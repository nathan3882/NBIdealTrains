/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author natha
 */
public class TrainDate {

    private Date date;
    private Calendar cal;

    public TrainDate(Date date) {
        this.date = date;
        this.cal = Calendar.getInstance();
        this.cal.setTime(date);
    }

    public Date getDate() {
        return date;
    }

    public Calendar getCal() {
        return cal;
    }

    public int getHourOfDay() {
        return getCal().get(Calendar.HOUR_OF_DAY);
    }

    public int getHour() {
        return getCal().get(Calendar.HOUR);
    }

    public int getMinute() {
        return getDate().getMinutes();
    }
    
    public String withColon() {
        return getHourOfDay() + ":" + getMinute();
    }
    public String withoutColon() {
        return String.valueOf(getHourOfDay()) + String.valueOf(getMinute());
    }
}
