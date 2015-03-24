package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Role_module {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int role_module_Id;
	private String role_name;
	private String privilege;
	
	public int getRole_module_Id() {
		return role_module_Id;
	}
	public void setRole_module_Id(int role_module_Id) {
		this.role_module_Id = role_module_Id;
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
