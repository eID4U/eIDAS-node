package at.gv.egiz.eid4u.api.attributes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Definitions {

	/*Prefix and Schema definitions for eIDU specific eIDAS extensions */
	public static final String SCHEMA_ROOT = "/schema/eid4u/";
	
	public static final String SAML2_eID4U_CORE_EXTENSIONS_PREFIX = "eid4u";
	public static final String SAML2_eID4U_CORE_EXTENSIONS = "http://eidas.europa.eu/attributes/sectorspecific/eid4u";
	public static final String SAML2_eID4U_CORE_EXTENSIONS_SCHEMA_LOCATION = SCHEMA_ROOT + "eID4U_attributes_generic.xsd";
 
	public static final String SAML2_eID4U_PERSON_EXTENSIONS_PREFIX = "eid4uP";
	public static final String SAML2_eID4U_PERSON_EXTENSIONS = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson";
	public static final String SAML2_eID4U_PERSON_EXTENSIONS_SCHEMA_LOCATION = SCHEMA_ROOT + "eID4U_attributes_person.xsd";
  
	public static final String SAML2_eID4U_STUDIES_EXTENSIONS_PREFIX = "eid4uS";
	public static final String SAML2_eID4U_STUDIES_EXTENSIONS = "http://eidas.europa.eu/attributes/sectorspecific/eID4U/studies";
	public static final String SAML2_eID4U_STUDIES_EXTENSIONS_SCHEMA_LOCATION = SCHEMA_ROOT + "eID4U_attributes_studies.xsd";
	  
	public static final String SAML2_eID4U_EXT_EUROPASS3_PREFIX = "europass3";
	public static final String SAML2_eID4U_EXT_EUROPASS3_EXTENSIONS = "http://europass.cedefop.europa.eu/Europass";
	public static final String SAML2_eID4U_EXT_EUROPASS3_EXTENSIONS_SCHEMA_LOCATION = SCHEMA_ROOT + "external/EuropassSchema.xsd";
	  
	
	//Format definitions
	public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd";
	
	
	//attribute types
	public static final String IDTYPE_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/id/Type";
	public static final String IDTYPE_FRIENDLYNAME = "IdType";
	
	public static final String IDNUMBER_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/id/Number";
	public static final String IDNUMBER_FRIENDLYNAME = "IdNumber";

	public static final String IDISSUER_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/id/Issuer";
	public static final String IDISSUER_FRIENDLYNAME = "IdIssuer";

	public static final String IDEXPIREDATE_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/id/ExpiryDate";
	public static final String IDEXPIREDATE_FRIENDLYNAME = "IdExpiryDate";
	
	public static final String EHICID_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/EhicId";
	public static final String EHICID_FRIENDLYNAME = "EhicId";	
	
	public static final String NATIONALITY_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/Nationality";
	public static final String NATIONALITY_FRIENDLYNAME = "Nationality";
	
	public static final String MARITALSTATE_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/MaritalState";
	public static final String MARITALSTATE_FRIENDLYNAME = "MaritalState";
	
	public static final String COUNTRYOFBIRTH_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/CountryOfBirth";
	public static final String COUNTRYOFBIRTH_FRIENDLYNAME = "CountryOfBirth";
	
	public static final String EMAIL_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/Email";
	public static final String EMAIL_FRIENDLYNAME = "Email";
	
	public static final String PHONE_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/Phone";
	public static final String PHONE_FRIENDLYNAME = "Phone";
	
	public static final String TEMPORARYADDRESS_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/TemporaryAddress";
	public static final String TEMPORARYADDRESS_FRIENDLYNAME = "TemporaryAddress";
	
	public static final String CURRENTPHOTO_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/CurrentPhoto";
	public static final String CURRENTPHOTO_FRIENDLYNAME = "CurrentPhoto";
	
	public static final String TAXIDENTIFICATIONNUMBER_NAME = "http://eidas.europa.eu/attributes/sectorspecific/naturalperson/TaxIdentificationNumber";
	public static final String TAXIDENTIFICATIONNUMBER_FRIENDLYNAME = "TaxIdentificationNumber";
	
	public static final String HOMEINSTITUTIONNAME_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/homeinstitution/Name";
	                                                       
	public static final String HOMEINSTITUTIONNAME_FRIENDLYNAME = "HomeInstitutionName";
	
	public static final String HOMEINSTITUTIONIDENTIFIER_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/homeinstitution/Identifier";
	public static final String HOMEINSTITUTIONIDENTIFIER_FRIENDLYNAME = "HomeInstitutionIdentifier";
		
	public static final String HOMEINSTITUTIONCOUNTRY_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/homeinstitution/Country";
	public static final String HOMEINSTITUTIONCOUNTRY_FRIENDLYNAME = "HomeInstitutionCountry";
	
	public static final String HOMEINSTITUTIONADDRESS_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/homeinstitution/Address";
	public static final String HOMEINSTITUTIONADDRESS_FRIENDLYNAME = "HomeInstitutionAddress";
	
	public static final String CURRENTLEVELOFSTUDY_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/CurrentLevelOfStudy";
	public static final String CURRENTLEVELOFSTUDY_FRIENDLYNAME = "CurrentLevelOfStudy";
	 
	public static final String FIELDOFSTUDY_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/FieldOfStudy";
	public static final String FIELDOFSTUDY_FRIENDLYNAME = "FieldOfStudy";
	
	public static final String CURRENTDEGREE_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/CurrentDegree";
	public static final String CURRENTDEGREE_FRIENDLYNAME = "CurrentDegree";
	
	public static final String DEGREE_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/Degree";
	public static final String DEGREE_FRIENDLYNAME = "Degree";
	
	public static final String DEGREEAWARDINGINSTITUTION_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/DegreeAwardingInstitution";
	public static final String DEGREEAWARDINGINSTITUTION_FRIENDLYNAME = "DegreeAwardingInstitution";
	
	public static final String GRADUATIONYEAR_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/GraduationYear";
	public static final String GRADUATIONYEAR_FRIENDLYNAME = "GraduationYear";
	
	public static final String DEGREECOUNTRY_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/DegreeCountry";
	public static final String DEGREECOUNTRY_FRIENDLYNAME = "DegreeCountry";
	
	public static final String LANGUAGEPROFICIENCY_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/LanguageProficiency";
	public static final String LANGUAGEPROFICIENCY_FRIENDLYNAME = "LanguageProficiency";
		
	public static final String LANGUAGECERTIFICATES_NAME = "http://eidas.europa.eu/attributes/sectorspecific/eid4u/studies/LanguageCertificates";
	public static final String LANGUAGECERTIFICATES_FRIENDLYNAME = "LanguageCertificates";
	
	
	public static final List<String> EID4UATTRIBUTEELIST = Collections.unmodifiableList(new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add(IDTYPE_NAME);
			add(IDISSUER_NAME);
			add(IDNUMBER_NAME);
			add(IDEXPIREDATE_NAME);
			add(NATIONALITY_NAME);
			add(MARITALSTATE_NAME);
			add(COUNTRYOFBIRTH_NAME);
			add(EMAIL_NAME);
			add(PHONE_NAME);
			add(TEMPORARYADDRESS_NAME);
			add(CURRENTPHOTO_NAME);
			add(TAXIDENTIFICATIONNUMBER_NAME);
			add(HOMEINSTITUTIONNAME_NAME);
			add(HOMEINSTITUTIONIDENTIFIER_NAME);
			add(HOMEINSTITUTIONCOUNTRY_NAME);
			add(HOMEINSTITUTIONADDRESS_NAME);
			add(CURRENTLEVELOFSTUDY_NAME);
			add(FIELDOFSTUDY_NAME);
			add(CURRENTDEGREE_NAME);
			add(DEGREE_NAME);
			add(DEGREEAWARDINGINSTITUTION_NAME);
			add(GRADUATIONYEAR_NAME);
			add(DEGREECOUNTRY_NAME);
			add(LANGUAGEPROFICIENCY_NAME);
			add(LANGUAGECERTIFICATES_NAME);
		}
	});

}
