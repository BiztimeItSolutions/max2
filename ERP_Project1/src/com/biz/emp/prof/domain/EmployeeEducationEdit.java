package com.biz.emp.prof.domain;

import javax.persistence.Column;

public class EmployeeEducationEdit {
	
	 int id;
	 String emp_ID;
	 String degreename;	
	 String universityname;
	 String percentage;
	 String yearofpassing;
	 String collegename;
	 String educationtype;
	 String employeetype;
	 
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
	public String getDegreename() {
		return degreename;
	}
	public void setDegreename(String degreename) {
		this.degreename = degreename;
	}
	public String getUniversityname() {
		return universityname;
	}
	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getYearofpassing() {
		return yearofpassing;
	}
	public void setYearofpassing(String yearofpassing) {
		this.yearofpassing = yearofpassing;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getEducationtype() {
		return educationtype;
	}
	public void setEducationtype(String educationtype) {
		this.educationtype = educationtype;
	}
	public String getEmployeetype() {
		return employeetype;
	}
	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}

}
