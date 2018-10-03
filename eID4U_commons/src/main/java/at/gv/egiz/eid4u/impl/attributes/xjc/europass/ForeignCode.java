//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für foreignCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="foreignCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}language"&gt;
 *     &lt;enumeration value="bg"/&gt;
 *     &lt;enumeration value="cs"/&gt;
 *     &lt;enumeration value="da"/&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="et"/&gt;
 *     &lt;enumeration value="fi"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="el"/&gt;
 *     &lt;enumeration value="hu"/&gt;
 *     &lt;enumeration value="is"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="lv"/&gt;
 *     &lt;enumeration value="lt"/&gt;
 *     &lt;enumeration value="mt"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="ro"/&gt;
 *     &lt;enumeration value="hr"/&gt;
 *     &lt;enumeration value="sk"/&gt;
 *     &lt;enumeration value="sl"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="sv"/&gt;
 *     &lt;enumeration value="tr"/&gt;
 *     &lt;enumeration value="ab"/&gt;
 *     &lt;enumeration value="af"/&gt;
 *     &lt;enumeration value="sq"/&gt;
 *     &lt;enumeration value="am"/&gt;
 *     &lt;enumeration value="ar"/&gt;
 *     &lt;enumeration value="an"/&gt;
 *     &lt;enumeration value="hy"/&gt;
 *     &lt;enumeration value="as"/&gt;
 *     &lt;enumeration value="az"/&gt;
 *     &lt;enumeration value="eu"/&gt;
 *     &lt;enumeration value="be"/&gt;
 *     &lt;enumeration value="bn"/&gt;
 *     &lt;enumeration value="bs"/&gt;
 *     &lt;enumeration value="br"/&gt;
 *     &lt;enumeration value="my"/&gt;
 *     &lt;enumeration value="ca"/&gt;
 *     &lt;enumeration value="ce"/&gt;
 *     &lt;enumeration value="zh"/&gt;
 *     &lt;enumeration value="cu"/&gt;
 *     &lt;enumeration value="kw"/&gt;
 *     &lt;enumeration value="co"/&gt;
 *     &lt;enumeration value="eo"/&gt;
 *     &lt;enumeration value="fo"/&gt;
 *     &lt;enumeration value="fj"/&gt;
 *     &lt;enumeration value="fy"/&gt;
 *     &lt;enumeration value="ka"/&gt;
 *     &lt;enumeration value="gd"/&gt;
 *     &lt;enumeration value="ga"/&gt;
 *     &lt;enumeration value="gl"/&gt;
 *     &lt;enumeration value="gv"/&gt;
 *     &lt;enumeration value="grc"/&gt;
 *     &lt;enumeration value="gu"/&gt;
 *     &lt;enumeration value="ht"/&gt;
 *     &lt;enumeration value="he"/&gt;
 *     &lt;enumeration value="hi"/&gt;
 *     &lt;enumeration value="id"/&gt;
 *     &lt;enumeration value="jv"/&gt;
 *     &lt;enumeration value="ja"/&gt;
 *     &lt;enumeration value="kn"/&gt;
 *     &lt;enumeration value="kk"/&gt;
 *     &lt;enumeration value="ky"/&gt;
 *     &lt;enumeration value="kg"/&gt;
 *     &lt;enumeration value="ko"/&gt;
 *     &lt;enumeration value="ku"/&gt;
 *     &lt;enumeration value="lo"/&gt;
 *     &lt;enumeration value="la"/&gt;
 *     &lt;enumeration value="li"/&gt;
 *     &lt;enumeration value="ln"/&gt;
 *     &lt;enumeration value="lb"/&gt;
 *     &lt;enumeration value="mk"/&gt;
 *     &lt;enumeration value="ml"/&gt;
 *     &lt;enumeration value="mr"/&gt;
 *     &lt;enumeration value="ms"/&gt;
 *     &lt;enumeration value="mg"/&gt;
 *     &lt;enumeration value="mo"/&gt;
 *     &lt;enumeration value="mn"/&gt;
 *     &lt;enumeration value="ne"/&gt;
 *     &lt;enumeration value="nn"/&gt;
 *     &lt;enumeration value="nb"/&gt;
 *     &lt;enumeration value="oc"/&gt;
 *     &lt;enumeration value="om"/&gt;
 *     &lt;enumeration value="pa"/&gt;
 *     &lt;enumeration value="fa"/&gt;
 *     &lt;enumeration value="ps"/&gt;
 *     &lt;enumeration value="rm"/&gt;
 *     &lt;enumeration value="rom"/&gt;
 *     &lt;enumeration value="ru"/&gt;
 *     &lt;enumeration value="sr"/&gt;
 *     &lt;enumeration value="se"/&gt;
 *     &lt;enumeration value="sd"/&gt;
 *     &lt;enumeration value="so"/&gt;
 *     &lt;enumeration value="sc"/&gt;
 *     &lt;enumeration value="sw"/&gt;
 *     &lt;enumeration value="ty"/&gt;
 *     &lt;enumeration value="ta"/&gt;
 *     &lt;enumeration value="tt"/&gt;
 *     &lt;enumeration value="te"/&gt;
 *     &lt;enumeration value="tg"/&gt;
 *     &lt;enumeration value="tl"/&gt;
 *     &lt;enumeration value="th"/&gt;
 *     &lt;enumeration value="bo"/&gt;
 *     &lt;enumeration value="tk"/&gt;
 *     &lt;enumeration value="uk"/&gt;
 *     &lt;enumeration value="ur"/&gt;
 *     &lt;enumeration value="uz"/&gt;
 *     &lt;enumeration value="vi"/&gt;
 *     &lt;enumeration value="vo"/&gt;
 *     &lt;enumeration value="cy"/&gt;
 *     &lt;enumeration value="yi"/&gt;
 *     &lt;enumeration value="yo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "foreignCode")
