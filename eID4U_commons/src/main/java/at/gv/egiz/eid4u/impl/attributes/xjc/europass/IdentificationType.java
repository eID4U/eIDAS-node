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
 * 				Contains the personal information of the individual, which includes at least the name, and optionally contact information, demographics, photo and signature.
 * 			
 * 
 * <p>Java-Klasse für IdentificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://europass.cedefop.europa.eu/Europass}PersonNameType" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://europass.cedefop.europa.eu/Europass}ContactInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Demographics" type="{http://europass.cedefop.europa.eu/Europass}DemographicsType" minOccurs="0"/&gt;
 *         &lt;element name="Photo" type="{http://europass.cedefop.europa.eu/Europass}PhotoDataType" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://europass.cedefop.europa.eu/Europass}SignatureDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", propOrder = {
    "personName",
    "contactInfo",
    "demographics",
    "photo",
    "signature"
})
public class IdentificationType {

    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "Demographics")
    protected DemographicsType demographics;
    @XmlElement(name = "Photo")
    protected PhotoDataType photo;
    @XmlElement(name = "Signature")
    protected SignatureDataType signature;

    /**
     * Ruft den Wert der personName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Legt den Wert der personName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Ruft den Wert der contactInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Legt den Wert der contactInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Ruft den Wert der demographics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType }
     *     
     */
    public DemographicsType getDemographics() {
        return demographics;
    }

    /**
     * Legt den Wert der demographics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType }
     *     
     */
    public void setDemographics(DemographicsType value) {
        this.demographics = value;
    }

    /**
     * Ruft den Wert der photo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhotoDataType }
     *     
     */
    public PhotoDataType getPhoto() {
        return photo;
    }

    /**
     * Legt den Wert der photo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoDataType }
     *     
     */
    public void setPhoto(PhotoDataType value) {
        this.photo = value;
    }

    /**
     * Ruft den Wert der signature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SignatureDataType }
     *     
     */
    public SignatureDataType getSignature() {
        return signature;
    }

    /**
     * Legt den Wert der signature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureDataType }
     *     
     */
    public void setSignature(SignatureDataType value) {
        this.signature = value;
    }

}
