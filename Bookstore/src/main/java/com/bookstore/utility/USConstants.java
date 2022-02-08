package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USConstants {
	
	public final static String US = "US";
	
	public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
		{
			put("AL", "Albania");
			put("AT", "Austria");
			put("BY", "Belarus");
            put("BE", "Belgium");
            put("BA", "Bosnia and Herzegowina");
            put("BG", "Bulgaria");
            put("CA", "Canada");
            put("CN", "China");
            put("HR", "Croatia ");
            put("CZ", "Czech Republic");
            put("DK", "Denmark");
            put("FI", "Finland");
            put("FR", "France");
            put("DE", "Germany");
            put("GR", "Greece");
            put("GL", "Greenland");
            put("HU", "Hungary");
            put("IS", "Iceland");
            put("IE", "Ireland");
            put("IT", "Italy");
            put("LV", "Latvia");
            put("LB", "Lebanon");
            put("LI", "Liechtenstein");
            put("LU", "Luxembourg");
            put("MK", "Macedonia");
            put("MG", "Madagascar");
            put("Malta", "Malta");
            put("MX", "Mexico");
            put("MC", "Monaco");
            put("NL", "Netherlands");
            put("NO", "Norway");
            put("PL", "Poland");
            put("PT", "Portugal");
            put("QA", "Qatar");
            put("RO", "Romania");
            put("RU", "Russian Federation");
            put("SM", "San Marino");
            put("SA", "	Saudi Arabia");
            put("CS", "Serbia and Montenegro");
            put("SG", "Singapore");
            put("SI", "Slovenia");
            put("ES", "Spain");
            put("SZ", "Swaziland");
            put("SE", "Sweden");
            put("CH", "Switzerland");
            put("TR", "Turkey");
            put("UA", "Ukraine");
            put("AE", "United Arab Emirates");
            put("GB", "United Kingdom");
            put("US", "United States");
            put("UY", "Uruguay");
		}
	};
	
	public final static List<String> listOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
	public final static List<String> listOfUSStatesName = new ArrayList<>(mapOfUSStates.values());

}
