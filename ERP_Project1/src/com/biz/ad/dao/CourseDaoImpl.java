package com.biz.ad.dao;

import java.util.List;


import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Department;



@Repository("CourseDao")
public class CourseDaoImpl implements CourseDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(course);
	}

	
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Course> course = sessionfactory.getCurrentSession().createCriteria(Course.class).list();
		System.out.println("Inside Dao");
		return course;
	
	}

	
	public Course getEachCourse(int course_id) {
		// TODO Auto-generated method stub
		System.out.println("inside each course");
		return (Course) sessionfactory.getCurrentSession().get(Course.class, course_id);
	}

	
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().update(course);
		sessionfactory.getCurrentSession().flush();
	}

	
	public void deleteCourse(Course course) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().createQuery("DELETE FROM Course WHERE course_id="+course.getCourse_id()).executeUpdate();	
	}

	
	public List<Department> getdeptforgrad(String grad) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("unchecked")
		//System.out.println("Inside dao impl"+grad);
		//List<Department> department=sessionfactory.getCurrentSession().createCriteria(Department.class);
		//Criteria criteria=sessionfactory.getCurrentSession().createCriteria(Department.class);
		//criteria.add(Restrictions.eq("graduation", "grad"));
		//List<Department> department=(List<Department>)criteria.list();
		
		//for(Department d:department)
			//System.out.println(1);
			//System.out.println(d.getDepartment_name());
		//return department;
		return null;
		
		
	}

	}
