package org.springblade.modules.business.service;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
	private static Properties properties;
	static {

		try {
			properties = new Properties();
			InputStream resource = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
			properties.load(resource);
//			Class.forName(properties.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(properties.getProperty("url")
			, properties.getProperty("username"), properties.getProperty("password"));
	}
}
