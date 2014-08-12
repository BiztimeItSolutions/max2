package com.biz.emp.prof.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.biz.emp.prof.dao.PersonalInformationsDao;
import com.biz.emp.prof.domain.PersonalInformationsPojo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersonalInformationsService implements IPersonalInformationsService {
	
	@Autowired
	PersonalInformationsDao personalInformationdao;
	
	@Override
	public void personalInformationsAdd( PersonalInformationsPojo employee){
		
		personalInformationdao.personalInformationsSave(employee);
		
	}
	
	public List<PersonalInformationsPojo> getPersInfList(){
		
		return personalInformationdao.getPersInfList();
	}
	
	public void deleteEmployeePersonal(PersonalInformationsPojo employee) {
		System.out.println("inside service");
		
		personalInformationdao.deleteEmployeePersonal(employee);
	}
	
	public void updateEmployeeInfo(PersonalInformationsPojo employee){
		personalInformationdao.updateEmployeeInfo(employee);
	}
	
	public PersonalInformationsPojo getEmployee(String emp_ID){
		return personalInformationdao.getEmployee(emp_ID);
	}
	
/*	@Override
	public void insertValues(Object o)throws SQLException{
		personalInformationdao.;
	}*/
}
