package com.biz.adm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Dropdown")

public class DisplayPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "id")
	int id;
	
	@Column(name = "graduation")
	String graduation;
	
	@Column(name = "course")
	String course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}