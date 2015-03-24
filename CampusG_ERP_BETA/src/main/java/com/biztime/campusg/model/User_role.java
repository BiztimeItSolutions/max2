package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_role_Id;
	private String user_type;
	private String user_name;
	private String user_role;
	
	
	public int getUser_role_Id() {
		return user_role_Id;
	}
	public void setUser_role_Id(int user_role_Id) {
		this.user_role_Id = user_role_Id;
	}
	
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	
	
	
}
