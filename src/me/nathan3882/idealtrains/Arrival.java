/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author natha
 */
public class Arrival {

    private final Service arrivalService;
    private final XMLGregorianCalendar eta;
    private final XMLGregorianCalendar sta;

    public Arrival(Service arrivalService) {
        this.arrivalService = arrivalService;
        this.eta = arrivalService.getEta();
        this.sta = arrivalService.getSta();
    }

    public TrainDate singular() {
        Date arrivalDate = null;
        if (getEta() != null) {
            arrivalDate = getEta().toGregorianCalendar().getTime();
        } else if (getSta() != null) {
            arrivalDate = getSta().toGregorianCalendar().getTime();
        }
        return new TrainDate(arrivalDate);
    }

    public Service getArrivalService() {
        return arrivalService;
    }

    public boolean isNullSingular() {
        return getEta() == null && getSta() == null;
    }

    public XMLGregorianCalendar getEta() {
        return eta;
    }

    public XMLGregorianCalendar getSta() {
        return sta;
    }
}
