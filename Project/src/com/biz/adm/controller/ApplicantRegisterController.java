package com.biz.adm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.biz.adm.pojo.Applicant_Edit;
import com.biz.adm.pojo.Applicant_Register;
import com.biz.adm.service.Applicant_Register_Service;

@Controller
public class ApplicantRegisterController {
	@Autowired
	private Applicant_Register_Service applicantService;
	
	
	@RequestMapping("/adduser")
	public ModelAndView getName(@ModelAttribute("applicant") Applicant_Register applicant,
			BindingResult result) {
		
		return new ModelAndView("UserList");
	}

	
	
	//adding values 
	
	@RequestMapping("/addapplicant")
	public ModelAndView getRegisterForm(@ModelAttribute("applicant") Applicant_Register applicant,
			BindingResult result) {
		
		return new ModelAndView("adm_OnlineApplicationForm");
	}

	//saving the values into database
	
	@RequestMapping("/saveApplicant")
	public ModelAndView saveUserData(@ModelAttribute("applicant")  Applicant_Register applicant,
			BindingResult result) {
		applicantService.addUser(applicant);
		System.out.println("Save User Data");
		
        Map<String,Object> model = new HashMap<String, Object>();
		 
		 model.put("applicants", applicantService.getUser());
		
		return new ModelAndView("adm_OnlineApplicationForm");
	}	
	
	//display the values from database

	@RequestMapping("/applicantList")
	public ModelAndView getUserList() {
		System.out.println("getuserlist");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("applicants", applicantService.getUser());
		ArrayList<Applicant_Register> al=new ArrayList<Applicant_Register>();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		return new ModelAndView("adm_Shortlisted_Applicant", model);

	}

//editing the values in jsp

	@RequestMapping(value = "/editApplicant", method = RequestMethod.GET)
	 public ModelAndView editApplicant(@ModelAttribute("applicant") Applicant_Edit applicantBean,
	 BindingResult result) {
	 Map<String, Object> model = new HashMap<String, Object>();
	 
	 System.out.println("applicant id="+applicantBean.getApplicant_ID());

	 
	 Applicant_Register e1=new Applicant_Register();
	 e1=applicantService.getApplicant(applicantBean.getApplicant_ID());
	 
	 System.out.println(e1.getApplicant_ID());
	 System.out.println(e1.getFirst_Name());
	 
	
	 
	 System.out.println("check after array list");
	 //Applicant_Edit e2=new Applicant_Edit();
	 //e2=(Applicant_Edit)e1;
     model.put("applicants",e1);
     
     System.out.println("check after model");
	 
	 return new ModelAndView("adm_Edit", model); 
	 
	
	 	
	 }
	
	
	
	//updating the values into database
	
	@RequestMapping(value = "/updateApplicant", method = RequestMethod.GET)
	 public ModelAndView UpdateEmployee(@ModelAttribute("applicant") Applicant_Register applicantBean,BindingResult result) 
	{
	 Map<String, Object> model = new HashMap<String, Object>();
	 
	 System.out.println("applicant id ="+applicantBean.getApplicant_ID());
	 System.out.println("applicant first name="+applicantBean.getFirst_Name());
	  
	 applicantService.updateApp(applicantBean);
	 
	 
	 model.put("applicants",applicantService.getUser());
		return new ModelAndView("adm_Shortlisted_Applicant", model);
	 }
	
	
	//deleting the rows in both jsp and database
	
	@RequestMapping("/delete")
	public ModelAndView deleteApplicant(@ModelAttribute("command") Applicant_Register applicant,
			BindingResult result) {
		System.out.println("Delete applicant id="+applicant.getApplicant_ID());
		
		applicantService.deleteApplicant(applicant);
		
		System.out.println("Delete User Data");
			 Map<String,Object> model = new HashMap<String, Object>();
			
			 model.put("applicants", applicantService.getUser());
			 return new ModelAndView("adm_Shortlisted_Applicant", model);
			 }

	
}
