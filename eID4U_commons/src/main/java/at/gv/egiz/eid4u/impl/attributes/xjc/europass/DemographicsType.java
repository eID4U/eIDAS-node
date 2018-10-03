//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains demographics-related information about the individual. It includes the birthdate, gender and list of nationalities.
 * 			
 * 
 * <p>Java-Klasse für DemographicsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DemographicsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Birthdate" type="{http://europass.cedefop.europa.eu/Europass}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://europass.cedefop.europa.eu/Europass}GenderLabelType" minOccurs="0"/&gt;
 *         &lt;element name="NationalityList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Nationality" type="{http://europass.cedefop.europa.eu/Europass}NationalityType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemographicsType", propOrder = {
    "birthdate",
    "gender",
    "nationalityList"
})
public class DemographicsType {

    @XmlElement(name = "Birthdate")
    protected DateType birthdate;
    @XmlElement(name = "Gender")
    protected GenderLabelType gender;
    @XmlElement(name = "NationalityList")
    protected DemographicsType.NationalityList nationalityList;

    /**
     * Ruft den Wert der birthdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBirthdate() {
        return birthdate;
    }

    /**
     * Legt den Wert der birthdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBirthdate(DateType value) {
        this.birthdate = value;
    }

    /**
     * Ruft den Wert der gender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenderLabelType }
     *     
     */
    public GenderLabelType getGender() {
        return gender;
    }

    /**
     * Legt den Wert der gender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderLabelType }
     *     
     */
    public void setGender(GenderLabelType value) {
        this.gender = value;
    }

    /**
     * Ruft den Wert der nationalityList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType.NationalityList }
     *     
     */
    public DemographicsType.NationalityList getNationalityList() {
        return nationalityList;
    }

    /**
     * Legt den Wert der nationalityList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType.NationalityList }
     *     
     */
    public void setNationalityList(DemographicsType.NationalityList value) {
        this.nationalityList = value;
    }


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
     *         &lt;element name="Nationality" type="{http://europass.cedefop.europa.eu/Europass}NationalityType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nationality"
    })
    public static class NationalityList {

        @XmlElement(name = "Nationality", required = true)
        protected List<NationalityType> nationality;

        /**
         * Gets the value of the nationality property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nationality property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNationality().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NationalityType }
         * 
         * 
         */
        public List<NationalityType> getNationality() {
            if (nationality == null) {
                nationality = new ArrayList<NationalityType>();
            }
            return this.nationality;
        }

    }

}
