//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für nationalityCountryCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="nationalityCountryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="AF"/&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="AU"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="BB"/&gt;
 *     &lt;enumeration value="BD"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BF"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="BH"/&gt;
 *     &lt;enumeration value="BI"/&gt;
 *     &lt;enumeration value="BJ"/&gt;
 *     &lt;enumeration value="BN"/&gt;
 *     &lt;enumeration value="BO"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="BT"/&gt;
 *     &lt;enumeration value="BW"/&gt;
 *     &lt;enumeration value="BY"/&gt;
 *     &lt;enumeration value="BZ"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="CF"/&gt;
 *     &lt;enumeration value="CG"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CI"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="CN"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="RS"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="DJ"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="DO"/&gt;
 *     &lt;enumeration value="DZ"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="EG"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FJ"/&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="UK"/&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="GH"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="GN"/&gt;
 *     &lt;enumeration value="GQ"/&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GW"/&gt;
 *     &lt;enumeration value="GY"/&gt;
 *     &lt;enumeration value="HN"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="HT"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IL"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="IQ"/&gt;
 *     &lt;enumeration value="IR"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="JM"/&gt;
 *     &lt;enumeration value="JO"/&gt;
 *     &lt;enumeration value="JP"/&gt;
 *     &lt;enumeration value="KE"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="KH"/&gt;
 *     &lt;enumeration value="KI"/&gt;
 *     &lt;enumeration value="KM"/&gt;
 *     &lt;enumeration value="KN"/&gt;
 *     &lt;enumeration value="KP"/&gt;
 *     &lt;enumeration value="KR"/&gt;
 *     &lt;enumeration value="KW"/&gt;
 *     &lt;enumeration value="KZ"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="LC"/&gt;
 *     &lt;enumeration value="LI"/&gt;
 *     &lt;enumeration value="LK"/&gt;
 *     &lt;enumeration value="LR"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LY"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="MC"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="MK"/&gt;
 *     &lt;enumeration value="ML"/&gt;
 *     &lt;enumeration value="MM"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="MU"/&gt;
 *     &lt;enumeration value="MV"/&gt;
 *     &lt;enumeration value="MW"/&gt;
 *     &lt;enumeration value="MX"/&gt;
 *     &lt;enumeration value="MY"/&gt;
 *     &lt;enumeration value="MZ"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NG"/&gt;
 *     &lt;enumeration value="NI"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="NP"/&gt;
 *     &lt;enumeration value="NR"/&gt;
 *     &lt;enumeration value="NU"/&gt;
 *     &lt;enumeration value="NZ"/&gt;
 *     &lt;enumeration value="OM"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="PG"/&gt;
 *     &lt;enumeration value="PH"/&gt;
 *     &lt;enumeration value="PK"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="PW"/&gt;
 *     &lt;enumeration value="PY"/&gt;
 *     &lt;enumeration value="QA"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SB"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="SV"/&gt;
 *     &lt;enumeration value="SY"/&gt;
 *     &lt;enumeration value="SZ"/&gt;
 *     &lt;enumeration value="TD"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TH"/&gt;
 *     &lt;enumeration value="TJ"/&gt;
 *     &lt;enumeration value="TL"/&gt;
 *     &lt;enumeration value="TM"/&gt;
 *     &lt;enumeration value="TN"/&gt;
 *     &lt;enumeration value="TO"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="TV"/&gt;
 *     &lt;enumeration value="TZ"/&gt;
 *     &lt;enumeration value="UA"/&gt;
 *     &lt;enumeration value="UG"/&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="UY"/&gt;
 *     &lt;enumeration value="UZ"/&gt;
 *     &lt;enumeration value="VA"/&gt;
 *     &lt;enumeration value="VC"/&gt;
 *     &lt;enumeration value="VE"/&gt;
 *     &lt;enumeration value="VN"/&gt;
 *     &lt;enumeration value="VU"/&gt;
 *     &lt;enumeration value="WS"/&gt;
 *     &lt;enumeration value="YE"/&gt;
 *     &lt;enumeration value="ZA"/&gt;
 *     &lt;enumeration value="ZM"/&gt;
 *     &lt;enumeration value="ZW"/&gt;
 *     &lt;enumeration value="ME"/&gt;
 *     &lt;enumeration value="SS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "nationalityCountryCode")
@XmlEnum
public enum NationalityCountryCode {


    /**
     * Andoral\u0131
     * 
     */
    AD,

    /**
     * Birle\u015fik Arap Emirlikleri vatanda\u015f\u0131
     * 
     */
    AE,

    /**
     * Afgan
     * 
     */
    AF,

