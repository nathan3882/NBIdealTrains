
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.DepBoardDateType;


/**
 * <p>Java class for GetHistoricTimeLineRequestParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistoricTimeLineRequestParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceUID" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}UIDType"/>
 *         &lt;element name="scheduleStartDate" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}DepBoardDateType"/>
 *         &lt;element name="historicDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fullTiploc" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}FullTiplocType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistoricTimeLineRequestParams", propOrder = {
    "serviceUID",
    "scheduleStartDate",
    "historicDateTime",
    "fullTiploc"
})
public class GetHistoricTimeLineRequestParams {

    @XmlElement(required = true)
    protected String serviceUID;
    @XmlElement(required = true)
    protected DepBoardDateType scheduleStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historicDateTime;
    @XmlElement(required = true)
    protected String fullTiploc;

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
     *     {@link DepBoardDateType }
     *     
     */
    public DepBoardDateType getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBoardDateType }
     *     
     */
    public void setScheduleStartDate(DepBoardDateType value) {
        this.scheduleStartDate = value;
    }

    /**
     * Gets the value of the historicDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoricDateTime() {
        return historicDateTime;
    }

    /**
     * Sets the value of the historicDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoricDateTime(XMLGregorianCalendar value) {
        this.historicDateTime = value;
    }

    /**
     * Gets the value of the fullTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullTiploc() {
        return fullTiploc;
    }

    /**
     * Sets the value of the fullTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullTiploc(String value) {
        this.fullTiploc = value;
    }

}
