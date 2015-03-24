package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_document")
public class EmployeeDocument implements Serializable{

	private static final long serialVersionUID = -723583058586873479L; 
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "document_id")  
		private Integer documentId;
	 
	  
	    @Column(name = "document_name")  
	   private String documentName;


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
