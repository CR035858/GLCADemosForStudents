package com.gl.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	public static void main(String[] args) {

		String jdbc = "jdbc:mysql://localhost:3306/testdb";
	//	String jdbc = "jdbc:mysql://localhost:3306/ebook";
		String user = "root";
	//	String pass = "rehan@1996";
		String pass = "MySQL_@123456";

		try {
			System.out.println("jdbc url:" + jdbc);

			Connection cn = DriverManager.getConnection(jdbc, user, pass);
			System.out.println("Connection successful");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
