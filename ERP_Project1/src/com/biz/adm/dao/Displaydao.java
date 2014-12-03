package com.biz.adm.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.biz.adm.pojo.CetAddmissionPojo;
import com.biz.adm.pojo.DisplayPojo;

public class Displaydao {
	
	@Autowired
	private SessionFactory sessionfactory;
	public DisplayPojo getId(int id) {
		// TODO Auto-generated method stub
		
		 return  (DisplayPojo) sessionfactory.getCurrentSession().get(DisplayPojo.class, id);
	}
	

}
