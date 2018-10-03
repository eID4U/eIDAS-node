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
 * 				Contains a sequence of skills and competences that the learner has acquired during any formal or informal experience.
 * 			
 * 
 * <p>Java-Klasse für SkillSetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SkillSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Linguistic" type="{http://europass.cedefop.europa.eu/Europass}LinguisticSkillType" minOccurs="0"/&gt;
 *         &lt;element name="Communication" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/&gt;
 *         &lt;element name="Organisational" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/&gt;
 *         &lt;element name="JobRelated" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/&gt;
 *         &lt;element name="Computer" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/&gt;
 *         &lt;element name="Driving" type="{http://europass.cedefop.europa.eu/Europass}DrivingSkillType" minOccurs="0"/&gt;
 *         &lt;element name="Other" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkillSetType", propOrder = {
    "linguistic",
    "communication",
    "organisational",
    "jobRelated",
    "computer",
    "driving",
    "other"
})
public class SkillSetType {

    @XmlElement(name = "Linguistic")
    protected LinguisticSkillType linguistic;
    @XmlElement(name = "Communication")
    protected GenericSkillType communication;
    @XmlElement(name = "Organisational")
    protected GenericSkillType organisational;
    @XmlElement(name = "JobRelated")
    protected GenericSkillType jobRelated;
    @XmlElement(name = "Computer")
    protected GenericSkillType computer;
    @XmlElement(name = "Driving")
    protected DrivingSkillType driving;
    @XmlElement(name = "Other")
    protected GenericSkillType other;

    /**
     * Ruft den Wert der linguistic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticSkillType }
     *     
     */
    public LinguisticSkillType getLinguistic() {
        return linguistic;
    }

    /**
     * Legt den Wert der linguistic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticSkillType }
     *     
     */
    public void setLinguistic(LinguisticSkillType value) {
        this.linguistic = value;
    }

    /**
     * Ruft den Wert der communication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getCommunication() {
        return communication;
    }

    /**
     * Legt den Wert der communication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setCommunication(GenericSkillType value) {
        this.communication = value;
    }

    /**
     * Ruft den Wert der organisational-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getOrganisational() {
        return organisational;
    }

    /**
     * Legt den Wert der organisational-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setOrganisational(GenericSkillType value) {
        this.organisational = value;
    }

    /**
     * Ruft den Wert der jobRelated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getJobRelated() {
        return jobRelated;
    }

    /**
     * Legt den Wert der jobRelated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setJobRelated(GenericSkillType value) {
        this.jobRelated = value;
    }

    /**
     * Ruft den Wert der computer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getComputer() {
        return computer;
    }

    /**
     * Legt den Wert der computer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setComputer(GenericSkillType value) {
        this.computer = value;
    }

    /**
     * Ruft den Wert der driving-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DrivingSkillType }
     *     
     */
    public DrivingSkillType getDriving() {
        return driving;
    }

    /**
     * Legt den Wert der driving-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingSkillType }
     *     
     */
    public void setDriving(DrivingSkillType value) {
        this.driving = value;
    }

    /**
     * Ruft den Wert der other-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getOther() {
        return other;
    }

    /**
     * Legt den Wert der other-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setOther(GenericSkillType value) {
        this.other = value;
    }

}
