package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_connector {

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connector = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_banque?&serverTimezone=UTC", "root", "");
			return connector;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
