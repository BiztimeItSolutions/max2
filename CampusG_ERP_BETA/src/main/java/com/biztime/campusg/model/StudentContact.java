package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="candidate_contact_detail")  
public class StudentContact implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "candidate_contact_detail_id")  
	private Integer studentcontactid;
	
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

	@Column(name = "present_address_line1")
	private String presentaddressline1;
	
	@Column(name = "present_address_line2")
	private String presentaddressline2;
	
	@Column(name = "present_address_city")
	private String presentaddresscity;
	
	@Column(name = "present_address_pincode")
	private String presentaddresspincode;
	
	@Column(name = "present_address_country")
	private String presentaddresscountry;
	
	@Column(name = "present_address_state")
	private String presentaddressstate;
	
	@Column(name = "permanent_address_line1")
	private String permanentaddressline1;
	
	@Column(name = "permanent_address_line2")
	private String permanentaddressline2;
	
	@Column(name = "permanent_address_city")
	private String permanentaddresscity;
	
	@Column(name = "permanent_address_pincode")
	private String permanentaddresspincode;
	
	@Column(name = "permanent_address_country")
	private String permanentaddresscountry;
	
	@Column(name = "permanent_address_state")
	private String permanentaddressstate;
	
	@Column(name = "emergency_address_line1")
	private String emergencyaddressline1;
	
	@Column(name = "emergency_address_line2")
	private String emergencyaddressline2;
	
	@Column(name = "emergency_address_city")
	private String emergencyaddresscity;
	
	@Column(name = "emergency_address_pincode")
	private String emergencyaddresspincode;
	
	@Column(name = "emergency_address_country")
	private String emergencyaddresscountry;
	
	@Column(name = "emergency_address_state")
	private String emergencyaddressstate;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "email")
	private String email;

	public Integer getStudentcontactid() {
		return studentcontactid;
	}

	public void setStudentcontactid(Integer studentcontactid) {
		this.studentcontactid = studentcontactid;
	}

	public String getPresentaddressline1() {
		return presentaddressline1;
	}

	public void setPresentaddressline1(String presentaddressline1) {
		this.presentaddressline1 = presentaddressline1;
	}

	public String getPresentaddressline2() {
		return presentaddressline2;
	}

	public void setPresentaddressline2(String presentaddressline2) {
		this.presentaddressline2 = presentaddressline2;
	}

	public String getPresentaddresscity() {
		return presentaddresscity;
	}

	public void setPresentaddresscity(String presentaddresscity) {
		this.presentaddresscity = presentaddresscity;
	}

	public String getPresentaddresspincode() {
		return presentaddresspincode;
	}

	public void setPresentaddresspincode(String presentaddresspincode) {
		this.presentaddresspincode = presentaddresspincode;
	}

	public String getPresentaddresscountry() {
		return presentaddresscountry;
	}

	public void setPresentaddresscountry(String presentaddresscountry) {
		this.presentaddresscountry = presentaddresscountry;
	}

	public String getPresentaddressstate() {
		return presentaddressstate;
	}

	public void setPresentaddressstate(String presentaddressstate) {
		this.presentaddressstate = presentaddressstate;
	}

	public String getPermanentaddressline1() {
		return permanentaddressline1;
	}

	public void setPermanentaddressline1(String permanentaddressline1) {
		this.permanentaddressline1 = permanentaddressline1;
	}

	public String getPermanentaddressline2() {
		return permanentaddressline2;
	}

	public void setPermanentaddressline2(String permanentaddressline2) {
		this.permanentaddressline2 = permanentaddressline2;
	}

	public String getPermanentaddresscity() {
		return permanentaddresscity;
	}

	public void setPermanentaddresscity(String permanentaddresscity) {
		this.permanentaddresscity = permanentaddresscity;
	}

	public String getPermanentaddresspincode() {
		return permanentaddresspincode;
	}

	public void setPermanentaddresspincode(String permanentaddresspincode) {
		this.permanentaddresspincode = permanentaddresspincode;
	}

	public String getPermanentaddresscountry() {
		return permanentaddresscountry;
	}

	public void setPermanentaddresscountry(String permanentaddresscountry) {
		this.permanentaddresscountry = permanentaddresscountry;
	}

	public String getPermanentaddressstate() {
		return permanentaddressstate;
	}

	public void setPermanentaddressstate(String permanentaddressstate) {
		this.permanentaddressstate = permanentaddressstate;
	}

	public String getEmergencyaddressline1() {
		return emergencyaddressline1;
	}

	public void setEmergencyaddressline1(String emergencyaddressline1) {
		this.emergencyaddressline1 = emergencyaddressline1;
	}

	public String getEmergencyaddressline2() {
		return emergencyaddressline2;
	}

	public void setEmergencyaddressline2(String emergencyaddressline2) {
		this.emergencyaddressline2 = emergencyaddressline2;
	}

	public String getEmergencyaddresscity() {
		return emergencyaddresscity;
	}

	public void setEmergencyaddresscity(String emergencyaddresscity) {
		this.emergencyaddresscity = emergencyaddresscity;
	}

	public String getEmergencyaddresspincode() {
		return emergencyaddresspincode;
	}

	public void setEmergencyaddresspincode(String emergencyaddresspincode) {
		this.emergencyaddresspincode = emergencyaddresspincode;
	}

	public String getEmergencyaddresscountry() {
		return emergencyaddresscountry;
	}

	public void setEmergencyaddresscountry(String emergencyaddresscountry) {
		this.emergencyaddresscountry = emergencyaddresscountry;
	}

	public String getEmergencyaddressstate() {
		return emergencyaddressstate;
	}

	public void setEmergencyaddressstate(String emergencyaddressstate) {
		this.emergencyaddressstate = emergencyaddressstate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
