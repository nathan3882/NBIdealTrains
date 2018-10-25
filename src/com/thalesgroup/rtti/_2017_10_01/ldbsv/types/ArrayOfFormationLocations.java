
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of the train formation data at each non-cancelled calling point of the train running the schedule.
 * 
 * <p>Java class for ArrayOfFormationLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFormationLocations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fmloc" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}LocFormationData" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFormationLocations", propOrder = {
    "fmloc"
})
public class ArrayOfFormationLocations {

    @XmlElement(required = true)
    protected List<LocFormationData> fmloc;

    /**
     * Gets the value of the fmloc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fmloc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFmloc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocFormationData }
     * 
     * 
     */
    public List<LocFormationData> getFmloc() {
        if (fmloc == null) {
            fmloc = new ArrayList<LocFormationData>();
        }
        return this.fmloc;
    }

}
