package com.biz.ad.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="Course_Id")
	int course_id;
	
	@Column(name="Department_Name")
	String department_name;
	
	@Column(name="Course_Name")
	String course_name;
	
	@Column(name="Course_Duration")
	String course_duration;
	
	@Column(name="Course_Size")
	String course_size;

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}


	public String getCourse_size() {
		return course_size;
	}

	public void setCourse_size(String course_size) {
		this.course_size = course_size;
	}
	
	

}
