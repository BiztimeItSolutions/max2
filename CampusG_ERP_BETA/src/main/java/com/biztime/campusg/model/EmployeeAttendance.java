package com.biztime.campusg.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author     Anuvidhya
 * @Module     EmployeeAttendance
 * @Purpose    Maintain Each and Every Employee Attendance details
 *
 */
@Entity  
@Table(name="employee_attendance")
public class EmployeeAttendance implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "employee_attendance_id")  
		private Integer employeeAttendanceId;
		
	    @Column(name = "employee_id")  
		private Integer employeeId;
	 
		@Column(name = "total_working_days")
		private String totalWorkingDays;
		
		@Column(name = "month")
		private String month;

		public Integer getEmployeeAttendanceId() {
			return employeeAttendanceId;
		}

		public void setEmployeeAttendanceId(Integer employeeAttendanceId) {
			this.employeeAttendanceId = employeeAttendanceId;
		}

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public String getTotalWorkingDays() {
			return totalWorkingDays;
		}

		public void setTotalWorkingDays(String totalWorkingDays) {
			this.totalWorkingDays = totalWorkingDays;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
		
}
