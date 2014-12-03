package com.biz.emp.prof.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//import com.biz.emp.prof.dao.EmpidCreationsDao;
import com.biz.emp.prof.dao.PersonalInformationsDao;
import com.biz.emp.prof.domain.AccountsDetailsPojo;
import com.biz.emp.prof.domain.DesignationDetailsPojo;
import com.biz.emp.prof.domain.EducationDetailsPojo;
import com.biz.emp.prof.domain.EmpidCreationPojo;
import com.biz.emp.prof.domain.PersonalInformationsPojo;
import com.biz.emp.prof.domain.WorkExperienceDetailsPojo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersonalInformationsService implements IPersonalInformationsService {
	
	@Autowired
	PersonalInformationsDao personalInformationdao;

	//empid creation

	//
	public void empidCreationAdd(EmpidCreationPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside service edu to insert");
		personalInformationdao.empidCreationSave(employee);
	}
	
//to insert	
	
	
	public void personalInformationsAdd( PersonalInformationsPojo employee){
		
		personalInformationdao.personalInformationsSave(employee);
		
	}
	
	
	public void educationDetailsAdd(EducationDetailsPojo employee) {
		// TODO Auto-generated method stub
		
		System.out.println("inside service edu to insert");
		personalInformationdao.educationDetailsSave(employee);
	}

	
	
	public void designationDetailsAdd(DesignationDetailsPojo employee) {
		// TODO Auto-generated method stub
		
		System.out.println("inside service edu to insert");
		personalInformationdao.designationDetailsSave(employee);
	}

	public void workexperienceDetailsAdd(WorkExperienceDetailsPojo employee){
		System.out.println("inside service edu to insert");
		personalInformationdao.workexperienceDetailsSave(employee);
	}
	public void accountsDetailsAdd(AccountsDetailsPojo employee){
		System.out.println("inside service edu to insert");
		personalInformationdao.accountsDetailsSave(employee);
	}
	
//to view
	
	public List<PersonalInformationsPojo> getPersInfList(){
		System.out.println("inside service edu");
		return personalInformationdao.getPersInfList();
	}
	
	
	public List<EducationDetailsPojo> getEduInfList() {
		// TODO Auto-generated method stub
		return personalInformationdao.getEduInfList();
	}
	
	public List<DesignationDetailsPojo> getDesigInfList(){
		return personalInformationdao.getDesigInfList();
	}
	public List<WorkExperienceDetailsPojo> getWorkExpInfList(){
		return personalInformationdao.getWorkExpInfList();
	}
	
	public List<AccountsDetailsPojo> getAcntInfList(){
		return personalInformationdao.getAcntInfList();
	}
//to delete
	
	public void deleteEmployeePersonal(PersonalInformationsPojo employee) {
		System.out.println("inside service");
		
		personalInformationdao.deleteEmployeePersonal(employee);
	}
	
	
	public void deleteEmployeeEducation(EducationDetailsPojo employee) {
		// TODO Auto-generated method stub
		personalInformationdao.deleteEmployeeEducation(employee);
	}
	
	public void deleteEmployeeDesignation(DesignationDetailsPojo employee){
		personalInformationdao.deleteEmployeeDesignation(employee);
	}
	
	public void deleteEmployeeWorkExperience(WorkExperienceDetailsPojo employee){
		personalInformationdao.deleteEmployeeWorkExperience(employee);
	}
	
	public void deleteEmployeeAccount(AccountsDetailsPojo employee){
		personalInformationdao.deleteEmployeeAccount(employee);
	}
	
	
	
//to edit	
	public void updateEmployeeInfo(PersonalInformationsPojo employee){
		personalInformationdao.updateEmployeeInfo(employee);
	}
	
	public PersonalInformationsPojo getEmployee(int id){
		return personalInformationdao.getEmployee(id);
	}

	
	public EducationDetailsPojo getEmployeeEdu(int id) {
		// TODO Auto-generated method stub
		return personalInformationdao.getEmployeeEdu(id);
	}

	
	public void updateEmployeeEdu(EducationDetailsPojo employee) {
		// TODO Auto-generated method stub
		personalInformationdao.updateEmployeeEdu(employee);
	}

	public DesignationDetailsPojo getEmployeeDesig(int id){
		return personalInformationdao.getEmployeeDesig(id);
	}
	
	
	public void updateEmployeeDesig(DesignationDetailsPojo employee) {
		// TODO Auto-generated method stub
		personalInformationdao.updateEmployeeDesig(employee);
	}
	
	public WorkExperienceDetailsPojo getEmployeeWorkExp(int id) {
		// TODO Auto-generated method stub
		return personalInformationdao.getEmployeeWorkExp(id);
	}

	
	public void updateEmployeeWorkExp(WorkExperienceDetailsPojo employee) {
		// TODO Auto-generated method stub
		personalInformationdao.updateEmployeeWorkExp(employee);
	}
	
	public AccountsDetailsPojo getEmployeeAcnt(int id) {
		// TODO Auto-generated method stub
		return personalInformationdao.getEmployeeAcnt(id);
	}

	
	public void updateEmployeeAccount(AccountsDetailsPojo employee) {
		// TODO Auto-generated method stub
		personalInformationdao.updateEmployeeAccount(employee);
	}
//fetch

	public PersonalInformationsPojo getFetchEmployee(int id) {
		// TODO Auto-generated method stub
		return personalInformationdao.getFetchEmployee(id);
	}
	
	
}
