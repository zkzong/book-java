package com.zkzong.ch6_singleton.s7.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyObject {

	public enum MyEnumSingleton {
		connectionFactory;

		private Connection connection;

		private MyEnumSingleton() {
			try {
				System.out.println("创建MyObject对象");
				String url = "jdbc:mysql://localhost:3306/test";
				String username = "root";
				String password = "root";
				String driverName = "com.mysql.jdbc.Driver";
				Class.forName(driverName);
				connection = DriverManager.getConnection(url, username,
						password);
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

	public static Connection getConnection() {
		return MyEnumSingleton.connectionFactory.getConnection();
	}

}