package com.zimbra.cs.service.account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

import com.google.common.collect.Lists;
import com.sun.mail.smtp.SMTPMessage;
import com.zimbra.common.account.Key;
import com.zimbra.common.account.Key.AccountBy;
import com.zimbra.common.account.Key.GranteeBy;
import com.zimbra.common.mime.MimeConstants;
import com.zimbra.common.mime.shim.JavaMailInternetAddress;
import com.zimbra.common.mime.shim.JavaMailMimeBodyPart;
import com.zimbra.common.mime.shim.JavaMailMimeMultipart;
import com.zimbra.common.service.ServiceException;
import com.zimbra.common.soap.AccountConstants;
import com.zimbra.common.soap.Element;
import com.zimbra.common.util.L10nUtil;
import com.zimbra.common.util.ZimbraLog;
import com.zimbra.common.util.L10nUtil.MsgKey;
import com.zimbra.cs.account.Account;
import com.zimbra.cs.account.Group;
import com.zimbra.cs.account.Provisioning;
import com.zimbra.cs.account.Group.GroupOwner;
import com.zimbra.cs.account.accesscontrol.ACLUtil;
import com.zimbra.cs.account.accesscontrol.GranteeType;
import com.zimbra.cs.account.accesscontrol.Right;
import com.zimbra.cs.account.accesscontrol.RightCommand;
import com.zimbra.cs.account.accesscontrol.RightManager;
import com.zimbra.cs.account.accesscontrol.TargetType;
import com.zimbra.cs.account.accesscontrol.ZimbraACE;
import com.zimbra.cs.util.AccountUtil;
import com.zimbra.cs.util.JMSession;
import com.zimbra.soap.ZimbraSoapContext;
import com.zimbra.soap.account.type.DistributionListSubscribeOp;
import com.zimbra.soap.account.type.DistributionListAction.Operation;
import com.zimbra.soap.type.TargetBy;

public class DistributionListAction extends DistributionListDocumentHandler {
    
    public Element handle(Element request, Map<String, Object> context) 
    throws ServiceException {
        
        ZimbraSoapContext zsc = getZimbraSoapContext(context);
        Provisioning prov = Provisioning.getInstance();
        Account acct = getRequestedAccount(zsc);
        
        Group group = getGroupBasic(request, prov);
        DistributionListActionHandler handler = new DistributionListActionHandler(
                group, request, prov, acct);
        handler.handle();
        
        Element response = zsc.createElement(AccountConstants.DISTRIBUTION_LIST_ACTION_RESPONSE);
        return response;
    }
    
    private static class DistributionListActionHandler extends SynchronizedGroupHandler {
        private Element request;
        private Provisioning prov;
        private Account acct;
        
        protected DistributionListActionHandler(Group group,
                Element request, Provisioning prov, Account acct) {
            super(group);
            this.request = request;
            this.prov = prov;
            this.acct = acct;
        }

        @Override
        protected void handleRequest() throws ServiceException {
            if (!GroupOwner.hasOwnerPrivilege(acct, group)) {
                throw ServiceException.PERM_DENIED(
                        "you do not have sufficient rights to access this distribution list");
            }
            
            Element eAction = request.getElement(AccountConstants.E_ACTION);
            Operation op = Operation.fromString(eAction.getAttribute(AccountConstants.A_OP));
            
            DLActionHandler handler = null;
            switch (op) {
                case delete:
                    handler = new DeleteHandler(eAction, group, prov, acct);
                    break;
                case modify:
                    handler = new ModifyHandler(eAction, group, prov, acct);
                    break;
                case rename:
                    handler = new RenameHandler(eAction, group, prov, acct);
                    break;
                case addAlias:
                    handler = new AddAliasHandler(eAction, group, prov, acct);
                    break;
                case removeAlias:
                    handler = new RemoveAliasHandler(eAction, group, prov, acct);
                    break;
                case addOwners:
                    handler = new AddOwnersHandler(eAction, group, prov, acct);
                    break;
                case removeOwners:
                    handler = new RemoveOwnersHandler(eAction, group, prov, acct);
                    break;
                case setOwners:
                    handler = new SetOwnersHandler(eAction, group, prov, acct);
                    break;
                case grantRights:
                    handler = new GrantRightsHandler(eAction, group, prov, acct);
                    break;
                case revokeRights:
                    handler = new RevokeRightsHandler(eAction, group, prov, acct);
                    break;
                case setRights:
                    handler = new SetRightsHandler(eAction, group, prov, acct);
                    break;
                case addMembers:
                    handler = new AddMembersHandler(eAction, group, prov, acct);
                    break;
                case removeMembers:
                    handler = new RemoveMembersHandler(eAction, group, prov, acct);
                    break;
                case acceptSubsReq:
                    handler = new AcceptSubsReqHandler(eAction, group, prov, acct);
                    break;
                case rejectSubsReq:
                    handler = new RejectSubsReqHandler(eAction, group, prov, acct);
                    break;     
                default:
                    throw ServiceException.FAILURE("unsupported op:" + op.name(), null);
            }
            
            handler.handle();
        }
        
    }
    
