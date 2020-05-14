package com;

import java.util.ArrayList;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

public class UserDAO 
{
	public ArrayList<User> getUserList() throws ClassNotFoundException, SQLException
	{
		System.out.println("inside dao class");
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from details");
		ArrayList<User> userList = new ArrayList<User>();
		while(rs.next())
		{
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			userList.add(user);
		}
		return userList;
	}
}
