package com.biztime.campusg.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity  
@Table(name="college")

public class CollegeDetail implements Serializable {

	private static long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "college_id")  
		private Integer collegeId;
		
		@Column(name = "college_name")
		private String collegeName;
		
		
		/*@Column(name = "grading")
		private String grading;
		
		public String getGrading() {
			return grading;
		}

		public void setGrading(String grading) {
			this.grading = grading;
		}*/

		@Column(name = "college_code")
		private String collegeCode;
		
		@Column(name = "college_address")
		private String collegeAddress;
		
		@Column(name = "college_email")
		private String collegeEmail;
       
		@Column(name = "college_phone")
		private String collegePhone;
		
		@Column(name = "university_id")
		private String universityId;
		
		@Column(name = "deleted")
		private String deleted;
		
		@Column(name = "version")
		private String version;
		
		@Column(name = "created_by")
		private String createdBy;
		
		@Column(name = "created_on")
		private String createdOn;
		
		public static long getSerialVersionUID() {
			return serialVersionUID;
		}

		public static void setSerialVersionUID(long serialVersionUID) {
			CollegeDetail.serialVersionUID = serialVersionUID;
		}

		public String getCollegeCode() {
			return collegeCode;
		}

		public void setCollegeCode(String collegeCode) {
			this.collegeCode = collegeCode;
		}

		public String getCollegeAddress() {
			return collegeAddress;
		}

		public void setCollegeAddress(String collegeAddress) {
			this.collegeAddress = collegeAddress;
		}

		public String getCollegeEmail() {
			return collegeEmail;
		}

		public void setCollegeEmail(String collegeEmail) {
			this.collegeEmail = collegeEmail;
		}

		public String getCollegePhone() {
			return collegePhone;
		}

		public void setCollegePhone(String collegePhone) {
			this.collegePhone = collegePhone;
		}

		public String getUniversityId() {
			return universityId;
		}

		public void setUniversityId(String universityId) {
			this.universityId = universityId;
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

		@Column(name = "mdofied_by")
		private String modifiedBy;
		
		@Column(name = "modified_on")
		private String modifiedOn;
		
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public static void setSerialversionuid(long serialversionuid) {
			serialVersionUID = serialversionuid;
		}

		public Integer getCollegeId() {
			return collegeId;
		}

		public void setCollegeId(Integer collegeId) {
			this.collegeId = collegeId;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		
		
}
