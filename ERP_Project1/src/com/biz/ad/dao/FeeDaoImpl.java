package com.biz.ad.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Department;
import com.biz.ad.pojo.Fees;

@Repository("FeeDao")
public class FeeDaoImpl implements FeeDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	
	public void addFee(Fees fee) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(fee);
		
	}

	@SuppressWarnings("unchecked")
	public List<Fees> getFee() {
		// TODO Auto-generated method stub
		List<Fees> fee = sessionfactory.getCurrentSession().createCriteria(Fees.class).list();
		System.out.println("Inside Dao");
		return fee;
	}

	
	public Fees getEachFees(int fee_id) {
		// TODO Auto-generated method stub
		return (Fees) sessionfactory.getCurrentSession().get(Fees.class, fee_id);
		//return (Course) sessionfactory.getCurrentSession().get(Course.class, course_id);
	}

	
	public void updateFees(Fees fees) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().update(fees);
		sessionfactory.getCurrentSession().flush();
	}

	
	public void deleteFees(Fees fees) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().createQuery("DELETE FROM Fees WHERE fee_id="+fees.getFee_id()).executeUpdate();
		//sessionfactory.getCurrentSession().createQuery("DELETE FROM Course WHERE course_id="+course.getCourse_id()).executeUpdate();
	}

}
