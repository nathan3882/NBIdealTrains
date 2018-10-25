
package com.thalesgroup.rtti._2015_11_27.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2014_02_20.ldbsv.types.ArrayOfEndPointLocations;


/**
 * <p>Java class for BaseServiceItemWithEndPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceItemWithEndPoints">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}BaseServiceItem">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="currentOrigins" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *         &lt;element name="currentDestinations" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfEndPointLocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceItemWithEndPoints", propOrder = {
    "origin",
    "destination",
    "currentOrigins",
    "currentDestinations"
})
@XmlSeeAlso({
    HistoricServiceItem.class,
    ServiceItem.class
})
public class BaseServiceItemWithEndPoints
    extends BaseServiceItem
{

    protected ArrayOfEndPointLocations origin;
    protected ArrayOfEndPointLocations destination;
    protected ArrayOfEndPointLocations currentOrigins;
    protected ArrayOfEndPointLocations currentDestinations;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setOrigin(ArrayOfEndPointLocations value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setDestination(ArrayOfEndPointLocations value) {
        this.destination = value;
    }

    /**
     * Gets the value of the currentOrigins property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getCurrentOrigins() {
        return currentOrigins;
    }

    /**
     * Sets the value of the currentOrigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setCurrentOrigins(ArrayOfEndPointLocations value) {
        this.currentOrigins = value;
    }

    /**
     * Gets the value of the currentDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public ArrayOfEndPointLocations getCurrentDestinations() {
        return currentDestinations;
    }

    /**
     * Sets the value of the currentDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndPointLocations }
     *     
     */
    public void setCurrentDestinations(ArrayOfEndPointLocations value) {
        this.currentDestinations = value;
    }

}
