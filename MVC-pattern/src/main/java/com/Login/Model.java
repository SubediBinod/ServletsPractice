package com.Login;

public class Model {
	boolean Authenticate(String name, String pass) {
		//Default userId and password is admin 
		if(name.equals("admin")&&pass.equals("admin")){
			return true;
		}
		return false;
		
				
	}

}
