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
 * <p>Java-Klasse für motherCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="motherCode"&gt;
 *   &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}foreignCode"&gt;
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
 *     &lt;enumeration value="kw"/&gt;
 *     &lt;enumeration value="co"/&gt;
 *     &lt;enumeration value="fo"/&gt;
 *     &lt;enumeration value="fj"/&gt;
 *     &lt;enumeration value="fy"/&gt;
 *     &lt;enumeration value="ka"/&gt;
 *     &lt;enumeration value="gd"/&gt;
 *     &lt;enumeration value="ga"/&gt;
 *     &lt;enumeration value="gl"/&gt;
 *     &lt;enumeration value="gv"/&gt;
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
 *     &lt;enumeration value="cy"/&gt;
 *     &lt;enumeration value="yi"/&gt;
 *     &lt;enumeration value="yo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "motherCode")
@XmlEnum(ForeignCode.class)
public enum MotherCode {


    /**
     * bulgarca
     * 
     */
    @XmlEnumValue("bg")
    BG(ForeignCode.BG),

    /**
     * çekçe
     * 
     */
    @XmlEnumValue("cs")
    CS(ForeignCode.CS),

    /**
     * danca
     * 
     */
    @XmlEnumValue("da")
    DA(ForeignCode.DA),

    /**
     * flemenkçe
     * 
     */
    @XmlEnumValue("nl")
    NL(ForeignCode.NL),

    /**
     * ingilizce
     * 
     */
    @XmlEnumValue("en")
    EN(ForeignCode.EN),

    /**
     * estonca
     * 
     */
    @XmlEnumValue("et")
    ET(ForeignCode.ET),

    /**
     * fince
     * 
     */
    @XmlEnumValue("fi")
    FI(ForeignCode.FI),

    /**
     * frans\u0131zca
     * 
     */
    @XmlEnumValue("fr")
    FR(ForeignCode.FR),

    /**
     * almanca
     * 
     */
    @XmlEnumValue("de")
    DE(ForeignCode.DE),

    /**
     * yunanca
     * 
     */
    @XmlEnumValue("el")
    EL(ForeignCode.EL),

    /**
     * macarca
     * 
     */
    @XmlEnumValue("hu")
    HU(ForeignCode.HU),

    /**
     * izlandaca
     * 
     */
    @XmlEnumValue("is")
    IS(ForeignCode.IS),

    /**
     * italyanca
     * 
     */
    @XmlEnumValue("it")
    IT(ForeignCode.IT),

    /**
     * letonca
     * 
     */
    @XmlEnumValue("lv")
    LV(ForeignCode.LV),

    /**
     * litvanca
     * 
     */
    @XmlEnumValue("lt")
    LT(ForeignCode.LT),

    /**
     * maltaca
     * 
     */
    @XmlEnumValue("mt")
    MT(ForeignCode.MT),

    /**
     * norveççe
     * 
     */
    @XmlEnumValue("no")
    NO(ForeignCode.NO),

    /**
     * lehçe
     * 
     */
    @XmlEnumValue("pl")
    PL(ForeignCode.PL),

    /**
     * portekizce
     * 
     */
    @XmlEnumValue("pt")
    PT(ForeignCode.PT),

    /**
     * rumence
     * 
     */
    @XmlEnumValue("ro")
    RO(ForeignCode.RO),

    /**
     * h\u0131rvatça
     * 
     */
    @XmlEnumValue("hr")
    HR(ForeignCode.HR),

    /**
     * slovakça
     * 
     */
    @XmlEnumValue("sk")
    SK(ForeignCode.SK),

    /**
     * slovence
     * 
     */
    @XmlEnumValue("sl")
    SL(ForeignCode.SL),

    /**
     * ispanyolca
     * 
     */
    @XmlEnumValue("es")
    ES(ForeignCode.ES),

    /**
     * isveççe
     * 
     */
    @XmlEnumValue("sv")
    SV(ForeignCode.SV),

    /**
     * türkçe
     * 
     */
    @XmlEnumValue("tr")
    TR(ForeignCode.TR),

    /**
     * abhazca
     * 
     */
    @XmlEnumValue("ab")
    AB(ForeignCode.AB),

    /**
     * afrikanca
     * 
     */
    @XmlEnumValue("af")
    AF(ForeignCode.AF),

    /**
     * arnavutça
     * 
     */
    @XmlEnumValue("sq")
    SQ(ForeignCode.SQ),

    /**
     * amharca
     * 
     */
    @XmlEnumValue("am")
    AM(ForeignCode.AM),

    /**
     * arapça
     * 
     */
    @XmlEnumValue("ar")
    AR(ForeignCode.AR),

    /**
     * aragonca
     * 
     */
    @XmlEnumValue("an")
    AN(ForeignCode.AN),