    private static abstract class DLActionHandler {
        protected Element eAction;
        protected Group group;
        protected Provisioning prov;
        protected Account requestedAcct;
        
        protected DLActionHandler(Element request, Group group, 
                Provisioning prov, Account requestedAcct) {
            this.eAction = request;
            this.group = group;
            this.prov = prov;
            this.requestedAcct = requestedAcct;
        }
        
        abstract void handle() throws ServiceException;
        abstract Operation getAction();
    }
    
    private static class DeleteHandler extends DLActionHandler {

        protected DeleteHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }

        @Override
        Operation getAction() {
            return Operation.delete;
        }
        
        @Override
        void handle() throws ServiceException {
            prov.deleteGroup(group.getId());
            
            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                            "name", group.getName(), "id", group.getId()}));
        }

    }
    
    private static class ModifyHandler extends DLActionHandler {

        protected ModifyHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.modify;
        }

        @Override
        void handle() throws ServiceException {
            Map<String, Object> attrs = AccountService.getKeyValuePairs(
                    eAction, AccountConstants.E_A, AccountConstants.A_N);
            prov.modifyAttrs(group, attrs, true);    
            
            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                            "name", group.getName()}, attrs)); 
        }
    }
    
    private static class RenameHandler extends DLActionHandler {

        protected RenameHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.rename;
        }

        @Override
        void handle() throws ServiceException {
            Element eNewName = eAction.getElement(AccountConstants.E_NEW_NAME);
            String newName = eNewName.getText();
            
            String oldName = group.getName();
            prov.renameGroup(group.getId(), newName);

            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                            "name", oldName, "newName", newName})); 
        }
    }
    
    private static class AddAliasHandler extends DLActionHandler {

        protected AddAliasHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.addAlias;
        }

        @Override
        void handle() throws ServiceException {
            String alias = eAction.getAttribute(AccountConstants.E_ALIAS);
            prov.addGroupAlias(group, alias);
            
            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                            "name", group.getName(), "alias", alias})); 
        }
    }
    
    private static class RemoveAliasHandler extends DLActionHandler {

        protected RemoveAliasHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.removeAlias;
        }

        @Override
        void handle() throws ServiceException {
            String alias = eAction.getAttribute(AccountConstants.E_ALIAS);
            prov.removeGroupAlias(group, alias);
            
            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                            "name", group.getName(), "alias", alias})); 
        }
    }
    
    private static abstract class ModifyRightHandler extends DLActionHandler {

        protected ModifyRightHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        protected class Grantee {
            GranteeType type;
            GranteeBy by;
            String grantee;
            
            private Grantee(GranteeType type, GranteeBy by, String grantee) {
                this.type = type;
                this.by = by;
                this.grantee = grantee;
            }
        };
        
        protected List<Grantee> parseGrantees(Element parent, String granteeElem) throws ServiceException {
            List<Grantee> grantees = Lists.newArrayList();
            
            for (Element eGrantee : parent.listElements(granteeElem)) {
                GranteeType type = GranteeType.fromCode(eGrantee.getAttribute(AccountConstants.A_TYPE));
                
                GranteeBy by = null;
                String grantee = null;
                
                if (type.needsGranteeIdentity()) {
                    by = GranteeBy.fromString(eGrantee.getAttribute(AccountConstants.A_BY));
                    grantee = eGrantee.getText();
                }
                
                grantees.add(new Grantee(type, by, grantee));
            }
            
            return grantees;
        }
        
        protected void grantRight(Right right, GranteeType granteeType, 
                Key.GranteeBy granteeBy, String grantee) 
        throws ServiceException {
            RightCommand.grantRight(prov,
                    null,  // grant the right as a a system admin
                    TargetType.dl.getCode(), TargetBy.id, group.getId(),
                    granteeType.getCode(), granteeBy, grantee, null,
                    right.getName(), null);
            
            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                            "name", group.getName(), "type", granteeType.getCode(),
                            "grantee", grantee})); 
        }
        
        protected void revokeRight(Right right, GranteeType granteeType, 
                Key.GranteeBy granteeBy, String grantee) 
        throws ServiceException {
            RightCommand.revokeRight(prov,
                    null,  // grant the right as a a system admin
                    TargetType.dl.getCode(), TargetBy.id, group.getId(),
                    granteeType.getCode(), granteeBy, grantee, 
                    right.getName(), null);
            
            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                            "name", group.getName(), "type", granteeType.getCode(),
                            "grantee", grantee})); 
        }
    }
    
    static class AddOwnersHandler extends ModifyRightHandler {

        protected AddOwnersHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.addOwners;
        }

        @Override
        void handle() throws ServiceException {
            List<Grantee> owners = parseGrantees(eAction, AccountConstants.E_OWNER);
            for (Grantee owner : owners) {
                addOwner(this, owner.type, owner.by, owner.grantee);
            }
        }
        
        private static void addOwner(ModifyRightHandler handler, 
                GranteeType granteeType, Key.GranteeBy granteeBy, String grantee) 
        throws ServiceException {
            handler.grantRight(Group.GroupOwner.GROUP_OWNER_RIGHT,
                    granteeType, granteeBy, grantee);
        }
    }
    
    static class RemoveOwnersHandler extends ModifyRightHandler {

        protected RemoveOwnersHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.removeOwners;
        }

        @Override
        void handle() throws ServiceException {
            List<Grantee> owners = parseGrantees(eAction, AccountConstants.E_OWNER);
            for (Grantee owner : owners) {
                removeOwner(this, owner.type, owner.by, owner.grantee);
            }
        }
        
        private static void removeOwner(ModifyRightHandler handler, 
                GranteeType granteeType, Key.GranteeBy granteeBy, String grantee) 
        throws ServiceException {
            handler.revokeRight(Group.GroupOwner.GROUP_OWNER_RIGHT,
                    granteeType, granteeBy, grantee);
        }
    }
    
    static class SetOwnersHandler extends ModifyRightHandler {

        protected SetOwnersHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.setOwners;
        }

        @Override
        void handle() throws ServiceException {
            List<Grantee> owners = parseGrantees(eAction, AccountConstants.E_OWNER);
            
            // remove all current owners
            List<GroupOwner> curOwners = GroupOwner.getOwners(group, false);
            for (GroupOwner owner : curOwners) {
                RemoveOwnersHandler.removeOwner(this, owner.getType(), 
                        Key.GranteeBy.id, owner.getId());
            }
            
            // add owners
            for (Grantee owner : owners) {
                AddOwnersHandler.addOwner(this, owner.type, owner.by, owner.grantee);
            }
        }
    }
    
    private static abstract class ModifyMultipleRightsHandler extends ModifyRightHandler {
        protected ModifyMultipleRightsHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        protected Map<Right, List<Grantee>> parseRights() throws ServiceException {
            RightManager rightMgr = RightManager.getInstance();
            
            // keep the soap order, use LinkedHashMap
            Map<Right, List<Grantee>> rights = new LinkedHashMap<Right, List<Grantee>>();
            for (Element eRight : eAction.listElements(AccountConstants.E_RIGHT)) {
                Right right = rightMgr.getUserRight(eRight.getAttribute(AccountConstants.A_RIGHT));
                
                if (Group.GroupOwner.GROUP_OWNER_RIGHT == right) {
                    throw ServiceException.INVALID_REQUEST(right.getName() + 
                            " cannot be granted directly, use addOwners/removeOwners/setOwners" +
                            " operation instead", null);
                    
                }
                List<Grantee> grantees = parseGrantees(eRight, AccountConstants.E_GRANTEE);
                rights.put(right, grantees);
            }
            
            return rights;
        }
    }
    
    static class GrantRightsHandler extends ModifyMultipleRightsHandler {
        protected GrantRightsHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }

        @Override
        Operation getAction() {
            return Operation.grantRights;
        }

        @Override
        void handle() throws ServiceException {
            Map<Right, List<Grantee>> rights = parseRights();
            
            for (Map.Entry<Right, List<Grantee>> entry : rights.entrySet()) {
                Right right = entry.getKey();
                List<Grantee> grantees = entry.getValue();
                for (Grantee grantee : grantees) {
                    grantRight(right, grantee.type, grantee.by, grantee.grantee);
                }
            }
        }
    }
    
    static class RevokeRightsHandler extends ModifyMultipleRightsHandler {
        protected RevokeRightsHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }

        @Override
        Operation getAction() {
            return Operation.revokeRights;
        }

        @Override
        void handle() throws ServiceException {
            Map<Right, List<Grantee>> rights = parseRights();
            
            for (Map.Entry<Right, List<Grantee>> entry : rights.entrySet()) {
                Right right = entry.getKey();
                List<Grantee> grantees = entry.getValue();
                for (Grantee grantee : grantees) {
                    revokeRight(right, grantee.type, grantee.by, grantee.grantee);
                }
            }
        }
    }

    static class SetRightsHandler extends ModifyMultipleRightsHandler {

        protected SetRightsHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.setRights;
        }

        @Override
        void handle() throws ServiceException {
            Map<Right, List<Grantee>> rights = parseRights();
            
            for (Map.Entry<Right, List<Grantee>> entry : rights.entrySet()) {
                Right right = entry.getKey();
                List<Grantee> grantees = entry.getValue();
                
                // remove all current grants for the right
                List<ZimbraACE> acl = ACLUtil.getACEs(group, Collections.singleton(right));
                if (acl != null) {
                    for (ZimbraACE ace : acl) {
                        revokeRight(right, ace.getGranteeType(),
                                Key.GranteeBy.id, ace.getGrantee());
                    }
                }
                
                // grant the right to the new grantees
                for (Grantee grantee : grantees) {
                    grantRight(right, grantee.type, grantee.by, grantee.grantee);
                }
            }
        }
    }
    
    private static class AddMembersHandler extends DLActionHandler {

        protected AddMembersHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.addMembers;
        }

        @Override
        void handle() throws ServiceException {
            List<String> memberList = new LinkedList<String>();
            for (Element elem : eAction.listElements(AccountConstants.E_DLM)) {
                memberList.add(elem.getTextTrim());
            }
            
            String[] members = (String[]) memberList.toArray(new String[memberList.size()]); 
            addGroupMembers(prov, group, members);
            
            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                   "name", group.getName(), "members", Arrays.deepToString(members)})); 
        }
    }
    
    private static class RemoveMembersHandler extends DLActionHandler {

        protected RemoveMembersHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.removeMembers;
        }

        @Override
        void handle() throws ServiceException {
            List<String> memberList = new LinkedList<String>();
            for (Element elem : eAction.listElements(AccountConstants.E_DLM)) {
                memberList.add(elem.getTextTrim());
            }
            
            String[] members = (String[]) memberList.toArray(new String[memberList.size()]); 
            removeGroupMembers(prov, group, members);
            
            ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                    new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                   "name", group.getName(), "members", Arrays.deepToString(members)})); 
        }
    }
    
    private static class SubscriptionResponseSender extends NotificationSender {
        private Account ownerAcct;  // owner who is handling the request
        private boolean bccOwners;
        private boolean accepted;
        
        private SubscriptionResponseSender(Provisioning prov, Group group, 
                Account ownerAcct, Account requestingAcct, 
                DistributionListSubscribeOp op, boolean bccOwners, boolean accepted) {
            super(prov, group, requestingAcct, op);
            this.ownerAcct = ownerAcct;
            this.bccOwners = bccOwners;
            this.accepted = accepted;
        }
        
        private void sendMessage() throws ServiceException {
            try {
                SMTPMessage out = new SMTPMessage(JMSession.getSmtpSession());
                
                Address fromAddr = AccountUtil.getFriendlyEmailAddress(ownerAcct);
                
                Address replyToAddr = fromAddr;
                String replyTo = ownerAcct.getAttr(Provisioning.A_zimbraPrefReplyToAddress);
                if (replyTo != null) {
                    replyToAddr = new JavaMailInternetAddress(replyTo);
                }
                
                // From
                out.setFrom(fromAddr);
                
                // Reply-To
                out.setReplyTo(new Address[]{replyToAddr});
                
                // To
                out.setRecipient(javax.mail.Message.RecipientType.TO, 
                        new JavaMailInternetAddress(requestingAcct.getName()));
                
                // Bcc all other owners of the list
                if (bccOwners) {
                    List<String> owners = new ArrayList<String>();
                    Group.GroupOwner.getOwnerEmails(group, owners);
                    
                    List<Address> addrs = Lists.newArrayList();
                    for (String ownerEmail : owners) {
                        if (!ownerEmail.equals(ownerAcct.getName())) {
                            addrs.add(new JavaMailInternetAddress(ownerEmail));
                        }
                    }
                    if (!addrs.isEmpty()) {
                        out.addRecipients(javax.mail.Message.RecipientType.BCC, 
                                addrs.toArray(new Address[addrs.size()]));
                    }
                }
                
                // Date
                out.setSentDate(new Date());
                
                // send in the receiver's(i.e. the requesting account) locale
                Locale locale = getLocale(requestingAcct);
                
                // Subject
                String subject = L10nUtil.getMessage(MsgKey.dlSubscriptionResponseSubject, locale);
                out.setSubject(subject);
                
                buildContentAndSend(out, locale, "group subscription response");
            
            } catch (MessagingException e) {
                ZimbraLog.account.warn("send share info notification failed, rcpt='" + 
                        requestingAcct.getName() +"'", e);
            }

        }

        @Override
        protected MimeMultipart buildMailContent(Locale locale)
        throws MessagingException {
            String text = textPart(locale);
            String html = htmlPart(locale);
            
            // Body
            MimeMultipart mmp = new JavaMailMimeMultipart("alternative");
        
            // TEXT part (add me first!)
            MimeBodyPart textPart = new JavaMailMimeBodyPart();
            textPart.setText(text, MimeConstants.P_CHARSET_UTF8);
            mmp.addBodyPart(textPart);

            // HTML part
            MimeBodyPart htmlPart = new JavaMailMimeBodyPart();
            htmlPart.setDataHandler(new DataHandler(new HtmlPartDataSource(html)));
            mmp.addBodyPart(htmlPart);
            
            return mmp;
        }
        
        private String textPart(Locale locale) {
            StringBuilder sb = new StringBuilder();

            
            MsgKey msgKey;
            if (accepted) {
                msgKey = DistributionListSubscribeOp.subscribe == op ? MsgKey.dlSubscribeResponseAcceptedText :
                    MsgKey.dlUnsubscribeResponseAcceptedText;
            } else {
                msgKey = DistributionListSubscribeOp.subscribe == op ? MsgKey.dlSubscribeResponseRejectedText :
                    MsgKey.dlUnsubscribeResponseRejectedText;
                
            }
            
            sb.append("\n");
            sb.append(L10nUtil.getMessage(msgKey, locale, 
                    requestingAcct.getName(), group.getName()));
            sb.append("\n\n");
            return sb.toString();
        }

        private String htmlPart(Locale locale) {
            StringBuilder sb = new StringBuilder();

            sb.append("<h4>\n");
            sb.append("<p>" + textPart(locale) + "</p>\n");
            sb.append("</h4>\n");
            sb.append("\n");
            return sb.toString();
        }

    }

    private static class AcceptSubsReqHandler extends DLActionHandler {

        protected AcceptSubsReqHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.acceptSubsReq;
        }

        @Override
        void handle() throws ServiceException {
            
            Element eSubsReq = eAction.getElement(AccountConstants.E_DL_SUBS_REQ);
            DistributionListSubscribeOp subsOp = DistributionListSubscribeOp.fromString(
                    eSubsReq.getAttribute(AccountConstants.A_OP));
            boolean bccOwners = eSubsReq.getAttributeBool(AccountConstants.A_BCC_OWNERS, true);
            String memberEmail = eSubsReq.getText();
            
            Account memberAcct = prov.get(AccountBy.name, memberEmail);
            if (memberAcct == null) {
                throw ServiceException.DEFEND_ACCOUNT_HARVEST(memberEmail);
            }
            boolean isMember = DistributionListDocumentHandler.isMember(prov, memberAcct, group);
            
            boolean processed = false;
            if (isMember) {
                if (subsOp == DistributionListSubscribeOp.subscribe) {
                    // do nothing
                    ZimbraLog.account.debug("AcceptSubsReqHandler: " + memberEmail + 
                            " is currently a member in list " + group.getName() + 
                            ", no action taken for the subscribe request");
                } else {
                    removeGroupMembers(prov, group, new String[]{memberEmail});
                    processed = true;
                }
            } else {
                // not currently a member
                if (subsOp == DistributionListSubscribeOp.subscribe) {
                    addGroupMembers(prov, group, new String[]{memberEmail});
                    processed = true;
                } else {
                    // do nothing
                    ZimbraLog.account.debug("AcceptSubsReqHandler: " + memberEmail + 
                            " is currently not a member in list " + group.getName() + 
                            ", no action taken for the un-subscribe request");
                }
            }
            
            if (processed) {
                ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                        new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                       "name", group.getName(), "subsOp", subsOp.name(), "member", memberEmail})); 
                
                // send notification email to the user and bcc other owners
                SubscriptionResponseSender notifSender = new SubscriptionResponseSender(
                        prov, group, requestedAcct, memberAcct, 
                        subsOp, bccOwners, true);
                notifSender.sendMessage();
            }
        }
        
    }
    
    private static class RejectSubsReqHandler extends DLActionHandler {

        protected RejectSubsReqHandler(Element eAction, Group group, 
                Provisioning prov, Account requestedAcct) {
            super(eAction, group, prov, requestedAcct);
        }
        
        @Override
        Operation getAction() {
            return Operation.rejectSubsReq;
        }

        @Override
        void handle() throws ServiceException {
            
            Element eSubsReq = eAction.getElement(AccountConstants.E_DL_SUBS_REQ);
            DistributionListSubscribeOp subsOp = DistributionListSubscribeOp.fromString(
                    eSubsReq.getAttribute(AccountConstants.A_OP));
            boolean bccOwners = eSubsReq.getAttributeBool(AccountConstants.A_BCC_OWNERS, true);
            String memberEmail = eSubsReq.getText();
            
            Account memberAcct = prov.get(AccountBy.name, memberEmail);
            if (memberAcct == null) {
                throw ServiceException.DEFEND_ACCOUNT_HARVEST(memberEmail);
            }
            boolean isMember = DistributionListDocumentHandler.isMember(prov, memberAcct, group);
            
            boolean processed = false;
            if (isMember) {
                if (subsOp == DistributionListSubscribeOp.subscribe) {
                    // do nothing
                    ZimbraLog.account.debug("RejectSubsReqHandler: " + memberEmail + 
                            " is currently a member in list " + group.getName() + 
                            ", no action taken for the subscribe request");
                } else {
                    processed = true;
                }
            } else {
                // not currently a member
                if (subsOp == DistributionListSubscribeOp.subscribe) {
                    processed = true;
                } else {
                    // do nothing
                    ZimbraLog.account.debug("RejectSubsReqHandler: " + memberEmail + 
                            " is currently not a member in list " + group.getName() + 
                            ", no action taken for the un-subscribe request");
                }
            }
            
            if (processed) {
                ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                        new String[] {"cmd", "DistributionListAction", "op", getAction().name(), 
                       "name", group.getName(), "subsOp", subsOp.name(), "member", memberEmail})); 
                
                // send notification email to the user and bcc other owners
                SubscriptionResponseSender notifSender = new SubscriptionResponseSender(
                        prov, group, requestedAcct, memberAcct, 
                        subsOp, bccOwners, false);
                notifSender.sendMessage();
            }
        }
    }
}
