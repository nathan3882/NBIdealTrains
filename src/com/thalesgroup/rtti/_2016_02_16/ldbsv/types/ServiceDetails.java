
package com.thalesgroup.rtti._2016_02_16.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.ReasonCodeWithLocation;


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
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}BaseServiceDetails">
 *       &lt;sequence>
 *         &lt;element name="cancelReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="delayReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="category" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}TrainCategoryCode" minOccurs="0"/>
 *         &lt;element name="isReverseFormation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locations" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}ArrayOfServiceLocations"/>
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
    "cancelReason",
    "delayReason",
    "category",
    "isReverseFormation",
    "locations"
})
@XmlSeeAlso({
    com.thalesgroup.rtti._2017_10_01.ldbsv.types.ServiceDetails.class
})
public class ServiceDetails
    extends BaseServiceDetails
{

    protected ReasonCodeWithLocation cancelReason;
    protected ReasonCodeWithLocation delayReason;
    protected String category;
    @XmlElement(defaultValue = "false")
    protected Boolean isReverseFormation;
    @XmlElement(required = true)
    protected ArrayOfServiceLocations locations;

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public ReasonCodeWithLocation getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public void setCancelReason(ReasonCodeWithLocation value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the delayReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public ReasonCodeWithLocation getDelayReason() {
        return delayReason;
    }

    /**
     * Sets the value of the delayReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public void setDelayReason(ReasonCodeWithLocation value) {
        this.delayReason = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the isReverseFormation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReverseFormation() {
        return isReverseFormation;
    }

    /**
     * Sets the value of the isReverseFormation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReverseFormation(Boolean value) {
        this.isReverseFormation = value;
    }

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
