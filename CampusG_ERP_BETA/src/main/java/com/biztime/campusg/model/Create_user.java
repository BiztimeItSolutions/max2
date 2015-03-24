package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Create_user {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int create_user_Id;
	//private String user_type;
	private String user_name;
	private String password;
	private String user_status;
	private String privilege;
	
	
	public int getCreate_user_Id() {
		return create_user_Id;
	}
	public void setCreate_user_Id(int create_user_Id) {
		this.create_user_Id = create_user_Id;
	}
	/*public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}*/
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
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	
	
	
	

}
