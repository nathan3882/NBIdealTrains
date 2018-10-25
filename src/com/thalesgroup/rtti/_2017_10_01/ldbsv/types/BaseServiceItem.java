
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual service's summary details for display on a departure board.
 * 
 * <p>Java class for BaseServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}BaseServiceItem">
 *       &lt;sequence>
 *         &lt;element name="formation" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}FormationData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceItem", propOrder = {
    "formation"
})
@XmlSeeAlso({
    BaseServiceItemWithEndPoints.class
})
public class BaseServiceItem
    extends com.thalesgroup.rtti._2016_02_16.ldbsv.types.BaseServiceItem
{

    protected FormationData formation;

    /**
     * Gets the value of the formation property.
     * 
     * @return
     *     possible object is
     *     {@link FormationData }
     *     
     */
    public FormationData getFormation() {
        return formation;
    }

    /**
     * Sets the value of the formation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormationData }
     *     
     */
    public void setFormation(FormationData value) {
        this.formation = value;
    }

}
