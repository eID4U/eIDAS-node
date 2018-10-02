//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.30 um 08:08:27 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 * 				A period is comprised of three sub elements for the start and end dates of the period, as well as an idicator whether the specific period is current. 
 * 				The end date and the current indicator are optional.
 * 			
 * 
 * <p>Java-Klasse für PeriodType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PeriodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="From" type="{http://europass.cedefop.europa.eu/Europass}DateType"/&gt;
 *         &lt;element name="To" type="{http://europass.cedefop.europa.eu/Europass}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="DurationEquivalent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodType", propOrder = {
    "from",
    "to",
    "current",
    "duration",
    "durationEquivalent"
})
public class PeriodType {

    @XmlElement(name = "From", required = true)
    protected DateType from;
    @XmlElement(name = "To")
    protected DateType to;
    @XmlElement(name = "Current")
    protected Boolean current;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "DurationEquivalent")
    protected String durationEquivalent;

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setFrom(DateType value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setTo(DateType value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der current-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrent() {
        return current;
    }

    /**
     * Legt den Wert der current-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(Boolean value) {
        this.current = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der durationEquivalent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationEquivalent() {
        return durationEquivalent;
    }

    /**
     * Legt den Wert der durationEquivalent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationEquivalent(String value) {
        this.durationEquivalent = value;
    }

}
