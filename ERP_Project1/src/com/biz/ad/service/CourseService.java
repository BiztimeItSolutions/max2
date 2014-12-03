package com.biz.ad.service;

import java.util.List;

import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Department;


public interface CourseService {

	public void addCourse(Course course);
	
	public List<Course> getCourse();
	
	public Course getEachCourse(int course_id);

	public void updateCourse(Course course);
	
	public void deleteCourse(Course object);
	
	public List<Department> getdeptforgrad(String grad); 

}
