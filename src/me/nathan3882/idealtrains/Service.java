/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.json.JSONObject;

/**
 *
 * @author natha
 */
public class Service {

    private final long rid;
    private XMLGregorianCalendar sdt;
    private XMLGregorianCalendar etd;
    private final String operatorCode;
    private final String operator;
    private XMLGregorianCalendar eta;
    private XMLGregorianCalendar sta;
    private ServiceType serviceType;
    private String fromCrs = "Not Set";
    private String toCrs = "Not Set";

    public void setToCrs(String toCrs) {
        this.toCrs = toCrs;
    }

    public String getToCrs() {
        return toCrs;
    }

    public Service(long rid, ServiceType serviceType,
            XMLGregorianCalendar sta,
            XMLGregorianCalendar eta,
            XMLGregorianCalendar sdt,
            XMLGregorianCalendar etd,
            int platform,
            String operatorCode,
            String operator, String fromCrs, String toCrs) {

        this.rid = rid;
        this.operatorCode = operatorCode;
        this.operator = operator;
        this.eta = eta;
        this.sta = sta;
        this.sdt = sdt;
        this.etd = etd;
        this.fromCrs = fromCrs;
        this.toCrs = toCrs;
    }

    public void setEta(XMLGregorianCalendar eta) {
        this.eta = eta;
    }

    public void setSta(XMLGregorianCalendar sta) {
        this.sta = sta;
    }

    public void setSdt(XMLGregorianCalendar sdt) {
        this.sdt = sdt;
    }

    public void setEtd(XMLGregorianCalendar etd) {
        this.etd = etd;
    }

    public static Service fromJSONObject(Object jsonArrayOrObject, ServiceType serviceType, String fromCrs, String toCrs) {
        if (jsonArrayOrObject instanceof HashMap) {
            HashMap jsonObject = (HashMap) jsonArrayOrObject;
            long rid = (long) jsonObject.get("t10:rid");
            String sdt = (String) jsonObject.get("t10:std");
            String edt = (String) jsonObject.get("t10:etd");
            String sta = (String) jsonObject.get("t10:sta");
            String eta = (String) jsonObject.get("t10:eta");
            //int length = (int) jsonObject.get("t12:length");
            String operatorCode = (String) jsonObject.get("t10:operatorCode");
            String operator = (String) jsonObject.get("t10:operator");
            int platform = (int) jsonObject.get("t10:platform");
            //boolean crossCountry = //is picadilly etc
            try {
                return new Service(rid, serviceType,
                        xmlGregCalFromString(sta), xmlGregCalFromString(eta),
                        xmlGregCalFromString(sdt), xmlGregCalFromString(edt),
                        platform, operatorCode, operator, fromCrs, toCrs);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static XMLGregorianCalendar xmlGregCalFromString(String string) throws ParseException {
        if (string == null) {
            return null;
        }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
//        2018-12-27T11:18:00
        Date date = format.parse(string);

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);

        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public long getRid() {
        return rid;
    }

    public XMLGregorianCalendar getSdt() {
        return sdt;
    }

    public XMLGregorianCalendar getEtd() {
        return etd;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public String getOperator() {
        return operator;
    }

    public XMLGregorianCalendar getEta() {
        return eta;
    }

    public XMLGregorianCalendar getSta() {
        return sta;
    }

    public ServiceType getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getFromCrs() {
        return this.fromCrs;
    }
    public void setFromCrs(String fromCrs) {
        this.fromCrs = fromCrs;
    }

    public enum ServiceType {
        ARRIVING_TO_BROCK,
        DEPARTING_FROM_HOME,
        HALF_AND_HALF //Departures is from HOME, arrivals is to BROCK
    }

}
