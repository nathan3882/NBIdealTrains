
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.types.StationBoardWithDetails;


/**
 * <p>Java class for GetStationBoardWithDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStationBoardWithDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetBoardWithDetailsResult" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}StationBoardWithDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStationBoardWithDetailsResponseType", propOrder = {
    "getBoardWithDetailsResult"
})
public class GetStationBoardWithDetailsResponseType {

    @XmlElement(name = "GetBoardWithDetailsResult")
    protected StationBoardWithDetails getBoardWithDetailsResult;

    /**
     * Gets the value of the getBoardWithDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link StationBoardWithDetails }
     *     
     */
    public StationBoardWithDetails getGetBoardWithDetailsResult() {
        return getBoardWithDetailsResult;
    }

    /**
     * Sets the value of the getBoardWithDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationBoardWithDetails }
     *     
     */
    public void setGetBoardWithDetailsResult(StationBoardWithDetails value) {
        this.getBoardWithDetailsResult = value;
    }

}
