package Dao;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	public class DbConnection {
		private static String driver="oracle.jdbc.OracleDriver";
		private static String url="jdbc:oracle:thin:@localhost:1521:XE";
		private static String userName="System";
		private static String password="123456789";
		
		public static Connection getDbConnection() {
			Connection con=null;
			try {
				Class.forName(driver);
				con=DriverManager.getConnection( url,userName,password);		
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return con;
			
		}

}
