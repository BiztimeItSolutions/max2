package com.biz.adm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.servlet.ModelAndView;
import com.biz.adm.pojo.CetAddmissionPojo;
import com.biz.adm.pojo.DisplayPojo;
import com.biz.adm.pojo.EditStudentData;
import com.biz.adm.service.CetInterface;
@Controller
public class DisplayController {
	
	@Autowired
	private CetInterface DisplayInterface ;
	
	@RequestMapping("/addDisplay")

	public ModelAndView getRegisterForm(@ModelAttribute("display") DisplayPojo display,
			BindingResult result) 
	{
	  System.out.println("inside controller ");
		return new ModelAndView("Display");
	}
	
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	 public ModelAndView sendmail(@ModelAttribute("display") DisplayPojo displayPojo,
	 BindingResult result) {
	 
	 Map<String, Object> model = new HashMap<String, Object>();
	 
	// System.out.println("studentid="+editStudentData.getId());
	
	// DisplayPojo displayPojo=new   DisplayPojo ();
	
	displayPojo=DisplayInterface.getDisplay(displayPojo.getGraduation());
	 
	 System.out.println(displayPojo.getGraduation());
	
	// System.out.println(cetAddmissionPojo.getMail());
	 
	 System.out.println("check after array list");
	
    model.put("studentsapplicants",displayPojo);
  
    System.out.println("check after model");
	 
	 return new ModelAndView("dispaly", model); 
	 
	
	 	
	 }
	
}