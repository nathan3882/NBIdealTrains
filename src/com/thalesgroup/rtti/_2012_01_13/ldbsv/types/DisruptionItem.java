
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure containing details of each disruption message active at a particular station.
 * 
 * <p>Java class for DisruptionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisruptionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="disruptions" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfDisruptionMessages"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisruptionItem", propOrder = {
    "generatedAt",
    "crs",
    "disruptions"
})
public class DisruptionItem {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedAt;
    @XmlElement(required = true, nillable = true)
    protected String crs;
    @XmlElement(required = true)
    protected ArrayOfDisruptionMessages disruptions;

    /**
     * Gets the value of the generatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Sets the value of the generatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneratedAt(XMLGregorianCalendar value) {
        this.generatedAt = value;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrs(String value) {
        this.crs = value;
    }

    /**
     * Gets the value of the disruptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDisruptionMessages }
     *     
     */
    public ArrayOfDisruptionMessages getDisruptions() {
        return disruptions;
    }

    /**
     * Sets the value of the disruptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDisruptionMessages }
     *     
     */
    public void setDisruptions(ArrayOfDisruptionMessages value) {
        this.disruptions = value;
    }

}
