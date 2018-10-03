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
 * <p>Java-Klasse für CoverLetterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CoverLetterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Addressee" type="{http://europass.cedefop.europa.eu/Europass}AddresseeType" minOccurs="0"/&gt;
 *         &lt;element name="Letter" type="{http://europass.cedefop.europa.eu/Europass}LetterType" minOccurs="0"/&gt;
 *         &lt;element name="Documentation" type="{http://europass.cedefop.europa.eu/Europass}GenericDocumentationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverLetterType", propOrder = {
    "addressee",
    "letter",
    "documentation"
})
public class CoverLetterType {

    @XmlElement(name = "Addressee")
    protected AddresseeType addressee;
    @XmlElement(name = "Letter")
    protected LetterType letter;
    @XmlElement(name = "Documentation")
    protected GenericDocumentationType documentation;

    /**
     * Ruft den Wert der addressee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AddresseeType }
     *     
     */
    public AddresseeType getAddressee() {
        return addressee;
    }

    /**
     * Legt den Wert der addressee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AddresseeType }
     *     
     */
    public void setAddressee(AddresseeType value) {
        this.addressee = value;
    }

    /**
     * Ruft den Wert der letter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LetterType }
     *     
     */
    public LetterType getLetter() {
        return letter;
    }

    /**
     * Legt den Wert der letter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterType }
     *     
     */
    public void setLetter(LetterType value) {
        this.letter = value;
    }

    /**
     * Ruft den Wert der documentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericDocumentationType }
     *     
     */
    public GenericDocumentationType getDocumentation() {
        return documentation;
    }

    /**
     * Legt den Wert der documentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDocumentationType }
     *     
     */
    public void setDocumentation(GenericDocumentationType value) {
        this.documentation = value;
    }

}
