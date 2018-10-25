
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2016_02_16.ldbsv.types.StationHeaderTrunc;


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
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}StationHeaderTrunc">
 *       &lt;sequence>
 *         &lt;element name="trainServices" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}ArrayOfServiceItemsWithLocations" minOccurs="0"/>
 *         &lt;element name="busServices" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}ArrayOfServiceItemsWithLocations" minOccurs="0"/>
 *         &lt;element name="ferryServices" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}ArrayOfServiceItemsWithLocations" minOccurs="0"/>
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
    "trainServices",
    "busServices",
    "ferryServices"
})
public class StationBoardWithDetails
    extends StationHeaderTrunc
{

    protected ArrayOfServiceItemsWithLocations trainServices;
    protected ArrayOfServiceItemsWithLocations busServices;
    protected ArrayOfServiceItemsWithLocations ferryServices;

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
