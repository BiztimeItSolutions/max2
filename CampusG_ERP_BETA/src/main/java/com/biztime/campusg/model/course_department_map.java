package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course_department_map
{
	@Id
	private int course_department_map_id;
	private String course_id;
	private String department_id;
	
	
	public int getCourse_department_map_id() {
		return course_department_map_id;
	}
	public void setCourse_department_map_id(int course_department_map_id) {
		this.course_department_map_id = course_department_map_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	
	

}
