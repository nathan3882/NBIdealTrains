
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A Station name reference data item.
 * 
 * <p>Java class for StationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationName">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
 *       &lt;attribute name="crs" use="required" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationName", propOrder = {
    "value"
})
public class StationName {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "crs", required = true)
    protected String crs;

    /**
     * The display name of a Station location
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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

}
