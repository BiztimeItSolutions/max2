package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_fee") 
public class MasterFee implements Serializable{  
	  
	private static final long serialVersionUID = -723583058586873479L; 
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "master_fee_id")  
		private Integer master_fee_id;
	 
	 
		@Column(name = "category_id")
	 	private String category_id;
		
		@Column(name = "department_id")
	 	private String department_id;
		
		@Column(name = "quota_id")
	 	private String quota_id;
 
		@Column(name = "amount")  
		private Integer amount;
		
		
	
		
        public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getDepartment_id() {
			return department_id;
		}

		public void setDepartment_id(String department_id) {
			this.department_id = department_id;
		}

		public String getQuota_id() {
			return quota_id;
		}

		public void setQuota_id(String quota_id) {
			this.quota_id = quota_id;
		}

	

	

		public Integer getMaster_fee_id() {
			return master_fee_id;
		}

		public void setMaster_fee_id(Integer master_fee_id) {
			this.master_fee_id = master_fee_id;
		}

		public String getCategory_id() {
			return category_id;
		}

		public void setCategory_id(String category_id) {
			this.category_id = category_id;
		}

		
	

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		

}
