package com.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 class DbConnection{

	boolean flag=false;
	boolean CheckPAss(String name,String pass) throws ClassNotFoundException, SQLException {
	  
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/My1","root","root");
			 Statement s= con.createStatement();
			 ResultSet rs = s.executeQuery("SELECT PassWord FROM user WHERE Name = '" + name + "'");
			 System.out.println("Connection was success");
			 if (rs.next()) {
				    String passwordFromDB = rs.getString("PassWord");
				    if (passwordFromDB.equals(pass)) {
				        // Password matches
				        System.out.println("Password matched!");
				        flag= true;
				    } else {
				        // Password does not match
				        System.out.println("Password does not match!");
				        flag= false;
				    }
				} else {
				    // No matching user found
				    System.out.println("User not found!");
				    flag=false;
				}

	        return flag;
	}
}
 
