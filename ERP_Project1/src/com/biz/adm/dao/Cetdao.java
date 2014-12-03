
package com.biz.adm.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.biz.adm.pojo.CetAddmissionPojo;



@Repository("Cetdao")
public class Cetdao implements CetInterfacedao{
	
	@Autowired
	private SessionFactory sessionfactory;
	
	//Save Data
	public void saveUser(CetAddmissionPojo student) {
		// TODO Auto-generated method stub
		
		
		sessionfactory.getCurrentSession().saveOrUpdate(student);
		
		
	}
	
	// Display List
	public List<CetAddmissionPojo> getStudent() {
		@SuppressWarnings("unchecked")
		List<CetAddmissionPojo> studentapplicantlist = sessionfactory.getCurrentSession()
				.createCriteria(CetAddmissionPojo.class).list();
		return studentapplicantlist;
	}
	
//Edit Data
	public CetAddmissionPojo getId(int id) {
		// TODO Auto-generated method stub
		
		 return  (CetAddmissionPojo) sessionfactory.getCurrentSession().get(CetAddmissionPojo.class, id);
	}
	
	
	public void updateApp(CetAddmissionPojo student) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  " +student.getFname());
		sessionfactory.getCurrentSession().update(student);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");
	}

//Delete
	public void deleteApplicant(CetAddmissionPojo student) {
		// TODO Auto-generated method stub
		
		System.out.println("in delete DAO"+student.getId());
		sessionfactory.getCurrentSession().createQuery("DELETE FROM CetAddmissionPojo WHERE id = "+student.getId()).executeUpdate();
		
	}


//View Full Data
	
	public List<CetAddmissionPojo> getStudentview() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<CetAddmissionPojo> studentapplicantlist = sessionfactory.getCurrentSession()
				.createCriteria(CetAddmissionPojo.class).list();
		return studentapplicantlist;
	}
	
	
	}
	
	


