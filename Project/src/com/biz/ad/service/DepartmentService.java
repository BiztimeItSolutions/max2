package com.biz.ad.service;

import java.util.List;

import com.biz.ad.pojo.Department;



public interface DepartmentService {
	
	public void addDepartment(Department department);
	
	public List<Department> getDepartment();
	
	public Department getEachDepartment(int dept_id);

	public void updateDepartment(Department Department);

	//public void deleteApplicant(Object object);
	
	public void deleteDepartment(Department object);


}
