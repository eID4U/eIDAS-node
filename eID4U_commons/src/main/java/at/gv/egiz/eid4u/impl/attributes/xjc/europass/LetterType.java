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
 * <p>Java-Klasse für LetterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LetterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Localisation" type="{http://europass.cedefop.europa.eu/Europass}LetterLocalisationType" minOccurs="0"/&gt;
 *         &lt;element name="SubjectLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpeningSalutation" type="{http://europass.cedefop.europa.eu/Europass}OpeningSalutationType" minOccurs="0"/&gt;
 *         &lt;element name="Body" type="{http://europass.cedefop.europa.eu/Europass}BodyType" minOccurs="0"/&gt;
 *         &lt;element name="ClosingSalutation" type="{http://europass.cedefop.europa.eu/Europass}ClosingSalutationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterType", propOrder = {
    "localisation",
    "subjectLine",
    "openingSalutation",
    "body",
    "closingSalutation"
})
public class LetterType {

    @XmlElement(name = "Localisation")
    protected LetterLocalisationType localisation;
    @XmlElement(name = "SubjectLine")
    protected String subjectLine;
    @XmlElement(name = "OpeningSalutation")
    protected OpeningSalutationType openingSalutation;
    @XmlElement(name = "Body")
    protected BodyType body;
    @XmlElement(name = "ClosingSalutation")
    protected ClosingSalutationType closingSalutation;

    /**
     * Ruft den Wert der localisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LetterLocalisationType }
     *     
     */
    public LetterLocalisationType getLocalisation() {
        return localisation;
    }

    /**
     * Legt den Wert der localisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterLocalisationType }
     *     
     */
    public void setLocalisation(LetterLocalisationType value) {
        this.localisation = value;
    }

    /**
     * Ruft den Wert der subjectLine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectLine() {
        return subjectLine;
    }

    /**
     * Legt den Wert der subjectLine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectLine(String value) {
        this.subjectLine = value;
    }

    /**
     * Ruft den Wert der openingSalutation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OpeningSalutationType }
     *     
     */
    public OpeningSalutationType getOpeningSalutation() {
        return openingSalutation;
    }

    /**
     * Legt den Wert der openingSalutation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningSalutationType }
     *     
     */
    public void setOpeningSalutation(OpeningSalutationType value) {
        this.openingSalutation = value;
    }

    /**
     * Ruft den Wert der body-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getBody() {
        return body;
    }

    /**
     * Legt den Wert der body-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setBody(BodyType value) {
        this.body = value;
    }

    /**
     * Ruft den Wert der closingSalutation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClosingSalutationType }
     *     
     */
    public ClosingSalutationType getClosingSalutation() {
        return closingSalutation;
    }

    /**
     * Legt den Wert der closingSalutation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingSalutationType }
     *     
     */
    public void setClosingSalutation(ClosingSalutationType value) {
        this.closingSalutation = value;
    }

}
