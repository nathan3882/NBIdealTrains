
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepBoardDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepBoardDateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PreviousDay"/>
 *     &lt;enumeration value="SameDay"/>
 *     &lt;enumeration value="NextDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepBoardDateType")
@XmlEnum
public enum DepBoardDateType {

    @XmlEnumValue("PreviousDay")
    PREVIOUS_DAY("PreviousDay"),
    @XmlEnumValue("SameDay")
    SAME_DAY("SameDay"),
    @XmlEnumValue("NextDay")
    NEXT_DAY("NextDay");
    private final String value;

    DepBoardDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepBoardDateType fromValue(String v) {
        for (DepBoardDateType c: DepBoardDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
