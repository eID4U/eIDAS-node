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
 * <p>Java-Klasse für LinguisticSkillType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinguisticSkillType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MotherTongueList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MotherTongue" type="{http://europass.cedefop.europa.eu/Europass}MotherTongueSkillType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ForeignLanguageList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ForeignLanguage" type="{http://europass.cedefop.europa.eu/Europass}ForeignLanguageSkillType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LinguisticSkillType", propOrder = {
    "motherTongueList",
    "foreignLanguageList"
})
public class LinguisticSkillType {

    @XmlElement(name = "MotherTongueList")
    protected LinguisticSkillType.MotherTongueList motherTongueList;
    @XmlElement(name = "ForeignLanguageList")
    protected LinguisticSkillType.ForeignLanguageList foreignLanguageList;

    /**
     * Ruft den Wert der motherTongueList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticSkillType.MotherTongueList }
     *     
     */
    public LinguisticSkillType.MotherTongueList getMotherTongueList() {
        return motherTongueList;
    }

    /**
     * Legt den Wert der motherTongueList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticSkillType.MotherTongueList }
     *     
     */
    public void setMotherTongueList(LinguisticSkillType.MotherTongueList value) {
        this.motherTongueList = value;
    }

    /**
     * Ruft den Wert der foreignLanguageList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticSkillType.ForeignLanguageList }
     *     
     */
    public LinguisticSkillType.ForeignLanguageList getForeignLanguageList() {
        return foreignLanguageList;
    }

    /**
     * Legt den Wert der foreignLanguageList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticSkillType.ForeignLanguageList }
     *     
     */
    public void setForeignLanguageList(LinguisticSkillType.ForeignLanguageList value) {
        this.foreignLanguageList = value;
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
     *         &lt;element name="ForeignLanguage" type="{http://europass.cedefop.europa.eu/Europass}ForeignLanguageSkillType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "foreignLanguage"
    })
    public static class ForeignLanguageList {

        @XmlElement(name = "ForeignLanguage")
        protected List<ForeignLanguageSkillType> foreignLanguage;

        /**
         * Gets the value of the foreignLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the foreignLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForeignLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ForeignLanguageSkillType }
         * 
         * 
         */
        public List<ForeignLanguageSkillType> getForeignLanguage() {
            if (foreignLanguage == null) {
                foreignLanguage = new ArrayList<ForeignLanguageSkillType>();
            }
            return this.foreignLanguage;
        }

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
     *         &lt;element name="MotherTongue" type="{http://europass.cedefop.europa.eu/Europass}MotherTongueSkillType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "motherTongue"
    })
    public static class MotherTongueList {

        @XmlElement(name = "MotherTongue")
        protected List<MotherTongueSkillType> motherTongue;

        /**
         * Gets the value of the motherTongue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motherTongue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotherTongue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MotherTongueSkillType }
         * 
         * 
         */
        public List<MotherTongueSkillType> getMotherTongue() {
            if (motherTongue == null) {
                motherTongue = new ArrayList<MotherTongueSkillType>();
            }
            return this.motherTongue;
        }

    }

}
