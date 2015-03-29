package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Privilege {
	@Id
	private String privilege_Id;
	private String privilege_shortname;
	private String privilege_name;
	private String group_Id;
	public String getPrivilege_Id() {
		return privilege_Id;
	}
	public void setPrivilege_Id(String privilege_Id) {
		this.privilege_Id = privilege_Id;
	}
	public String getPrivilege_shortname() {
		return privilege_shortname;
	}
	public void setPrivilege_shortname(String privilege_shortname) {
		this.privilege_shortname = privilege_shortname;
	}
	public String getPrivilege_name() {
		return privilege_name;
	}
	public void setPrivilege_name(String privilege_name) {
		this.privilege_name = privilege_name;
	}
	public String getGroup_Id() {
		return group_Id;
	}
	public void setGroup_Id(String group_Id) {
		this.group_Id = group_Id;
	}
	
	
		
}
