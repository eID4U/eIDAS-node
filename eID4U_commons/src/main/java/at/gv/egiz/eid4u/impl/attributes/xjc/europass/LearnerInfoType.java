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
 * 				Defines a sequence of elements that fully describe a Europass XML document.
 * 			
 * 
 * <p>Java-Klasse für LearnerInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LearnerInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identification" type="{http://europass.cedefop.europa.eu/Europass}IdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="Headline" type="{http://europass.cedefop.europa.eu/Europass}HeadlineType" minOccurs="0"/&gt;
 *         &lt;element name="WorkExperienceList" type="{http://europass.cedefop.europa.eu/Europass}WorkExperienceListType" minOccurs="0"/&gt;
 *         &lt;element name="EducationList" type="{http://europass.cedefop.europa.eu/Europass}EducationalExperienceListType" minOccurs="0"/&gt;
 *         &lt;element name="Skills" type="{http://europass.cedefop.europa.eu/Europass}SkillSetType" minOccurs="0"/&gt;
 *         &lt;element name="AchievementList" type="{http://europass.cedefop.europa.eu/Europass}AchievementListType" minOccurs="0"/&gt;
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
@XmlType(name = "LearnerInfoType", propOrder = {
    "identification",
    "headline",
    "workExperienceList",
    "educationList",
    "skills",
    "achievementList",
    "documentation"
})
public class LearnerInfoType {

    @XmlElement(name = "Identification")
    protected IdentificationType identification;
    @XmlElement(name = "Headline")
    protected HeadlineType headline;
    @XmlElement(name = "WorkExperienceList")
    protected WorkExperienceListType workExperienceList;
    @XmlElement(name = "EducationList")
    protected EducationalExperienceListType educationList;
    @XmlElement(name = "Skills")
    protected SkillSetType skills;
    @XmlElement(name = "AchievementList")
    protected AchievementListType achievementList;
    @XmlElement(name = "Documentation")
    protected IntraDocumentDocumentationType documentation;

    /**
     * Ruft den Wert der identification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getIdentification() {
        return identification;
    }

    /**
     * Legt den Wert der identification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setIdentification(IdentificationType value) {
        this.identification = value;
    }

    /**
     * Ruft den Wert der headline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeadlineType }
     *     
     */
    public HeadlineType getHeadline() {
        return headline;
    }

    /**
     * Legt den Wert der headline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadlineType }
     *     
     */
    public void setHeadline(HeadlineType value) {
        this.headline = value;
    }

    /**
     * Ruft den Wert der workExperienceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkExperienceListType }
     *     
     */
    public WorkExperienceListType getWorkExperienceList() {
        return workExperienceList;
    }

    /**
     * Legt den Wert der workExperienceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkExperienceListType }
     *     
     */
    public void setWorkExperienceList(WorkExperienceListType value) {
        this.workExperienceList = value;
    }

    /**
     * Ruft den Wert der educationList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EducationalExperienceListType }
     *     
     */
    public EducationalExperienceListType getEducationList() {
        return educationList;
    }

    /**
     * Legt den Wert der educationList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalExperienceListType }
     *     
     */
    public void setEducationList(EducationalExperienceListType value) {
        this.educationList = value;
    }

    /**
     * Ruft den Wert der skills-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SkillSetType }
     *     
     */
    public SkillSetType getSkills() {
        return skills;
    }

    /**
     * Legt den Wert der skills-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillSetType }
     *     
     */
    public void setSkills(SkillSetType value) {
        this.skills = value;
    }

    /**
     * Ruft den Wert der achievementList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AchievementListType }
     *     
     */
    public AchievementListType getAchievementList() {
        return achievementList;
    }

    /**
     * Legt den Wert der achievementList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AchievementListType }
     *     
     */
    public void setAchievementList(AchievementListType value) {
        this.achievementList = value;
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
