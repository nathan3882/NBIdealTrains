
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2016_02_16.ldbsv.types.HistoricTimeLine;


/**
 * <p>Java class for GetHistoricTimeLineResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistoricTimeLineResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetHistoricTimeLineResult" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}HistoricTimeLine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistoricTimeLineResponseType", propOrder = {
    "getHistoricTimeLineResult"
})
public class GetHistoricTimeLineResponseType {

    @XmlElement(name = "GetHistoricTimeLineResult")
    protected HistoricTimeLine getHistoricTimeLineResult;

    /**
     * Gets the value of the getHistoricTimeLineResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricTimeLine }
     *     
     */
    public HistoricTimeLine getGetHistoricTimeLineResult() {
        return getHistoricTimeLineResult;
    }

    /**
     * Sets the value of the getHistoricTimeLineResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricTimeLine }
     *     
     */
    public void setGetHistoricTimeLineResult(HistoricTimeLine value) {
        this.getHistoricTimeLineResult = value;
    }

}
