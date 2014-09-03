package com.biz.adm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;




import com.biz.adm.dao.ApplicantRegisterDaoImpl;
import com.biz.adm.pojo.Applicant_Edit;
import com.biz.adm.pojo.Applicant_Register;
import com.biz.adm.service.Applicant_Register_Service;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class Applicant_Register_Service_Impl implements Applicant_Register_Service {

	
	@Autowired
	ApplicantRegisterDaoImpl applicantDao;
	
//add shortlisted
	
	public void addUser(Applicant_Register applicant) 
	{
		// TODO Auto-generated method stub
		applicantDao.saveUser(applicant);
		
	}

//display shortlisted
	
	public List<Applicant_Register> getUser()
	{
		// TODO Auto-generated method stub
		return applicantDao.getUser();
	}
	
//edit shortlisted
	
	public Applicant_Register getApplicant(int Applicant_ID)
	{
		 return applicantDao.getApplicant(Applicant_ID);
	}

//update shortlisted
	
	public void updateApp(Applicant_Register applicant)
	{
		 // TODO Auto-generated method stub
		 applicantDao.updateApp(applicant);	
    }
	
//delete
	
	public void deleteApplicant(Applicant_Register applicant)
	{
		 System.out.println("inside service");
	     applicantDao.deleteApplicant(applicant);
    }

	
//display interview details
		
	public List<Applicant_Register> getInterviewUser() 
	{
		 // TODO Auto-generated method stub
		 return applicantDao.getInterviewUser();
	}	
	
//edit interview details
	
	public Applicant_Register getApplicantDetails(int Applicant_ID)
	{
		 return applicantDao.getApplicant(Applicant_ID);
	}

//update interview details
	
	public void updateApplicant(Applicant_Register applicant) 
	{
		// TODO Auto-generated method stub
		applicantDao.updateApplicant(applicant);	
    }
	
//display final list
	
	public List<Applicant_Register> getFinalUser() 
	{
		// TODO Auto-generated method stub
		return applicantDao.getFinalUser();
	}
	
//fetch sample

	public Applicant_Register getFetchApplicant(int Applicant_ID)
	{
		return applicantDao.getFetchApplicant(Applicant_ID);
	}
	
}