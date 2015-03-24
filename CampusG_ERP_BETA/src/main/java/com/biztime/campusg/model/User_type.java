package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_type {
	@Id
	private int user_type_Id;
	private String user_type_name;
	
	
	public int getUser_type_Id() {
		return user_type_Id;
	}
	public void setUser_type_Id(int user_type_Id) {
		this.user_type_Id = user_type_Id;
	}
	public String getUser_type_name() {
		return user_type_name;
	}
	public void setUser_type_name(String user_type_name) {
		this.user_type_name = user_type_name;
	}
	
	
	

}
