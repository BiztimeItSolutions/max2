package com.biz.ad.dao;

import java.util.List;

import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Department;

public interface CourseDao {
	
	public void addCourse(Course course);
	
	public List<Course> getCourse();
	
	public Course getEachCourse(int course_id);

	public void updateCourse(Course course);
	
	public void deleteCourse(Course course);
	
	public List<Department> getdeptforgrad(String grad); 



}
