/*
 * SoapProtocol.java
 */

package com.zimbra.soap;

import java.util.Iterator;

import org.dom4j.Namespace;
import org.dom4j.QName;

import com.liquidsys.coco.service.Element;
import com.liquidsys.coco.service.ServiceException;

/**
 * Interface to Soap Protocol
 */

public abstract class SoapProtocol {

    protected static final String NS_PREFIX = "soap";
    
    /** SOAP 1.2 Protocol Object */
    public static final SoapProtocol Soap12 = new Soap12Protocol();

    /** SOAP 1.1 Protocol Object */
    public static final SoapProtocol Soap11 = new Soap11Protocol();

    /** SOAP 1.1 Protocol Object */
    public static final SoapProtocol SoapJS = new SoapJSProtocol();

    protected QName mFaultQName;
    protected QName mEnvelopeQName;
    protected QName mBodyQName;
	protected QName mHeaderQName;
    protected Element.ElementFactory mFactory;


    /** Package-Private constructor to prevent anyone else from
        extending */
    SoapProtocol() {
        mFaultQName = new QName("Fault", getNamespace());
        mEnvelopeQName = new QName("Envelope", getNamespace());
        mBodyQName = new QName("Body", getNamespace());
        mHeaderQName = new QName("Header", getNamespace());
        mFactory = getFactory();
    }

    /** 
     * Given an element, wrap it in an envelope and return the 
     * envelope.
     */
    public Element soapEnvelope(Element document) {
        Element env = mFactory.createElement(mEnvelopeQName);
        Element body = env.addUniqueElement(mBodyQName);
        body.addUniqueElement(document);
        return env;
    }

    /** 
     * Given an element and some headers, wrap it in an envelope and return the 
     * envelope.
     */
    public Element soapEnvelope(Element document, Element header) {
        Element env = mFactory.createElement(mEnvelopeQName);
        if (header != null) {
        	Element soapHeader = env.addUniqueElement(mHeaderQName);
        	soapHeader.addUniqueElement(header);
        }
        Element body = env.addUniqueElement(mBodyQName);
        body.addUniqueElement(document);
        return env;
    }

    /** 
     * Given a Exception, wrap it in a soap fault and return the 
     * soap fault element.
     */
    public abstract Element soapFault(ServiceException e);
    
    /** 
     * Given an element that represents a fault (i.e,. isFault returns 
     * true on it), construct a SoapFaultException from it.
     *
     * @return new SoapFaultException or null if passed in document 
     *         is not a soap fault.
     * @throws ServiceException

     */
    public abstract SoapFaultException soapFault(Element env);

    /** Return Content-Type header */
    public abstract String getContentType();

    /** Return the element factory */
    public abstract Element.ElementFactory getFactory();

    /**
     * Return the namespace object
     */
    public abstract Namespace getNamespace();
    
    public QName getFaultQName() {
        return mFaultQName;
    }
    
    public QName getBodyQName() {
        return mBodyQName;
    }
    
    public QName getEnvelopeQName() {
        return mEnvelopeQName;
    }
    
    public QName getHeaderQName() {
        return mHeaderQName;
    }

    /** Return charset encoding for converting from bytes/strings */
    public static String getCharset() {
        return "UTF-8";
    }

    /** Convert a SOAP message in a String to bytes */
    public static byte[] toBytes(String message) 
        throws java.io.UnsupportedEncodingException
    {
        return message.getBytes(getCharset());
    }

    /** Convert a SOAP message in bytes to a String */
    public static String toString(byte[] message) 
        throws java.io.UnsupportedEncodingException
    {
        if (message == null || message.length == 0)
            return "";
    	else if (message[message.length-1] == '\0')
    		return new String(message, 0, message.length-1, getCharset());
    	else
    		return new String(message, getCharset());
    }

