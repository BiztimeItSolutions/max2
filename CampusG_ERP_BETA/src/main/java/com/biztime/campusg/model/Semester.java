package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="semester")
public class Semester implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "semester_id")  
		private Integer semesterId;
		

	 
		@Column(name = "semester_name")
		private String semesterName;



		public Integer getSemesterId() {
			return semesterId;
		}



		public void setSemesterId(Integer semesterId) {
			this.semesterId = semesterId;
		}



		public String getSemesterName() {
			return semesterName;
		}



		public void setSemesterName(String semesterName) {
			this.semesterName = semesterName;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