    /**
     * ermenice 
     * 
     */
    @XmlEnumValue("hy")
    HY(ForeignCode.HY),

    /**
     * assamca
     * 
     */
    @XmlEnumValue("as")
    AS(ForeignCode.AS),

    /**
     * azerice
     * 
     */
    @XmlEnumValue("az")
    AZ(ForeignCode.AZ),

    /**
     * baskça
     * 
     */
    @XmlEnumValue("eu")
    EU(ForeignCode.EU),

    /**
     * belarusça
     * 
     */
    @XmlEnumValue("be")
    BE(ForeignCode.BE),

    /**
     * banglade\u015fçe
     * 
     */
    @XmlEnumValue("bn")
    BN(ForeignCode.BN),

    /**
     * bo\u015fnakça
     * 
     */
    @XmlEnumValue("bs")
    BS(ForeignCode.BS),

    /**
     * bretonca
     * 
     */
    @XmlEnumValue("br")
    BR(ForeignCode.BR),

    /**
     * burmaca 
     * 
     */
    @XmlEnumValue("my")
    MY(ForeignCode.MY),

    /**
     * katalanca/valensiyaca
     * 
     */
    @XmlEnumValue("ca")
    CA(ForeignCode.CA),

    /**
     * çeçence
     * 
     */
    @XmlEnumValue("ce")
    CE(ForeignCode.CE),

    /**
     * çince
     * 
     */
    @XmlEnumValue("zh")
    ZH(ForeignCode.ZH),

    /**
     * korni\u015fce
     * 
     */
    @XmlEnumValue("kw")
    KW(ForeignCode.KW),

    /**
     * korsikaca
     * 
     */
    @XmlEnumValue("co")
    CO(ForeignCode.CO),

    /**
     * faraoece
     * 
     */
    @XmlEnumValue("fo")
    FO(ForeignCode.FO),

    /**
     * fijice
     * 
     */
    @XmlEnumValue("fj")
    FJ(ForeignCode.FJ),

    /**
     * frizyaca
     * 
     */
    @XmlEnumValue("fy")
    FY(ForeignCode.FY),

    /**
     * gürcüce 
     * 
     */
    @XmlEnumValue("ka")
    KA(ForeignCode.KA),

    /**
     * gaelce/iskoçça
     * 
     */
    @XmlEnumValue("gd")
    GD(ForeignCode.GD),

    /**
     * irlandaca
     * 
     */
    @XmlEnumValue("ga")
    GA(ForeignCode.GA),

    /**
     * galiçyaca 
     * 
     */
    @XmlEnumValue("gl")
    GL(ForeignCode.GL),

    /**
     * manskça 
     * 
     */
    @XmlEnumValue("gv")
    GV(ForeignCode.GV),

    /**
     * gucaratça
     * 
     */
    @XmlEnumValue("gu")
    GU(ForeignCode.GU),

    /**
     * haitice/haiti kreyolu
     * 
     */
    @XmlEnumValue("ht")
    HT(ForeignCode.HT),

    /**
     * \u0130branice
     * 
     */
    @XmlEnumValue("he")
    HE(ForeignCode.HE),

    /**
     * hintçe
     * 
     */
    @XmlEnumValue("hi")
    HI(ForeignCode.HI),

    /**
     * endonezce
     * 
     */
    @XmlEnumValue("id")
    ID(ForeignCode.ID),

    /**
     * javaca
     * 
     */
    @XmlEnumValue("jv")
    JV(ForeignCode.JV),

    /**
     * japonca
     * 
     */
    @XmlEnumValue("ja")
    JA(ForeignCode.JA),

    /**
     * kannada
     * 
     */
    @XmlEnumValue("kn")
    KN(ForeignCode.KN),

    /**
     * kazakça
     * 
     */
    @XmlEnumValue("kk")
    KK(ForeignCode.KK),

    /**
     * k\u0131rg\u0131zca
     * 
     */
    @XmlEnumValue("ky")
    KY(ForeignCode.KY),

    /**
     * kongoca
     * 
     */
    @XmlEnumValue("kg")
    KG(ForeignCode.KG),

    /**
     * korece 
     * 
     */
    @XmlEnumValue("ko")
    KO(ForeignCode.KO),

    /**
     * kürtçe
     * 
     */
    @XmlEnumValue("ku")
    KU(ForeignCode.KU),

    /**
     * laoca
     * 
     */
    @XmlEnumValue("lo")
    LO(ForeignCode.LO),

    /**
     * limburgca
     * 
     */
    @XmlEnumValue("li")
    LI(ForeignCode.LI),

    /**
     * lingalaca
     * 
     */
    @XmlEnumValue("ln")
    LN(ForeignCode.LN),

    /**
     * lüksemburgca
     * 
     */
    @XmlEnumValue("lb")
    LB(ForeignCode.LB),

    /**
     * makedonca
     * 
     */
    @XmlEnumValue("mk")
    MK(ForeignCode.MK),

