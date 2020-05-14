package com;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

public class DBConnection 
{
	public static Connection getConnection()
	{	
		System.out.println("inside db conn");
		ResourceBundle rb = ResourceBundle.getBundle("mydb");
		String url = rb.getString("db.url");
		String username = rb.getString("db.username");
		String password = rb.getString("db.password");
		Connection conn=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("error in class not found exc"+e.getMessage());
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			
			System.out.println("sql exception"+e.getMessage());
			e.printStackTrace();
		}
//		System.out.println("arrived at the end");
		return conn;
	}
}
