package com.biz.emp.prof.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_work_experience")
public class WorkExperienceDetailsPojo {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "emp_ID")
	 String emp_ID;
	
	@Column(name = "collegename")
	 String collegename;
	
	@Column(name = "universityname")
	 String universityname;
	
	@Column(name = "designation")
	 String designation;
	
	@Column(name = "startdate")
	 String startdate;
	
	@Column(name = "enddate")
	 String enddate;
	
	@Column(name = "yearofexperience")
	 String yearofexperience;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(String emp_ID) {
		this.emp_ID = emp_ID;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getYearofexperience() {
		return yearofexperience;
	}

	public void setYearofexperience(String yearofexperience) {
		this.yearofexperience = yearofexperience;
	}
	
	
	
}
