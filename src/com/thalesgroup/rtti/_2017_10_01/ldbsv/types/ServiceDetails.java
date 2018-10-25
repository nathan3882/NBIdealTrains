
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure containing details of an individual service obtained from a departure board.
 * 
 * <p>Java class for ServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}ServiceDetails">
 *       &lt;sequence>
 *         &lt;element name="formation" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}ArrayOfFormationLocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDetails", propOrder = {
    "formation"
})
public class ServiceDetails
    extends com.thalesgroup.rtti._2016_02_16.ldbsv.types.ServiceDetails
{

    protected ArrayOfFormationLocations formation;

    /**
     * Gets the value of the formation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormationLocations }
     *     
     */
    public ArrayOfFormationLocations getFormation() {
        return formation;
    }

    /**
     * Sets the value of the formation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormationLocations }
     *     
     */
    public void setFormation(ArrayOfFormationLocations value) {
        this.formation = value;
    }

}
