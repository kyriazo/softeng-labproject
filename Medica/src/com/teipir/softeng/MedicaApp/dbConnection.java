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
	public static String thisUsername;
	public static String thisPassword;
	public static int userId;







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
         int id = rs.getInt("ID");
         
         
//         System.out.println(Password);
//         System.out.println(User);
//         System.out.println(user1);
//         System.out.println(pass);
         
        
         
         if(pass.equals(Password) && user1.equals(User))
         {
        	 USER = user1;
        	 userId = id;
     		

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


public void addPatient(String name, String surname,String amka,String carrier,String birthdate,String address,String tk,String city,String phone ) {
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
		pstmt.setString(1, name);
		pstmt.setString(2, surname);
		pstmt.setString(3, amka);
		pstmt.setString(4, carrier);
		pstmt.setString(5, birthdate);
		pstmt.setString(6, address);
		pstmt.setString(7, tk);
		pstmt.setString(8, city);
		pstmt.setString(9, phone);
		pstmt.executeUpdate();
		pstmt.close();
		
		
		
		
		
		
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
}

public String getUsername() {
	return thisUsername;
}

public String getPassword() {
	
	return thisPassword;
	
}

public int getId() {
	
	return userId;
	
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
		
		String sql = "SELECT * FROM patientinfo WHERE Surname=? OR AMKA =?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, surname);
		pstmt.setString(2, amka);
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