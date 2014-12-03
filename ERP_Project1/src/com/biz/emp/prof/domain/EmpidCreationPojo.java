package com.biz.emp.prof.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empid_creation")

public class EmpidCreationPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	
	@Column(name = "value")
	 String value;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "emp_ID")
	 String emp_ID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_ID() {
		return emp_ID;
	}

	public String setEmp_ID(String emp_ID) {
		return this.emp_ID = emp_ID;
	}
	
	}
