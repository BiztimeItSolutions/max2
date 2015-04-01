package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="manage")
public class ManageBatchmodel implements Serializable {

	private static long serialVersionUID = -723583058586873479L;  

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "manage_id")  
	private Integer manageId;
	
	@Column(name = "course_id")
	private String courseId;
	
	@Column(name = "batch_name")
	private String batchName;
	
	@Column(name = "student_name")
	private String firstName;
	
	@Column(name = "deleted")
	private String deleted;
	
	@Column(name = "version")
	private String version;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_on")
	private String createdOn;
	
	@Column(name = "mdofied_by")
	private String modifiedBy;
	
	@Column(name = "modified_on")
	private String modifiedOn;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public static void setSerialVersionUID(long serialVersionUID) {
		ManageBatchmodel.serialVersionUID = serialVersionUID;
	}

	public Integer getManageId() {
		return manageId;
	}

	public void setManageId(Integer manageId) {
		this.manageId = manageId;
	}

	

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

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
	
	
	
}