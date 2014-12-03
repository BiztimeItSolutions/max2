package com.biz.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.biz.ad.dao.CourseDao;
import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Department;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao cour_dao; 

	
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		cour_dao.addCourse(course);
		
	}

	
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return cour_dao.getCourse();
	}

	
	public Course getEachCourse(int course_id) {
		// TODO Auto-generated method stub
		return cour_dao.getEachCourse(course_id);
	}

	
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		cour_dao.updateCourse(course);
	}

	
	public void deleteCourse(Course object) {
		// TODO Auto-generated method stub
		cour_dao.deleteCourse(object);
		
	}

	
	public List<Department> getdeptforgrad(String grad) {
		// TODO Auto-generated method stub
		return cour_dao.getdeptforgrad(grad);
	}



}
