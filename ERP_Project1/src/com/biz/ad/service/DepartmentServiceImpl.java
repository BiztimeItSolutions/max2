package com.biz.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.biz.ad.dao.DepartmentDao;
import com.biz.ad.pojo.Department;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentDao dept_dao;
	

	
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		dept_dao.addDepartment(department);
		
	}

	
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		System.out.println("Inside Service");
		return dept_dao.getDepartment();
		
	}

	
	public Department getEachDepartment(int dept_id) {
		// TODO Auto-generated method stub
		return dept_dao.getEachDepartment(dept_id);
	}

	
	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub
		dept_dao.updateDepartment(department);
	}

	
	public void deleteDepartment(Department department) {
		// TODO Auto-generated method stub
		dept_dao.deleteDepartment(department);
	}

}
