package com.teipir.softeng.SQLconnection;

import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionMySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Connection conn = DriverManager.getConnection("jbdc:mysql://localhost/test","root","yamaha");
			System.out.println("Connection Succes");
		}catch(Exception e) {
			System.err.println(e);
			
		}
		
		

	}

}
