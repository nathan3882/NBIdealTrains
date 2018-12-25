/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import org.w3c.dom.Document;

/**
 *
 * @author natha
 */
public class SoapRequest {

    public static String TOKEN;

    public static Document generateDoc(JAXBElement<?> element) {
        Class elementClass = element.getDeclaredType();
        Document generatedDoc = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(elementClass);
            generatedDoc = getMarshalledDocument(element, jaxbContext);
            if (generatedDoc == null) {
                System.out.println("Could not marshall, terminating...");
                return null;
            }
            return generatedDoc;
        } catch (JAXBException ex) {
            Logger.getLogger(SoapRequest.class.getName()).log(Level.SEVERE, null, ex);
        }

        return generatedDoc;
    }
    private final SOAPMessage request;
    private final String actionString;

    public SoapRequest(Action action, Document generatedRequestAsDoc) throws SOAPException {
        this.actionString = action.getActionString();
        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ldb", "http://thalesgroup.com/RTTI/2017-10-01/ldb/");
        envelope.addNamespaceDeclaration("typ", "http://thalesgroup.com/RTTI/2013-11-28/Token/types");

        envelope.getHeader().
                addHeaderElement(new QName("http://thalesgroup.com/RTTI/2013-11-28/Token/types", "AccessToken")).
                addChildElement("typ:TokenValue").
                addTextNode(getTokenValue());
        soapMessage.getMimeHeaders().addHeader("Content-type", "application/soap+xml;charset=UTF-8;action=" + createSoapAction(getActionString(), false));
        soapMessage.getMimeHeaders().addHeader("Accept-encoding", "gzip, x-gzip, deflate, x-bzip2");

        soapMessage.getMimeHeaders().addHeader("SOAPAction", "http://thalesgroup.com/RTTI/2017-10-01/ldb/ " + createSoapAction(getActionString(), true));

        soapMessage.getSOAPBody().addDocument(generatedRequestAsDoc); //adding the generated request by jax client to the body

        soapMessage.saveChanges();
        this.request = soapMessage;
    }

    private static String createSoapAction(String action, boolean appendRequest) {
        return action + (appendRequest ? "Request" : "");
    }

    private static Document getEmptyDoc() {
        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(IdealTrains.class.getName()).log(Level.SEVERE, null, ex);
        }
        return document;
    }

    private static Document getMarshalledDocument(JAXBElement<?> element, JAXBContext jaxbContext) {
        Document document = getEmptyDoc();
        try {
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(element, document);
        } catch (JAXBException e) {
            Logger.getLogger(IdealTrains.class.getName()).log(Level.SEVERE, null, e);
            document = null;
        }
        return document;
    }

    private static String getTokenValue() {
        return IdealTrains.AUTHENTICATION_TOKEN;
    }

    public static void setToken(String token) {
        TOKEN = token;
    }

    private SOAPMessage getRequest() {
        return this.request;
    }

    public SoapResponse sendRequestForResponse() {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(getRequest(), IdealTrains.STAFF_WEBSERVICE_ENDPOINT);
            soapConnection.close();
            return new SoapResponse(soapResponse);
        } catch (UnsupportedOperationException | SOAPException e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
            return null;
        }
    }

    public String getActionString() {
        return actionString;
    }

    public String getResponseString() {
        return getActionString() + "Response";
    }
}
