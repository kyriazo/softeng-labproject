package com.teipir.softeng.MedicaApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class dbConnection{
	
	private	static String connectionURL = "jdbc:mysql://localhost/medicadb";
	private	static	String userName = "root";
	private	static	String password = "";
	public static Connection con = null;
	public static Statement stmt = null;
	public static Statement stmt2 = null;
	public static ResultSet rs = null;
	public static ResultSet rs2 = null;
	public static java.sql.PreparedStatement pstmt = null;







public  boolean SignIn (String Password, String User){
	try {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			 con = DriverManager.getConnection(connectionURL,userName,password);
			 stmt = con.createStatement();
			if (con != null){
				System.out.println("Connection with database established!");
			}
			
			} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}	
	
		
	String sql = ("SELECT * FROM users");
	rs = stmt.executeQuery(sql);
	
	while(rs.next()) { 
		
		 
         String user1  = rs.getString("Username");
         String pass = rs.getString("Password");
         
//         System.out.println(Password);
//         System.out.println(User);
//         System.out.println(user1);
//         System.out.println(pass);
         
        
         
         if(pass.equals(Password) && user1.equals(User))
         {
        	
     		

        	 System.out.println("All good");
        	
        	 
        	 return true;
         }
        
        
	}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	return false;
}


public void addPatient(String Name, String Surname,String AMKA,String Carrier,String Birthdate,String Address,String TK,String City,String Phone ) {
	try {
		
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			 con = DriverManager.getConnection(connectionURL,userName,password);
			 stmt = con.createStatement();
			if (con != null){
				System.out.println("Connection with database established!");
			}
			
			} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}	
		
		//String sql = ("INSERT INTO patientinfo VALUES(" + Name + ","+ Surname + ","+ AMKA + ","+ Carrier + ","+ Birthdate + ","+ Address+ ","+ TK + ","+ City + ","+ Phone")";
		//stmt.executeUpdate(sql);
		
		String SQL = "INSERT INTO patientinfo VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		pstmt = con.prepareStatement(SQL);
		pstmt.setString(1, Name);
		pstmt.setString(2, Surname);
		pstmt.setString(3, AMKA);
		pstmt.setString(4, Carrier);
		pstmt.setString(5, Birthdate);
		pstmt.setString(6, Address);
		pstmt.setString(7, TK);
		pstmt.setString(8, City);
		pstmt.setString(9, Phone);
		pstmt.executeUpdate();
		pstmt.close();
		
		
		
		
		
		
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
}


}