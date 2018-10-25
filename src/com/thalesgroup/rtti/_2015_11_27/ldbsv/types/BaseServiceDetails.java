
package com.thalesgroup.rtti._2015_11_27.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure containing details of an individual service.
 * 
 * <p>Java class for BaseServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}BaseServiceDetails">
 *       &lt;sequence>
 *         &lt;element name="isCharter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceDetails", propOrder = {
    "isCharter"
})
@XmlSeeAlso({
    HistoricServiceDetails.class,
    ServiceDetails.class
})
public class BaseServiceDetails
    extends com.thalesgroup.rtti._2014_02_20.ldbsv.types.BaseServiceDetails
{

    @XmlElement(defaultValue = "false")
    protected Boolean isCharter;

    /**
     * Gets the value of the isCharter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCharter() {
        return isCharter;
    }

    /**
     * Sets the value of the isCharter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCharter(Boolean value) {
        this.isCharter = value;
    }

}
