/*
 * Created on Jun 17, 2004
 */
package com.liquidsys.coco.service.admin;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.liquidsys.coco.account.AccountServiceException;
import com.liquidsys.coco.account.Domain;
import com.liquidsys.coco.account.Provisioning;
import com.liquidsys.coco.service.Element;
import com.liquidsys.coco.service.ServiceException;
import com.zimbra.soap.LiquidContext;

/**
 * @author schemers
 */
public class GetDomain extends AdminDocumentHandler {

    public static final String BY_NAME = "name";
    public static final String BY_ID = "id";
    
	public Element handle(Element request, Map context) throws ServiceException {
	    
        LiquidContext lc = getLiquidContext(context);
	    Provisioning prov = Provisioning.getInstance();
	    
        boolean applyConfig = request.getAttributeBool(AdminService.A_APPLY_CONFIG, true);
        Element d = request.getElement(AdminService.E_DOMAIN);
	    String key = d.getAttribute(AdminService.A_BY);
        String value = d.getText();
	    
	    Domain domain = null;
        
        if (key.equals(BY_NAME)) {
            domain = prov.getDomainByName(value);
        } else if (key.equals(BY_ID)) {
            domain = prov.getDomainById(value);
        } else {
            throw ServiceException.INVALID_REQUEST("unknown value for by: "+key, null);
        }
	    
        if (domain == null)
            throw AccountServiceException.NO_SUCH_DOMAIN(value);

	    Element response = lc.createElement(AdminService.GET_DOMAIN_RESPONSE);
        doDomain(response, domain, applyConfig);

	    return response;
	}

    public static void doDomain(Element e, Domain d) throws ServiceException {
        doDomain(e, d, true);
    }
    
    public static void doDomain(Element e, Domain d, boolean applyConfig) throws ServiceException {
        Element domain = e.addElement(AdminService.E_DOMAIN);
        domain.addAttribute(AdminService.A_NAME,d.getName());
        domain.addAttribute(AdminService.A_ID,d.getId());
        Map attrs = d.getAttrs(applyConfig);
        for (Iterator mit = attrs.entrySet().iterator(); mit.hasNext(); ) {
            Map.Entry entry = (Entry) mit.next();
            String name = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String[]) {
                String sv[] = (String[]) value;
                for (int i = 0; i < sv.length; i++)
                    domain.addAttribute(name, sv[i], Element.DISP_ELEMENT);
            } else if (value instanceof String)
                domain.addAttribute(name, (String) value, Element.DISP_ELEMENT);
        }
    }
}
