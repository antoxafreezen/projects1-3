//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.10 at 09:32:55 PM EET 
//


package ua.kiev.univ.cyb.project3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHotels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeHotels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stars">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="food" type="{http://aaa.com/Purchase}typeYesNo"/>
 *         &lt;element name="foodType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="HB"/>
 *               &lt;enumeration value="BB"/>
 *               &lt;enumeration value="AI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="room">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;maxInclusive value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tv" type="{http://aaa.com/Purchase}typeYesNo"/>
 *         &lt;element name="conditioner" type="{http://aaa.com/Purchase}typeYesNo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeHotels", namespace = "http://aaa.com/Purchase", propOrder = {
    "stars",
    "food",
    "foodType",
    "room",
    "tv",
    "conditioner"
})
public class TypeHotels {

    protected int stars;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeYesNo food;
    protected String foodType;
    protected int room;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeYesNo tv;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeYesNo conditioner;

    /**
     * Gets the value of the stars property.
     * 
     */
    public int getStars() {
        return stars;
    }

    /**
     * Sets the value of the stars property.
     * 
     */
    public void setStars(int value) {
        this.stars = value;
    }

    /**
     * Gets the value of the food property.
     * 
     * @return
     *     possible object is
     *     {@link TypeYesNo }
     *     
     */
    public TypeYesNo getFood() {
        return food;
    }

    /**
     * Sets the value of the food property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeYesNo }
     *     
     */
    public void setFood(TypeYesNo value) {
        this.food = value;
    }

    /**
     * Gets the value of the foodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * Sets the value of the foodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodType(String value) {
        this.foodType = value;
    }

    /**
     * Gets the value of the room property.
     * 
     */
    public int getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     */
    public void setRoom(int value) {
        this.room = value;
    }

    /**
     * Gets the value of the tv property.
     * 
     * @return
     *     possible object is
     *     {@link TypeYesNo }
     *     
     */
    public TypeYesNo getTv() {
        return tv;
    }

    /**
     * Sets the value of the tv property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeYesNo }
     *     
     */
    public void setTv(TypeYesNo value) {
        this.tv = value;
    }

    /**
     * Gets the value of the conditioner property.
     * 
     * @return
     *     possible object is
     *     {@link TypeYesNo }
     *     
     */
    public TypeYesNo getConditioner() {
        return conditioner;
    }

    /**
     * Sets the value of the conditioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeYesNo }
     *     
     */
    public void setConditioner(TypeYesNo value) {
        this.conditioner = value;
    }

}