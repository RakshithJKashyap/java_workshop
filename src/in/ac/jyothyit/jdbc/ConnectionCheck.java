package in.ac.jyothyit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 class ConnectionCheck {
	public static void main(String args[]) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3360/institute";
		String username = "root";
		String password ="";
		
		Connection connection = null;
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Successfull");
			connection.close();
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}
		catch(SQLException sqle) {
			System.out.println(sqle);
		}
	}
}
