package com.zonray.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {

	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("db.properties")) {
			Properties properties = new Properties();

			properties.setProperty("db.url", "jdbc:oracle:thin:@localhost:1521:orcl");
			properties.setProperty("db.uname", "hibernate");
			properties.setProperty("db.passord", "hibernate");
			properties.store(fileOutputStream, "sample file to use property file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
