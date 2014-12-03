package com.biz.ad.dao;

import java.util.List;

import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Fees;

public interface FeeDao {
	
	public void addFee(Fees fee);
	
	public List<Fees> getFee();
	
	public Fees getEachFees(int fee_id);

	public void updateFees(Fees fees);
	
	public void deleteFees(Fees fees);

}
