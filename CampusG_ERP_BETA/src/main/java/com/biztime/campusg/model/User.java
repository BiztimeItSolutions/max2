package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int user_Id;
	private String user_name;
	private String password;
	private int user_type_Id;
	
	
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_type_Id() {
		return user_type_Id;
	}
	public void setUser_type_Id(int user_type_Id) {
		this.user_type_Id = user_type_Id;
	}
	
	
	
	

}
