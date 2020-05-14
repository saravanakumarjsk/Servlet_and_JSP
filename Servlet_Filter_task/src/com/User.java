package com;

import java.util.ArrayList;

public class User {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User() 
	{
		super();
	}

public ArrayList<User> getUserList()
{
	ArrayList<User> userlist = new ArrayList<User>();
	userlist.add(new User("admin", "admin"));
	userlist.add(new User("john", "john123"));
	userlist.add(new User("kivi", "kivi123"));
	userlist.add(new User("shyam", "shyam123"));
	return userlist;
}
}

















