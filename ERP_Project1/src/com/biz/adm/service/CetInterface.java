package com.biz.adm.service;



import java.util.List;

import com.biz.adm.pojo.CetAddmissionPojo;
import com.biz.adm.pojo.DisplayPojo;

public interface CetInterface {
	// add student
	public void addUser(CetAddmissionPojo student);
	
	// Display
	
	public  List<CetAddmissionPojo> getStudent();
	
	// update
	
	public void updateApp(CetAddmissionPojo editStudentData);
	
	public CetAddmissionPojo  getStudent(int id);

	public void deleteApplicant(CetAddmissionPojo student);
	
	public List<CetAddmissionPojo> getStudentview();

	public DisplayPojo getDisplay(String graduation);

	public CetAddmissionPojo fetchStudent(int id);

	
	
}
