package com.biz.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.biz.ad.dao.SubjectDao;
import com.biz.ad.pojo.Subject;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	private SubjectDao sub_dao;

	
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		sub_dao.addSubject(subject);
		
	}

	
	public List<Subject> getSubject() {
		// TODO Auto-generated method stub
		return sub_dao.getSubject();
	}

	
	public Subject getEachSubject(int subject_id) {
		// TODO Auto-generated method stub
		return sub_dao.getEachSubject(subject_id);
	}

	
	public void updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		sub_dao.updateSubject(subject);
		
	}

	
	public void deleteSubject(Subject object) {
		// TODO Auto-generated method stub
		sub_dao.deleteSubject(object);
	}

	
	//getSubj
	
	public List<Subject> getfirstsubj(String course) {
		// TODO Auto-generated method stub
		//return null;
		return sub_dao.getfirstsubj(course);
	}

	
	public List<Subject> getsecondsubj(String course) {
		// TODO Auto-generated method stub
		return sub_dao.getsecondsubj(course);
	}

	
	public List<Subject> getthirdsubj(String course) {
		// TODO Auto-generated method stub
		return sub_dao.getthirdsubj(course);
	}

	
	public List<Subject> getfourthsubj(String course) {
		// TODO Auto-generated method stub
		return sub_dao.getfourthsubj(course);
	}

	
	public List<Subject> getfifthsubj(String course) {
		// TODO Auto-generated method stub
		return sub_dao.getfifthsubj(course);
	}

	
	public List<Subject> getsixthsubj(String course) {
		// TODO Auto-generated method stub
		return sub_dao.getsixthsubj(course);
	}

	
	public List<Subject> getseventhsubj(String course) {
		// TODO Auto-generated method stub
		return sub_dao.getseventhsubj(course);
	}

	
	public List<Subject> geteighthsubj(String course) {
		// TODO Auto-generated method stub
		return sub_dao.geteighthsubj(course);
	}

	/*
	public List<Subject> getfirstsubj() {
		// TODO Auto-generated method stub
		return sub_dao.getfirstsubj();
	}*/

}
