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
 * <p>Java-Klasse für countryCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="countryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="UK"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="AF"/&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AU"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="BB"/&gt;
 *     &lt;enumeration value="BD"/&gt;
 *     &lt;enumeration value="BF"/&gt;
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
 *     &lt;enumeration value="CI"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="CN"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="RS"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="DJ"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="DO"/&gt;
 *     &lt;enumeration value="DZ"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="EG"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="FJ"/&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="GH"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="GN"/&gt;
 *     &lt;enumeration value="GQ"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GW"/&gt;
 *     &lt;enumeration value="GY"/&gt;
 *     &lt;enumeration value="HN"/&gt;
 *     &lt;enumeration value="HT"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IL"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="IQ"/&gt;
 *     &lt;enumeration value="IR"/&gt;
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
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="PW"/&gt;
 *     &lt;enumeration value="PY"/&gt;
 *     &lt;enumeration value="QA"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SB"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SG"/&gt;
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
@XmlType(name = "countryCode")
@XmlEnum
public enum CountryCode {


    /**
     * Belçika
     * 
     */
    BE,

    /**
     * Bulgaristan
     * 
     */
    BG,

    /**
     * Çek Cumhuriyeti
     * 
     */
    CZ,

    /**
     * Danimarka
     * 
     */
    DK,

    /**
     * Almanya
     * 
     */
    DE,

    /**
     * Estonya
     * 
     */
    EE,

    /**
     * \u0130rlanda
     * 
     */
    IE,

    /**
     * Yunanistan
     * 
     */
    EL,

    /**
     * \u0130spanya
     * 
     */
    ES,

    /**
     * Fransa
     * 
     */
    FR,

    /**
     * H\u0131rvatistan
     * 
     */
    HR,

    /**
     * \u0130zlanda
     * 
     */
    IS,

    /**
     * \u0130talya
     * 
     */
    IT,

    /**
     * K\u0131br\u0131s
     * 
     */
    CY,

    /**
     * Litvanya
     * 
     */
    LT,

    /**
     * Letonya
     * 
     */
    LV,

    /**
     * Lüksemburg
     * 
     */
    LU,

    /**
     * Macaristan
     * 
     */
    HU,

    /**
     * Malta
     * 
     */
    MT,

    /**
     * Hollanda
     * 
     */
    NL,

    /**
     * Norveç
     * 
     */
    NO,

    /**
     * Avusturya
     * 
     */
    AT,

    /**
     * Polonya
     * 
     */
    PL,

    /**
     * Portekiz
     * 
     */
    PT,

    /**
     * Romanya
     * 
     */
    RO,

    /**
     * Slovenya
     * 
     */
    SI,

    /**
     * Slovakya
     * 
     */
    SK,

    /**
     * Finlandiya
     * 
     */
    FI,

    /**
     * \u0130sveç
     * 
     */
    SE,

    /**
     * Birle\u015fik Krall\u0131k
     * 
     */
    UK,

    /**
     * Türkiye
     * 
     */
    TR,

    /**
     * \u0130sviçre
     * 
     */
    CH,

    /**
     * Andorra
     * 
     */
    AD,

    /**
     * Birle\u015fik Arap Emirlikleri
     * 
     */
    AE,

    /**
     * Afganistan
     * 
     */
    AF,

    /**
     * Antigua ve Barbuda
     * 
     */
    AG,

    /**
     * Arnavutluk
     * 
     */
    AL,

    /**
     * Ermenistan
     * 
     */
    AM,

    /**
     * Angola
     * 
     */
    AO,

    /**
     * Arjantin
     * 
     */
    AR,

    /**
     * Avustralya
     * 
     */
    AU,

    /**
     * Azerbaycan
     * 
     */
    AZ,

    /**
     * Bosna-Hersek
     * 
     */
    BA,

    /**
     * Barbados
     * 
     */
    BB,

    /**
     * Banglade\u015f
     * 
     */
    BD,

    /**
     * Burkina Faso
     * 
     */
    BF,

    /**
     * Bahreyn
     * 
     */
    BH,

    /**
     * Burundi
     * 
     */
    BI,

    /**
     * Benin
     * 
     */
    BJ,

    /**
     * Brunei
     * 
     */
    BN,

    /**
     * Bolivya
     * 
     */
    BO,

    /**
     * Brezilya
     * 
     */
    BR,

    /**
     * Bahamalar
     * 
     */
    BS,

    /**
     * Bhutan
     * 
     */
    BT,

    /**
     * Botsvana
     * 
     */
    BW,

    /**
     * Beyaz Rusya
     * 
     */
    BY,

