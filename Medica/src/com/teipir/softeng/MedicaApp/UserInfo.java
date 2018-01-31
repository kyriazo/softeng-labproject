package com.teipir.softeng.MedicaApp;

import java.sql.Connection;

public class UserInfo {

	private String Username;
	private int id;
	
	public UserInfo (String user){
		Username = user;
	}
	
	public String getUsername() {
			return Username;
	}
	
	dbConnection db = new dbConnection();
}
