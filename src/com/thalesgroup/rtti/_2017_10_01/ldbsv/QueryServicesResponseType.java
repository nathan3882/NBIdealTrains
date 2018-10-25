
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2016_02_16.ldbsv.types.ServiceList;


/**
 * <p>Java class for QueryServicesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryServicesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryServicesResult" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}ServiceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryServicesResponseType", propOrder = {
    "queryServicesResult"
})
public class QueryServicesResponseType {

    @XmlElement(name = "QueryServicesResult")
    protected ServiceList queryServicesResult;

    /**
     * Gets the value of the queryServicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceList }
     *     
     */
    public ServiceList getQueryServicesResult() {
        return queryServicesResult;
    }

    /**
     * Sets the value of the queryServicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceList }
     *     
     */
    public void setQueryServicesResult(ServiceList value) {
        this.queryServicesResult = value;
    }

}
