package com.biz.emp.prof.service;

import java.sql.SQLException;
import java.util.List;

import com.biz.emp.prof.domain.AccountsDetailsPojo;
import com.biz.emp.prof.domain.DesignationDetailsPojo;
import com.biz.emp.prof.domain.EducationDetailsPojo;
import com.biz.emp.prof.domain.EmpidCreationPojo;
import com.biz.emp.prof.domain.PersonalInformationsPojo;
import com.biz.emp.prof.domain.WorkExperienceDetailsPojo;

public interface IPersonalInformationsService {

	public void personalInformationsAdd( PersonalInformationsPojo employee);
	public List<PersonalInformationsPojo>getPersInfList();
	public void deleteEmployeePersonal(PersonalInformationsPojo employee);
	public void updateEmployeeInfo(PersonalInformationsPojo employee);
	public PersonalInformationsPojo getEmployee(int id);
	
	public void educationDetailsAdd(EducationDetailsPojo employee);
	public List<EducationDetailsPojo>getEduInfList();
	public void deleteEmployeeEducation(EducationDetailsPojo employee);
	public EducationDetailsPojo getEmployeeEdu(int id);
	public void updateEmployeeEdu(EducationDetailsPojo employee);
	
	
	public void designationDetailsAdd(DesignationDetailsPojo employee);
	public List<DesignationDetailsPojo> getDesigInfList();
	public void deleteEmployeeDesignation(DesignationDetailsPojo employee);
	public void updateEmployeeDesig(DesignationDetailsPojo employee);
	public DesignationDetailsPojo getEmployeeDesig(int id);
	
	public void workexperienceDetailsAdd(WorkExperienceDetailsPojo employee);
	public List<WorkExperienceDetailsPojo> getWorkExpInfList();
	public void deleteEmployeeWorkExperience(WorkExperienceDetailsPojo employee);
	public void updateEmployeeWorkExp(WorkExperienceDetailsPojo employee);
	public WorkExperienceDetailsPojo getEmployeeWorkExp(int id);
	
	public void accountsDetailsAdd(AccountsDetailsPojo employee);
	public List<AccountsDetailsPojo> getAcntInfList();
	public void deleteEmployeeAccount(AccountsDetailsPojo employee);
	public void updateEmployeeAccount(AccountsDetailsPojo employee);
	public AccountsDetailsPojo getEmployeeAcnt(int id);
	
	public void empidCreationAdd(EmpidCreationPojo employee);
	
	public PersonalInformationsPojo getFetchEmployee(int id);
	
	
	
	
}