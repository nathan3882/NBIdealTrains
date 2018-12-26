/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import java.io.ByteArrayOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

/**
 *
 * @author natha
 */
public class SoapResponse {

    private final SOAPMessage responseMessage;
    private String action;

    public String getAction() {
        return action;
    }

    public SoapResponse(SOAPMessage responseMessage) {
        this.responseMessage = responseMessage;
    }

    public SOAPMessage getResponseMessage() {
        return responseMessage;
    }

    public JSONObject bodyToJson() {
        JSONObject body = null;
        try {
            JSONObject core = XML.toJSONObject(formatSoapMessage(getResponseMessage().getSOAPPart()));
            body = (JSONObject) core.getJSONObject("soap:Envelope").getJSONObject("soap:Body");
        } catch (Exception ex) {
            Logger.getLogger(SoapResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return body;
    }

    public String formatSoapMessage(SOAPPart part) {
        try {
            final TransformerFactory transformerFactory = TransformerFactory.newInstance();
            final Transformer transformer = transformerFactory.newTransformer();

            // Format it
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            final Source soapContent = part.getContent();

            final ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
            final StreamResult result = new StreamResult(streamOut);
            transformer.transform(soapContent, result);

            return streamOut.toString();
        } catch (SOAPException | TransformerException ex) {
            Logger.getLogger(SoapResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "not formatted";
    }

    public String getResponsedMessageFormatted() {
        return formatSoapMessage(getResponseMessage().getSOAPPart());
    }

    public String getString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return a singular JSONObject if only one service availabe or a JSONArray
     */
    public Object getTrainServices() {
        switch (getResponseString()) {
            case "GetDepartureBoardByCRSResponse":
            case "GetArrivalBoardByCRSResponse":
                JSONObject withResponseString = bodyToJson();
                JSONObject withGetBoardResult = withResponseString.getJSONObject(getResponseString());
                JSONObject withTrainServices = withGetBoardResult.getJSONObject("GetBoardResult");
                JSONObject trainServicesFromCrs = null;
                try {
                    trainServicesFromCrs = withTrainServices.getJSONObject("t12:trainServices");
                } catch (org.json.JSONException e) {
                    System.err.println("There are no trains running");
                    return null;
                }
                Object serviceArray = trainServicesFromCrs.get("t12:service");
                if (serviceArray instanceof JSONArray) {
                    return (JSONArray) serviceArray;
                } else if (serviceArray instanceof JSONObject) {
                    return (JSONObject) serviceArray;
                }
                return null;
        }
        return null;
    }

    public String getResponseString() {
        return getAction() + "Response";
    }
}
