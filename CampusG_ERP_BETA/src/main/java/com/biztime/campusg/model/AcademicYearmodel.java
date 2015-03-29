package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name="academic_detail")
public class AcademicYearmodel implements Serializable {

	private static long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "academic_year_id")  
		private Integer academicyearId;
		
		@Column(name = "academic_year")
		private String academicYear;
		
		
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
			AcademicYearmodel.serialVersionUID = serialVersionUID;
		}

		public Integer getAcademicyearId() {
			return academicyearId;
		}

		public void setAcademicyearId(Integer academicyearId) {
			this.academicyearId = academicyearId;
		}

		public String getAcademicYear() {
			return academicYear;
		}

		public void setAcademicYear(String academicYear) {
			this.academicYear = academicYear;
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
