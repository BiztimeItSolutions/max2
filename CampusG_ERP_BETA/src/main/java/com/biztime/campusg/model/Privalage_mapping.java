package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Privalage_mapping {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int privalage_mapping_Id;
	private String user;
	private String department;
	private String role;
	private String module;
	private String privilage;
	
	public int getPrivalage_mapping_Id() {
		return privalage_mapping_Id;
	}
	public void setPrivalage_mapping_Id(int privalage_mapping_Id) {
		this.privalage_mapping_Id = privalage_mapping_Id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getPrivilage() {
		return privilage;
	}
	public void setPrivilage(String privilage) {
		this.privilage = privilage;
	}
	
	

}
