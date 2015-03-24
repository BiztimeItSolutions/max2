package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_temp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_temp_id;
	private String name;
	private String password;
	private String user_role;
	
	public int getUser_temp_id() {
		return user_temp_id;
	}
	public void setUser_temp_id(int user_temp_id) {
		this.user_temp_id = user_temp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	
	

}