    /** Convert an Element to a String. Doesn't really belong here... */
    public static String toString(Element env, boolean prettyPrint) {
        return prettyPrint ? env.prettyPrint() : env.toString();
    }

//    /** Convert an Element to a String. Doesn't really belong here... */
//    public static String toString(org.dom4j.Element env, boolean prettyPrint)
//    {
//        if (prettyPrint) {
//            StringWriter buff = new StringWriter();
//            try {
//                OutputFormat format = OutputFormat.createPrettyPrint();
//                XMLWriter writer = new XMLWriter(buff, format);
//                writer.write(env);
//                writer.close();
//            } catch (IOException e) {
//                // ignore, since StringWriter doesn't throw IOExceptions
//            }
//            return buff.toString();
//        } else {
//            return env.toString();
//        }
//    }
//
//    public static byte[] toBytes(Element env, boolean prettyPrint) {
//        ByteArrayOutputStream os = new ByteArrayOutputStream();
//        try {
//            XMLWriter writer;
//            if (prettyPrint) {
//                OutputFormat format = OutputFormat.createPrettyPrint();
//                writer = new XMLWriter(os, format);
//            } else {
//                writer = new XMLWriter(os);
//            }
//            writer.write(env);
//            writer.close();
//        } catch (IOException ioe) {
//            // ignore, since ByteArrayOutputStream doesn't throw IOExceptions
//        }
//        return os.toByteArray();
//    }

    /** 
     * returns the first child in the soap body
     */
    public Element getBodyElement(Element soapEnvelope) {
        if (soapEnvelope == null || !isEnvelope(soapEnvelope)) {
            // FIXME: should this be an exception?
            return null;
        }

        Element body = soapEnvelope.getOptionalElement(getBodyQName());
        if (body == null) {
            //FIXME: should this be an exception?
            return null;
        }
        
        Iterator it = body.elementIterator();
        if (it.hasNext())
            return (Element) it.next();
        return null;
    }

    /** 
     * returns the Header element
     */
    public Element getHeader(Element soapEnvelope) {
        if (!isEnvelope(soapEnvelope)) {
            // FIXME: should this be an exception?
            return null;
        }

        return soapEnvelope.getOptionalElement(getHeaderQName());
    }

    /** 
     * returns the specified element in the Header element, or
     * null if it doesn't exist.
     */
    public Element getHeader(Element soapEnvelope, QName headerQName) {
        if (!isEnvelope(soapEnvelope)) {
            // FIXME: should this be an exception?
            return null;
        }
        Element soapHeader = getHeader(soapEnvelope);
        Element header;
        if (soapHeader != null)
        	header = soapHeader.getOptionalElement(headerQName);
        else 
        	header = null;
        return header;
    }
    
    /**
     * Returns true if this element represents a SOAP envelope
     */
    public boolean isEnvelope(Element element) {
        return mEnvelopeQName.equals(element.getQName());
    }
    
    /**
     * Returns true if this element represents a SOAP fault
     */
    public boolean isFault(Element element) {
        return mFaultQName.equals(element.getQName());
    }

    /**
     * Returns true if this soap envelope has a SOAP fault as the
     * first child of its body.     
     */
    public boolean hasFault(Element soapEnvelope) {
        Element body = getBodyElement(soapEnvelope);
        return body != null && isFault(body);
    }

    /** 
     * determine if given document is Soap11 or Soap12 envelope.
     * returns null if neither.
     */
    public static SoapProtocol determineProtocol(Element env) {
        if (Soap12.isEnvelope(env))
            return Soap12;
        else if (Soap11.isEnvelope(env))
            return Soap11;
        else if (env instanceof Element.JavaScriptElement)
            return SoapJS;
        else
            return null;
    }

    /** Whether or not to include a HTTP SOAPActionHeader. (Gag) */
    public abstract boolean hasSOAPActionHeader();

    /** 
     * returns the version as a string (e.g, "1.1" or "1.2")
     */
    public abstract String getVersion();

    /**
     */
    public String toString() {
        return "SOAP " + getVersion();
    }
}