@XmlEnum
public enum ForeignCode {


    /**
     * bulgarca
     * 
     */
    @XmlEnumValue("bg")
    BG("bg"),

    /**
     * çekçe
     * 
     */
    @XmlEnumValue("cs")
    CS("cs"),

    /**
     * danca
     * 
     */
    @XmlEnumValue("da")
    DA("da"),

    /**
     * flemenkçe
     * 
     */
    @XmlEnumValue("nl")
    NL("nl"),

    /**
     * ingilizce
     * 
     */
    @XmlEnumValue("en")
    EN("en"),

    /**
     * estonca
     * 
     */
    @XmlEnumValue("et")
    ET("et"),

    /**
     * fince
     * 
     */
    @XmlEnumValue("fi")
    FI("fi"),

    /**
     * frans\u0131zca
     * 
     */
    @XmlEnumValue("fr")
    FR("fr"),

    /**
     * almanca
     * 
     */
    @XmlEnumValue("de")
    DE("de"),

    /**
     * yunanca
     * 
     */
    @XmlEnumValue("el")
    EL("el"),

    /**
     * macarca
     * 
     */
    @XmlEnumValue("hu")
    HU("hu"),

    /**
     * izlandaca
     * 
     */
    @XmlEnumValue("is")
    IS("is"),

    /**
     * italyanca
     * 
     */
    @XmlEnumValue("it")
    IT("it"),

    /**
     * letonca
     * 
     */
    @XmlEnumValue("lv")
    LV("lv"),

    /**
     * litvanca
     * 
     */
    @XmlEnumValue("lt")
    LT("lt"),

    /**
     * maltaca
     * 
     */
    @XmlEnumValue("mt")
    MT("mt"),

    /**
     * norveççe
     * 
     */
    @XmlEnumValue("no")
    NO("no"),

    /**
     * lehçe
     * 
     */
    @XmlEnumValue("pl")
    PL("pl"),

    /**
     * portekizce
     * 
     */
    @XmlEnumValue("pt")
    PT("pt"),

    /**
     * rumence
     * 
     */
    @XmlEnumValue("ro")
    RO("ro"),

    /**
     * h\u0131rvatça
     * 
     */
    @XmlEnumValue("hr")
    HR("hr"),

    /**
     * slovakça
     * 
     */
    @XmlEnumValue("sk")
    SK("sk"),

    /**
     * slovence
     * 
     */
    @XmlEnumValue("sl")
    SL("sl"),

    /**
     * ispanyolca
     * 
     */
    @XmlEnumValue("es")
    ES("es"),

    /**
     * isveççe
     * 
     */
    @XmlEnumValue("sv")
    SV("sv"),

    /**
     * türkçe
     * 
     */
    @XmlEnumValue("tr")
    TR("tr"),

    /**
     * abhazca
     * 
     */
    @XmlEnumValue("ab")
    AB("ab"),

    /**
     * afrikanca
     * 
     */
    @XmlEnumValue("af")
    AF("af"),

    /**
     * arnavutça
     * 
     */
    @XmlEnumValue("sq")
    SQ("sq"),

    /**
     * amharca
     * 
     */
    @XmlEnumValue("am")
    AM("am"),

    /**
     * arapça
     * 
     */
    @XmlEnumValue("ar")
    AR("ar"),

