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
 * <p>Java-Klasse für OrganisationalContactInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OrganisationalContactInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://europass.cedefop.europa.eu/Europass}ContactAddressType" minOccurs="0"/&gt;
 *         &lt;element name="Website" type="{http://europass.cedefop.europa.eu/Europass}OrganisationalWebsiteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationalContactInfoType", propOrder = {
    "address",
    "website"
})
public class OrganisationalContactInfoType {

    @XmlElement(name = "Address")
    protected ContactAddressType address;
    @XmlElement(name = "Website")
    protected OrganisationalWebsiteType website;

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
     * Ruft den Wert der website-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationalWebsiteType }
     *     
     */
    public OrganisationalWebsiteType getWebsite() {
        return website;
    }

    /**
     * Legt den Wert der website-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationalWebsiteType }
     *     
     */
    public void setWebsite(OrganisationalWebsiteType value) {
        this.website = value;
    }

}