    /**
     * malayalam
     * 
     */
    @XmlEnumValue("ml")
    ML(ForeignCode.ML),

    /**
     * marathi
     * 
     */
    @XmlEnumValue("mr")
    MR(ForeignCode.MR),

    /**
     * malezyaca
     * 
     */
    @XmlEnumValue("ms")
    MS(ForeignCode.MS),

    /**
     * malagasi
     * 
     */
    @XmlEnumValue("mg")
    MG(ForeignCode.MG),

    /**
     * moldovca
     * 
     */
    @XmlEnumValue("mo")
    MO(ForeignCode.MO),

    /**
     * mogolca
     * 
     */
    @XmlEnumValue("mn")
    MN(ForeignCode.MN),

    /**
     * nepalce 
     * 
     */
    @XmlEnumValue("ne")
    NE(ForeignCode.NE),

    /**
     * norveççe (Norsk)
     * 
     */
    @XmlEnumValue("nn")
    NN(ForeignCode.NN),

    /**
     * norveççe (Bokmål)
     * 
     */
    @XmlEnumValue("nb")
    NB(ForeignCode.NB),

    /**
     * pencapça
     * 
     */
    @XmlEnumValue("pa")
    PA(ForeignCode.PA),

    /**
     * farsça
     * 
     */
    @XmlEnumValue("fa")
    FA(ForeignCode.FA),

    /**
     * pe\u015ftuca
     * 
     */
    @XmlEnumValue("ps")
    PS(ForeignCode.PS),

    /**
     * reto romanca
     * 
     */
    @XmlEnumValue("rm")
    RM(ForeignCode.RM),

    /**
     * çingenece
     * 
     */
    @XmlEnumValue("rom")
    ROM(ForeignCode.ROM),

    /**
     * rusça
     * 
     */
    @XmlEnumValue("ru")
    RU(ForeignCode.RU),

    /**
     * s\u0131rpça
     * 
     */
    @XmlEnumValue("sr")
    SR(ForeignCode.SR),

    /**
     * kuzeylapça
     * 
     */
    @XmlEnumValue("se")
    SE(ForeignCode.SE),

    /**
     * sintçe
     * 
     */
    @XmlEnumValue("sd")
    SD(ForeignCode.SD),

    /**
     * somalice
     * 
     */
    @XmlEnumValue("so")
    SO(ForeignCode.SO),

    /**
     * sarduca
     * 
     */
    @XmlEnumValue("sc")
    SC(ForeignCode.SC),

    /**
     * swahilice
     * 
     */
    @XmlEnumValue("sw")
    SW(ForeignCode.SW),

    /**
     * tahitice
     * 
     */
    @XmlEnumValue("ty")
    TY(ForeignCode.TY),

    /**
     * tamilce
     * 
     */
    @XmlEnumValue("ta")
    TA(ForeignCode.TA),

    /**
     * tatarca
     * 
     */
    @XmlEnumValue("tt")
    TT(ForeignCode.TT),

    /**
     * teluguca
     * 
     */
    @XmlEnumValue("te")
    TE(ForeignCode.TE),

    /**
     * tacikçe
     * 
     */
    @XmlEnumValue("tg")
    TG(ForeignCode.TG),

    /**
     * tagalogca
     * 
     */
    @XmlEnumValue("tl")
    TL(ForeignCode.TL),

    /**
     * tayca
     * 
     */
    @XmlEnumValue("th")
    TH(ForeignCode.TH),

    /**
     * tibetçe
     * 
     */
    @XmlEnumValue("bo")
    BO(ForeignCode.BO),

    /**
     * türkmence
     * 
     */
    @XmlEnumValue("tk")
    TK(ForeignCode.TK),

    /**
     * ukraynaca
     * 
     */
    @XmlEnumValue("uk")
    UK(ForeignCode.UK),

    /**
     * urduca
     * 
     */
    @XmlEnumValue("ur")
    UR(ForeignCode.UR),

    /**
     * özbekçe
     * 
     */
    @XmlEnumValue("uz")
    UZ(ForeignCode.UZ),

    /**
     * vietnamca
     * 
     */
    @XmlEnumValue("vi")
    VI(ForeignCode.VI),

    /**
     * galce
     * 
     */
    @XmlEnumValue("cy")
    CY(ForeignCode.CY),

    /**
     * yidce
     * 
     */
    @XmlEnumValue("yi")
    YI(ForeignCode.YI),

    /**
     * yoruba
     * 
     */
    @XmlEnumValue("yo")
    YO(ForeignCode.YO);
    private final ForeignCode value;

    MotherCode(ForeignCode v) {
        value = v;
    }

    public ForeignCode value() {
        return value;
    }

    public static MotherCode fromValue(ForeignCode v) {
        for (MotherCode c: MotherCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
