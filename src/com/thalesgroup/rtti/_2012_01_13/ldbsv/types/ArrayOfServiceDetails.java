
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of ServiceDetails.
 * 
 * <p>Java class for ArrayOfServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceDetails" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ServiceDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceDetails", propOrder = {
    "serviceDetails"
})
public class ArrayOfServiceDetails {

    @XmlElement(nillable = true)
    protected List<ServiceDetails> serviceDetails;

    /**
     * Gets the value of the serviceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDetails }
     * 
     * 
     */
    public List<ServiceDetails> getServiceDetails() {
        if (serviceDetails == null) {
            serviceDetails = new ArrayList<ServiceDetails>();
        }
        return this.serviceDetails;
    }

}
