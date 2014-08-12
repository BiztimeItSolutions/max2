package com.biz.adm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.biz.adm.pojo.Applicant_Register;

@Repository("ApplicantRegisterDao")
public class ApplicantRegisterDaoImpl {
	@Autowired
	private SessionFactory sessionfactory;
	
	
	public void saveUser(Applicant_Register applicant)
	{
		// TODO Auto-generated method stub	
		sessionfactory.getCurrentSession().saveOrUpdate(applicant);		
	}

	
	public List<Applicant_Register> getUser() {
		@SuppressWarnings("unchecked")
		List<Applicant_Register> applicantlist = sessionfactory.getCurrentSession()
				.createCriteria(Applicant_Register.class).list();
		return applicantlist;
	}
	

	public Applicant_Register getApplicant(int applicant_ID) {
		// TODO Auto-generated method stub
		
		 return  (Applicant_Register) sessionfactory.getCurrentSession().get(Applicant_Register.class, applicant_ID);
		
	}

	public void updateApp(Applicant_Register applicant) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  " +applicant.getFirst_Name());
		sessionfactory.getCurrentSession().update(applicant);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}
	
	
	
	//delete
	
	public void deleteApplicant(Applicant_Register applicant) {
		System.out.println("in delete DAO"+applicant.getApplicant_ID());
		sessionfactory.getCurrentSession().createQuery("DELETE FROM Applicant_Register WHERE applicant_ID = "+applicant.getApplicant_ID()).executeUpdate();
		 }
	
	
	
	/*public List<Applicant_Register> getUser() {
		@SuppressWarnings("unchecked")
		
		String hql = "FROM applicant_register1 E WHERE E.tenth_Percentage ='s'";
		Session session=null;
		Query query = session.createQuery(hql);
		List<Applicant_Register> applicantlist = query.list();
		
		return applicantlist;
}*/
	
}
