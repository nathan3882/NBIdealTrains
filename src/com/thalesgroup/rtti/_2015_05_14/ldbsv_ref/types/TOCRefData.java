
package com.thalesgroup.rtti._2015_05_14.ldbsv_ref.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference data giving all the known TOC codes and their display names.
 * 
 * <p>Java class for TOCRefData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOCRefData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/types}RefDataVersion"/>
 *         &lt;element name="TOCList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TOC" type="{http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/types}TOCName" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TOCRefData", propOrder = {
    "version",
    "tocList"
})
public class TOCRefData {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(name = "TOCList", required = true, nillable = true)
    protected TOCRefData.TOCList tocList;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the tocList property.
     * 
     * @return
     *     possible object is
     *     {@link TOCRefData.TOCList }
     *     
     */
    public TOCRefData.TOCList getTOCList() {
        return tocList;
    }

    /**
     * Sets the value of the tocList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOCRefData.TOCList }
     *     
     */
    public void setTOCList(TOCRefData.TOCList value) {
        this.tocList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TOC" type="{http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/types}TOCName" maxOccurs="unbounded" minOccurs="0"/>
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
        "toc"
    })
    public static class TOCList {

        @XmlElement(name = "TOC")
        protected List<TOCName> toc;

        /**
         * Gets the value of the toc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the toc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTOC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TOCName }
         * 
         * 
         */
        public List<TOCName> getTOC() {
            if (toc == null) {
                toc = new ArrayList<TOCName>();
            }
            return this.toc;
        }

    }

}
