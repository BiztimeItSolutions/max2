package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receipt_book") 
public class ReceiptBook implements Serializable{  
	  
	 private static final long serialVersionUID = -723583058586873479L; 
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "receipt_book_id")  
		private Integer receipt_book_id;
	 
	 
		@Column(name = "receipt_book_name")
	 	private String receiptName;


		public Integer getReceipt_book_id() {
			return receipt_book_id;
		}


		public void setReceipt_book_id(Integer receipt_book_id) {
			this.receipt_book_id = receipt_book_id;
		}


		public String getReceiptName() {
			return receiptName;
		}


		public void setReceiptName(String receiptName) {
			this.receiptName = receiptName;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
}
