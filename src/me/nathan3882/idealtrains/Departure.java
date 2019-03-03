/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import java.util.Calendar;
import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author natha
 */
public class Departure {

    private final Service departureService;

    private final XMLGregorianCalendar sdt;
    private final XMLGregorianCalendar etd;

    public Departure(Service departureService) {
        this.departureService = departureService;
        this.sdt = departureService.getSdt();
        this.etd = departureService.getEtd();
    }

    public XMLGregorianCalendar getEtd() {
        return etd;
    }

    public XMLGregorianCalendar getSdt() {
        return sdt;
    }
    public TrainDate singular() {
        Date departureDate = null;
        if (getEtd()!= null) {
            departureDate = getEtd().toGregorianCalendar().getTime();
        } else if (getSdt()!= null) {
            departureDate = getSdt().toGregorianCalendar().getTime();
        }
        return new TrainDate(departureDate);
    }

    public Service getDepartureService() {
        return departureService;
    }
}
