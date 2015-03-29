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
 * @Module     EmployeeProfile
 * @Purpose    Maintain Employee Leave Details
 *
 */
@Entity  
@Table(name="employee_leave_detail")


public class EmployeeLeave implements Serializable {

		private static final long serialVersionUID = -723583058586873479L;  
		   
		 @Id  
			@GeneratedValue(strategy=GenerationType.AUTO)  
			@Column(name = "employee_leave_id")  
			private Integer employee_leave_id;

		 
			@Column(name = "employee_id")
			private Integer employeeId;
			
			@Column(name = "leave_name")
			private String leaveName;
			
			@Column(name = "leave_code")
			private String leaveCode;
			
			@Column(name = "maximum_leave_count")
			private String leaveCount;
			
			@Column(name = "status")
			private String status;
			
			
			@Column(name="start_date")
			private String startDate;
			
			@Column(name="end_date")
			private String endDate;
			
			
			@Column(name = "days_request")
			private String daysRequest;
			
			@Column(name="applied_date")
			private String appliedDate;
			
			@Column(name = "leave_status")
			private String leaveStatus;
			
			@Column(name = "leave_type_id")  
			private Integer leaveTypeId;
			
			@Column(name = "reason")
			private String reason;
			
			public String getReason() {
				return reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public Integer getLeaveTypeId() {
				return leaveTypeId;
			}

			public void setLeaveTypeId(Integer leaveTypeId) {
				this.leaveTypeId = leaveTypeId;
			}

			public Integer getEmployee_leave_id() {
				return employee_leave_id;
			}

			public void setEmployee_leave_id(Integer employee_leave_id) {
				this.employee_leave_id = employee_leave_id;
			}

			public Integer getEmployeeId() {
				return employeeId;
			}

			public void setEmployeeId(Integer employeeId) {
				this.employeeId = employeeId;
			}

			public String getLeaveName() {
				return leaveName;
			}

			public void setLeaveName(String leaveName) {
				this.leaveName = leaveName;
			}

			public String getLeaveCode() {
				return leaveCode;
			}

			public void setLeaveCode(String leaveCode) {
				this.leaveCode = leaveCode;
			}

			public String getLeaveCount() {
				return leaveCount;
			}

			public void setLeaveCount(String leaveCount) {
				this.leaveCount = leaveCount;
			}

			public String getStatus() {
				return status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getStartDate() {
				return startDate;
			}

			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}

			public String getEndDate() {
				return endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public String getDaysRequest() {
				return daysRequest;
			}

			public void setDaysRequest(String daysRequest) {
				this.daysRequest = daysRequest;
			}

			public String getAppliedDate() {
				return appliedDate;
			}

			public void setAppliedDate(String appliedDate) {
				this.appliedDate = appliedDate;
			}

			public String getLeaveStatus() {
				return leaveStatus;
			}

			public void setLeaveStatus(String leaveStatus) {
				this.leaveStatus = leaveStatus;
			}

			public static long getSerialversionuid() {
				return serialVersionUID;
			}

		
}
