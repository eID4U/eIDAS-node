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
 * 				Contains all the available methods of contacting individual.
 * 			
 * 
 * <p>Java-Klasse für ContactInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://europass.cedefop.europa.eu/Europass}ContactAddressType" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://europass.cedefop.europa.eu/Europass}ContactEmailType" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneList" type="{http://europass.cedefop.europa.eu/Europass}TelephoneListType" minOccurs="0"/&gt;
 *         &lt;element name="WebsiteList" type="{http://europass.cedefop.europa.eu/Europass}WebsiteListType" minOccurs="0"/&gt;
 *         &lt;element name="InstantMessagingList" type="{http://europass.cedefop.europa.eu/Europass}InstantMessagingListType" minOccurs="0"/&gt;
 *         &lt;element name="ContactMethodList" type="{http://europass.cedefop.europa.eu/Europass}ContactMethodListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "address",
    "email",
    "telephoneList",
    "websiteList",
    "instantMessagingList",
    "contactMethodList"
})
public class ContactInfoType {

    @XmlElement(name = "Address")
    protected ContactAddressType address;
    @XmlElement(name = "Email")
    protected ContactEmailType email;
    @XmlElement(name = "TelephoneList")
    protected TelephoneListType telephoneList;
    @XmlElement(name = "WebsiteList")
    protected WebsiteListType websiteList;
    @XmlElement(name = "InstantMessagingList")
    protected InstantMessagingListType instantMessagingList;
    @XmlElement(name = "ContactMethodList")
    protected ContactMethodListType contactMethodList;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactAddressType }
     *     
     */
    public ContactAddressType getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAddressType }
     *     
     */
    public void setAddress(ContactAddressType value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactEmailType }
     *     
     */
    public ContactEmailType getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactEmailType }
     *     
     */
    public void setEmail(ContactEmailType value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der telephoneList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneListType }
     *     
     */
    public TelephoneListType getTelephoneList() {
        return telephoneList;
    }

    /**
     * Legt den Wert der telephoneList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneListType }
     *     
     */
    public void setTelephoneList(TelephoneListType value) {
        this.telephoneList = value;
    }

    /**
     * Ruft den Wert der websiteList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WebsiteListType }
     *     
     */
    public WebsiteListType getWebsiteList() {
        return websiteList;
    }

    /**
     * Legt den Wert der websiteList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WebsiteListType }
     *     
     */
    public void setWebsiteList(WebsiteListType value) {
        this.websiteList = value;
    }

    /**
     * Ruft den Wert der instantMessagingList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InstantMessagingListType }
     *     
     */
    public InstantMessagingListType getInstantMessagingList() {
        return instantMessagingList;
    }

    /**
     * Legt den Wert der instantMessagingList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantMessagingListType }
     *     
     */
    public void setInstantMessagingList(InstantMessagingListType value) {
        this.instantMessagingList = value;
    }

    /**
     * Ruft den Wert der contactMethodList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethodListType }
     *     
     */
    public ContactMethodListType getContactMethodList() {
        return contactMethodList;
    }

    /**
     * Legt den Wert der contactMethodList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethodListType }
     *     
     */
    public void setContactMethodList(ContactMethodListType value) {
        this.contactMethodList = value;
    }

}
