//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.12 at 11:16:55 AM PDT 
//


package com.truthfulgiant.xbeeswitchcontrol.protocol.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetMultipleSwitchesCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetMultipleSwitchesCommand">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractCommand">
 *       &lt;sequence>
 *         &lt;element name="SwitchOffset" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="SwitchBitMask" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMultipleSwitchesCommand", propOrder = {
    "switchOffset",
    "switchBitMask"
})
public class SetMultipleSwitchesCommand
    extends AbstractCommand
{

    @XmlElement(name = "SwitchOffset")
    @XmlSchemaType(name = "unsignedShort")
    protected int switchOffset;
    @XmlElement(name = "SwitchBitMask", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger switchBitMask;

    /**
     * Gets the value of the switchOffset property.
     * 
     */
    public int getSwitchOffset() {
        return switchOffset;
    }

    /**
     * Sets the value of the switchOffset property.
     * 
     */
    public void setSwitchOffset(int value) {
        this.switchOffset = value;
    }

    /**
     * Gets the value of the switchBitMask property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwitchBitMask() {
        return switchBitMask;
    }

    /**
     * Sets the value of the switchBitMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwitchBitMask(BigInteger value) {
        this.switchBitMask = value;
    }

}
