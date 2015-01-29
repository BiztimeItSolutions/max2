package com.biztime.campusg.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.biztime.campusg.model.Student;
import com.biztime.campusg.model.StudentContact;
import com.biztime.campusg.model.StudentEducation;
import com.biztime.campusg.model.StudentParent;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	
	@Override
	public void saveStudent(Student s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(s);
		logger.info("Student saved successfully, Student Details="+s);
	}

	@Override
	public void saveStudentContact(StudentContact s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(s);
		logger.info("StudentContact Details saved successfully, StudentContact Details="+s);
	}
	
	
	@Override
	public void saveStudentParent(StudentParent s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(s);
		logger.info("StudentParentContact Details saved successfully, StudentParentContact Details="+s);
	}

	@Override
	public void saveStudentEducation(StudentEducation s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(s);
		logger.info("StudentEducation Details saved successfully, StudentEducation Details="+s);
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<Student> getStudentPersonal() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Student> student= session.createCriteria(Student.class).list();
		System.out.println("Inside Dao");
		return student;
		
	}
	
	
	

}
