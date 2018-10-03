//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProficiencyLevelType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProficiencyLevelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Listening" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/&gt;
 *         &lt;element name="Reading" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/&gt;
 *         &lt;element name="SpokenInteraction" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/&gt;
 *         &lt;element name="SpokenProduction" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/&gt;
 *         &lt;element name="Writing" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProficiencyLevelType", propOrder = {
    "listening",
    "reading",
    "spokenInteraction",
    "spokenProduction",
    "writing"
})
public class ProficiencyLevelType {

    @XmlElement(name = "Listening")
    protected String listening;
    @XmlElement(name = "Reading")
    protected String reading;
    @XmlElement(name = "SpokenInteraction")
    protected String spokenInteraction;
    @XmlElement(name = "SpokenProduction")
    protected String spokenProduction;
    @XmlElement(name = "Writing")
    protected String writing;

    /**
     * Ruft den Wert der listening-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListening() {
        return listening;
    }

    /**
     * Legt den Wert der listening-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListening(String value) {
        this.listening = value;
    }

    /**
     * Ruft den Wert der reading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReading() {
        return reading;
    }

    /**
     * Legt den Wert der reading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReading(String value) {
        this.reading = value;
    }

    /**
     * Ruft den Wert der spokenInteraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpokenInteraction() {
        return spokenInteraction;
    }

    /**
     * Legt den Wert der spokenInteraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpokenInteraction(String value) {
        this.spokenInteraction = value;
    }

    /**
     * Ruft den Wert der spokenProduction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpokenProduction() {
        return spokenProduction;
    }

    /**
     * Legt den Wert der spokenProduction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpokenProduction(String value) {
        this.spokenProduction = value;
    }

    /**
     * Ruft den Wert der writing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriting() {
        return writing;
    }

    /**
     * Legt den Wert der writing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriting(String value) {
        this.writing = value;
    }

}
