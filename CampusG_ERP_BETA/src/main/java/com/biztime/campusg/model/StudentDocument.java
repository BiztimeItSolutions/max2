package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_category_document") 
public class StudentDocument implements Serializable{

	private static final long serialVersionUID = -723583058586873479L; 
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "document_id")  
		private Integer document_id;
	 
	  
	    @Column(name = "document_name")  
	   private String documentName;


		public Integer getDocument_id() {
			return document_id;
		}


		public void setDocument_id(Integer document_id) {
			this.document_id = document_id;
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
