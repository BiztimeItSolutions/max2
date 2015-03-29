package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="quota")
public class Quotamodel implements Serializable {

	
	private static long serialVersionUID = -723583058586873479L;  

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "quota_id")  
	private Integer quotaId;
	
	@Column(name = "quota_name")
	private String quotaName;
	
	
	

	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public static void setSerialVersionUID(long serialVersionUID) {
		Quotamodel.serialVersionUID = serialVersionUID;
	}

	public Integer getQuotaId() {
		return quotaId;
	}

	public void setQuotaId(Integer quotaId) {
		this.quotaId = quotaId;
	}

	public String getQuotaName() {
		return quotaName;
	}

	public void setQuotaName(String quotaName) {
		this.quotaName = quotaName;
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
