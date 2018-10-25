
package com.thalesgroup.rtti._2017_10_01.ldbsv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDisruptionListRequestParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDisruptionListRequestParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRSList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisruptionListRequestParams", propOrder = {
    "crsList"
})
public class GetDisruptionListRequestParams {

    @XmlElement(name = "CRSList", required = true)
    protected GetDisruptionListRequestParams.CRSList crsList;

    /**
     * Gets the value of the crsList property.
     * 
     * @return
     *     possible object is
     *     {@link GetDisruptionListRequestParams.CRSList }
     *     
     */
    public GetDisruptionListRequestParams.CRSList getCRSList() {
        return crsList;
    }

    /**
     * Sets the value of the crsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDisruptionListRequestParams.CRSList }
     *     
     */
    public void setCRSList(GetDisruptionListRequestParams.CRSList value) {
        this.crsList = value;
    }


    /**
     * A list of CRS Codes.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "crs"
    })
    public static class CRSList {

        @XmlElement(required = true)
        protected List<String> crs;

        /**
         * Gets the value of the crs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCrs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCrs() {
            if (crs == null) {
                crs = new ArrayList<String>();
            }
            return this.crs;
        }

    }

}
