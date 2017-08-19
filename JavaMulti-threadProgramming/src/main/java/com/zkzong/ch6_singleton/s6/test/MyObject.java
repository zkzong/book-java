package com.zkzong.ch6_singleton.s6.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum MyObject {
	connectionFactory;

	private Connection connection;

	private MyObject() {
		try {
			System.out.println("������MyObject�Ĺ���");
			String url = "jdbc:mysql://localhost:3306/test";
			String username = "root";
			String password = "root";
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
}