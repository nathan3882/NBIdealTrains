
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An indication as to where a service has become Overdue.
 * 
 * <p>Java class for Overdue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Overdue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="odtime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="isOverdueAt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="odStation1" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="odStation1CRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="odStation1Tiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/>
 *         &lt;element name="odStation2" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType" minOccurs="0"/>
 *         &lt;element name="odStation2CRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="odStation2Tiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Overdue", propOrder = {
    "odtime",
    "isOverdueAt",
    "odStation1",
    "odStation1CRS",
    "odStation1Tiploc",
    "odStation2",
    "odStation2CRS",
    "odStation2Tiploc"
})
public class Overdue {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar odtime;
    protected boolean isOverdueAt;
    @XmlElement(required = true)
    protected String odStation1;
    @XmlElement(required = true)
    protected String odStation1CRS;
    @XmlElement(required = true)
    protected String odStation1Tiploc;
    protected String odStation2;
    protected String odStation2CRS;
    protected String odStation2Tiploc;

    /**
     * Gets the value of the odtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOdtime() {
        return odtime;
    }

    /**
     * Sets the value of the odtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOdtime(XMLGregorianCalendar value) {
        this.odtime = value;
    }

    /**
     * Gets the value of the isOverdueAt property.
     * 
     */
    public boolean isIsOverdueAt() {
        return isOverdueAt;
    }

    /**
     * Sets the value of the isOverdueAt property.
     * 
     */
    public void setIsOverdueAt(boolean value) {
        this.isOverdueAt = value;
    }

    /**
     * Gets the value of the odStation1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdStation1() {
        return odStation1;
    }

    /**
     * Sets the value of the odStation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdStation1(String value) {
        this.odStation1 = value;
    }

    /**
     * Gets the value of the odStation1CRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdStation1CRS() {
        return odStation1CRS;
    }

    /**
     * Sets the value of the odStation1CRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdStation1CRS(String value) {
        this.odStation1CRS = value;
    }

    /**
     * Gets the value of the odStation1Tiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdStation1Tiploc() {
        return odStation1Tiploc;
    }

    /**
     * Sets the value of the odStation1Tiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdStation1Tiploc(String value) {
        this.odStation1Tiploc = value;
    }

    /**
     * Gets the value of the odStation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdStation2() {
        return odStation2;
    }

    /**
     * Sets the value of the odStation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdStation2(String value) {
        this.odStation2 = value;
    }

    /**
     * Gets the value of the odStation2CRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdStation2CRS() {
        return odStation2CRS;
    }

    /**
     * Sets the value of the odStation2CRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdStation2CRS(String value) {
        this.odStation2CRS = value;
    }

    /**
     * Gets the value of the odStation2Tiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdStation2Tiploc() {
        return odStation2Tiploc;
    }

    /**
     * Sets the value of the odStation2Tiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdStation2Tiploc(String value) {
        this.odStation2Tiploc = value;
    }

}
