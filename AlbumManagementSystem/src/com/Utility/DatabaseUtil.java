package com.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	public static final String username = "system";
	public static final String password = "PugLife";
	public static final String sid = "xe";
	public static final String server = "localhost";
	public static final String portno = "1521";
	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	
	
	public static Connection getConnect() throws SQLException, ClassNotFoundException {

		Connection con = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection(url, username, password);

		return con;

	}

	public static void closeConnection(Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}

}
