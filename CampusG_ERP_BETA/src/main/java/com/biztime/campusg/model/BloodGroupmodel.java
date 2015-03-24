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
@Table(name="blood_check")

public class BloodGroupmodel implements Serializable {

	private static long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "group_id")  
		private Integer groupId;
		
		
	 @Column(name = "group_name")
		private String groupName;
		
		
		
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

		

		
		public Integer getGroupId() {
			return groupId;
		}




		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}




		public String getGroupName() {
			return groupName;
		}




		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}




		public static void setSerialVersionUID(long serialVersionUID) {
			BloodGroupmodel.serialVersionUID = serialVersionUID;
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
		
}