package in.ac.jyothyit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDelete {
	public static void main(String args[]) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3360/institute";
		String username = "root";
		String password ="";
		
		Connection connection =null;
		Statement statement=null;
		ResultSet resultSet=null;
		PreparedStatement preparedStatement = null;
		
		String sql = "delete from students where usn = ?";
		String sql1 = "select * from students";
		String usn = null;
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Enter the USN to be deleted:");
			usn = scanner.next();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement .setString(1, usn);
			int n = preparedStatement.executeUpdate();
			if (n==1)
				System.out.println("Deleted successful");
			else
				System.out.println("Not found!!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql1);
			
			while(resultSet.next()) {
				System.out.println("Remaining Useless ppl");
				System.out.println(resultSet.getString("usn")+ ","+ resultSet.getString("name")+ ","+ resultSet.getString("gender")+ ","+ resultSet.getString("Email")+ ","+ resultSet.getString("city")+ ","+ resultSet.getString("Age"));
			}
						
			
			connection.close();
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}
		catch(SQLException sqle) {
			System.out.println(sqle);
		}
		scanner.close();
	}
}
