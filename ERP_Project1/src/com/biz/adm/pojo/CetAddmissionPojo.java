package com.biz.adm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Cet_Student_Data")

public class CetAddmissionPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "id")
	int id;
	
	@Column(name = "fname")
	String fname;
	
	@Column(name = "mname")
	String mname;
	
	@Column(name = "lname")
	String lname;
	
	@Column(name = "gender")
	String gender;
	
	@Column(name = "dob")
	String dob;
	
	
	@Column(name = "per")
	int per;
	@Column(name = "yop")
	String yop;
	
	@Column(name = "sname")
	String sname;
	
	@Column(name = "percent")
	String percent;
	
	@Column(name = "yearpass")
	String yearpass;
	
	@Column(name = "cname")
	String cname;
	
	@Column(name = "cetrank")
	String cetrank;
	
	@Column(name = "cetbill")
	String cetbill;
	
	@Column(name = "branch")
	String branch;
	
	@Column(name = "batch")
	String batch;
	
	@Column(name = "typeofseat")
	String typeofseat;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "country")
	String country;
	
	@Column(name = "mail")
	String mail;
	
	@Column(name = "mobile")
	String mobile;
	
    @Column(name = "pincode")
		String pincode;
	
		
			
			
			@Column(name = "schooldoc")
			String schooldoc;
			
			@Column(name = "collegedoc")
			String collegedoc;
			
				@Column(name = "tc")
				String tc;
				

				@Column(name = "cetdoc")
				String cetdoc;

				@Column(name = "sem")
				String sem;
				

				@Column(name = "year")
				String year;


				public int getId() {
					return id;
				}


				public void setId(int id) {
					this.id = id;
				}


				public String getFname() {
					return fname;
				}


				public void setFname(String fname) {
					this.fname = fname;
				}


				public String getMname() {
					return mname;
				}


				public void setMname(String mname) {
					this.mname = mname;
				}


				public String getLname() {
					return lname;
				}


				public void setLname(String lname) {
					this.lname = lname;
				}


				public String getGender() {
					return gender;
				}


				public void setGender(String gender) {
					this.gender = gender;
				}


				public String getDob() {
					return dob;
				}


				public void setDob(String dob) {
					this.dob = dob;
				}


				public int getPer() {
					return per;
				}


				public void setPer(int per) {
					this.per = per;
				}


				public String getYop() {
					return yop;
				}


				public void setYop(String yop) {
					this.yop = yop;
				}


				public String getSname() {
					return sname;
				}


				public void setSname(String sname) {
					this.sname = sname;
				}


				public String getPercent() {
					return percent;
				}


				public void setPercent(String percent) {
					this.percent = percent;
				}


				public String getYearpass() {
					return yearpass;
				}


				public void setYearpass(String yearpass) {
					this.yearpass = yearpass;
				}


				public String getCname() {
					return cname;
				}


				public void setCname(String cname) {
					this.cname = cname;
				}


				public String getCetrank() {
					return cetrank;
				}


				public void setCetrank(String cetrank) {
					this.cetrank = cetrank;
				}


				public String getCetbill() {
					return cetbill;
				}


				public void setCetbill(String cetbill) {
					this.cetbill = cetbill;
				}


				public String getBranch() {
					return branch;
				}


				public void setBranch(String branch) {
					this.branch = branch;
				}


				public String getBatch() {
					return batch;
				}


				public void setBatch(String batch) {
					this.batch = batch;
				}


				public String getTypeofseat() {
					return typeofseat;
				}


				public void setTypeofseat(String typeofseat) {
					this.typeofseat = typeofseat;
				}


				public String getAddress() {
					return address;
				}


				public void setAddress(String address) {
					this.address = address;
				}


				public String getCity() {
					return city;
				}


				public void setCity(String city) {
					this.city = city;
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


				public String getMail() {
					return mail;
				}


				public void setMail(String mail) {
					this.mail = mail;
				}


				public String getMobile() {
					return mobile;
				}


				public void setMobile(String mobile) {
					this.mobile = mobile;
				}


				public String getPincode() {
					return pincode;
				}


				public void setPincode(String pincode) {
					this.pincode = pincode;
				}


				


				public String getSchooldoc() {
					return schooldoc;
				}


				public void setSchooldoc(String schooldoc) {
					this.schooldoc = schooldoc;
				}


				public String getCollegedoc() {
					return collegedoc;
				}


				public void setCollegedoc(String collegedoc) {
					this.collegedoc = collegedoc;
				}


				public String getTc() {
					return tc;
				}


				public void setTc(String tc) {
					this.tc = tc;
				}


				public String getCetdoc() {
					return cetdoc;
				}


				public void setCetdoc(String cetdoc) {
					this.cetdoc = cetdoc;
				}


				public String getSem() {
					return sem;
				}


				public void setSem(String sem) {
					this.sem = sem;
				}


				public String getYear() {
					return year;
				}


				public void setYear(String year) {
					this.year = year;
				}
				
				
		

}
