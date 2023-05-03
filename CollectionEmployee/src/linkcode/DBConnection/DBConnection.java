package linkcode.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
        private static String driver=("oracle.jdbc.OracleDriver");
        private static String url=("jdbc:oracle:thin:@localhost:1521:XE");
        private static String username=("system");
        private static String password=("123456789");
        
 public static Connection getConnection() {
	 Connection con=null;
	 try {
		Class.forName(driver);
		 con=DriverManager.getConnection(url, username, password);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
}
