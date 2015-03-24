package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_role_module {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_role_module_Id;
	private String department;
	private String user_name;
	private String role_name;
	private String privilege;
	
	
	public int getUser_role_module_Id() {
		return user_role_module_Id;
	}
	public void setUser_role_module_Id(int user_role_module_Id) {
		this.user_role_module_Id = user_role_module_Id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
		
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	
}
