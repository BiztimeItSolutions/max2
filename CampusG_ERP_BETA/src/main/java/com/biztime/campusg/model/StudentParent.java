package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="candidate_parent_detail")  
public class StudentParent implements Serializable{
	

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "candidate_parent_detail_id")  
	private Integer studentparentid;
	
	@Column(name = "candidate_id")
 	private Integer candidateid;
	
	
	public Integer getCandidateid() {
		return candidateid;
	}

	public void setCandidateid(Integer candidateid) {
		this.candidateid = candidateid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "guardian_first_name")
	private String guardianfirstname;
	
	@Column(name = "guardian_middle_name")
	private String guardianmiddlename;
	
	@Column(name = "guardian_last_name")
	private String guardianlastname;
	
	@Column(name = "guardian_relation")
	private String guardinrelation;
	
	@Column(name = "guardian_occupation")
	private String guardinoccupation;
	
	@Column(name = "guardian_tel_res")
	private String guardintelres;
	
	@Column(name = "guardian_tel_off")
	private String guardinteloff;
	
	@Column(name = "guardian_mobile")
	private String guardinmobile;
	
	@Column(name = "guardian_email")
	private String guardinemail;
	
	@Column(name = "guardin_anual_income")
	private String guardinanualincome;
	
	
	
	@Column(name = "father_first_name")
	private String fatherfirstname;
	
	@Column(name = "father_middle_name")
	private String fathermiddlename;
	
	@Column(name = "father_last_name")
	private String fatherlastname;
	
	@Column(name = "father_occupation")
	private String fatheroccupation;
	
	@Column(name = "father_tel_res")
	private String fathertelres;
	
	@Column(name = "father_tel_off")
	private String fatherteloff;
	
	@Column(name = "father_mobile")
	private String fathermobile;
	
	@Column(name = "father_email")
	private String fatheremail;
	
	@Column(name = "father_anual_income")
	private String fatheranualincome;
	
	
	
	@Column(name = "mother_first_name")
	private String motherfirstname;
	
	@Column(name = "mother_middle_name")
	private String mothermiddlename;
	
	@Column(name = "mother_last_name")
	private String motherlastname;
	
	@Column(name = "mother_occupation")
	private String motheroccupation;
	
	@Column(name = "mother_tel_res")
	private String mothertelres;
	
	@Column(name = "mother_tel_off")
	private String motherteloff;
	
	@Column(name = "mother_mobile")
	private String mothermobile;
	
	@Column(name = "mother_email")
	private String motheremail;
	
	@Column(name = "mother_anual_income")
	private String motheranualincome;

	public Integer getStudentparentid() {
		return studentparentid;
	}

	public void setStudentparentid(Integer studentparentid) {
		this.studentparentid = studentparentid;
	}

	public String getGuardianfirstname() {
		return guardianfirstname;
	}

	public void setGuardianfirstname(String guardianfirstname) {
		this.guardianfirstname = guardianfirstname;
	}

	public String getGuardianmiddlename() {
		return guardianmiddlename;
	}

	public void setGuardianmiddlename(String guardianmiddlename) {
		this.guardianmiddlename = guardianmiddlename;
	}

	public String getGuardianlastname() {
		return guardianlastname;
	}

	public void setGuardianlastname(String guardianlastname) {
		this.guardianlastname = guardianlastname;
	}

	public String getGuardinrelation() {
		return guardinrelation;
	}

	public void setGuardinrelation(String guardinrelation) {
		this.guardinrelation = guardinrelation;
	}

	public String getGuardinoccupation() {
		return guardinoccupation;
	}

	public void setGuardinoccupation(String guardinoccupation) {
		this.guardinoccupation = guardinoccupation;
	}

	public String getGuardintelres() {
		return guardintelres;
	}

	public void setGuardintelres(String guardintelres) {
		this.guardintelres = guardintelres;
	}

	public String getGuardinteloff() {
		return guardinteloff;
	}

	public void setGuardinteloff(String guardinteloff) {
		this.guardinteloff = guardinteloff;
	}

	public String getGuardinmobile() {
		return guardinmobile;
	}

	public void setGuardinmobile(String guardinmobile) {
		this.guardinmobile = guardinmobile;
	}

	public String getGuardinemail() {
		return guardinemail;
	}

	public void setGuardinemail(String guardinemail) {
		this.guardinemail = guardinemail;
	}

	public String getGuardinanualincome() {
		return guardinanualincome;
	}

	public void setGuardinanualincome(String guardinanualincome) {
		this.guardinanualincome = guardinanualincome;
	}

	public String getFatherfirstname() {
		return fatherfirstname;
	}

	public void setFatherfirstname(String fatherfirstname) {
		this.fatherfirstname = fatherfirstname;
	}

	public String getFathermiddlename() {
		return fathermiddlename;
	}

	public void setFathermiddlename(String fathermiddlename) {
		this.fathermiddlename = fathermiddlename;
	}

	public String getFatherlastname() {
		return fatherlastname;
	}

	public void setFatherlastname(String fatherlastname) {
		this.fatherlastname = fatherlastname;
	}

	public String getFatheroccupation() {
		return fatheroccupation;
	}

	public void setFatheroccupation(String fatheroccupation) {
		this.fatheroccupation = fatheroccupation;
	}

	public String getFathertelres() {
		return fathertelres;
	}

	public void setFathertelres(String fathertelres) {
		this.fathertelres = fathertelres;
	}

	public String getFatherteloff() {
		return fatherteloff;
	}

	public void setFatherteloff(String fatherteloff) {
		this.fatherteloff = fatherteloff;
	}

	public String getFathermobile() {
		return fathermobile;
	}

	public void setFathermobile(String fathermobile) {
		this.fathermobile = fathermobile;
	}

	public String getFatheremail() {
		return fatheremail;
	}

	public void setFatheremail(String fatheremail) {
		this.fatheremail = fatheremail;
	}

	public String getFatheranualincome() {
		return fatheranualincome;
	}

	public void setFatheranualincome(String fatheranualincome) {
		this.fatheranualincome = fatheranualincome;
	}

	public String getMotherfirstname() {
		return motherfirstname;
	}

	public void setMotherfirstname(String motherfirstname) {
		this.motherfirstname = motherfirstname;
	}

	public String getMothermiddlename() {
		return mothermiddlename;
	}

	public void setMothermiddlename(String mothermiddlename) {
		this.mothermiddlename = mothermiddlename;
	}

	public String getMotherlastname() {
		return motherlastname;
	}

	public void setMotherlastname(String motherlastname) {
		this.motherlastname = motherlastname;
	}

	public String getMotheroccupation() {
		return motheroccupation;
	}

	public void setMotheroccupation(String motheroccupation) {
		this.motheroccupation = motheroccupation;
	}

	public String getMothertelres() {
		return mothertelres;
	}

	public void setMothertelres(String mothertelres) {
		this.mothertelres = mothertelres;
	}

	public String getMotherteloff() {
		return motherteloff;
	}

	public void setMotherteloff(String motherteloff) {
		this.motherteloff = motherteloff;
	}

	public String getMothermobile() {
		return mothermobile;
	}

	public void setMothermobile(String mothermobile) {
		this.mothermobile = mothermobile;
	}

	public String getMotheremail() {
		return motheremail;
	}

	public void setMotheremail(String motheremail) {
		this.motheremail = motheremail;
	}

	public String getMotheranualincome() {
		return motheranualincome;
	}

	public void setMotheranualincome(String motheranualincome) {
		this.motheranualincome = motheranualincome;
	}
		 

}
