
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure containing details of an individual service obtained from a departure board.
 * 
 * <p>Java class for ServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}BaseServiceDetails">
 *       &lt;sequence>
 *         &lt;element name="locations" type="{http://thalesgroup.com/RTTI/2014-02-20/ldbsv/types}ArrayOfServiceLocations"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDetails", propOrder = {
    "locations"
})
public class ServiceDetails
    extends BaseServiceDetails
{

    @XmlElement(required = true)
    protected ArrayOfServiceLocations locations;

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setLocations(ArrayOfServiceLocations value) {
        this.locations = value;
    }

}
