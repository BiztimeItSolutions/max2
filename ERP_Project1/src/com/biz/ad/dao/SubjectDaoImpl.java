package com.biz.ad.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Department;
import com.biz.ad.pojo.Subject;

@Repository("SubjectDao")
public class SubjectDaoImpl implements SubjectDao {
	
	@Autowired
	private SessionFactory sessionfactory;


	
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(subject);
		
	}

	
	public List<Subject> getSubject() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Subject> subject = sessionfactory.getCurrentSession().createCriteria(Subject.class).list();
		System.out.println("Inside Dao");
		return subject;
	
	}

	
	public Subject getEachSubject(int subject_id) {
		// TODO Auto-generated method stub
		return (Subject) sessionfactory.getCurrentSession().get(Subject.class, subject_id);
		//return (Course) sessionfactory.getCurrentSession().get(Course.class, course_id);
	}

	
	public void updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().update(subject);
		sessionfactory.getCurrentSession().flush();
	
		
	}

	
	public void deleteSubject(Subject object) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().createQuery("DELETE FROM Subject WHERE subject_id="+object.getSubject_id()).executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getfirstsubj(String course) {
		// TODO Auto-generated method stub
		/*//@SuppressWarnings("unchecked")
		System.out.println("Inside dao of first semester");
		System.out.println("Course Name:"+course);
		String c=course;
		Criteria criteria=sessionfactory.getCurrentSession().createCriteria(Subject.class);
		criteria.add(Restrictions.eq("course_name", "c"));
				//,(Restrictions.eq("semester", 1))));
		List<Subject> subject=criteria.list();
		
		for(Subject a:subject){
			System.out.println("SUbject Code"+a.getSubject_code());
			System.out.println("Subject Name"+a.getSubject_name());
		}*/
		
	
		//return subject;
		String course1=course;
		String sem="1";
		Query query=sessionfactory.getCurrentSession().createQuery("FROM Subject WHERE course_name=? and semester=?");
		query.setString(0, course1);
		query.setInteger(1, Integer.parseInt(sem));
		
		List<Subject> subject=query.list();
		return subject;
		
		}


	@SuppressWarnings("unchecked")
	public List<Subject> getsecondsubj(String course) {
		// TODO Auto-generated method stub
		String course1=course;
		String sem="2";
		Query query=sessionfactory.getCurrentSession().createQuery("FROM Subject WHERE course_name=? and semester=?");
		query.setString(0, course1);
		query.setInteger(1, Integer.parseInt(sem));
		
		List<Subject> subject=query.list();
		return subject;
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getthirdsubj(String course) {
		// TODO Auto-generated method stub
		String course1=course;
		String sem="3";
		Query query=sessionfactory.getCurrentSession().createQuery("FROM Subject WHERE course_name=? and semester=?");
		query.setString(0, course1);
		query.setInteger(1, Integer.parseInt(sem));
		
		List<Subject> subject=query.list();
		return subject;
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getfourthsubj(String course) {
		// TODO Auto-generated method stub
		String course1=course;
		String sem="4";
		Query query=sessionfactory.getCurrentSession().createQuery("FROM Subject WHERE course_name=? and semester=?");
		query.setString(0, course1);
		query.setInteger(1, Integer.parseInt(sem));
		
		List<Subject> subject=query.list();
		return subject;
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getfifthsubj(String course) {
		// TODO Auto-generated method stub
		String course1=course;
		String sem="5";
		Query query=sessionfactory.getCurrentSession().createQuery("FROM Subject WHERE course_name=? and semester=?");
		query.setString(0, course1);
		query.setInteger(1, Integer.parseInt(sem));
		
		List<Subject> subject=query.list();
		return subject;
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getsixthsubj(String course) {
		// TODO Auto-generated method stub
		String course1=course;
		String sem="6";
		Query query=sessionfactory.getCurrentSession().createQuery("FROM Subject WHERE course_name=? and semester=?");
		query.setString(0, course1);
		query.setInteger(1, Integer.parseInt(sem));
		
		List<Subject> subject=query.list();
		return subject;
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getseventhsubj(String course) {
		// TODO Auto-generated method stub
		String course1=course;
		String sem="7";
		Query query=sessionfactory.getCurrentSession().createQuery("FROM Subject WHERE course_name=? and semester=?");
		query.setString(0, course1);
		query.setInteger(1, Integer.parseInt(sem));
		
		List<Subject> subject=query.list();
		return subject;
	}

	@SuppressWarnings("unchecked")
	public List<Subject> geteighthsubj(String course) {
		// TODO Auto-generated method stub
		String course1=course;
		String sem="8";
		Query query=sessionfactory.getCurrentSession().createQuery("FROM Subject WHERE course_name=? and semester=?");
		query.setString(0, course1);
		query.setInteger(1, Integer.parseInt(sem));
		
		List<Subject> subject=query.list();
		return subject;
	}

/*	@SuppressWarnings("unchecked")
	public List<Subject> getfirstsubj() {
		// TODO Auto-generated method stub
		Criteria criteria=sessionfactory.getCurrentSession().createCriteria(Subject.class);
		criteria.add(Restrictions.le("semester", 2));
		List<Subject> subject=criteria.list();
		
		return subject;
	}
*/
}
