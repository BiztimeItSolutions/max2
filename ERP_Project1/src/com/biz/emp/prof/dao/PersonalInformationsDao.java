package com.biz.emp.prof.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.biz.emp.prof.domain.AccountsDetailsPojo;
import com.biz.emp.prof.domain.DesignationDetailsPojo;
import com.biz.emp.prof.domain.EducationDetailsPojo;
import com.biz.emp.prof.domain.EmpidCreationPojo;
import com.biz.emp.prof.domain.WorkExperienceDetailsPojo;
//import com.biz.adm.pojo.Applicant_Register;
import com.biz.emp.prof.domain.PersonalInformationsPojo;

@Repository("IPersonalInformations")
public class PersonalInformationsDao implements IPersonalInformations {

	@Autowired
	
	private SessionFactory sessionfactory;
//empid creation	
	public void empidCreationSave(EmpidCreationPojo employee)
	{
		
		System.out.println("inside personal dao for insert");
		
		//sessionfactory.getCurrentSession().
		//@SuppressWarnings("unchecked")
		
		System.out.println("hi");
			String m=employee.setEmp_ID("BIZ14");
		employee.setValue(m);
	sessionfactory.getCurrentSession().saveOrUpdate(employee);
	System.out.println("hello");
	int i=employee.getId();
	System.out.println(i);
	employee.setValue(m+i);
	System.out.println(m+i);
	sessionfactory.getCurrentSession().update(employee);
	sessionfactory.getCurrentSession().flush();
	System.out.println("updated::::<>>>");

		
	}
//insert into db
	
	public void personalInformationsSave(PersonalInformationsPojo employee)
	{
		System.out.println("inside personal dao for insert");
		sessionfactory.getCurrentSession().saveOrUpdate(employee);
		System.out.println(employee.getPhoto());
		String photo=employee.getPhoto();
	}
	
	
	public void educationDetailsSave(EducationDetailsPojo employee)
	{
		System.out.println("inside edu dao for insert");
		sessionfactory.getCurrentSession().saveOrUpdate(employee);
	}
	
	public void designationDetailsSave(DesignationDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside edu dao for insert");
		sessionfactory.getCurrentSession().saveOrUpdate(employee);
	}
	public void workexperienceDetailsSave(WorkExperienceDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside edu dao for insert");
		sessionfactory.getCurrentSession().saveOrUpdate(employee);
	}
	
	public void accountsDetailsSave(AccountsDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside edu dao for insert");
		sessionfactory.getCurrentSession().saveOrUpdate(employee);
	}
	
	
	
//to view
	
	public List<PersonalInformationsPojo>getPersInfList(){
		@SuppressWarnings("unchecked")
		List<PersonalInformationsPojo> employeelist =sessionfactory.getCurrentSession()
		.createCriteria(PersonalInformationsPojo.class).list();
		return employeelist;
	}
	
	public List<EducationDetailsPojo>getEduInfList(){
		@SuppressWarnings("unchecked")
		List<EducationDetailsPojo> employeelistedu =sessionfactory.getCurrentSession()
		.createCriteria(EducationDetailsPojo.class).list();
		return employeelistedu;
	}
	
	public List<DesignationDetailsPojo> getDesigInfList() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<DesignationDetailsPojo> employeelistdesig =sessionfactory.getCurrentSession()
				.createCriteria(DesignationDetailsPojo.class).list();
				return employeelistdesig;
	}

	public List<WorkExperienceDetailsPojo> getWorkExpInfList() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<WorkExperienceDetailsPojo> employeelistworkexp =sessionfactory.getCurrentSession()
				.createCriteria(WorkExperienceDetailsPojo.class).list();
				return employeelistworkexp;
	}


	public List<AccountsDetailsPojo> getAcntInfList() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<AccountsDetailsPojo> employeelistacnt =sessionfactory.getCurrentSession()
				.createCriteria(AccountsDetailsPojo.class).list();
				return employeelistacnt;
	}

	
//to delete
	
	public void deleteEmployeePersonal(PersonalInformationsPojo employee) {
		System.out.println("inside delete");
		sessionfactory.getCurrentSession().createQuery("DELETE FROM PersonalInformationsPojo WHERE id = "+employee.getId()).executeUpdate();
		System.out.println("deleted");
	}
	
	public void deleteEmployeeEducation(EducationDetailsPojo employee) {
		// TODO Auto-generated method stub
		
		System.out.println("inside delete");
		sessionfactory.getCurrentSession().createQuery("DELETE FROM EducationDetailsPojo WHERE id = "+employee.getId()).executeUpdate();
		System.out.println("deleted");
	}
	
	public void deleteEmployeeDesignation(DesignationDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside delete");
		sessionfactory.getCurrentSession().createQuery("DELETE FROM DesignationDetailsPojo WHERE id = "+employee.getId()).executeUpdate();
		System.out.println("deleted");
	}

	public void deleteEmployeeWorkExperience(WorkExperienceDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside delete");
		sessionfactory.getCurrentSession().createQuery("DELETE FROM WorkExperienceDetailsPojo WHERE id = "+employee.getId()).executeUpdate();
		System.out.println("deleted");
	}

	public void deleteEmployeeAccount(AccountsDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside delete");
		sessionfactory.getCurrentSession().createQuery("DELETE FROM AccountsDetailsPojo WHERE id = "+employee.getId()).executeUpdate();
		System.out.println("deleted");
	}
	
//to edit
	
	public void updateEmployeeInfo(PersonalInformationsPojo employee)
	{
		System.out.println("inside update DAO:  "+employee.getId());
		sessionfactory.getCurrentSession().update(employee);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}
	
	public PersonalInformationsPojo getEmployee(int id){
		
		return (PersonalInformationsPojo) sessionfactory.getCurrentSession().get(PersonalInformationsPojo.class, id);
	}


	public EducationDetailsPojo getEmployeeEdu(int id) {
		// TODO Auto-generated method stub
		return (EducationDetailsPojo) sessionfactory.getCurrentSession().get(EducationDetailsPojo.class, id);
	}


	public void updateEmployeeEdu(EducationDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  "+employee.getId());
		sessionfactory.getCurrentSession().update(employee);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}

	public DesignationDetailsPojo getEmployeeDesig(int id) {
		// TODO Auto-generated method stub
		return (DesignationDetailsPojo) sessionfactory.getCurrentSession().get(DesignationDetailsPojo.class, id);
	}


	
	public void updateEmployeeDesig(DesignationDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  "+employee.getId());
		sessionfactory.getCurrentSession().update(employee);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}

	public WorkExperienceDetailsPojo getEmployeeWorkExp(int id) {
		// TODO Auto-generated method stub
		return (WorkExperienceDetailsPojo) sessionfactory.getCurrentSession().get(WorkExperienceDetailsPojo.class, id);
	}

	public void updateEmployeeWorkExp(WorkExperienceDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  "+employee.getId());
		sessionfactory.getCurrentSession().update(employee);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}

	public AccountsDetailsPojo getEmployeeAcnt(int id) {
		// TODO Auto-generated method stub
		return (AccountsDetailsPojo) sessionfactory.getCurrentSession().get(AccountsDetailsPojo.class, id);
	}	
	
	public void updateEmployeeAccount(AccountsDetailsPojo employee) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  "+employee.getId());
		sessionfactory.getCurrentSession().update(employee);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}
//fetch
	public PersonalInformationsPojo getFetchEmployee(int id) {
		// TODO Auto-generated method stub
		return (PersonalInformationsPojo) sessionfactory.getCurrentSession().get(PersonalInformationsPojo.class, id);
	}


}