    /**
     * Belize
     * 
     */
    BZ,

    /**
     * Kanada
     * 
     */
    CA,

    /**
     * Demokratik Kongo Cumhuriyeti
     * 
     */
    CD,

    /**
     * Orta Afrika Cumhuriyeti
     * 
     */
    CF,

    /**
     * Kongo Cumhuriyeti
     * 
     */
    CG,

    /**
     * Fildi\u015fi Sahili
     * 
     */
    CI,

    /**
     * \u015eili
     * 
     */
    CL,

    /**
     * Kamerun
     * 
     */
    CM,

    /**
     * Çin
     * 
     */
    CN,

    /**
     * Kolombiya
     * 
     */
    CO,

    /**
     * Kosta Rika
     * 
     */
    CR,

    /**
     * S\u0131rbistan
     * 
     */
    RS,

    /**
     * Küba
     * 
     */
    CU,

    /**
     * Ye\u015filburun
     * 
     */
    CV,

    /**
     * Cibuti
     * 
     */
    DJ,

    /**
     * Dominik
     * 
     */
    DM,

    /**
     * Dominik Cumhuriyeti
     * 
     */
    DO,

    /**
     * Cezayir
     * 
     */
    DZ,

    /**
     * Ekvador
     * 
     */
    EC,

    /**
     * M\u0131s\u0131r
     * 
     */
    EG,

    /**
     * Eritre
     * 
     */
    ER,

    /**
     * Etiyopya
     * 
     */
    ET,

    /**
     * Fiji
     * 
     */
    FJ,

    /**
     * Mikronezya
     * 
     */
    FM,

    /**
     * Gabon
     * 
     */
    GA,

    /**
     * Granada
     * 
     */
    GD,

    /**
     * Gürcistan
     * 
     */
    GE,

    /**
     * Gana
     * 
     */
    GH,

    /**
     * Grönland
     * 
     */
    GL,

    /**
     * Gambia
     * 
     */
    GM,

    /**
     * Gine
     * 
     */
    GN,

    /**
     * Ekvator Ginesi
     * 
     */
    GQ,

    /**
     * Guatemala
     * 
     */
    GT,

    /**
     * Gine Bissau
     * 
     */
    GW,

    /**
     * Guyana
     * 
     */
    GY,

    /**
     * Honduras
     * 
     */
    HN,

    /**
     * Haiti
     * 
     */
    HT,

    /**
     * Endonezya
     * 
     */
    ID,

    /**
     * \u0130srail
     * 
     */
    IL,

    /**
     * Hindistan
     * 
     */
    IN,

    /**
     * Irak
     * 
     */
    IQ,

    /**
     * Iran
     * 
     */
    IR,

    /**
     * Jamaika
     * 
     */
    JM,

    /**
     * Ürdün
     * 
     */
    JO,

    /**
     * Japonya
     * 
     */
    JP,

    /**
     * Kenya
     * 
     */
    KE,

    /**
     * K\u0131rg\u0131zistan
     * 
     */
    KG,

    /**
     * Kamboçya
     * 
     */
    KH,

    /**
     * Kiribati
     * 
     */
    KI,

    /**
     * Komor
     * 
     */
    KM,

    /**
     * Saint Kitts ve Nevis
     * 
     */
    KN,

    /**
     * Kuzey Kore (Kore Demokratik Halk Cumhuriyeti)
     * 
     */
    KP,

    /**
     * Güney Kore (Kore Cumhuriyeti)
     * 
     */
    KR,

    /**
     * Kuveyt
     * 
     */
    KW,

    /**
     * Kazakistan
     * 
     */
    KZ,

    /**
     * Laos
     * 
     */
    LA,

    /**
     * Lübnan
     * 
     */
    LB,

    /**
     * Saint Lucia
     * 
     */
    LC,

    /**
     * Lihten\u015ftayn
     * 
     */
    LI,

    /**
     * Sri Lanka
     * 
     */
    LK,

    /**
     * Liberya
     * 
     */
    LR,

    /**
     * Lesoto
     * 
     */
    LS,

    /**
     * Libya
     * 
     */
    LY,

    /**
     * Fas
     * 
     */
    MA,

    /**
     * Monako
     * 
     */
    MC,

    /**
     * Moldova
     * 
     */
    MD,

    /**
     * Madagaskar
     * 
     */
    MG,

    /**
     * Mar\u015fal Adalar\u0131
     * 
     */
    MH,

    /**
     * Eski Yugoslav Makedonya Cumhuriyeti
     * 
     */
    MK,

    /**
     * Mali
     * 
     */
    ML,

