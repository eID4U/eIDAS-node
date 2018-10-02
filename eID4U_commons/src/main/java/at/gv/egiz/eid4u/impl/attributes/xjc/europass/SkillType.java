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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines a skill. A Skill has a description and may be accompanied by sutiable documentation.
 *                 Morever a Skill may be acquired during one or more experience periods, and be verified by one or more certificates
 *             
 * 
 * <p>Java-Klasse für SkillType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SkillType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProficiencyLevel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AcquiredDuring" type="{http://europass.cedefop.europa.eu/Europass}AbstractExperienceListType" minOccurs="0"/&gt;
 *         &lt;element name="VerifiedBy" type="{http://europass.cedefop.europa.eu/Europass}CertificateListType" minOccurs="0"/&gt;
 *         &lt;element name="Documentation" type="{http://europass.cedefop.europa.eu/Europass}IntraDocumentDocumentationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkillType", propOrder = {
    "description",
    "proficiencyLevel",
    "acquiredDuring",
    "verifiedBy",
    "documentation"
})
@XmlSeeAlso({
    GenericSkillType.class,
    DrivingSkillType.class,
    MotherTongueSkillType.class,
    ForeignLanguageSkillType.class
})
public abstract class SkillType {

    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "ProficiencyLevel")
    protected Object proficiencyLevel;
    @XmlElement(name = "AcquiredDuring")
    protected AbstractExperienceListType acquiredDuring;
    @XmlElement(name = "VerifiedBy")
    protected CertificateListType verifiedBy;
    @XmlElement(name = "Documentation")
    protected IntraDocumentDocumentationType documentation;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der proficiencyLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProficiencyLevel() {
        return proficiencyLevel;
    }

    /**
     * Legt den Wert der proficiencyLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProficiencyLevel(Object value) {
        this.proficiencyLevel = value;
    }

    /**
     * Ruft den Wert der acquiredDuring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExperienceListType }
     *     
     */
    public AbstractExperienceListType getAcquiredDuring() {
        return acquiredDuring;
    }

    /**
     * Legt den Wert der acquiredDuring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExperienceListType }
     *     
     */
    public void setAcquiredDuring(AbstractExperienceListType value) {
        this.acquiredDuring = value;
    }

    /**
     * Ruft den Wert der verifiedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CertificateListType }
     *     
     */
    public CertificateListType getVerifiedBy() {
        return verifiedBy;
    }

    /**
     * Legt den Wert der verifiedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateListType }
     *     
     */
    public void setVerifiedBy(CertificateListType value) {
        this.verifiedBy = value;
    }

    /**
     * Ruft den Wert der documentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntraDocumentDocumentationType }
     *     
     */
    public IntraDocumentDocumentationType getDocumentation() {
        return documentation;
    }

    /**
     * Legt den Wert der documentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraDocumentDocumentationType }
     *     
     */
    public void setDocumentation(IntraDocumentDocumentationType value) {
        this.documentation = value;
    }

}
