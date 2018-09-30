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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FileDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FileDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MimeType" type="{http://europass.cedefop.europa.eu/Europass}MimeTypeEnumeration"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="MetadataList" type="{http://europass.cedefop.europa.eu/Europass}MetadataListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDataType", propOrder = {
    "name",
    "mimeType",
    "data",
    "metadataList"
})
@XmlSeeAlso({
    AttachmentType.class,
    PhotoDataType.class
})
public class FileDataType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "MimeType", required = true)
    @XmlSchemaType(name = "string")
    protected MimeTypeEnumeration mimeType;
    @XmlElement(name = "Data", required = true)
    protected byte[] data;
    @XmlElement(name = "MetadataList")
    protected MetadataListType metadataList;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der mimeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MimeTypeEnumeration }
     *     
     */
    public MimeTypeEnumeration getMimeType() {
        return mimeType;
    }

    /**
     * Legt den Wert der mimeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeTypeEnumeration }
     *     
     */
    public void setMimeType(MimeTypeEnumeration value) {
        this.mimeType = value;
    }

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Ruft den Wert der metadataList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataListType }
     *     
     */
    public MetadataListType getMetadataList() {
        return metadataList;
    }

    /**
     * Legt den Wert der metadataList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataListType }
     *     
     */
    public void setMetadataList(MetadataListType value) {
        this.metadataList = value;
    }

}
