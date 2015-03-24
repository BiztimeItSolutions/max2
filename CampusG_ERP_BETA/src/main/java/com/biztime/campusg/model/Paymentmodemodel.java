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
@Table(name="payment_mode1")
public class Paymentmodemodel implements Serializable {
	
	private static long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "mode_of_payment_id")  
		private Integer paymentmodeId;
	 
	 @Column(name = "mode_of_payment")
		private String paymentMode;
	 
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
			Paymentmodemodel.serialVersionUID = serialVersionUID;
		}


		public Integer getPaymentmodeId() {
			return paymentmodeId;
		}


		public void setPaymentmodeId(Integer paymentmodeId) {
			this.paymentmodeId = paymentmodeId;
		}


		public String getPaymentMode() {
			return paymentMode;
		}


		public void setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
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