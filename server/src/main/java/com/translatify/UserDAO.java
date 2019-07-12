package com.translatify;

import java.util.ArrayList;

public class UserDAO {

	ArrayList<String> users;
	
	public UserDAO() {
		users = new ArrayList<String>();
	}
	
	public String add(String name) {
		if(name.equals(""))
			return "Name cannot be null";
		
		else if(users.contains(name))
			return "User already exists";
		
		users.add(name);
		return "User added successfuly";
	}
	
	public String remove(String name) {
		if(name.equals(""))
			return "Name cannot be null";
		
		else if(!users.contains(name))
			return "User don't exists";
		
		users.remove(name);
		return "User removed successfuly";
	}
}