
package com.thalesgroup.rtti._2017_10_01.ldbsv.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of next/fastest services with calling points on a departures board.
 * 
 * <p>Java class for ArrayOfDepartureItemsWithLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDepartureItemsWithLocations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destination" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}DepartureItemWithLocations" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDepartureItemsWithLocations", propOrder = {
    "destination"
})
public class ArrayOfDepartureItemsWithLocations {

    protected List<DepartureItemWithLocations> destination;

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartureItemWithLocations }
     * 
     * 
     */
    public List<DepartureItemWithLocations> getDestination() {
        if (destination == null) {
            destination = new ArrayList<DepartureItemWithLocations>();
        }
        return this.destination;
    }

}
