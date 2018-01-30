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
	public static String USER;







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
         USER = user1;
         
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

public boolean allagi(String x) {
	int sfalma = 0;
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
		
		String SQL = "SELECT * FROM patientinfo WHERE Surname = ?";
		pstmt = con.prepareStatement(SQL);
		pstmt.setString(1, x);
		pstmt.executeQuery(SQL);
		pstmt.close();
		
		while(rs.next()) { 
			
			String check = rs.getString("name");
			
			if(check == null) {
				sfalma = 1;
			}
			
			 
		}
		
		
		
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	if(sfalma == 1) {
	return true;
	}else {
		return false;
	}
}


public String[] yparxei(String surname, String amka) {
	
	String info[] = {"","","","","","","","",""};
	
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
		
		String sql = "SELECT * FROM patientinfo WHERE Surname=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, surname);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			
			info[0] = rs.getString("Name");
			info[1] = rs.getString("Surname");
			info[2] = rs.getString("AMKA");
			info[3] = rs.getString("Carrier");
			info[4] = rs.getString("Birthdate");
			info[5] = rs.getString("Address");
			info[6] = rs.getString("TK");
			info[7] = rs.getString("City");
			info[8] = rs.getString("Phone");
		
			
		}
		
		
		
		
		
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	return info;
	
	
}
}