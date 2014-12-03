
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
import com.biz.adm.pojo.EditStudentData;
import com.biz.adm.service.CetInterface;
import com.biz.emp.prof.domain.PersonalInformationsPojo;
@Controller
public class CetApplicationRegisterController {
	
	@Autowired
	private CetInterface cetInterface ;
	
	@RequestMapping("/addLogin")

	public ModelAndView getLogin(@ModelAttribute("student") CetAddmissionPojo student,
			BindingResult result) 
	{
	  System.out.println("inside login ");
		return new ModelAndView("adm_Login");
	}
	
	@RequestMapping("/addCetapplicant")

	public ModelAndView getRegisterForm(@ModelAttribute("student") CetAddmissionPojo student,
			BindingResult result) 
	{
	  System.out.println("inside controller ");
		return new ModelAndView("adm_CET_Process");
	}

//Save

@RequestMapping("/saveCetApplicant")
public ModelAndView saveUserData(@ModelAttribute("student") CetAddmissionPojo student,
		BindingResult result) {
	cetInterface.addUser(student);
	System.out.println("Save User Data");
	
	 Map<String,Object> model = new HashMap<String, Object>();
	 
	 model.put("studentsapplicants", cetInterface.getStudent());
	 
	return new ModelAndView("adm_Success");
}


//display the values from database

	@RequestMapping("/CetStudentList")
	public ModelAndView CetStudentList() {
		System.out.println("CetStudentList");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("studentsapplicants", cetInterface.getStudent());
		ArrayList<CetAddmissionPojo> al=new ArrayList<CetAddmissionPojo>();
		Iterator itterator=al.iterator();
		while(itterator.hasNext())
		{
			System.out.println(itterator.next());
		}
		
		return new ModelAndView("adm_CETDetails", model);

	}
	

	
	/**
	 * @param editStudentData
	 * @param result
	 * @return
	 
	@RequestMapping(value = "/viewfulldata", method = RequestMethod.GET)
	 public ModelAndView viewCetApplicant(@ModelAttribute("student") EditStudentData editStudentData,
	 BindingResult result) {
	 Map<String, Object> model = new HashMap<String, Object>();
	 
	 System.out.println("studentid="+editStudentData.getId());

	 
	 CetAddmissionPojo  cetAddmissionPojo=new  CetAddmissionPojo();
	 cetAddmissionPojo=cetInterface.getStudent(editStudentData.getId());
	 
	 System.out.println(cetAddmissionPojo.getId());
	 System.out.println(cetAddmissionPojo.getFname());
	 
	
	 
	 System.out.println("check after array list");
	 //Applicant_Edit e2=new Applicant_Edit();
	 //e2=(Applicant_Edit)e1;
    model.put("studentsapplicants",cetAddmissionPojo);
    
    System.out.println("check after model");
	 
	 return new ModelAndView("adm_view_CETDetails", model); 
	 
	
	 	
	 } */
	
	@RequestMapping(value = "/sendmaildata", method = RequestMethod.GET)
	 public ModelAndView sendmail(@ModelAttribute("student") EditStudentData editStudentData,
	 BindingResult result) {
	 
	 Map<String, Object> model = new HashMap<String, Object>();
	 
	 System.out.println("studentid="+editStudentData.getId());
 	
	 CetAddmissionPojo  cetAddmissionPojo=new  CetAddmissionPojo();
	
	 cetAddmissionPojo=cetInterface.getStudent(editStudentData.getId());
	 
	 System.out.println(cetAddmissionPojo.getId());
	
	 System.out.println(cetAddmissionPojo.getMail());
	 
	 System.out.println("check after array list");
	
     model.put("studentsapplicants",cetAddmissionPojo);
   
     System.out.println("check after model");
	 
	 return new ModelAndView("adm_sendmail", model); 
	 
	
	 	
	 }
	
	

	//editing the values in jsp

