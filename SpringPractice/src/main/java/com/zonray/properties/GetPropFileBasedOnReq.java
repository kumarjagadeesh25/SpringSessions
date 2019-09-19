package com.zonray.properties;

import java.util.Locale;
import java.util.ResourceBundle;

public class GetPropFileBasedOnReq {

public static void main(String[] args) {

		Locale locale = Locale.getDefault();
		/*
		 * String name =
		 * "myproject_"+locale.getLanguage()+"_"+locale.getCountry()+".properties";
		 * System.out.println(name);
		 */
	
		
		/*
		 * StringBuilder builder = new StringBuilder(); builder.append("myproject_");
		 * builder.append(locale.getLanguage()); builder.append("_");
		 * builder.append(locale.getCountry()); builder.append(".properties");
		 * System.out.println(builder);
		 */

		Locale locale2 = new Locale("en","IN");
		ResourceBundle bundle = ResourceBundle.getBundle("myproject", locale2);
		System.out.println(bundle);
		System.out.println(bundle.getString("welcome.message"));
		
	}
}
