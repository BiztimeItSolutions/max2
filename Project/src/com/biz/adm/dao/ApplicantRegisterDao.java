package com.biz.adm.dao;

import java.util.List;


import com.biz.adm.pojo.Applicant_Register;

public interface ApplicantRegisterDao {
	
	//shortlisted
	
	public void saveUser ( Applicant_Register applicant );
	
	public List<Applicant_Register> getUser();
	
	public Applicant_Register getApplicant(int applicant_ID);
	
	public void  updateApp ( Applicant_Register applicant );
	
	public void deleteApplicant(Applicant_Register applicant);
	
   //interview details
	
	public List<Applicant_Register> getInterviewUser();
	
	public void  updateApplicant ( Applicant_Register applicant);
	
	public Applicant_Register getApplicantDetails(int applicant_ID);
	
	//final list
	
	public List<Applicant_Register> getFinalUser();
	
	//sample
	
	public Applicant_Register getFetchApplicant(int applicant_ID);
	
}
