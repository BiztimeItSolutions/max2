package com.biztime.campusg.model;

public class FeeCommand {

	StudentFee studentFee;
	    Candidate candidate;
	 StudentDocument document;
	 MasterFee masterfee;
	
	 ReceiptBook receiptBook;
	 


		public ReceiptBook getReceiptBook() {
		return receiptBook;
	}
	public void setReceiptBook(ReceiptBook receiptBook) {
		this.receiptBook = receiptBook;
	}
		public MasterFee getMasterfee() {
		return masterfee;
	}
	public void setMasterfee(MasterFee masterfee) {
		this.masterfee = masterfee;
	}
		public StudentDocument getDocument() {
		return document;
	}
	public void setDocument(StudentDocument document) {
		this.document = document;
	}
		public StudentFee getStudentFee() {
			return studentFee;
		}
		public void setStudentFee(StudentFee studentFee) {
			this.studentFee = studentFee;
		}
		public Candidate getCandidate() {
			return candidate;
		}
		public void setCandidate(Candidate candidate) {
			this.candidate = candidate;
		}
	    
}
