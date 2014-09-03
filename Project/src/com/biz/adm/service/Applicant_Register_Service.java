package com.biz.adm.service;

import java.util.List;


import com.biz.adm.pojo.Applicant_Edit;
import com.biz.adm.pojo.Applicant_Register;

public interface Applicant_Register_Service {
	
//online application
	public void addUser(Applicant_Register applicant);

//shortlisted
	
	public List<Applicant_Register> getUser();
	
	public Applicant_Register getApplicant(int applicant_ID);

	public void updateApp(Applicant_Register applicantBean);

	public void deleteApplicant(Applicant_Register object);
	

//interview process
	
	public List<Applicant_Register> getInterviewUser();
	
	public Applicant_Register getApplicantDetails(int applicant_ID);
	
	public void updateApplicant(Applicant_Register applicantBean);

	
//final list
	
	public List<Applicant_Register> getFinalUser();
	
	
//sample fetch
	public Applicant_Register getFetchApplicant(int applicant_ID);

}
