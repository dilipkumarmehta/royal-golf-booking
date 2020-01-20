//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 08:08:31 PM GST 
//


package org.opentravel.ota.beans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines rail availability and schedule search criteria, including origin-destination information and train number and network code.
 * 
 * <p>Java class for RailAvailScheduleQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailAvailScheduleQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationInformation" type="{http://www.opentravel.org/OTA/2003/05}RailOriginDestinationInformationType"/>
 *         &lt;element name="RailSearchCriteria" type="{http://www.opentravel.org/OTA/2003/05}TrainQueryType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxConnections" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TrainTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailAvailScheduleQueryType", propOrder = {
    "originDestinationInformation",
    "railSearchCriteria"
})
public class RailAvailScheduleQueryType {

    @XmlElement(name = "OriginDestinationInformation", required = true)
    protected RailOriginDestinationInformationType originDestinationInformation;
    @XmlElement(name = "RailSearchCriteria")
    protected List<TrainQueryType> railSearchCriteria;
    @XmlAttribute(name = "MaxConnections")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxConnections;
    @XmlAttribute(name = "TrainTypeCode")
    protected String trainTypeCode;

    /**
     * Gets the value of the originDestinationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RailOriginDestinationInformationType }
     *     
     */
    public RailOriginDestinationInformationType getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * Sets the value of the originDestinationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailOriginDestinationInformationType }
     *     
     */
    public void setOriginDestinationInformation(RailOriginDestinationInformationType value) {
        this.originDestinationInformation = value;
    }

    /**
     * Gets the value of the railSearchCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSearchCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailSearchCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainQueryType }
     * 
     * 
     */
    public List<TrainQueryType> getRailSearchCriteria() {
        if (railSearchCriteria == null) {
            railSearchCriteria = new ArrayList<TrainQueryType>();
        }
        return this.railSearchCriteria;
    }

    /**
     * Gets the value of the maxConnections property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConnections() {
        return maxConnections;
    }

    /**
     * Sets the value of the maxConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConnections(BigInteger value) {
        this.maxConnections = value;
    }

    /**
     * Gets the value of the trainTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainTypeCode() {
        return trainTypeCode;
    }

    /**
     * Sets the value of the trainTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainTypeCode(String value) {
        this.trainTypeCode = value;
    }

}
