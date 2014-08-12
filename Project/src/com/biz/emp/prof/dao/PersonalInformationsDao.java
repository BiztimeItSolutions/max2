package com.biz.emp.prof.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.biz.adm.pojo.Applicant_Register;
import com.biz.emp.prof.domain.PersonalInformationsPojo;

@Repository("IPersonalInformations")
public class PersonalInformationsDao implements IPersonalInformations {

	@Autowired
	
	private SessionFactory sessionfactory;
	
	public void personalInformationsSave(PersonalInformationsPojo employee)
	{
		sessionfactory.getCurrentSession().saveOrUpdate(employee);
	}
	
	public List<PersonalInformationsPojo>getPersInfList(){
		@SuppressWarnings("unchecked")
		List<PersonalInformationsPojo> employeelist =sessionfactory.getCurrentSession()
		.createCriteria(PersonalInformationsPojo.class).list();
		return employeelist;
	}
	
	public void deleteEmployeePersonal(PersonalInformationsPojo employee) {
		System.out.println("inside delete");
		sessionfactory.getCurrentSession().createQuery("DELETE FROM employee1 WHERE emp_ID = "+employee.getEmp_ID()).executeUpdate();
		System.out.println("deleted");
	}
	
	
	public void updateEmployeeInfo(PersonalInformationsPojo employee)
	{
		System.out.println("inside updatre DAO:  "+employee.getEmp_ID());
		sessionfactory.getCurrentSession().update(employee);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}
	
	public PersonalInformationsPojo getEmployee(String emp_ID){
		
		return (PersonalInformationsPojo) sessionfactory.getCurrentSession().get(PersonalInformationsPojo.class, emp_ID);
	}
	/*@Override
	public void insertValues(Object o) throws SQLException {
		// TODO Auto-generated method stub
//ItemBean IB=(ItemBean)o;
		PersonalInformationsPojo db=(PersonalInformationsPojo)o;
		System.out.println("iside insert dao");
		//CityBean CB=(CityBean)o;
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		System.out.println(0);
		
		SessionFactory sf = conf.buildSessionFactory();
		Session s1 = sf.openSession();
		s1.beginTransaction();
		
		System.out.println(1);		
		/*SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(db);
		session.getTransaction().commit();
		session.close();*/
		
/*s1.save(db);
		
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done insert");
			}*/
}
