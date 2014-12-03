package com.biz.ad.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fees_Structure")
public class FeesStructure {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="Fees_Structure_Id")
	private int fees_structure_id;
	
	
	private String department_name;
	private String course_name;
	private String forr;
	private String year;
	private String perticulars;
	private String amount;
	public int getFees_structure_id() {
		return fees_structure_id;
	}
	public void setFees_structure_id(int fees_structure_id) {
		this.fees_structure_id = fees_structure_id;
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
	public String getForr() {
		return forr;
	}
	public void setForr(String forr) {
		this.forr = forr;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPerticulars() {
		return perticulars;
	}
	public void setPerticulars(String perticulars) {
		this.perticulars = perticulars;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	
	

}
