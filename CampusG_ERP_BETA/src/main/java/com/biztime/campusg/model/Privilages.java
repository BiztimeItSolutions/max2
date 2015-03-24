package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Privilages {
	@Id
	private String privilages_Id;
	private String privilages_name;
	private String group_Id;
	
	public String getPrivilages_Id() {
		return privilages_Id;
	}
	public void setPrivilages_Id(String privilages_Id) {
		this.privilages_Id = privilages_Id;
	}
	public String getPrivilages_name() {
		return privilages_name;
	}
	public void setPrivilages_name(String privilages_name) {
		this.privilages_name = privilages_name;
	}
	public String getGroup_Id() {
		return group_Id;
	}
	public void setGroup_Id(String group_Id) {
		this.group_Id = group_Id;
	}
	
	
	
	
}
