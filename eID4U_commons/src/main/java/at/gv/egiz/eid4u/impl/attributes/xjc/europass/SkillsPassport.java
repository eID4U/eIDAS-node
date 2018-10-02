//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentInfo" type="{http://europass.cedefop.europa.eu/Europass}DocumentInfoType"/&gt;
 *         &lt;element name="PrintingPreferences" type="{http://europass.cedefop.europa.eu/Europass}PrintingPreferencesType" minOccurs="0"/&gt;
 *         &lt;element name="LearnerInfo" type="{http://europass.cedefop.europa.eu/Europass}LearnerInfoType"/&gt;
 *         &lt;element name="AttachmentList" type="{http://europass.cedefop.europa.eu/Europass}AttachmentListType" minOccurs="0"/&gt;
 *         &lt;element name="CoverLetter" type="{http://europass.cedefop.europa.eu/Europass}CoverLetterType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="locale" use="required" type="{http://europass.cedefop.europa.eu/Europass}LocaleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentInfo",
    "printingPreferences",
    "learnerInfo",
    "attachmentList",
    "coverLetter"
})
@XmlRootElement(name = "SkillsPassport")
public class SkillsPassport {

    @XmlElement(name = "DocumentInfo", required = true)
    protected DocumentInfoType documentInfo;
    @XmlElement(name = "PrintingPreferences")
    protected PrintingPreferencesType printingPreferences;
    @XmlElement(name = "LearnerInfo", required = true)
    protected LearnerInfoType learnerInfo;
    @XmlElement(name = "AttachmentList")
    protected AttachmentListType attachmentList;
    @XmlElement(name = "CoverLetter")
    protected CoverLetterType coverLetter;
    @XmlAttribute(name = "locale", required = true)
    protected String locale;

    /**
     * Ruft den Wert der documentInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInfoType }
     *     
     */
    public DocumentInfoType getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Legt den Wert der documentInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInfoType }
     *     
     */
    public void setDocumentInfo(DocumentInfoType value) {
        this.documentInfo = value;
    }

    /**
     * Ruft den Wert der printingPreferences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrintingPreferencesType }
     *     
     */
    public PrintingPreferencesType getPrintingPreferences() {
        return printingPreferences;
    }

    /**
     * Legt den Wert der printingPreferences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintingPreferencesType }
     *     
     */
    public void setPrintingPreferences(PrintingPreferencesType value) {
        this.printingPreferences = value;
    }

    /**
     * Ruft den Wert der learnerInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LearnerInfoType }
     *     
     */
    public LearnerInfoType getLearnerInfo() {
        return learnerInfo;
    }

    /**
     * Legt den Wert der learnerInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LearnerInfoType }
     *     
     */
    public void setLearnerInfo(LearnerInfoType value) {
        this.learnerInfo = value;
    }

    /**
     * Ruft den Wert der attachmentList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentListType }
     *     
     */
    public AttachmentListType getAttachmentList() {
        return attachmentList;
    }

    /**
     * Legt den Wert der attachmentList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentListType }
     *     
     */
    public void setAttachmentList(AttachmentListType value) {
        this.attachmentList = value;
    }

    /**
     * Ruft den Wert der coverLetter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoverLetterType }
     *     
     */
    public CoverLetterType getCoverLetter() {
        return coverLetter;
    }

    /**
     * Legt den Wert der coverLetter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverLetterType }
     *     
     */
    public void setCoverLetter(CoverLetterType value) {
        this.coverLetter = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

}
