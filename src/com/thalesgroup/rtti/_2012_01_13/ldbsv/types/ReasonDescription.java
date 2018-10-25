
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The description of a Reason Code
 * 
 * <p>Java class for ReasonDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReasonDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ReasonCodeType"/>
 *         &lt;element name="lateReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReasonDescription", propOrder = {
    "code",
    "lateReason",
    "cancReason"
})
public class ReasonDescription {

    protected int code;
    @XmlElement(required = true)
    protected String lateReason;
    @XmlElement(required = true)
    protected String cancReason;

    /**
     * Gets the value of the code property.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the value of the lateReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateReason() {
        return lateReason;
    }

    /**
     * Sets the value of the lateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateReason(String value) {
        this.lateReason = value;
    }

    /**
     * Gets the value of the cancReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancReason() {
        return cancReason;
    }

    /**
     * Sets the value of the cancReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancReason(String value) {
        this.cancReason = value;
    }

}
