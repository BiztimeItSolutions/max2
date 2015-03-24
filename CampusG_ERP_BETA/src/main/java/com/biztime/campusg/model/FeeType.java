package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feetype") 
public class FeeType implements Serializable{  
	  
	 private static final long serialVersionUID = -723583058586873479L; 
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "fee_type_id")  
		private Integer fee_type_id;
	 
	 
		@Column(name = "fee_type_name")
	 	private String feeName;

		@Column(name = "short_name")
	 	private String shortName;
		
		@Column(name = "amount")
	 	private Integer amount;
		
		@Column(name = "receipt_book_name")
	 	private String receiptName;
		
		
		
		
		
		public String getReceiptName() {
			return receiptName;
		}


		public void setReceiptName(String receiptName) {
			this.receiptName = receiptName;
		}


		public String getShortName() {
			return shortName;
		}


		public void setShortName(String shortName) {
			this.shortName = shortName;
		}


		public Integer getAmount() {
			return amount;
		}


		public void setAmount(Integer amount) {
			this.amount = amount;
		}


		public Integer getFee_type_id() {
			return fee_type_id;
		}


		public void setFee_type_id(Integer fee_type_id) {
			this.fee_type_id = fee_type_id;
		}


		public String getFeeName() {
			return feeName;
		}


		public void setFeeName(String feeName) {
			this.feeName = feeName;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
