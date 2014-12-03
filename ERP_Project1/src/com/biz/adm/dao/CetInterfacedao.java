package com.biz.adm.dao;

import java.util.List;


import com.biz.adm.pojo.CetAddmissionPojo;

public interface CetInterfacedao {
	
	public void saveUser ( CetAddmissionPojo student );
	//public List<Employee_personel> getUser();
	
	public List<CetAddmissionPojo> getStudent();
	
	public void  updateApp ( CetAddmissionPojo student );
   
	public void deleteApplicant(CetAddmissionPojo student);
	
	public List<CetAddmissionPojo> getStudentview();
}
