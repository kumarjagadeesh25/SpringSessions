package com.zonray.properties;

import java.util.Locale;

public class LocaleObjectUsage {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		System.out.println(locale.getClass());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayCountry(locale));
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getDisplayName(locale));
		System.out.println(locale.getDisplayScript());
		System.out.println(locale.getDisplayScript(locale));
		System.out.println(locale.getDisplayVariant());
		System.out.println(locale.getDisplayVariant(locale));
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getScript());
		System.out.println(locale.getUnicodeLocaleType("u0"));
		System.out.println(locale.getVariant());
		System.out.println(locale.hasExtensions());
		System.out.println(locale.hashCode());
		System.out.println(locale.toLanguageTag());
		System.out.println(locale.toString());
		System.out.println(locale.getClass());
		System.out.println(locale.getExtensionKeys());

	}
}
