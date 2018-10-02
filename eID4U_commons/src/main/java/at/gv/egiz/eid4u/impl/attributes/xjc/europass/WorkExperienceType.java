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
 *                 Extends the generic ExperienceType to include information about a work experience. 
 *                 Contains information about the period the experience took place and the title of the position, as well as the activities/ tasks and information of the employer. 
 *             
 * 
 * <p>Java-Klasse für WorkExperienceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WorkExperienceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}ExperienceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://europass.cedefop.europa.eu/Europass}OccupationalFieldType" minOccurs="0"/&gt;
 *         &lt;element name="Activities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Employer" type="{http://europass.cedefop.europa.eu/Europass}EmployerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkExperienceType", propOrder = {
    "position",
    "activities",
    "employer"
})
public class WorkExperienceType
    extends ExperienceType
{

    @XmlElement(name = "Position")
    protected OccupationalFieldType position;
    @XmlElement(name = "Activities")
    protected String activities;
    @XmlElement(name = "Employer")
    protected EmployerType employer;

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupationalFieldType }
     *     
     */
    public OccupationalFieldType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationalFieldType }
     *     
     */
    public void setPosition(OccupationalFieldType value) {
        this.position = value;
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
     * Ruft den Wert der employer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmployerType }
     *     
     */
    public EmployerType getEmployer() {
        return employer;
    }

    /**
     * Legt den Wert der employer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerType }
     *     
     */
    public void setEmployer(EmployerType value) {
        this.employer = value;
    }

}
