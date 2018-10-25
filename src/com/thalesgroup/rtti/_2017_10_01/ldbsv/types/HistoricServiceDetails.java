
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure containing details of a historic service details.
 * 
 * <p>Java class for HistoricServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricServiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}HistoricServiceDetails">
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
@XmlType(name = "HistoricServiceDetails", propOrder = {
    "formation"
})
public class HistoricServiceDetails
    extends com.thalesgroup.rtti._2016_02_16.ldbsv.types.HistoricServiceDetails
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
