package com.zonray.properties;

import java.util.Locale;

public class GetCountryLangWithLocale {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		System.out.println(locale.getCountry());
		System.out.println(locale.getLanguage());
	}
}
