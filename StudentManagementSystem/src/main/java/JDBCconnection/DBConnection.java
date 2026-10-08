package JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	String url;
	String username;
	String password;
	Connection con;
	
	public DBConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		url = "jdbc:mysql://localhost:3306/studentdb";
		username = "root";
		password = "YOUR-MYSQL-PASSWORD";
	}
	
	public Connection getConnection() throws SQLException {
		con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Complete");
		return con;
	}
}
