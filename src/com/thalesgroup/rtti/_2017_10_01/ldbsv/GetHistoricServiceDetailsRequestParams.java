
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.DepBoardDateType;


/**
 * <p>Java class for GetHistoricServiceDetailsRequestParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistoricServiceDetailsRequestParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceUID" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}UIDType"/>
 *         &lt;element name="scheduleStartDate" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}DepBoardDateType" minOccurs="0"/>
 *         &lt;element name="historicDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistoricServiceDetailsRequestParams", propOrder = {
    "serviceUID",
    "scheduleStartDate",
    "historicDateTime"
})
public class GetHistoricServiceDetailsRequestParams {

    @XmlElement(required = true)
    protected String serviceUID;
    @XmlElementRef(name = "scheduleStartDate", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<DepBoardDateType> scheduleStartDate;
    @XmlElementRef(name = "historicDateTime", namespace = "http://thalesgroup.com/RTTI/2017-10-01/ldbsv/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> historicDateTime;

    /**
     * Gets the value of the serviceUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUID() {
        return serviceUID;
    }

    /**
     * Sets the value of the serviceUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUID(String value) {
        this.serviceUID = value;
    }

    /**
     * Gets the value of the scheduleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}
     *     
     */
    public JAXBElement<DepBoardDateType> getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepBoardDateType }{@code >}
     *     
     */
    public void setScheduleStartDate(JAXBElement<DepBoardDateType> value) {
        this.scheduleStartDate = value;
    }

    /**
     * Gets the value of the historicDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getHistoricDateTime() {
        return historicDateTime;
    }

    /**
     * Sets the value of the historicDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setHistoricDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.historicDateTime = value;
    }

}