    /**
     * Antigua ve Barbudal\u0131 
     * 
     */
    AG,

    /**
     * Arnavut
     * 
     */
    AL,

    /**
     * Ermeni
     * 
     */
    AM,

    /**
     * Angolal\u0131
     * 
     */
    AO,

    /**
     * Arjantin
     * 
     */
    AR,

    /**
     * Avusturyal\u0131
     * 
     */
    AT,

    /**
     * Avustralyal\u0131
     * 
     */
    AU,

    /**
     * Azeri
     * 
     */
    AZ,

    /**
     * Bosna-Hersekli
     * 
     */
    BA,

    /**
     * Barbadoslu
     * 
     */
    BB,

    /**
     * Banglade\u015fli
     * 
     */
    BD,

    /**
     * Belçikal\u0131
     * 
     */
    BE,

    /**
     * Burkina Fasolu
     * 
     */
    BF,

    /**
     * Bulgar
     * 
     */
    BG,

    /**
     * Bahreynli
     * 
     */
    BH,

    /**
     * Brundili
     * 
     */
    BI,

    /**
     * Beninli
     * 
     */
    BJ,

    /**
     * Buruneli
     * 
     */
    BN,

    /**
     * Bolivyal\u0131
     * 
     */
    BO,

    /**
     * Brezilyal\u0131
     * 
     */
    BR,

    /**
     * Bahamal\u0131
     * 
     */
    BS,

    /**
     * Bhutanl\u0131
     * 
     */
    BT,

    /**
     * Bostwanal\u0131
     * 
     */
    BW,

    /**
     * Beyaz Rusyal\u0131
     * 
     */
    BY,

    /**
     * Belizli
     * 
     */
    BZ,

    /**
     * Kanadal\u0131
     * 
     */
    CA,

    /**
     * Kongolu (Demokratik Kongo Cumhuriyeti)
     * 
     */
    CD,

    /**
     * Orta Afrikal\u0131
     * 
     */
    CF,

    /**
     * Kongolu (Kongo Cumhuriyetli)
     * 
     */
    CG,

    /**
     * \u0130sviçreli
     * 
     */
    CH,

    /**
     * \u0130vorial\u0131
     * 
     */
    CI,

    /**
     * \u015eilili
     * 
     */
    CL,

    /**
     * Kamerunlu
     * 
     */
    CM,

    /**
     * Çinli
     * 
     */
    CN,

    /**
     * Kolombiyal\u0131
     * 
     */
    CO,

    /**
     * Kosta Rikal\u0131
     * 
     */
    CR,

    /**
     * S\u0131rp
     * 
     */
    RS,

    /**
     * Kübal\u0131
     * 
     */
    CU,

    /**
     * Cape Verdli
     * 
     */
    CV,

    /**
     * K\u0131br\u0131sl\u0131
     * 
     */
    CY,

    /**
     * Çek
     * 
     */
    CZ,

    /**
     * Alman
     * 
     */
    DE,

    /**
     * Cibutili
     * 
     */
    DJ,

    /**
     * Danimarkal\u0131
     * 
     */
    DK,

    /**
     * Dominik
     * 
     */
    DM,

    /**
     * Dominik Cumhuriyetli
     * 
     */
    DO,

    /**
     * Cezayirli 
     * 
     */
    DZ,

    /**
     * Ekvadorlu
     * 
     */
    EC,

    /**
     * Estonyal\u0131
     * 
     */
    EE,

    /**
     * M\u0131s\u0131rl\u0131
     * 
     */
    EG,

    /**
     * Eritreli 
     * 
     */
    ER,

    /**
     * \u0130spanyol
     * 
     */
    ES,

    /**
     * Etiyopyal\u0131
     * 
     */
    ET,

    /**
     * Fin
     * 
     */
    FI,

    /**
     * Fijili
     * 
     */
    FJ,

    /**
     * Mikronezyal\u0131
     * 
     */
    FM,

    /**
     * Frans\u0131z
     * 
     */
    FR,

    /**
     * Gabonlu 
     * 
     */
    GA,

    /**
     * \u0130ngiliz
     * 
     */
    UK,

    /**
     * Grenadal\u0131
     * 
     */
    GD,

    /**
     * Gürcü
     * 
     */
    GE,

    /**
     * Ganal\u0131
     * 
     */
    GH,

    /**
     * Gröndlandl\u0131
     * 
     */
    GL,

    /**
     * Gambiyal\u0131 
     * 
     */
    GM,

    /**
     * Gineli (Gine Cumhuriyeti)
     * 
     */
    GN,

