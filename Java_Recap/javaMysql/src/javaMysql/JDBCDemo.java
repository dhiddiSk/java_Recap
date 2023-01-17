package javaMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
		
		try {	
			// Establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "krishna100");
			
			// Create a statment object to send it to the database.
			Statement statement = conn.createStatement();
			
			// Execute the statement object
			ResultSet resultSet = statement.executeQuery("select * from employee_database");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("salary"));
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
		}

	}

}