		@RequestMapping(value = "/editStudentData", method = RequestMethod.GET)
		 public ModelAndView editApplicant(@ModelAttribute("student") EditStudentData editStudentData,
		 BindingResult result) {
		 Map<String, Object> model = new HashMap<String, Object>();
		 
		 System.out.println("studentid="+editStudentData.getId());

		 
		 CetAddmissionPojo  cetAddmissionPojo=new  CetAddmissionPojo();
		 cetAddmissionPojo=cetInterface.getStudent(editStudentData.getId());
		 
		 System.out.println(cetAddmissionPojo.getId());
		 System.out.println(cetAddmissionPojo.getFname());
		 
		
		 
		 System.out.println("check after array list");
		 //Applicant_Edit e2=new Applicant_Edit();
		 //e2=(Applicant_Edit)e1;
	     model.put("studentsapplicants",cetAddmissionPojo);
	     
	     System.out.println("check after model");
		 
		 return new ModelAndView("adm_EditData",model); 
		 
		
		 	
		 }
		
		//updating the values into database
		
		@RequestMapping(value = "/updateStudentApplicant", method = RequestMethod.GET)
		 public ModelAndView UpdateStudent(@ModelAttribute("applicant") CetAddmissionPojo editStudentData,BindingResult result) 
		{ 
		 Map<String, Object> model = new HashMap<String, Object>();
		 
		 System.out.println("applicant id ="+editStudentData.getId());
		 System.out.println("applicant first name="+editStudentData.getFname());
		  
		 cetInterface .updateApp(editStudentData);
		 
		 
		 model.put("studentsapplicants",cetInterface .getStudent());
			return new ModelAndView("adm_CETDetails", model);
		 }
		
		//deleting the rows in both jsp and database
		
		@RequestMapping("/deleteStudentData")
		public ModelAndView deleteApplicant(@ModelAttribute("command") CetAddmissionPojo student,
				BindingResult result) {
			System.out.println("Delete applicant id="+student.getId());
			
			cetInterface.deleteApplicant(student);
			
			System.out.println("Delete User Data");
				 Map<String,Object> model = new HashMap<String, Object>();
				
				 model.put("studentsapplicants", cetInterface.getStudent());
				 return new ModelAndView("adm_CETDetails", model);
				 }
		
		
		
		//to delete values from db	
		
		/**
		 * @param employee
		 * @param result
		 * @return
		 
		@RequestMapping("/deleteemployee")
		public ModelAndView deleteEmployeePersonal(@ModelAttribute("command") PersonalInformationsPojo employee,
				BindingResult result){
			System.out.println("Delete User Data"+employee.getId());
			
			personalInformationService.deleteEmployeePersonal(employee);
			System.out.println("Delete User Data");
				 Map<String,Object> model = new HashMap<String, Object>();
				// model.put("employee", null);
				 model.put("employees", personalInformationService.getPersInfList());
				 return new ModelAndView("emp_employeedetails", model);
		}*/
		
//fetch		
		
		@RequestMapping(value = "/fetchCet", method = RequestMethod.GET)
		 public ModelAndView fetchCet(@ModelAttribute("student") EditStudentData editStudentData,
		 BindingResult result) {
		 Map<String, Object> model = new HashMap<String, Object>();
		 
		 System.out.println("studentid="+editStudentData.getId());

		 
		 CetAddmissionPojo  cetAddmissionPojo=new  CetAddmissionPojo();
		 cetAddmissionPojo=cetInterface.fetchStudent(editStudentData.getId());
		 
		 System.out.println(cetAddmissionPojo.getId());
		 System.out.println(cetAddmissionPojo.getFname());
		 
		
		 
		 System.out.println("check after array list");
		 //Applicant_Edit e2=new Applicant_Edit();
		 //e2=(Applicant_Edit)e1;
	     model.put("studentsapplicants",cetAddmissionPojo);
	     
	     System.out.println("check after model");
		 
		 return new ModelAndView("adm_ViewCetDetails",model); 
		 
		
		 	
		 }


}