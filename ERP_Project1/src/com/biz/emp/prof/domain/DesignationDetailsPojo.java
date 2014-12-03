package com.biz.emp.prof.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import java.sql.Date;
@Entity
@Table(name = "employee_designation")
public class DesignationDetailsPojo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "emp_ID")
	 String emp_ID;
	
	@Column(name = "designation")
	 String designation;
	
	@Column(name = "department")
	 String department;
	
	@Column(name = "doj")
	 String doj;

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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	
	
	
}
