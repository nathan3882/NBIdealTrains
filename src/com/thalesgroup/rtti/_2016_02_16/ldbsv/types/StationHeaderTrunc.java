
package com.thalesgroup.rtti._2016_02_16.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2014_02_20.ldbsv.types.BaseStationBoard;


/**
 * A structure containing details of a departure board for a specific location with a "truncated data" indicator.
 * 
 * <p>Java class for StationHeaderTrunc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationHeaderTrunc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}BaseStationBoard">
 *       &lt;sequence>
 *         &lt;element name="isTruncated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationHeaderTrunc", propOrder = {
    "isTruncated"
})
@XmlSeeAlso({
    com.thalesgroup.rtti._2016_02_16.ldbsv.types.StationBoardWithDetails.class,
    com.thalesgroup.rtti._2017_10_01.ldbsv.types.StationBoardWithDetails.class,
    StationHeaderQos.class
})
public class StationHeaderTrunc
    extends BaseStationBoard
{

    @XmlElement(defaultValue = "false")
    protected Boolean isTruncated;

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

}
