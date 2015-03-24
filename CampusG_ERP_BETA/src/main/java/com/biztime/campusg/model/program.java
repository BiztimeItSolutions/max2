package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class program {
	
	@Id
	private int program_id;
	private String program_name;
	private int course_level_id;
	
	
	public int getProgram_id() {
		return program_id;
	}
	public void setProgram_id(int program_id) {
		this.program_id = program_id;
	}
	public String getProgram_name() {
		return program_name;
	}
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	public int getCourse_level_id() {
		return course_level_id;
	}
	public void setCourse_level_id(int course_level_id) {
		this.course_level_id = course_level_id;
	}
	
	
	
	

}
