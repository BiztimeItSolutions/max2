package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;
 
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="mode_of_payment") 
public class ModeOfPayment implements Serializable{  
	  
	 private static final long serialVersionUID = -723583058586873479L; 
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "mode_of_payment_id", unique = true, nullable = false)  
		private Integer mode_of_payment_id;
	 
	 
		@Column(name = "mode_of_payment_name")
	 	private String paymentName;


		public Integer getMode_of_payment_id() {
			return mode_of_payment_id;
		}


		public void setMode_of_payment_id(Integer mode_of_payment_id) {
			this.mode_of_payment_id = mode_of_payment_id;
		}


		public String getPaymentName() {
			return paymentName;
		}


		public void setPaymentName(String paymentName) {
			this.paymentName = paymentName;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
	

}
