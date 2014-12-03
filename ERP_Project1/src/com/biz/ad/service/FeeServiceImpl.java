package com.biz.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.biz.ad.dao.FeeDao;
import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Fees;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class FeeServiceImpl implements FeeService {
	
	@Autowired
	private FeeDao Fee_dao;

	
	public void addFee(Fees fee) {
		// TODO Auto-generated method stub
		Fee_dao.addFee(fee);
		
	}

	
	public List<Fees> getFee() {
		// TODO Auto-generated method stub
		return Fee_dao.getFee();
	}

	
	public Fees getEachFees(int fee_id) {
		// TODO Auto-generated method stub
		return Fee_dao.getEachFees(fee_id);
	}

	
	public void updateFees(Fees fees) {
		// TODO Auto-generated method stub
		Fee_dao.updateFees(fees);
	}

	
	public void deleteFees(Fees object) {
		// TODO Auto-generated method stub
		Fee_dao.deleteFees(object);
	}

}
