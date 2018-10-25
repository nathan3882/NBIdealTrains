
package com.thalesgroup.rtti._2016_02_16.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2014_02_20.ldbsv.types.BaseStationBoard;


/**
 * A structure containing details of a next/fastest departures board for a specific location.
 * 
 * <p>Java class for DeparturesBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeparturesBoard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}BaseStationBoard">
 *       &lt;sequence>
 *         &lt;element name="departures" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}ArrayOfDepartureItems"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeparturesBoard", propOrder = {
    "departures"
})
public class DeparturesBoard
    extends BaseStationBoard
{

    @XmlElement(required = true)
    protected ArrayOfDepartureItems departures;

    /**
     * Gets the value of the departures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartureItems }
     *     
     */
    public ArrayOfDepartureItems getDepartures() {
        return departures;
    }

    /**
     * Sets the value of the departures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartureItems }
     *     
     */
    public void setDepartures(ArrayOfDepartureItems value) {
        this.departures = value;
    }

}
