package com.zonray.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileWriting {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream("db.properties"));
			System.out.println(properties.getProperty("db.url"));
			System.out.println(properties.getProperty("db.uname"));
			System.out.println(properties.getProperty("db.password"));
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
