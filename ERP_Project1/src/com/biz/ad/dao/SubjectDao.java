package com.biz.ad.dao;

import java.util.List;

import com.biz.ad.pojo.Subject;

public interface SubjectDao {
	
	public void addSubject(Subject subject);
	
	public List<Subject> getSubject();
	
	public Subject getEachSubject(int subject_id);

	public void updateSubject(Subject subject);
	
	public void deleteSubject(Subject object);
	
	//getSubject
	
	public List<Subject> getfirstsubj(String course);
	//public List<Subject> getfirstsubj();
	
	public List<Subject> getsecondsubj(String course);
	
	public List<Subject> getthirdsubj(String course);
	
	public List<Subject> getfourthsubj(String course);
	
	public List<Subject> getfifthsubj(String course);
	
	public List<Subject> getsixthsubj(String course);
	
	public List<Subject> getseventhsubj(String course);
	
	public List<Subject> geteighthsubj(String course);
	



}
