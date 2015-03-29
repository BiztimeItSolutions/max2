package com.biztime.campusg.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 


@Entity
@Table(name="leave_type") 

public class LeaveType implements Serializable{  
	  
	 private static final long serialVersionUID = -723583058586873479L; 
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "leave_type_id")  
		private Integer leaveTypeId;
	 
	    @Column(name = "leave_name")
	 	private String leaveName;
		
        @Column(name = "leave_code")
	 	private String leaveCode;
		
		@Column(name = "maximum_leave_count")
	 	private String leaveCount;
		
		@Column(name = "reset_date")
	 	private String resetDate;
		
		@Column(name = "enable_leave_carry_forward")
	 	private String enableLeave;
		
		@Column(name = "status")
	 	private String status;

		public Integer getLeaveTypeId() {
			return leaveTypeId;
		}

		public void setLeaveTypeId(Integer leaveTypeId) {
			this.leaveTypeId = leaveTypeId;
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

		public String getResetDate() {
			return resetDate;
		}

		public void setResetDate(String resetDate) {
			this.resetDate = resetDate;
		}

		public String getEnableLeave() {
			return enableLeave;
		}

		public void setEnableLeave(String enableLeave) {
			this.enableLeave = enableLeave;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
