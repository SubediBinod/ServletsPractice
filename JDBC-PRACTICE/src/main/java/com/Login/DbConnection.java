package com.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 class DbConnection{

	boolean flag=false;
	String[] CheckPAss(String name,String pass) throws ClassNotFoundException, SQLException {
	  
		
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 String arr[]=new String[2];
			 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/my1","root","root");
			 Statement s= con.createStatement();
			 ResultSet rs = s.executeQuery("SELECT PassWord FROM user WHERE Name = '" + name + "'");
			 System.out.println("Connection was success");
			 if (rs.next()) {
				    String passwordFromDB = rs.getString("PassWord");
				    if (passwordFromDB.equals(pass)) {
				        // Password matches
				    	arr[0]=name;
				    	arr[1]=passwordFromDB;
				        System.out.println("Password matched!");
				       
				    } else {
				        // Password does not match
				    	arr[0]=name;
				    	arr[1]=null;
				        System.out.println("Password does not match!");
				        flag= false;
				    }
				} else {
				    // No matching user found
				    System.out.println("User not found!");
				    arr[0]=null;
				    arr[1]=null;
				}

	        return arr;
	}
}
 
