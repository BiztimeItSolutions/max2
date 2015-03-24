package com.biztime.campusg.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Candidate {
	
	/*Basic*/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int candidate_id;
	private String course_level;
	private String program;
	private String department;
	private String course_name;
	private String quota;
	private String mobile;
	private String email;
	
	/*Personal*/
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "middle_name")
	private String middlename;
	
	@Column(name = "last_name")
	private String lastname;
	
	/*@Column(name = "dateofbirth")
	private String dateofbirth;
	*/
	@Column(name="Date_Of_Birth")
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
	
	/*Contact*/
	
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
	
	/*Parent*/

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

	/*Educational*/
	

	@Column(name = "college_name")
	private String collegename;
	
	@Column(name = "date_of_entry")
	@Temporal(TemporalType.DATE)
	private Date dateofentry;
	
	@Column(name = "date_of_leaving")
	@Temporal(TemporalType.DATE)
	private Date dateofleaving;
	
	@Column(name = "university")
	private String university;
	
	@Column(name = "date_of_entry_university")
	@Temporal(TemporalType.DATE)
	private Date dateofentryuniversity;
	
	@Column(name = "date_of_leaving_university")
	@Temporal(TemporalType.DATE)
	private Date dateofleavinguniversity;
	
	@Column(name = "qualifying_examination")
	private String qualifyingexamination;
	
	@Column(name = "number_of_attempts")
	private String numberofattempts;
	
	@Column(name = "year_of_passing")
	private String yop;
	
	@Column(name = "register_number")
	private String registernumber;
	
	@Column(name = "optional_subject_physics")
	private String optionalsubjectphysics;
		
	@Column(name = "optional_subject_physics_avg_marks")
	private String optionalsubjectphysicsavgmarks;
	
	@Column(name = "optional_subject_maths")
	private String optionalsubjectmaths;
	
	
	@Column(name = "optional_subject_maths_avg_marks")
	private String optionalsubjectmathsavgmarks;
	
	@Column(name = "optional_subject_opt")
	private String optionalsubjectopt;
	
	@Column(name = "optional_subject_opt_avg_marks")
	private String optionalsubjectoptavgmarks;
	
	@Column(name = "avg_percentage")
	private String avgpercentage;
	
	/*@Column(name = "year")
	private String year;
	
	@Column(name = "institution")
	private String institution;
	
	@Column(name = "clas")
	private String clas;
	
	@Column(name = "remarks")
	private String remarks;
*/
	private String admission_status;
	private String admission_status_remarks;
	
	private String office_status;
	private String office_status_remark;
	
	public String toString()
	{
		return "id: "+ candidate_id+" course level: "+course_level;
		
	}

	public int getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}

	public String getCourse_level() {
		return course_level;
	}

	public void setCourse_level(String course_level) {
		this.course_level = course_level;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
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

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public Date getDateofentry() {
		return dateofentry;
	}

	public void setDateofentry(Date dateofentry) {
		this.dateofentry = dateofentry;
	}

	public Date getDateofleaving() {
		return dateofleaving;
	}

	public void setDateofleaving(Date dateofleaving) {
		this.dateofleaving = dateofleaving;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Date getDateofentryuniversity() {
		return dateofentryuniversity;
	}

	public void setDateofentryuniversity(Date dateofentryuniversity) {
		this.dateofentryuniversity = dateofentryuniversity;
	}

	public Date getDateofleavinguniversity() {
		return dateofleavinguniversity;
	}

	public void setDateofleavinguniversity(Date dateofleavinguniversity) {
		this.dateofleavinguniversity = dateofleavinguniversity;
	}

	public String getQualifyingexamination() {
		return qualifyingexamination;
	}

	public void setQualifyingexamination(String qualifyingexamination) {
		this.qualifyingexamination = qualifyingexamination;
	}

	public String getNumberofattempts() {
		return numberofattempts;
	}

	public void setNumberofattempts(String numberofattempts) {
		this.numberofattempts = numberofattempts;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public String getRegisternumber() {
		return registernumber;
	}

	public void setRegisternumber(String registernumber) {
		this.registernumber = registernumber;
	}

	public String getOptionalsubjectphysics() {
		return optionalsubjectphysics;
	}

	public void setOptionalsubjectphysics(String optionalsubjectphysics) {
		this.optionalsubjectphysics = optionalsubjectphysics;
	}

	public String getOptionalsubjectphysicsavgmarks() {
		return optionalsubjectphysicsavgmarks;
	}

	public void setOptionalsubjectphysicsavgmarks(
			String optionalsubjectphysicsavgmarks) {
		this.optionalsubjectphysicsavgmarks = optionalsubjectphysicsavgmarks;
	}

	public String getOptionalsubjectmaths() {
		return optionalsubjectmaths;
	}

	public void setOptionalsubjectmaths(String optionalsubjectmaths) {
		this.optionalsubjectmaths = optionalsubjectmaths;
	}

	public String getOptionalsubjectmathsavgmarks() {
		return optionalsubjectmathsavgmarks;
	}

	public void setOptionalsubjectmathsavgmarks(String optionalsubjectmathsavgmarks) {
		this.optionalsubjectmathsavgmarks = optionalsubjectmathsavgmarks;
	}

	public String getOptionalsubjectopt() {
		return optionalsubjectopt;
	}

	public void setOptionalsubjectopt(String optionalsubjectopt) {
		this.optionalsubjectopt = optionalsubjectopt;
	}

	public String getOptionalsubjectoptavgmarks() {
		return optionalsubjectoptavgmarks;
	}

	public void setOptionalsubjectoptavgmarks(String optionalsubjectoptavgmarks) {
		this.optionalsubjectoptavgmarks = optionalsubjectoptavgmarks;
	}

	public String getAvgpercentage() {
		return avgpercentage;
	}

	public void setAvgpercentage(String avgpercentage) {
		this.avgpercentage = avgpercentage;
	}

	public String getAdmission_status() {
		return admission_status;
	}

	public void setAdmission_status(String admission_status) {
		this.admission_status = admission_status;
	}

	public String getAdmission_status_remarks() {
		return admission_status_remarks;
	}

	public void setAdmission_status_remarks(String admission_status_remarks) {
		this.admission_status_remarks = admission_status_remarks;
	}

	public String getOffice_status() {
		return office_status;
	}

	public void setOffice_status(String office_status) {
		this.office_status = office_status;
	}

	public String getOffice_status_remark() {
		return office_status_remark;
	}

	public void setOffice_status_remark(String office_status_remark) {
		this.office_status_remark = office_status_remark;
	}
	
	
	
	
	
	

}
