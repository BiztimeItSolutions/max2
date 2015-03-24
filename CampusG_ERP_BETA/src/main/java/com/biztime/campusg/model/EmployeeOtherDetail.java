package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="employee_additional_detail")
public class EmployeeOtherDetail implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "employee_other_detail_id")  
		private Integer employeeOtherDetailId;
		
		@Column(name = "employee_id")  
		private Integer employeeId;
	
	 
		@Column(name = "document_id")
		private Integer documentId;
		
		@Column(name = "document_name")
		private String documentName;
		
		

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public Integer getEmployeeOtherDetailId() {
			return employeeOtherDetailId;
		}

		public void setEmployeeOtherDetailId(Integer employeeOtherDetailId) {
			this.employeeOtherDetailId = employeeOtherDetailId;
		}


		public Integer getDocumentId() {
			return documentId;
		}

		public void setDocumentId(Integer documentId) {
			this.documentId = documentId;
		}

		public String getDocumentName() {
			return documentName;
		}

		public void setDocumentName(String documentName) {
			this.documentName = documentName;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