    /**
     * Ekvatorlu (Ekvator Ginesi)
     * 
     */
    GQ,

    /**
     * Yunan
     * 
     */
    EL,

    /**
     * Guatemalal\u0131
     * 
     */
    GT,

    /**
     * Gineli (Gine-Bissau Cumhuriyeti)
     * 
     */
    GW,

    /**
     * Guyanal\u0131
     * 
     */
    GY,

    /**
     * Hondurasl\u0131
     * 
     */
    HN,

    /**
     * H\u0131rvat
     * 
     */
    HR,

    /**
     * Haitili
     * 
     */
    HT,

    /**
     * Macar
     * 
     */
    HU,

    /**
     * Endonezyal\u0131
     * 
     */
    ID,

    /**
     * \u0130rlandal\u0131
     * 
     */
    IE,

    /**
     * \u0130srailli
     * 
     */
    IL,

    /**
     * Hindu
     * 
     */
    IN,

    /**
     * \u0130ranl\u0131
     * 
     */
    IQ,

    /**
     * Irakl\u0131
     * 
     */
    IR,

    /**
     * \u0130zlandal\u0131
     * 
     */
    IS,

    /**
     * \u0130talyan
     * 
     */
    IT,

    /**
     * Jameykal\u0131
     * 
     */
    JM,

    /**
     * Ürdünlü
     * 
     */
    JO,

    /**
     * Japon
     * 
     */
    JP,

    /**
     * Kenyal\u0131
     * 
     */
    KE,

    /**
     * K\u0131rg\u0131z
     * 
     */
    KG,

    /**
     * Kamboçyal\u0131
     * 
     */
    KH,

    /**
     * Kirabatili
     * 
     */
    KI,

    /**
     * Komoroslu
     * 
     */
    KM,

    /**
     * Saint Kitts ve Nevisli
     * 
     */
    KN,

    /**
     * Kuzey Koreli (Kore Demokratik Halk Cumhuriyeti)
     * 
     */
    KP,

    /**
     * Güney Koreli (Kore Cumhuriyeti)
     * 
     */
    KR,

    /**
     * Kuveytli
     * 
     */
    KW,

    /**
     * Kazak
     * 
     */
    KZ,

    /**
     * Laoslu
     * 
     */
    LA,

    /**
     * Lübnanl\u0131
     * 
     */
    LB,

    /**
     * Saint Lucianl\u0131
     * 
     */
    LC,

    /**
     * Lihteny\u015ftanl\u0131
     * 
     */
    LI,

    /**
     * Sri Lankal\u0131
     * 
     */
    LK,

    /**
     * Liberyal\u0131
     * 
     */
    LR,

    /**
     * Lesotholu
     * 
     */
    LS,

    /**
     * Litvanyal\u0131
     * 
     */
    LT,

    /**
     * Lüksemburglu
     * 
     */
    LU,

    /**
     * Leton
     * 
     */
    LV,

    /**
     * Libyal\u0131
     * 
     */
    LY,

    /**
     * Fasl\u0131
     * 
     */
    MA,

    /**
     * Monakolu
     * 
     */
    MC,

    /**
     * Moldovyal\u0131
     * 
     */
    MD,

    /**
     * Madagaskarl\u0131
     * 
     */
    MG,

    /**
     * Marshall\u0131
     * 
     */
    MH,

    /**
     * Makedon (Eski Yugoslav Makedonya Cumhuriyeti)
     * 
     */
    MK,

    /**
     * Malili
     * 
     */
    ML,

    /**
     * Burmal\u0131
     * 
     */
    MM,

    /**
     * Mo\u011fol
     * 
     */
    MN,

    /**
     * Moritanyal\u0131
     * 
     */
    MR,

    /**
     * Maltal\u0131
     * 
     */
    MT,

    /**
     * Morityuslu
     * 
     */
    MU,

    /**
     * Maldivli
     * 
     */
    MV,

    /**
     * Malavili
     * 
     */
    MW,

    /**
     * Meksikal\u0131
     * 
     */
    MX,

    /**
     * Malezyal\u0131
     * 
     */
    MY,

    /**
     * Mozambikli
     * 
     */
    MZ,

    /**
     * Namibyal\u0131
     * 
     */
    NA,

    /**
     * Nijerli (Nijer)
     * 
     */
    NE,

    /**
     * Nijeryal\u0131 (Nijerya)
     * 
     */
    NG,

    /**
     * Nikaragual\u0131
     * 
     */
    NI,

    /**
     * Hollandal\u0131
     * 
     */
    NL,

