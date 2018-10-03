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
 * 
 * 				Contains a list of references to material attached to this XML instance or outside the scope of it, and which enrich or support the learner’s information.
 * 			
 * 
 * <p>Java-Klasse für GenericDocumentationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GenericDocumentationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Heading" type="{http://europass.cedefop.europa.eu/Europass}DocumentationHeadingLabelType" minOccurs="0"/&gt;
 *         &lt;element name="InterDocument" type="{http://europass.cedefop.europa.eu/Europass}InterDocumentDocumentationType" minOccurs="0"/&gt;
 *         &lt;element name="IntraDocument" type="{http://europass.cedefop.europa.eu/Europass}IntraDocumentDocumentationType" minOccurs="0"/&gt;
 *         &lt;element name="ExtraDocument" type="{http://europass.cedefop.europa.eu/Europass}ExtraDocumentDocumentationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericDocumentationType", propOrder = {
    "heading",
    "interDocument",
    "intraDocument",
    "extraDocument"
})
public class GenericDocumentationType {

    @XmlElement(name = "Heading")
    protected DocumentationHeadingLabelType heading;
    @XmlElement(name = "InterDocument")
    protected InterDocumentDocumentationType interDocument;
    @XmlElement(name = "IntraDocument")
    protected IntraDocumentDocumentationType intraDocument;
    @XmlElement(name = "ExtraDocument")
    protected ExtraDocumentDocumentationType extraDocument;

    /**
     * Ruft den Wert der heading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationHeadingLabelType }
     *     
     */
    public DocumentationHeadingLabelType getHeading() {
        return heading;
    }

    /**
     * Legt den Wert der heading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationHeadingLabelType }
     *     
     */
    public void setHeading(DocumentationHeadingLabelType value) {
        this.heading = value;
    }

    /**
     * Ruft den Wert der interDocument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterDocumentDocumentationType }
     *     
     */
    public InterDocumentDocumentationType getInterDocument() {
        return interDocument;
    }

    /**
     * Legt den Wert der interDocument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterDocumentDocumentationType }
     *     
     */
    public void setInterDocument(InterDocumentDocumentationType value) {
        this.interDocument = value;
    }

    /**
     * Ruft den Wert der intraDocument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntraDocumentDocumentationType }
     *     
     */
    public IntraDocumentDocumentationType getIntraDocument() {
        return intraDocument;
    }

    /**
     * Legt den Wert der intraDocument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraDocumentDocumentationType }
     *     
     */
    public void setIntraDocument(IntraDocumentDocumentationType value) {
        this.intraDocument = value;
    }

    /**
     * Ruft den Wert der extraDocument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDocumentDocumentationType }
     *     
     */
    public ExtraDocumentDocumentationType getExtraDocument() {
        return extraDocument;
    }

    /**
     * Legt den Wert der extraDocument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDocumentDocumentationType }
     *     
     */
    public void setExtraDocument(ExtraDocumentDocumentationType value) {
        this.extraDocument = value;
    }

}
