/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import com.thalesgroup.rtti._2017_10_01.ldbsv.types.ArrayOfCoaches;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author natha
 */
public class IdealTrains {

    public static final String STAFF_WEBSERVICE_URL = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2017-10-01";
    public static final String STAFF_WEBSERVICE_ENDPOINT = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/ldbsv12.asmx";
    public static final String AUTHENTICATION_TOKEN = "";

    public static final String CRS_CODE_BOURNEMOUTH = "BMH";
    public static final String CRS_CODE_POOLE = "POO";
    public static final String CRS_CODE_BROCKENHURST = "BCU";

    public static List<String> crsCodes;

    public static void main(String args[]) {
        crsCodes = new ArrayList<>(Arrays.asList(CRS_CODE_BOURNEMOUTH, CRS_CODE_BROCKENHURST));
    
    }
}
