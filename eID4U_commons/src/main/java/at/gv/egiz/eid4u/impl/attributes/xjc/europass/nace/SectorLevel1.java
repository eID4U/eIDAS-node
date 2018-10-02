//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass.nace;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für sector-level1.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="sector-level1"&gt;
 *   &lt;restriction base="{http://europass.cedefop.europa.eu/NACE}sector"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sector-level1", namespace = "http://europass.cedefop.europa.eu/NACE")
@XmlEnum(Sector.class)
public enum SectorLevel1 {


    /**
     * Tar\u0131m, ormanc\u0131l\u0131k ve bal\u0131kç\u0131l\u0131k
     * 
     */
    A,

    /**
     * Madencilik ve ta\u015f oca\u011f\u0131 
     * 
     */
    B,

    /**
     * Imalat
     * 
     */
    C,

    /**
     * Elektirik, gaz, buhar ve klima tedariki
     * 
     */
    D,

    /**
     * Su tedariki, çöplük, at\u0131m yönetimi ve su kalitesinin iyile\u015ftirilmesi
     * 
     */
    E,

    /**
     * In\u015faat
     * 
     */
    F,

    /**
     * Toptan Ve Perakende Sat\u0131\u015f, Motorlu Araçlar\u0131n Tamiri
     * 
     */
    G,

    /**
     * Ta\u015f\u0131mac\u0131l\u0131k Ve Depolama
     * 
     */
    H,

    /**
     * Bar\u0131nma Ve G\u0131da Hizmeti
     * 
     */
    I,

    /**
     * Bilgi Ve Ileti\u015fim
     * 
     */
    J,

    /**
     * Finans Ve Sigorta Faaliyetleri
     * 
     */
    K,

    /**
     * Gayrimenkul Sektörü Faaliyetleri
     * 
     */
    L,

    /**
     * Mesleki, Bilimsel Ve Teknik Faaliyetler
     * 
     */
    M,

    /**
     * Idari Ve Destek Hizmetleri Faaliyetleri
     * 
     */
    N,

    /**
     * Kamu Yönetimi Ve Savunma; Zorunlu Sosyal Güvenlik
     * 
     */
    O,

    /**
     * E\u011fitim
     * 
     */
    P,

    /**
     * Insan Sa\u011fl\u0131\u011f\u0131 Ve Sosyal Çal\u0131\u015fma Faaliyetleri
     * 
     */
    Q,

    /**
     * Sanat Ve E\u011flence
     * 
     */
    R,

    /**
     * Di\u011fer Hizmet Faaliyetleri
     * 
     */
    S,

    /**
     * Hane Halk\u0131n\u0131 I\u015f Gücü Olarak Kullanan Faaliyetler; Pazarlananan Mallar - Ve Hizmetler- \u015eahsi Kullan\u0131m Için Üretim Faaliyetleri
     * 
     */
    T,

    /**
     * Ülke Yasalar\u0131na Dahil Olmayan Örgüt Ve Te\u015fkilatlar\u0131n Faaliyetleri
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static SectorLevel1 fromValue(String v) {
        return valueOf(v);
    }

}
