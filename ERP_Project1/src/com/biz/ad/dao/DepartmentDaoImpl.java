package com.biz.ad.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.biz.ad.pojo.Department;


@Repository("DepartmentDao")
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(department);
		
	}

	
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Department> dept = sessionfactory.getCurrentSession().createCriteria(Department.class).list();
		System.out.println("Inside Dao");
		return dept;
	}

	
	public Department getEachDepartment(int dept_id) {
		// TODO Auto-generated method stub
		return  (Department) sessionfactory.getCurrentSession().get(Department.class, dept_id);
		
	}

	
	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  " +department.getDept_id());
		System.out.println("inside updatre DAO:  " +department.getDepartment_name());
		sessionfactory.getCurrentSession().update(department);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");

		
	}

	
	public void deleteDepartment(Department department) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().createQuery("DELETE FROM Department WHERE dept_id="+department.getDept_id()).executeUpdate();
	}

}
