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
    private final XMLGregorianCalendar sdt;
    private final XMLGregorianCalendar etd;
    private final int length;
    private final String operatorCode;
    private final String operator;
    private final XMLGregorianCalendar eta;
    private final XMLGregorianCalendar sta;

    public Service(long rid,
            XMLGregorianCalendar sta,
            XMLGregorianCalendar eta,
            XMLGregorianCalendar sdt,
            XMLGregorianCalendar etd,
            int length,
            int platform,
            String operatorCode,
            String operator) {

        this.rid = rid;
        this.sdt = sdt;
        this.etd = etd;
        this.length = length;
        this.operatorCode = operatorCode;
        this.operator = operator;
        this.eta = eta;
        this.sta = sta;
    }

    public static Service fromJSONObject(Object firstService) {
        if (firstService instanceof JSONObject) {
            JSONObject aJSONObjectService = (JSONObject) firstService;
            long rid = aJSONObjectService.getLong("t10:rid");
            String sdt = aJSONObjectService.getString("t10:std");
            String edt = aJSONObjectService.getString("t10:etd");
            String sta = aJSONObjectService.getString("t10:sta");
            String eta = aJSONObjectService.getString("t10:eta");
            int length = aJSONObjectService.getInt("t12:length");
            String operatorCode = aJSONObjectService.getString("t10:operatorCode");
            String operator = aJSONObjectService.getString("t10:operator");
            int platform = aJSONObjectService.getInt("t10:platform");
            //boolean crossCountry = //is picadilly etc
            try {
                return new Service(rid,
                        xmlGregCalFromString(sta), xmlGregCalFromString(eta),
                        xmlGregCalFromString(sdt), xmlGregCalFromString(edt),
                        length, platform, operatorCode, operator);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static XMLGregorianCalendar xmlGregCalFromString(String string) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
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

    public int getLength() {
        return length;
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

}