    /**
     * aragonca
     * 
     */
    @XmlEnumValue("an")
    AN("an"),

    /**
     * ermenice 
     * 
     */
    @XmlEnumValue("hy")
    HY("hy"),

    /**
     * assamca
     * 
     */
    @XmlEnumValue("as")
    AS("as"),

    /**
     * azerice
     * 
     */
    @XmlEnumValue("az")
    AZ("az"),

    /**
     * baskça
     * 
     */
    @XmlEnumValue("eu")
    EU("eu"),

    /**
     * belarusça
     * 
     */
    @XmlEnumValue("be")
    BE("be"),

    /**
     * banglade\u015fçe
     * 
     */
    @XmlEnumValue("bn")
    BN("bn"),

    /**
     * bo\u015fnakça
     * 
     */
    @XmlEnumValue("bs")
    BS("bs"),

    /**
     * bretonca
     * 
     */
    @XmlEnumValue("br")
    BR("br"),

    /**
     * burmaca 
     * 
     */
    @XmlEnumValue("my")
    MY("my"),

    /**
     * katalanca/valensiyaca
     * 
     */
    @XmlEnumValue("ca")
    CA("ca"),

    /**
     * çeçence
     * 
     */
    @XmlEnumValue("ce")
    CE("ce"),

    /**
     * çince
     * 
     */
    @XmlEnumValue("zh")
    ZH("zh"),

    /**
     * slavca
     * 
     */
    @XmlEnumValue("cu")
    CU("cu"),

    /**
     * korni\u015fce
     * 
     */
    @XmlEnumValue("kw")
    KW("kw"),

    /**
     * korsikaca
     * 
     */
    @XmlEnumValue("co")
    CO("co"),

    /**
     * esperantoca
     * 
     */
    @XmlEnumValue("eo")
    EO("eo"),

    /**
     * faraoece
     * 
     */
    @XmlEnumValue("fo")
    FO("fo"),

    /**
     * fijice
     * 
     */
    @XmlEnumValue("fj")
    FJ("fj"),

    /**
     * frizyaca
     * 
     */
    @XmlEnumValue("fy")
    FY("fy"),

    /**
     * gürcüce 
     * 
     */
    @XmlEnumValue("ka")
    KA("ka"),

    /**
     * gaelce/iskoçça
     * 
     */
    @XmlEnumValue("gd")
    GD("gd"),

    /**
     * irlandaca
     * 
     */
    @XmlEnumValue("ga")
    GA("ga"),

    /**
     * galiçyaca 
     * 
     */
    @XmlEnumValue("gl")
    GL("gl"),

    /**
     * manskça 
     * 
     */
    @XmlEnumValue("gv")
    GV("gv"),

    /**
     * eski yunanca
     * 
     */
    @XmlEnumValue("grc")
    GRC("grc"),

    /**
     * gucaratça
     * 
     */
    @XmlEnumValue("gu")
    GU("gu"),

    /**
     * haitice/haiti kreyolu
     * 
     */
    @XmlEnumValue("ht")
    HT("ht"),

    /**
     * \u0130branice
     * 
     */
    @XmlEnumValue("he")
    HE("he"),

    /**
     * hintçe
     * 
     */
    @XmlEnumValue("hi")
    HI("hi"),

    /**
     * endonezce
     * 
     */
    @XmlEnumValue("id")
    ID("id"),

    /**
     * javaca
     * 
     */
    @XmlEnumValue("jv")
    JV("jv"),

    /**
     * japonca
     * 
     */
    @XmlEnumValue("ja")
    JA("ja"),

    /**
     * kannada
     * 
     */
    @XmlEnumValue("kn")
    KN("kn"),

    /**
     * kazakça
     * 
     */
    @XmlEnumValue("kk")
    KK("kk"),

    /**
     * k\u0131rg\u0131zca
     * 
     */
    @XmlEnumValue("ky")
    KY("ky"),

    /**
     * kongoca
     * 
     */
    @XmlEnumValue("kg")
    KG("kg"),

    /**
     * korece 
     * 
     */
    @XmlEnumValue("ko")
    KO("ko"),

    /**
     * kürtçe
     * 
     */
    @XmlEnumValue("ku")
    KU("ku"),

    /**
     * laoca
     * 
     */
    @XmlEnumValue("lo")
    LO("lo"),

    /**
     * latince
     * 
     */
    @XmlEnumValue("la")
    LA("la"),

    /**
     * limburgca
     * 
     */
    @XmlEnumValue("li")
    LI("li"),

    /**
     * lingalaca
     * 
     */
    @XmlEnumValue("ln")
    LN("ln"),

