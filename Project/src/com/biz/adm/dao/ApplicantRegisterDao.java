package com.biz.adm.dao;

import java.util.List;


import com.biz.adm.pojo.Applicant_Register;

public interface ApplicantRegisterDao {
	public void saveUser ( Applicant_Register applicant );
	

	public void  updateApp ( Applicant_Register applicant );
	
	
	public List<Applicant_Register> getUser();
	
	public void deleteApplicant(Applicant_Register applicant);
}
