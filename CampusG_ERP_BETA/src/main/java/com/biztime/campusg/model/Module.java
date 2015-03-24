package com.biztime.campusg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity  
public class Module {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "module_id")  
	private Integer moduleId;
	
	@Column(name = "module_name")
	private String moduleName;
	
	@Column(name = "parent_id")
	private Integer parentId;

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	

}
