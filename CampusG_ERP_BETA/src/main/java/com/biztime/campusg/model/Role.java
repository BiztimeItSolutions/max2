package com.biztime.campusg.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	private int role_Id;
	private String role_name;
	private String user_type_Id;
	
	
	
	public String getUser_type_Id() {
		return user_type_Id;
	}
	public void setUser_type_Id(String user_type_Id) {
		this.user_type_Id = user_type_Id;
	}
	public int getRole_Id() {
		return role_Id;
	}
	public void setRole_Id(int role_Id) {
		this.role_Id = role_Id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
		
}