    /**
     * lüksemburgca
     * 
     */
    @XmlEnumValue("lb")
    LB("lb"),

    /**
     * makedonca
     * 
     */
    @XmlEnumValue("mk")
    MK("mk"),

    /**
     * malayalam
     * 
     */
    @XmlEnumValue("ml")
    ML("ml"),

    /**
     * marathi
     * 
     */
    @XmlEnumValue("mr")
    MR("mr"),

    /**
     * malezyaca
     * 
     */
    @XmlEnumValue("ms")
    MS("ms"),

    /**
     * malagasi
     * 
     */
    @XmlEnumValue("mg")
    MG("mg"),

    /**
     * moldovca
     * 
     */
    @XmlEnumValue("mo")
    MO("mo"),

    /**
     * mogolca
     * 
     */
    @XmlEnumValue("mn")
    MN("mn"),

    /**
     * nepalce 
     * 
     */
    @XmlEnumValue("ne")
    NE("ne"),

    /**
     * norveççe (Norsk)
     * 
     */
    @XmlEnumValue("nn")
    NN("nn"),

    /**
     * norveççe (Bokmål)
     * 
     */
    @XmlEnumValue("nb")
    NB("nb"),

    /**
     * oksitanca/provencal
     * 
     */
    @XmlEnumValue("oc")
    OC("oc"),

    /**
     * oromo
     * 
     */
    @XmlEnumValue("om")
    OM("om"),

    /**
     * pencapça
     * 
     */
    @XmlEnumValue("pa")
    PA("pa"),

    /**
     * farsça
     * 
     */
    @XmlEnumValue("fa")
    FA("fa"),

    /**
     * pe\u015ftuca
     * 
     */
    @XmlEnumValue("ps")
    PS("ps"),

    /**
     * reto romanca
     * 
     */
    @XmlEnumValue("rm")
    RM("rm"),

    /**
     * çingenece
     * 
     */
    @XmlEnumValue("rom")
    ROM("rom"),

    /**
     * rusça
     * 
     */
    @XmlEnumValue("ru")
    RU("ru"),

    /**
     * s\u0131rpça
     * 
     */
    @XmlEnumValue("sr")
    SR("sr"),

    /**
     * sami
     * 
     */
    @XmlEnumValue("se")
    SE("se"),

    /**
     * sintçe
     * 
     */
    @XmlEnumValue("sd")
    SD("sd"),

    /**
     * somalice
     * 
     */
    @XmlEnumValue("so")
    SO("so"),

    /**
     * sarduca
     * 
     */
    @XmlEnumValue("sc")
    SC("sc"),

    /**
     * swahilice
     * 
     */
    @XmlEnumValue("sw")
    SW("sw"),

    /**
     * tahitice
     * 
     */
    @XmlEnumValue("ty")
    TY("ty"),

    /**
     * tamilce
     * 
     */
    @XmlEnumValue("ta")
    TA("ta"),

    /**
     * tatarca
     * 
     */
    @XmlEnumValue("tt")
    TT("tt"),

    /**
     * teluguca
     * 
     */
    @XmlEnumValue("te")
    TE("te"),

    /**
     * tacikçe
     * 
     */
    @XmlEnumValue("tg")
    TG("tg"),

    /**
     * tagalogca
     * 
     */
    @XmlEnumValue("tl")
    TL("tl"),

    /**
     * tayca
     * 
     */
    @XmlEnumValue("th")
    TH("th"),

    /**
     * tibetçe
     * 
     */
    @XmlEnumValue("bo")
    BO("bo"),

    /**
     * türkmence
     * 
     */
    @XmlEnumValue("tk")
    TK("tk"),

    /**
     * ukraynaca
     * 
     */
    @XmlEnumValue("uk")
    UK("uk"),

    /**
     * urduca
     * 
     */
    @XmlEnumValue("ur")
    UR("ur"),

    /**
     * özbekçe
     * 
     */
    @XmlEnumValue("uz")
    UZ("uz"),

    /**
     * vietnamca
     * 
     */
    @XmlEnumValue("vi")
    VI("vi"),

    /**
     * volapük
     * 
     */
    @XmlEnumValue("vo")
    VO("vo"),

    /**
     * galce
     * 
     */
    @XmlEnumValue("cy")
    CY("cy"),

    /**
     * yidce
     * 
     */
    @XmlEnumValue("yi")
    YI("yi"),

    /**
     * yoruba
     * 
     */
    @XmlEnumValue("yo")
    YO("yo");
    private final String value;

    ForeignCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeignCode fromValue(String v) {
        for (ForeignCode c: ForeignCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
