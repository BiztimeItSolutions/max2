package com.biz.emp.prof.dao;

import java.sql.SQLException;
import java.util.List;

import com.biz.emp.prof.domain.PersonalInformationsPojo;

public interface IPersonalInformations {

	public void personalInformationsSave(PersonalInformationsPojo employee);

	public List<PersonalInformationsPojo>getPersInfList();
	public void deleteEmployeePersonal(PersonalInformationsPojo employee);
	public void updateEmployeeInfo(PersonalInformationsPojo employee);
	
}
