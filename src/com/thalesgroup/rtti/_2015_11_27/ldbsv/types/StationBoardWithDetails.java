
package com.thalesgroup.rtti._2015_11_27.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2014_02_20.ldbsv.types.BaseStationBoard;


/**
 * A structure containing details of a "WithDetails" departure board for a specific location.
 * 
 * <p>Java class for StationBoardWithDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationBoardWithDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}BaseStationBoard">
 *       &lt;sequence>
 *         &lt;element name="isTruncated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainServices" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}ArrayOfServiceItemsWithLocations" minOccurs="0"/>
 *         &lt;element name="busServices" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}ArrayOfServiceItemsWithLocations" minOccurs="0"/>
 *         &lt;element name="ferryServices" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}ArrayOfServiceItemsWithLocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationBoardWithDetails", propOrder = {
    "isTruncated",
    "trainServices",
    "busServices",
    "ferryServices"
})
public class StationBoardWithDetails
    extends BaseStationBoard
{

    @XmlElement(defaultValue = "false")
    protected Boolean isTruncated;
    protected ArrayOfServiceItemsWithLocations trainServices;
    protected ArrayOfServiceItemsWithLocations busServices;
    protected ArrayOfServiceItemsWithLocations ferryServices;

    /**
     * Gets the value of the isTruncated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * Sets the value of the isTruncated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTruncated(Boolean value) {
        this.isTruncated = value;
    }

    /**
     * Gets the value of the trainServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItemsWithLocations }
     *     
     */
    public ArrayOfServiceItemsWithLocations getTrainServices() {
        return trainServices;
    }

    /**
     * Sets the value of the trainServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItemsWithLocations }
     *     
     */
    public void setTrainServices(ArrayOfServiceItemsWithLocations value) {
        this.trainServices = value;
    }

    /**
     * Gets the value of the busServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItemsWithLocations }
     *     
     */
    public ArrayOfServiceItemsWithLocations getBusServices() {
        return busServices;
    }

    /**
     * Sets the value of the busServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItemsWithLocations }
     *     
     */
    public void setBusServices(ArrayOfServiceItemsWithLocations value) {
        this.busServices = value;
    }

    /**
     * Gets the value of the ferryServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItemsWithLocations }
     *     
     */
    public ArrayOfServiceItemsWithLocations getFerryServices() {
        return ferryServices;
    }

    /**
     * Sets the value of the ferryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItemsWithLocations }
     *     
     */
    public void setFerryServices(ArrayOfServiceItemsWithLocations value) {
        this.ferryServices = value;
    }

}
