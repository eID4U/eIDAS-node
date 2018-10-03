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
 * 				Extends the generic ExperienceType to include information about a learning achievement or a training period. 
 * 				Contains information about the period the learning experience took place and the awarded title, as well as information about the skills acquired, the organisation providing the education, the educational field and level. 
 * 			
 * 
 * <p>Java-Klasse für EducationalExperienceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EducationalExperienceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}ExperienceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Activities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Organisation" type="{http://europass.cedefop.europa.eu/Europass}OrganisationType" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://europass.cedefop.europa.eu/Europass}EducationalLevelType" minOccurs="0"/&gt;
 *         &lt;element name="Field" type="{http://europass.cedefop.europa.eu/Europass}EducationalFieldType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationalExperienceType", propOrder = {
    "title",
    "activities",
    "organisation",
    "level",
    "field"
})
public class EducationalExperienceType
    extends ExperienceType
{

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Activities")
    protected String activities;
    @XmlElement(name = "Organisation")
    protected OrganisationType organisation;
    @XmlElement(name = "Level")
    protected EducationalLevelType level;
    @XmlElement(name = "Field")
    protected EducationalFieldType field;

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der activities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivities() {
        return activities;
    }

    /**
     * Legt den Wert der activities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivities(String value) {
        this.activities = value;
    }

    /**
     * Ruft den Wert der organisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getOrganisation() {
        return organisation;
    }

    /**
     * Legt den Wert der organisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setOrganisation(OrganisationType value) {
        this.organisation = value;
    }

    /**
     * Ruft den Wert der level-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EducationalLevelType }
     *     
     */
    public EducationalLevelType getLevel() {
        return level;
    }

    /**
     * Legt den Wert der level-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalLevelType }
     *     
     */
    public void setLevel(EducationalLevelType value) {
        this.level = value;
    }

    /**
     * Ruft den Wert der field-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EducationalFieldType }
     *     
     */
    public EducationalFieldType getField() {
        return field;
    }

    /**
     * Legt den Wert der field-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalFieldType }
     *     
     */
    public void setField(EducationalFieldType value) {
        this.field = value;
    }

}
