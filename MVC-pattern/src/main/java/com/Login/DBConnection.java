package com.Login;

import java.sql.*;

import org.apache.el.parser.ArithmeticNode;


public class DBConnection {

	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from login");
		while(rs.next()) {
			System.out.println("User name is"+ rs.getString(1)+" PAssword is "+rs.getString(2));
	}
		st.close();
		con.close();
}
}