    /**
     * Norveçli
     * 
     */
    NO,

    /**
     * Nepalli
     * 
     */
    NP,

    /**
     * Naurulu
     * 
     */
    NR,

    /**
     * Niueli
     * 
     */
    NU,

    /**
     * Yeni Zellandal\u0131
     * 
     */
    NZ,

    /**
     * Ummanl\u0131
     * 
     */
    OM,

    /**
     * Panamal\u0131
     * 
     */
    PA,

    /**
     * Perulu
     * 
     */
    PE,

    /**
     * Papua Yeni Gineli
     * 
     */
    PG,

    /**
     * Filipinli
     * 
     */
    PH,

    /**
     * Pakistanl\u0131
     * 
     */
    PK,

    /**
     * Leh
     * 
     */
    PL,

    /**
     * Filistinli (Özerk Filistin Bölgeleri)
     * 
     */
    PS,

    /**
     * Portekizli 
     * 
     */
    PT,

    /**
     * Palaulu
     * 
     */
    PW,

    /**
     * Paraguayl\u0131
     * 
     */
    PY,

    /**
     * Katarl\u0131
     * 
     */
    QA,

    /**
     * Romen
     * 
     */
    RO,

    /**
     * Rus
     * 
     */
    RU,

    /**
     * Ruandal\u0131
     * 
     */
    RW,

    /**
     * Suudi Arabistanl\u0131
     * 
     */
    SA,

    /**
     * Solomon Adal\u0131
     * 
     */
    SB,

    /**
     * \u015eeyselli
     * 
     */
    SC,

    /**
     * Sudanl\u0131
     * 
     */
    SD,

    /**
     * \u0130sveçli
     * 
     */
    SE,

    /**
     * Singapurlu
     * 
     */
    SG,

    /**
     * Sloven
     * 
     */
    SI,

    /**
     * Slovak
     * 
     */
    SK,

    /**
     * Sierra Leonlu
     * 
     */
    SL,

    /**
     * San Marinolu
     * 
     */
    SM,

    /**
     * Senagalli
     * 
     */
    SN,

    /**
     * Somalili
     * 
     */
    SO,

    /**
     * Surinaml\u0131
     * 
     */
    SR,

    /**
     * Sao Tome ve Principli
     * 
     */
    ST,

    /**
     * Salvadorlu
     * 
     */
    SV,

    /**
     * Suriyeli
     * 
     */
    SY,

    /**
     * Swazili
     * 
     */
    SZ,

    /**
     * Çadl\u0131
     * 
     */
    TD,

    /**
     * Togolu
     * 
     */
    TG,

    /**
     * Taylandl\u0131
     * 
     */
    TH,

    /**
     * Tacik 
     * 
     */
    TJ,

    /**
     * Timor-Lesteli
     * 
     */
    TL,

    /**
     * Türkmen
     * 
     */
    TM,

    /**
     * Tunuslu
     * 
     */
    TN,

    /**
     * Tongal\u0131
     * 
     */
    TO,

    /**
     * Türk
     * 
     */
    TR,

    /**
     * Trinidad ve Tobagolu
     * 
     */
    TT,

    /**
     * Tuvalu
     * 
     */
    TV,

    /**
     * Tanzanyal\u0131
     * 
     */
    TZ,

    /**
     * Ukraynal\u0131
     * 
     */
    UA,

    /**
     * Ugandal\u0131
     * 
     */
    UG,

    /**
     * Amerikan 
     * 
     */
    US,

    /**
     * Uruguayl\u0131
     * 
     */
    UY,

    /**
     * Özbek
     * 
     */
    UZ,

    /**
     * Vatikanl\u0131
     * 
     */
    VA,

    /**
     * Saint Vincent ve Grenadal\u0131
     * 
     */
    VC,

    /**
     * Venezuelal\u0131 
     * 
     */
    VE,

    /**
     * Vietnaml\u0131
     * 
     */
    VN,

    /**
     * Vanuatulu
     * 
     */
    VU,

    /**
     * Samonlu
     * 
     */
    WS,

    /**
     * Yemenli
     * 
     */
    YE,

    /**
     * Güney Afrikal\u0131
     * 
     */
    ZA,

    /**
     * Zambiyal\u0131
     * 
     */
    ZM,

    /**
     * Zimbabveli
     * 
     */
    ZW,

    /**
     * Karada\u011fl\u0131
     * 
     */
    ME,

    /**
     * Güney Sudanl\u0131
     * 
     */
    SS;

    public String value() {
        return name();
    }

    public static NationalityCountryCode fromValue(String v) {
        return valueOf(v);
    }

}
