//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 08:08:31 PM GST 
//


package org.opentravel.ota.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Code and optional string to describe a location point.
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "value"
})
@XmlSeeAlso({
    org.opentravel.ota.beans.VerificationType.StartLocation.class,
    org.opentravel.ota.beans.VerificationType.EndLocation.class,
    org.opentravel.ota.beans.ConnectionType.ConnectionLocation.class,
    org.opentravel.ota.beans.RailOriginDestinationInformationType.OriginLocation.class,
    org.opentravel.ota.beans.RailOriginDestinationInformationType.DestinationLocation.class,
    org.opentravel.ota.beans.RailOriginDestinationSummaryType.OriginLocation.class,
    org.opentravel.ota.beans.RailOriginDestinationSummaryType.DestinationLocation.class,
    LocationPrefType.class,
    org.opentravel.ota.beans.VehicleAvailCoreType.VendorLocation.class,
    org.opentravel.ota.beans.VehicleAvailCoreType.DropOffLocation.class,
    StationType.class,
    org.opentravel.ota.beans.VehicleRentalCoreType.PickUpLocation.class,
    org.opentravel.ota.beans.VehicleRentalCoreType.ReturnLocation.class,
    org.opentravel.ota.beans.ItemSearchCriterionType.CodeRef.class,
    AirportPrefType.class,
    org.opentravel.ota.beans.VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation.class,
    org.opentravel.ota.beans.RailConnectionType.ConnectionLocation.class,
    org.opentravel.ota.beans.OriginDestinationInformationType.OriginLocation.class,
    org.opentravel.ota.beans.OriginDestinationInformationType.DestinationLocation.class
})
public class LocationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

}
