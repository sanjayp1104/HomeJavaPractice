package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String user="hbstudent";
		String password="hbstudent";
		
		try {
			System.out.println("Connecting to database  "+jdbcUrl);
			Connection conn = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("Connection Successful!!!");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
