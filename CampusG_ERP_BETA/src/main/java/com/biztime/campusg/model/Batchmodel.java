package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity  
@Table(name="batch")
public class Batchmodel implements Serializable {

	private static long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "batch_id")  
		private Integer batchId;
	 
	 @Column(name = "batch_name")
		private String batchName;
	 
	 
	 @Column(name = "college_id")
		private Integer collegeId;
	 
	 
	 @Column(name = "course_id")
		private Integer courseId;
	 
	 
	 @Column(name = "academic_year_id")
		private Integer academicyearId;
	 
	 
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


		public static long getSerialVersionUID() {
			return serialVersionUID;
		}



		public static void setSerialVersionUID(long serialVersionUID) {
			Batchmodel.serialVersionUID = serialVersionUID;
		}



		public Integer getBatchId() {
			return batchId;
		}



		public void setBatchId(Integer batchId) {
			this.batchId = batchId;
		}



		public int getCollegeId() {
			return collegeId;
		}



		public void setCollegeId(int collegeId) {
			this.collegeId = collegeId;
		}





		



		public Integer getCourseId() {
			return courseId;
		}



		public void setCourseId(Integer courseId) {
			this.courseId = courseId;
		}



		public Integer getAcademicyearId() {
			return academicyearId;
		}



		public void setAcademicyearId(Integer academicyearId) {
			this.academicyearId = academicyearId;
		}



		public void setCollegeId(Integer collegeId) {
			this.collegeId = collegeId;
		}




	

		public String getBatchName() {
			return batchName;
		}



		public void setBatchName(String batchName) {
			this.batchName = batchName;
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
		
		
	 
}
