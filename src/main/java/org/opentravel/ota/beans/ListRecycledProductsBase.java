//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 08:08:31 PM GST 
//


package org.opentravel.ota.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_RecycledProducts_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_RecycledProducts_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aluminum"/>
 *     &lt;enumeration value="Batteries"/>
 *     &lt;enumeration value="ComputerParts"/>
 *     &lt;enumeration value="Glass"/>
 *     &lt;enumeration value="Lightbulbs"/>
 *     &lt;enumeration value="Paper"/>
 *     &lt;enumeration value="Plastic"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_RecycledProducts_Base")
@XmlEnum
public enum ListRecycledProductsBase {

    @XmlEnumValue("Aluminum")
    ALUMINUM("Aluminum"),
    @XmlEnumValue("Batteries")
    BATTERIES("Batteries"),
    @XmlEnumValue("ComputerParts")
    COMPUTER_PARTS("ComputerParts"),
    @XmlEnumValue("Glass")
    GLASS("Glass"),
    @XmlEnumValue("Lightbulbs")
    LIGHTBULBS("Lightbulbs"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    @XmlEnumValue("Plastic")
    PLASTIC("Plastic"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListRecycledProductsBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListRecycledProductsBase fromValue(String v) {
        for (ListRecycledProductsBase c: ListRecycledProductsBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
