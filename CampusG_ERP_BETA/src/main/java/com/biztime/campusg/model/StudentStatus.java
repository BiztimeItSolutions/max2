package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="candidate_status") 
public class StudentStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Candidate_Status_Id;
	private String status;
	private String remarks;
	private String candidateid;
	
	public String getCandidateid() {
		return candidateid;
	}
	public void setCandidateid(String candidateid) {
		this.candidateid = candidateid;
	}
	public Integer getCandidate_Status_Id() {
		return Candidate_Status_Id;
	}
	public void setCandidate_Status_Id(Integer candidate_Status_Id) {
		Candidate_Status_Id = candidate_Status_Id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	

}
