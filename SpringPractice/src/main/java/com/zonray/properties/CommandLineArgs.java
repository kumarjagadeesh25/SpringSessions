package com.zonray.properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommandLineArgs {

	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection(args[0],args[1],args[2]);
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
