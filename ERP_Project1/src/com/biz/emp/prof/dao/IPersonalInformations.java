package com.biz.emp.prof.dao;

import java.sql.SQLException;
import java.util.List;

import com.biz.emp.prof.domain.AccountsDetailsPojo;
import com.biz.emp.prof.domain.DesignationDetailsPojo;
import com.biz.emp.prof.domain.EducationDetailsPojo;
import com.biz.emp.prof.domain.EmpidCreationPojo;
import com.biz.emp.prof.domain.PersonalInformationsPojo;
import com.biz.emp.prof.domain.WorkExperienceDetailsPojo;

public interface IPersonalInformations {

	public void personalInformationsSave(PersonalInformationsPojo employee);

	public List<PersonalInformationsPojo>getPersInfList();
	public void deleteEmployeePersonal(PersonalInformationsPojo employee);
	public void updateEmployeeInfo(PersonalInformationsPojo employee);

	
	//empid creation
	//public void empidCreationSave(EmpidCreationPojo employee);
	//public void empidCreationAdd(EmpidCreationPojo employee);
	
	public void empidCreationSave(EmpidCreationPojo employee);
	
//	public PersonalInformationsPojo getEmployee(int id);
	
	public void educationDetailsSave(EducationDetailsPojo employee);
	public List<EducationDetailsPojo>getEduInfList();
	public void deleteEmployeeEducation(EducationDetailsPojo employee);
	public void updateEmployeeEdu(EducationDetailsPojo employee);
	
	public void designationDetailsSave(DesignationDetailsPojo employee);
	public List<DesignationDetailsPojo> getDesigInfList();
	public void deleteEmployeeDesignation(DesignationDetailsPojo employee);
	public void updateEmployeeDesig(DesignationDetailsPojo employee);
	
	public void workexperienceDetailsSave(WorkExperienceDetailsPojo employee);
	public List<WorkExperienceDetailsPojo> getWorkExpInfList();
	public void deleteEmployeeWorkExperience(WorkExperienceDetailsPojo employee);
	public void updateEmployeeWorkExp(WorkExperienceDetailsPojo employee);
	
	public void accountsDetailsSave(AccountsDetailsPojo employee);
	public List<AccountsDetailsPojo> getAcntInfList();
	public void deleteEmployeeAccount(AccountsDetailsPojo employee);
	public void updateEmployeeAccount(AccountsDetailsPojo employee);
}

