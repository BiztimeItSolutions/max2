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

	@Override
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(department);
		
	}

	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Department> dept = sessionfactory.getCurrentSession().createCriteria(Department.class).list();
		return dept;
	}

	@Override
	public Department getEachDepartment(int dept_id) {
		// TODO Auto-generated method stub
		return  (Department) sessionfactory.getCurrentSession().get(Department.class, dept_id);
		
	}

	@Override
	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub
		System.out.println("inside updatre DAO:  " +department.getDept_id());
		System.out.println("inside updatre DAO:  " +department.getDepartmentt_name());
		sessionfactory.getCurrentSession().update(department);
		sessionfactory.getCurrentSession().flush();
		System.out.println("updated::::<>>>");

		
	}

	@Override
	public void deleteDepartment(Department department) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().createQuery("DELETE FROM Department WHERE dept_id="+department.getDept_id()).executeUpdate();
	}

}
