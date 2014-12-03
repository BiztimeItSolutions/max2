package com.biz.adm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.biz.adm.service.*;
import com.biz.adm.dao.Cetdao;

import com.biz.adm.pojo.CetAddmissionPojo;
import com.biz.adm.pojo.DisplayPojo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class CetFile implements CetInterface{
	
	@Autowired
	Cetdao cetdao;
	
	public void addUser(CetAddmissionPojo student) {
		// TODO Auto-generated method stub
		cetdao.saveUser(student);
		
	}
	
	
	public List<CetAddmissionPojo> getStudent() {
		// TODO Auto-generated method stub
		return cetdao.getStudent();
	}
	
	
	
	public CetAddmissionPojo getStudent(int id) {
		// TODO Auto-generated method stub
		 return cetdao.getId(id);
	}
	
	public void updateApp(CetAddmissionPojo student) {
		// TODO Auto-generated method stub
		cetdao.updateApp(student);	
}

	public void deleteApplicant(CetAddmissionPojo student)
	{
		System.out.println("inside service");
	        cetdao.deleteApplicant(student);
    }


	

	
	public List<CetAddmissionPojo> getStudentview() {
		// TODO Auto-generated method stub
		return cetdao.getStudentview();
	}


	
	public DisplayPojo getDisplay(String graduation) {
		// TODO Auto-generated method stub
		return null;
	}


	
	public CetAddmissionPojo fetchStudent(int id) {
		// TODO Auto-generated method stub
		 return cetdao.getId(id);
	}

	
		
	

}
	
