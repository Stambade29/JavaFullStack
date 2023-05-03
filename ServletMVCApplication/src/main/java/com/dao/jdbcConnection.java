package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {
	public Connection getConnection() {
		Connection con=null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		// Step 2 : Connection to database
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","123456789");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
}
