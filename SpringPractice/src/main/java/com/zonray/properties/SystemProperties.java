package com.zonray.properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SystemProperties {

	public static void main(String[] args) {
		String url = System.getProperty("db.url");
		String uname = System.getProperty("db.uname");
		String pass = System.getProperty("db.pass");
		try {
			Connection connection = DriverManager.getConnection(url,uname,pass);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employee");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("ename"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
