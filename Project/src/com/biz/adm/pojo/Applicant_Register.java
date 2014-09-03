package com.biz.adm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicant_register3")
public class Applicant_Register {
   
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "applicant_ID")
		int applicant_ID;
		
		
		@Column(name = "first_Name")
		String first_Name;
		
		@Column(name = "last_Name")
		String last_Name;
		
		@Column(name = "tenth_Percentage")
		String tenth_Percentage;
		
		@Column(name = "tenth_YOP")
		String tenth_YOP;
		
		@Column(name = "tenth_School")
		String tenth_School;
		
		@Column(name = "twelth_Percentage")
		String twelth_Percentage;
		
		@Column(name = "twelth_YOP")
		String twelth_YOP;
		
		@Column(name = "twelth_School")
		String twelth_School;

		@Column(name = "gender")
		String gender;

		@Column(name = "department")
		String department;

		@Column(name = "dob")
		String dob;

		@Column(name = "pincode")
		String pincode;
		
		@Column(name = "address")
		String address;
		
		@Column(name = "city")
		String city;

		@Column(name = "state")
		String state;

		@Column(name = "country")
		String country;

		@Column(name = "email_ID")
		String email_ID;

		@Column(name = "mobile_No")
		String mobile_No;
		

		@Column(name = "mail")
		String mail;

		@Column(name = "counseling1")
		String counseling1;
		

		@Column(name = "counseling2")
		String counseling2;
		

		@Column(name = "status")
		String status;
		
		
	public String getCounseling1() {
			return counseling1;
		}

		public void setCounseling1(String counseling1) {
			this.counseling1 = counseling1;
		}

		public String getCounseling2() {
			return counseling2;
		}

		public void setCounseling2(String counseling2) {
			this.counseling2 = counseling2;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

	public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getApplicant_ID() {
		return applicant_ID;
	}
	public void setApplicant_ID(int applicant_ID) {
		this.applicant_ID = applicant_ID;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getTenth_Percentage() {
		return tenth_Percentage;
	}
	public void setTenth_Percentage(String tenth_Percentage) {
		this.tenth_Percentage = tenth_Percentage;
	}
	public String getTenth_YOP() {
		return tenth_YOP;
	}
	public void setTenth_YOP(String tenth_YOP) {
		this.tenth_YOP = tenth_YOP;
	}
	public String getTenth_School() {
		return tenth_School;
	}
	public void setTenth_School(String tenth_School) {
		this.tenth_School = tenth_School;
	}
	public String getTwelth_Percentage() {
		return twelth_Percentage;
	}
	public void setTwelth_Percentage(String twelth_Percentage) {
		this.twelth_Percentage = twelth_Percentage;
	}
	public String getTwelth_YOP() {
		return twelth_YOP;
	}
	public void setTwelth_YOP(String twelth_YOP) {
		this.twelth_YOP = twelth_YOP;
	}
	public String getTwelth_School() {
		return twelth_School;
	}
	public void setTwelth_School(String twelth_School) {
		this.twelth_School = twelth_School;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public String getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}
}

