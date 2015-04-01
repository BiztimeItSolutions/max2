package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="semester")
public class Semester implements Serializable {

	private static long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "semester_id")  
		private Integer semesterId;
		

	 
		@Column(name = "semester_name")
		private String semesterName;

		@Column(name = "deleted")
		private String deleted;
		
		@Column(name = "version")
		private String version;
		
		@Column(name = "created_by")
		private String createdBy;
		
		@Column(name = "created_on")
		private String createdOn;
		
		@Column(name = "modified_on")
		private String modifiedOn;
		
		

		@Column(name = "modified_by")
		private String modifiedBy;



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



		public String getModifiedOn() {
			return modifiedOn;
		}



		public void setModifiedOn(String modifiedOn) {
			this.modifiedOn = modifiedOn;
		}



		public String getModifiedBy() {
			return modifiedBy;
		}



		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}



		public static void setSerialversionuid(long serialversionuid) {
			serialVersionUID = serialversionuid;
		}



		public Integer getSemesterId() {
			return semesterId;
		}



		public void setSemesterId(Integer semesterId) {
			this.semesterId = semesterId;
		}



		public String getSemesterName() {
			return semesterName;
		}



		public void setSemesterName(String semesterName) {
			this.semesterName = semesterName;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
