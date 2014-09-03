package com.biz.ad.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Dept_ID")
	int dept_id;
	
	@Column(name="Department_Name")
	String departmentt_name;
	
	@Column(name="Building_Name")
	String building_name;
	
	@Column(name="Location")
	String location;

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDepartmentt_name() {
		return departmentt_name;
	}

	public void setDepartmentt_name(String departmentt_name) {
		this.departmentt_name = departmentt_name;
	}

	public String getBuilding_name() {
		return building_name;
	}

	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
