package com.biztime.campusg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity  
@Table(name="student_fee_table2")  
public class StudentFee implements Serializable{
	
	private static final long serialVersionUID = -723583058586873479L;  
	 

	@Id  
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	 @Column(name = "student_fee_id")  
		private Integer studentFeeId;
	 
	
	 
	@Column(name = "mode_of_payment_id")
   private Integer mode_of_payment_id;
	
	
	 
	
	
	 @Column(name = "student_id")  
		private Integer candidate_id;
	 
	@Column(name = "receipt_book_id")  
		private Integer receipt_book_id;
		
	 @Column(name = "fee_type_id")  
		private Integer fee_type_id;
	 
	 @Column(name = "document_id")  
		private Integer document_id;
	
	 @Column(name="date")
 	 private String date;
	
	
	 private String paymentName;
	 private String feeName;
     private String receiptName;
     

     @Column(name="cheque_status")
     private String chequeStatus;
     
     @Column(name="cheque_no")
     private String chequeNo;
     
     @Column(name="dd_issue_date")
     private String ddIssueDate;
     
     @Column(name="dd_bank")
     private String ddBank;
     
     @Column(name="dd_number")
     private String ddNumber;
     
     @Column(name="account_number")
     private String accountNumber;
     
     @Column(name="bank_name")
     private String bankName;
     
     @Column(name="amount")
     private Integer amount;
     
   
	 @Column(name="documentName")
     private String documentName;
     
    

	public String getDocumentName() {
		return documentName;
	}


	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}


		public Integer getAmount() {
		return amount;
	}


	public void setAmount(Integer amount) {
		this.amount = amount;
	}


		public Integer getDocument_id() {
		return document_id;
	}


	public void setDocument_id(Integer document_id) {
		this.document_id = document_id;
	}


		public Integer getCandidate_id() {
		return candidate_id;
	}


	public void setCandidate_id(Integer candidate_id) {
		this.candidate_id = candidate_id;
	}




		public Integer getStudentFeeId() {
			return studentFeeId;
		}


		public void setStudentFeeId(Integer studentFeeId) {
			this.studentFeeId = studentFeeId;
		}


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


		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}


		public String getChequeStatus() {
			return chequeStatus;
		}


		public void setChequeStatus(String chequeStatus) {
			this.chequeStatus = chequeStatus;
		}


		public String getChequeNo() {
			return chequeNo;
		}


		public void setChequeNo(String chequeNo) {
			this.chequeNo = chequeNo;
		}


		public String getDdIssueDate() {
			return ddIssueDate;
		}


		public void setDdIssueDate(String ddIssueDate) {
			this.ddIssueDate = ddIssueDate;
		}


		public String getDdBank() {
			return ddBank;
		}


		public void setDdBank(String ddBank) {
			this.ddBank = ddBank;
		}


		public String getDdNumber() {
			return ddNumber;
		}


		public void setDdNumber(String ddNumber) {
			this.ddNumber = ddNumber;
		}


		public String getAccountNumber() {
			return accountNumber;
		}


		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}


		public String getBankName() {
			return bankName;
		}


		public void setBankName(String bankName) {
			this.bankName = bankName;
		}


			 
}
