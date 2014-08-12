package com.biz.emp.prof.service;

import java.sql.SQLException;
import java.util.List;

import com.biz.emp.prof.domain.PersonalInformationsPojo;

public interface IPersonalInformationsService {

	public void personalInformationsAdd( PersonalInformationsPojo employee);
	public List<PersonalInformationsPojo>getPersInfList();
	public void deleteEmployeePersonal(PersonalInformationsPojo employeeperso);
	//public void insertValues(Object o)throws SQLException;
	
}
