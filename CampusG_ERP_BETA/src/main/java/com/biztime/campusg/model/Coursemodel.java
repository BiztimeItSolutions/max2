package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name="course")

public class Coursemodel implements Serializable {

	private static long serialVersionUID = -723583058586873479L;  

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "course_id")  
	private Integer courseId;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "grading ")
	private String grading;
	
	
	@Column(name = "elective ")
	private String elective;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGrading() {
		return grading;
	}

	public void setGrading(String grading) {
		this.grading = grading;
	}

	public String getElective() {
		return elective;
	}

	public void setElective(String elective) {
		this.elective = elective;
	}



	@Column(name = "program_name")
	private String programNamefk;
	
	
	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public static void setSerialVersionUID(long serialVersionUID) {
		Coursemodel.serialVersionUID = serialVersionUID;
	}

	

	public String getProgramNamefk() {
		return programNamefk;
	}

	public void setProgramNamefk(String programNamefk) {
		this.programNamefk = programNamefk;
	}



	@Column(name = "deleted")
	private String deleted;
	
	@Column(name = "version")
	private String version;
	
	@Column(name = "created_by")
	private String createdBy;
	
	public String getDeleted() {
		return deleted;
	} 

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Column(name = "created_on")
	private String createdOn;
	
	@Column(name = "mdofied_by")
	private String modifiedBy;
	
	@Column(name = "modified_on")
	private String modifiedOn;
	
	
	

}
