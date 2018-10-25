
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual origin or destination location of a service. Note that vias will only be specified for destinations.
 * 
 * <p>Java class for EndPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndPointLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}EndPointLocation">
 *       &lt;sequence>
 *         &lt;element name="isOperationalEndPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPointLocation", propOrder = {
    "isOperationalEndPoint"
})
public class EndPointLocation
    extends com.thalesgroup.rtti._2012_01_13.ldbsv.types.EndPointLocation
{

    @XmlElement(defaultValue = "false")
    protected Boolean isOperationalEndPoint;

    /**
     * Gets the value of the isOperationalEndPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOperationalEndPoint() {
        return isOperationalEndPoint;
    }

    /**
     * Sets the value of the isOperationalEndPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOperationalEndPoint(Boolean value) {
        this.isOperationalEndPoint = value;
    }

}
