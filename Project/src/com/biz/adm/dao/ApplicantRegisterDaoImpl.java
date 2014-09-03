package com.biz.adm.dao;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



import com.biz.adm.pojo.Applicant_Register;

@Repository("ApplicantRegisterDao")
public class ApplicantRegisterDaoImpl {
	@Autowired
	private SessionFactory sessionfactory;

	
public void setSessionFactory(SessionFactory sessionFactory)
	{
        this.sessionfactory = sessionFactory;
    }

 protected Session getSession()
   {
        return sessionfactory.openSession();
   }

 public boolean checkLogin(String userName, String userPassword)
   {
                  System.out.println("In Check login DAO impl");
                  Session session = sessionfactory.openSession();
                  boolean userFound = false;
                  //Query using Hibernate Query Language
                  String SQL_QUERY =" from LoginForm as o where o.userName=? and o.userPassword=?";
                  System.out.println("hello");
                  Query query = session.createQuery(SQL_QUERY);
                  query.setParameter(0,userName);
                  query.setParameter(1,userPassword);
                  List list = query.list();

                  if ((list != null) && (list.size() > 0))
                  {
                          userFound= true;
                  }

                  session.close();
                  return userFound;              
 }
	
	
	
	
//save shortlisted
	
	public void saveUser(Applicant_Register applicant)
	{
		// TODO Auto-generated method stub	
		sessionfactory.getCurrentSession().saveOrUpdate(applicant);		
	}

//display shortlisted
	
	public List<Applicant_Register> getUser()
	{
		@SuppressWarnings("unchecked")
	
		List<Applicant_Register> applicantlist = sessionfactory.getCurrentSession().createQuery("from Applicant_Register WHERE tenth_Percentage>=60 AND twelth_Percentage>=60").list();
		
		//List<Applicant_Register> applicantlist = sessionfactory.getCurrentSession().createCriteria(Applicant_Register.class).list();
		return applicantlist;
	}
	
//edit shortlisted

	public Applicant_Register getApplicant(int applicant_ID) 
	{
	    // TODO Auto-generated method stub
			
		return  (Applicant_Register) sessionfactory.getCurrentSession().get(Applicant_Register.class, applicant_ID);
			
	}
		
//update shortlisted

	public void updateApp(Applicant_Register applicant) 
	{
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  " +applicant.getFirst_Name());
		sessionfactory.getCurrentSession().update(applicant);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}
	

//delete 
	
	 public void deleteApplicant(Applicant_Register applicant)
	 {
		System.out.println("in delete DAO"+applicant.getApplicant_ID());
		sessionfactory.getCurrentSession().createQuery("DELETE FROM Applicant_Register WHERE applicant_ID = "+applicant.getApplicant_ID()).executeUpdate();
	 }


//displaying for interview process details
	
	public List<Applicant_Register> getInterviewUser() 
	{
		@SuppressWarnings("unchecked")
		
		List<Applicant_Register> applicantInterviewlist = sessionfactory.getCurrentSession().createQuery("from Applicant_Register WHERE mail='sent'").list();
		
		return applicantInterviewlist;
	}	
	
//edit interview details

	public Applicant_Register getApplicantDetails(int applicant_ID) 
	{
		// TODO Auto-generated method stub		
		return  (Applicant_Register) sessionfactory.getCurrentSession().get(Applicant_Register.class, applicant_ID);
		
	}
			
//update interview details

	public void updateApplicant(Applicant_Register applicant)
	{
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  " +applicant.getFirst_Name());
		sessionfactory.getCurrentSession().update(applicant);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated");
	}
		
		
//displaying for final list details
		
	public List<Applicant_Register> getFinalUser()
	{
		@SuppressWarnings("unchecked")
		
		List<Applicant_Register> applicantfinallist = sessionfactory.getCurrentSession().createQuery("from Applicant_Register WHERE status='selected'").list();
		
		return applicantfinallist;
	}	
	
	
//fetch sample
	
	public Applicant_Register getFetchApplicant(int applicant_ID) 
	{
		// TODO Auto-generated method stub
		
		 return  (Applicant_Register) sessionfactory.getCurrentSession().get(Applicant_Register.class, applicant_ID);
		
	}
	
		
}
