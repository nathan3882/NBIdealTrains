
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.types.StationBoard;


/**
 * <p>Java class for GetBoardResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBoardResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetBoardResult" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}StationBoard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBoardResponseType", propOrder = {
    "getBoardResult"
})
public class GetBoardResponseType {

    @XmlElement(name = "GetBoardResult")
    protected StationBoard getBoardResult;

    /**
     * Gets the value of the getBoardResult property.
     * 
     * @return
     *     possible object is
     *     {@link StationBoard }
     *     
     */
    public StationBoard getGetBoardResult() {
        return getBoardResult;
    }

    /**
     * Sets the value of the getBoardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationBoard }
     *     
     */
    public void setGetBoardResult(StationBoard value) {
        this.getBoardResult = value;
    }

}
