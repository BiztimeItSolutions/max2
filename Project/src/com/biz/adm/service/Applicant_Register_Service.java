package com.biz.adm.service;

import java.util.List;


import com.biz.adm.pojo.Applicant_Edit;
import com.biz.adm.pojo.Applicant_Register;

public interface Applicant_Register_Service {
	public void addUser(Applicant_Register applicant);
	
	public List<Applicant_Register> getUser();
	
	public Applicant_Register getApplicant(int applicant_ID);

	public void updateApp(Applicant_Register applicantBean);

	//public void deleteApplicant(Object object);
	
	public void deleteApplicant(Applicant_Register object);

}
