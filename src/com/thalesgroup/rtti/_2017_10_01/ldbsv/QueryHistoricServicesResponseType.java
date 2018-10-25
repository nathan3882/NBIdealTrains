
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2016_02_16.ldbsv.types.ServiceList;


/**
 * <p>Java class for QueryHistoricServicesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryHistoricServicesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryHistoricServicesResult" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}ServiceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryHistoricServicesResponseType", propOrder = {
    "queryHistoricServicesResult"
})
public class QueryHistoricServicesResponseType {

    @XmlElement(name = "QueryHistoricServicesResult")
    protected ServiceList queryHistoricServicesResult;

    /**
     * Gets the value of the queryHistoricServicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceList }
     *     
     */
    public ServiceList getQueryHistoricServicesResult() {
        return queryHistoricServicesResult;
    }

    /**
     * Sets the value of the queryHistoricServicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceList }
     *     
     */
    public void setQueryHistoricServicesResult(ServiceList value) {
        this.queryHistoricServicesResult = value;
    }

}
