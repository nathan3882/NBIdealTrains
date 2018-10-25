
package com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Type describing a disruption reason, optionally with a location
 * 
 * <p>Java class for ReasonCodeWithLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReasonCodeWithLocation">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes>ReasonCodeType">
 *       &lt;attribute name="tiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" />
 *       &lt;attribute name="near" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReasonCodeWithLocation", propOrder = {
    "value"
})
public class ReasonCodeWithLocation {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "tiploc")
    protected String tiploc;
    @XmlAttribute(name = "near")
    protected Boolean near;

    /**
     * A coded cancellation or late-running reason
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the tiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiploc() {
        return tiploc;
    }

    /**
     * Sets the value of the tiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiploc(String value) {
        this.tiploc = value;
    }

    /**
     * Gets the value of the near property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNear() {
        if (near == null) {
            return false;
        } else {
            return near;
        }
    }

    /**
     * Sets the value of the near property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNear(Boolean value) {
        this.near = value;
    }

}
