package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course_level {
	@Id
	private int course_level_id;
	private String course_level_name;
	
	public int getCourse_level_id() {
		return course_level_id;
	}
	public void setCourse_level_id(int course_level_id) {
		this.course_level_id = course_level_id;
	}
	public String getCourse_level_name() {
		return course_level_name;
	}
	public void setCourse_level_name(String course_level_name) {
		this.course_level_name = course_level_name;
	}
	
	
	
	

}