    /**
     * Myanmar/Burma
     * 
     */
    MM,

    /**
     * Mo\u011folistan
     * 
     */
    MN,

    /**
     * Moritanya
     * 
     */
    MR,

    /**
     * Morityus
     * 
     */
    MU,

    /**
     * Maldivler
     * 
     */
    MV,

    /**
     * Malavi
     * 
     */
    MW,

    /**
     * Meksika
     * 
     */
    MX,

    /**
     * Malezya
     * 
     */
    MY,

    /**
     * Mozambik
     * 
     */
    MZ,

    /**
     * Namibya
     * 
     */
    NA,

    /**
     * Nijer
     * 
     */
    NE,

    /**
     * Nijerya
     * 
     */
    NG,

    /**
     * Nikaragua
     * 
     */
    NI,

    /**
     * Nepal
     * 
     */
    NP,

    /**
     * Nauru
     * 
     */
    NR,

    /**
     * Niue
     * 
     */
    NU,

    /**
     * Yeni Zelanda
     * 
     */
    NZ,

    /**
     * Umman
     * 
     */
    OM,

    /**
     * Panama
     * 
     */
    PA,

    /**
     * Peru
     * 
     */
    PE,

    /**
     * Papua Yeni Gine
     * 
     */
    PG,

    /**
     * Filipinler
     * 
     */
    PH,

    /**
     * Pakistan
     * 
     */
    PK,

    /**
     * Özerk Filistin Bölgeleri
     * 
     */
    PS,

    /**
     * Palau
     * 
     */
    PW,

    /**
     * Paraguay
     * 
     */
    PY,

    /**
     * Katar
     * 
     */
    QA,

    /**
     * Rusya
     * 
     */
    RU,

    /**
     * Ruanda
     * 
     */
    RW,

    /**
     * Suudi Arabistan
     * 
     */
    SA,

    /**
     * Solomon Adalar\u0131
     * 
     */
    SB,

    /**
     * Sey\u015fel Adalar\u0131
     * 
     */
    SC,

    /**
     * Sudan
     * 
     */
    SD,

    /**
     * Singapur
     * 
     */
    SG,

    /**
     * Sierra Leone
     * 
     */
    SL,

    /**
     * San Marino
     * 
     */
    SM,

    /**
     * Senegal
     * 
     */
    SN,

    /**
     * Somali
     * 
     */
    SO,

    /**
     * Surinam
     * 
     */
    SR,

    /**
     * São Tomé ve Príncipe
     * 
     */
    ST,

    /**
     * El Salvador
     * 
     */
    SV,

    /**
     * Suriye
     * 
     */
    SY,

    /**
     * Svaziland
     * 
     */
    SZ,

    /**
     * Çad
     * 
     */
    TD,

    /**
     * Togo
     * 
     */
    TG,

    /**
     * Tayland
     * 
     */
    TH,

    /**
     * Tacikistan
     * 
     */
    TJ,

    /**
     * Do\u011fu Timor
     * 
     */
    TL,

    /**
     * Türkmenistan
     * 
     */
    TM,

    /**
     * Tunus
     * 
     */
    TN,

    /**
     * Tonga
     * 
     */
    TO,

    /**
     * Trinidad ve Tobago
     * 
     */
    TT,

    /**
     * Tuvalu
     * 
     */
    TV,

    /**
     * Tanzanya
     * 
     */
    TZ,

    /**
     * Ukrayna
     * 
     */
    UA,

    /**
     * Uganda
     * 
     */
    UG,

    /**
     * Amerika Birle\u015fik Devletleri
     * 
     */
    US,

    /**
     * Uruguay
     * 
     */
    UY,

    /**
     * Özbekistan
     * 
     */
    UZ,

    /**
     * Vatikan
     * 
     */
    VA,

    /**
     * Saint Vincent ve Grenadineler
     *                     
     * 
     */
    VC,

    /**
     * Venezuella
     * 
     */
    VE,

    /**
     * Vietnam
     * 
     */
    VN,

    /**
     * Vanuatu
     * 
     */
    VU,

    /**
     * Samoa
     * 
     */
    WS,

    /**
     * Yemen
     * 
     */
    YE,

    /**
     * Güney Afrika
     * 
     */
    ZA,

    /**
     * Zambiya
     * 
     */
    ZM,

    /**
     * Zimbabve
     * 
     */
    ZW,

    /**
     * Karada\u011f
     * 
     */
    ME,

    /**
     * Güney Sudan
     * 
     */
    SS;

    public String value() {
        return name();
    }

    public static CountryCode fromValue(String v) {
        return valueOf(v);
    }

}
