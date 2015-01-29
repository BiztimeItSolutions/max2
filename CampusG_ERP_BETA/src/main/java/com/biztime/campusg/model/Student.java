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


@Entity  
@Table(name="candidate_personal_detail")  
public class Student implements Serializable{  
  
 private static final long serialVersionUID = -723583058586873479L;  
   
 @Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "candidate_personal_detail_id")  
	private Integer studentid;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "middle_name")
	private String middlename;
	
	@Column(name = "last_name")
	private String lastname;
	
	/*@Column(name = "dateofbirth")
	private String dateofbirth;
	*/
	@Column(name="DOB")
	@Temporal(TemporalType.DATE)
	 private Date dateofbirth;
	 
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "blood_group")
	private String bloodgroup;
	
	@Column(name = "birth_place")
	private String birthplace;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "mother_tongue")
	private String mothertongue;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "religion")
	private String religion;
	
	@Column(name = "caste")
	private String caste;
	
	@Column(name = "extra_curricular")
	private String extracurricular;
	
	@Column(name = "photo")
	private String photo;

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMothertongue() {
		return mothertongue;
	}

	public void setMothertongue(String mothertongue) {
		this.mothertongue = mothertongue;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getExtracurricular() {
		return extracurricular;
	}

	public void setExtracurricular(String extracurricular) {
		this.extracurricular = extracurricular;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

  
} 