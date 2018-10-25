
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Formation data with the Tiploc code of the calling point where it applies. The contents may be empty if there is no known formation data at the identified calling point.
 * 
 * <p>Java class for LocFormationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocFormationData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}FormationData">
 *       &lt;attribute name="tiploc" use="required" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocFormationData")
public class LocFormationData
    extends FormationData
{

    @XmlAttribute(name = "tiploc", required = true)
    protected String tiploc;

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

}
