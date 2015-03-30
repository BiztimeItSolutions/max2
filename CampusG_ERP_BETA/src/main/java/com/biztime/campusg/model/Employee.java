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
 * @Purpose    Maintain Employee Details
 *
 */
@Entity  
@Table(name="employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "employee_id")  
		private Integer employeeId;
		
	/* personal*/
	 
		@Column(name = "first_name")
		private String firstName;
		
		@Column(name = "middle_name")
		private String middleName;
		
		@Column(name = "last_name")
		private String lastName;
		
		
		@Column(name="date_of_birth")
		@Temporal(TemporalType.DATE)
		 private Date dateOfBirth;
		 
		@Column(name = "gender")
		private String gender;
		
		@Column(name = "blood_group")
		private String bloodGroup;
		

		@Column(name = "marital_status")
		private String marital;
		
		@Column(name = "nationality")
		private String nationality;
	
		@Column(name = "government_id_number")
		private String governmentId;
		
		@Column(name = "pan_card_number")
		private String pancard;
		
		@Column(name = "caste")
		private String caste;
	
		
		@Column(name = "photo")
		private String photo;


		public Integer getEmployeeId() {
			return employeeId;
		}


		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getMiddleName() {
			return middleName;
		}


		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public Date getDateOfBirth() {
			return dateOfBirth;
		}


		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getBloodGroup() {
			return bloodGroup;
		}


		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}


		public String getMarital() {
			return marital;
		}


		public void setMarital(String marital) {
			this.marital = marital;
		}


		public String getNationality() {
			return nationality;
		}


		public void setNationality(String nationality) {
			this.nationality = nationality;
		}


		public String getGovernmentId() {
			return governmentId;
		}


		public void setGovernmentId(String governmentId) {
			this.governmentId = governmentId;
		}


		public String getPancard() {
			return pancard;
		}


		public void setPancard(String pancard) {
			this.pancard = pancard;
		}


		public String getCaste() {
			return caste;
		}


		public void setCaste(String caste) {
			this.caste = caste;
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
		
/*Account*/
		
		@Column(name = "account_number")
		private String accountNumber;
		
		@Column(name = "account_type")
		private String accountType;
		
		@Column(name = "bank_name")
		private String bankName;
		
		@Column(name = "branch_name")
		private String branchName;
		
		@Column(name = "ifsc_code")
		private String ifscCode;
		
		@Column(name = "ctc")
		private String ctc;
		
		

	


		public String getCtc() {
			return ctc;
		}


		public void setCtc(String ctc) {
			this.ctc = ctc;
		}


		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public String getBranchName() {
			return branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}

		public String getIfscCode() {
			return ifscCode;
		}

		public void setIfscCode(String ifscCode) {
			this.ifscCode = ifscCode;
		}

		/*contact*/
		
		@Column(name = "present_address_line1")
		private String presentAddressLine1;
		
		@Column(name = "present_address_line2")
		private String presentAddressLine2;
		
		@Column(name = "present_address_city")
		private String presentAddressCity;
		
		@Column(name = "present_address_pincode")
		private String presentAddressPincode;
		
		@Column(name = "present_address_country")
		private String presentAddressCountry;
		
		@Column(name = "present_address_state")
		private String presentAddressState;
		
		@Column(name = "permanent_address_line1")
		private String permanentAddressLine1;
		
		@Column(name = "permanent_address_line2")
		private String permanentAddressLine2;
		
		@Column(name = "permanent_address_city")
		private String permanentAddressCity;
		
		@Column(name = "permanent_address_pincode")
		private String permanentAddressPincode;
		
		@Column(name = "permanent_address_country")
		private String permanentAddressCountry;
		
		@Column(name = "permanent_address_state")
		private String permanentAddressState;
		
		@Column(name = "office_phone1")
		private String officePhone1;
		
		@Column(name = "office_phone2")
		private String officePhone2;
		
		@Column(name = "office_address_line1")
		private String officeAddressLine1;
		
		@Column(name = "office_address_line2")
		private String officeAddressLine2;
		
		@Column(name = "office_address_city")
		private String officeAddressCity;
		
		@Column(name = "office_address_pincode")
		private String officeAddressPincode;
		
		@Column(name = "office_address_country")
		private String officeAddressCountry;
		
		@Column(name = "office_address_state")
		private String officeAddressState;
		
		@Column(name = "phone")
		private String phone;
		
		@Column(name = "mobile")
		private String mobile;
		
		@Column(name = "email")
		private String email;

	

		public String getPresentAddressLine1() {
			return presentAddressLine1;
		}

		public void setPresentAddressLine1(String presentAddressLine1) {
			this.presentAddressLine1 = presentAddressLine1;
		}

		public String getPresentAddressLine2() {
			return presentAddressLine2;
		}

		public void setPresentAddressLine2(String presentAddressLine2) {
			this.presentAddressLine2 = presentAddressLine2;
		}

		public String getPresentAddressCity() {
			return presentAddressCity;
		}

		public void setPresentAddressCity(String presentAddressCity) {
			this.presentAddressCity = presentAddressCity;
		}

		public String getPresentAddressPincode() {
			return presentAddressPincode;
		}

		public void setPresentAddressPincode(String presentAddressPincode) {
			this.presentAddressPincode = presentAddressPincode;
		}

		public String getPresentAddressCountry() {
			return presentAddressCountry;
		}

		public void setPresentAddressCountry(String presentAddressCountry) {
			this.presentAddressCountry = presentAddressCountry;
		}

		public String getPresentAddressState() {
			return presentAddressState;
		}

		public void setPresentAddressState(String presentAddressState) {
			this.presentAddressState = presentAddressState;
		}

		public String getPermanentAddressLine1() {
			return permanentAddressLine1;
		}

		public void setPermanentAddressLine1(String permanentAddressLine1) {
			this.permanentAddressLine1 = permanentAddressLine1;
		}

		public String getPermanentAddressLine2() {
			return permanentAddressLine2;
		}

		public void setPermanentAddressLine2(String permanentAddressLine2) {
			this.permanentAddressLine2 = permanentAddressLine2;
		}

		public String getPermanentAddressCity() {
			return permanentAddressCity;
		}

		public void setPermanentAddressCity(String permanentAddressCity) {
			this.permanentAddressCity = permanentAddressCity;
		}

		public String getPermanentAddressPincode() {
			return permanentAddressPincode;
		}

		public void setPermanentAddressPincode(String permanentAddressPincode) {
			this.permanentAddressPincode = permanentAddressPincode;
		}

		public String getPermanentAddressCountry() {
			return permanentAddressCountry;
		}

		public void setPermanentAddressCountry(String permanentAddressCountry) {
			this.permanentAddressCountry = permanentAddressCountry;
		}

		public String getPermanentAddressState() {
			return permanentAddressState;
		}

		public void setPermanentAddressState(String permanentAddressState) {
			this.permanentAddressState = permanentAddressState;
		}

		public String getOfficePhone1() {
			return officePhone1;
		}

		public void setOfficePhone1(String officePhone1) {
			this.officePhone1 = officePhone1;
		}

		public String getOfficePhone2() {
			return officePhone2;
		}

		public void setOfficePhone2(String officePhone2) {
			this.officePhone2 = officePhone2;
		}

		public String getOfficeAddressLine1() {
			return officeAddressLine1;
		}

		public void setOfficeAddressLine1(String officeAddressLine1) {
			this.officeAddressLine1 = officeAddressLine1;
		}

		public String getOfficeAddressLine2() {
			return officeAddressLine2;
		}

		public void setOfficeAddressLine2(String officeAddressLine2) {
			this.officeAddressLine2 = officeAddressLine2;
		}

		public String getOfficeAddressCity() {
			return officeAddressCity;
		}

		public void setOfficeAddressCity(String officeAddressCity) {
			this.officeAddressCity = officeAddressCity;
		}

		public String getOfficeAddressPincode() {
			return officeAddressPincode;
		}

		public void setOfficeAddressPincode(String officeAddressPincode) {
			this.officeAddressPincode = officeAddressPincode;
		}

		public String getOfficeAddressCountry() {
			return officeAddressCountry;
		}

		public void setOfficeAddressCountry(String officeAddressCountry) {
			this.officeAddressCountry = officeAddressCountry;
		}

		public String getOfficeAddressState() {
			return officeAddressState;
		}

		public void setOfficeAddressState(String officeAddressState) {
			this.officeAddressState = officeAddressState;
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
		
		/*education*/
		
		@Column(name = "college_name")
		private String collegeName;
		
		@Column(name = "degree_name")
		private String degreeName;
		
		@Column(name = "university")
		private String universityPassed;
		
		@Column(name = "education_type")
		private String educationType;
		
		@Column(name = "years_of_passing")
		private String yearOfPassing;
		
		@Column(name = "percentage")
		private String percentage;

		

		public String getCollegeName() {
			return collegeName;
		}

		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}

		public String getDegreeName() {
			return degreeName;
		}

		public void setDegreeName(String degreeName) {
			this.degreeName = degreeName;
		}

		

		public String getEducationType() {
			return educationType;
		}

		public void setEducationType(String educationType) {
			this.educationType = educationType;
		}

		public String getYearOfPassing() {
			return yearOfPassing;
		}

		public void setYearOfPassing(String yearOfPassing) {
			this.yearOfPassing = yearOfPassing;
		}

		public String getPercentage() {
			return percentage;
		}

		public void setPercentage(String percentage) {
			this.percentage = percentage;
		}
		
		/*experience*/
		
		@Column(name = "previous_employee_id")
		private String previousEmployeeId;
		
		@Column(name = "organization_name")
		private String organizationName;
		
		@Column(name = "previous_designation")
		private String previousDesignation;
		
		
		@Column(name="start_date")
		@Temporal(TemporalType.DATE)
		 private Date startDate;
		
		@Column(name="end_date")
		@Temporal(TemporalType.DATE)
		 private Date endDate;
		 
		@Column(name = "university_name")
		private String university;
		
		@Column(name = "years_of_experience")
		private String yearsOfExperience;
		

		
		
		@Column(name = "designation")
		private String designation;
	
		@Column(name = "department")
		private String department;
		
		@Column(name="effective_date")
		@Temporal(TemporalType.DATE)
		 private Date effectiveDate;
		
		@Column(name="date_of_join")
		@Temporal(TemporalType.DATE)
		 private Date dateOfJoin;

		

		public String getUniversityPassed() {
			return universityPassed;
		}


		public void setUniversityPassed(String universityPassed) {
			this.universityPassed = universityPassed;
		}


		public String getPreviousEmployeeId() {
			return previousEmployeeId;
		}

		public void setPreviousEmployeeId(String previousEmployeeId) {
			this.previousEmployeeId = previousEmployeeId;
		}

		public String getOrganizationName() {
			return organizationName;
		}

		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}

		public String getPreviousDesignation() {
			return previousDesignation;
		}

		public void setPreviousDesignation(String previousDesignation) {
			this.previousDesignation = previousDesignation;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		
		public String getUniversity() {
			return university;
		}

		public void setUniversity(String university) {
			this.university = university;
		}

		public String getYearsOfExperience() {
			return yearsOfExperience;
		}

		public void setYearsOfExperience(String yearsOfExperience) {
			this.yearsOfExperience = yearsOfExperience;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public Date getEffectiveDate() {
			return effectiveDate;
		}

		public void setEffectiveDate(Date effectiveDate) {
			this.effectiveDate = effectiveDate;
		}

		public Date getDateOfJoin() {
			return dateOfJoin;
		}

		public void setDateOfJoin(Date dateOfJoin) {
			this.dateOfJoin = dateOfJoin;
		}

	
}
