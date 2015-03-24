package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="employee_subject_association")
public class EmployeeSubjectAssociation implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "employee_subject_association_id")  
		private Integer employeeSubjectAssociationId;
		
		@Column(name = "employee_id")  
		private Integer employeeId;
	
	 
		@Column(name = "batch_id")  
		private Integer batchId;
	 
	    @Column(name = "batch_name")
		private String batchName;
	    
	    @Column(name = "course_id")
		private Integer courseId;
		
		@Column(name = "semester_id")  
		private Integer semesterId;
		
        @Column(name = "semester_name")
		private String semesterName;
		
		@Column(name = "department_name")
		private String departmentName;
		
		@Column(name = "subject_id")  
		private Integer subjectId;
		
		@Column(name = "subject_name")
		private String subjectName;

		public Integer getEmployeeSubjectAssociationId() {
			return employeeSubjectAssociationId;
		}

		public void setEmployeeSubjectAssociationId(Integer employeeSubjectAssociationId) {
			this.employeeSubjectAssociationId = employeeSubjectAssociationId;
		}

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public Integer getBatchId() {
			return batchId;
		}

		public void setBatchId(Integer batchId) {
			this.batchId = batchId;
		}

		public String getBatchName() {
			return batchName;
		}

		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}

		public Integer getCourseId() {
			return courseId;
		}

		public void setCourseId(Integer courseId) {
			this.courseId = courseId;
		}

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

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public Integer getSubjectId() {
			return subjectId;
		}

		public void setSubjectId(Integer subjectId) {
			this.subjectId = subjectId;
		}

		public String getSubjectName() {
			return subjectName;
		}

		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
				
}
