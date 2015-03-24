package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_transaction_Id;
	private String user_type;
	private String user_name;
	private String user_department;
	private String user_module;
	
	private Boolean permission_read;
	private Boolean permission_create;
	private Boolean permission_edit;
	private Boolean permission_delete;
	
	public int getUser_transaction_Id() {
		return user_transaction_Id;
	}
	public void setUser_transaction_Id(int user_transaction_Id) {
		this.user_transaction_Id = user_transaction_Id;
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
	
	public String getUser_module() {
		return user_module;
	}
	public void setUser_module(String user_module) {
		this.user_module = user_module;
	}
	public Boolean getPermission_read() {
		return permission_read;
	}
	public void setPermission_read(Boolean permission_read) {
		this.permission_read = permission_read;
	}
	public Boolean getPermission_create() {
		return permission_create;
	}
	public void setPermission_create(Boolean permission_create) {
		this.permission_create = permission_create;
	}
	public Boolean getPermission_edit() {
		return permission_edit;
	}
	public void setPermission_edit(Boolean permission_edit) {
		this.permission_edit = permission_edit;
	}
	public Boolean getPermission_delete() {
		return permission_delete;
	}
	public void setPermission_delete(Boolean permission_delete) {
		this.permission_delete = permission_delete;
	}
	public String getUser_department() {
		return user_department;
	}
	public void setUser_department(String user_department) {
		this.user_department = user_department;
	}
	
	
	
	
		
}
