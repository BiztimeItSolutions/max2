package com.biz.emp.prof.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.biz.emp.prof.domain.EmployeePersonalDelete;
import com.biz.emp.prof.domain.PersonalInformationsPojo;
import com.biz.emp.prof.service.IPersonalInformationsService;



@Controller
public class PersonalInformationsController {

	@Autowired
	private IPersonalInformationsService personalInformationService;
	
	@RequestMapping("/employeeinformation")
	public ModelAndView Personal_Informations(@ModelAttribute("employee") PersonalInformationsPojo employee,
			BindingResult result)
	{
				System.out.println("inside mvc personal controller");
		return new ModelAndView("emp_Personal_Informations");
		
	}
		
	@RequestMapping("/PersonalInfo")
	public ModelAndView personalInformationsSave(@ModelAttribute("employee") PersonalInformationsPojo employee,
			                            BindingResult result){
		
		System.out.println("fromsave "+employee.getFirst_name());
		personalInformationService.personalInformationsAdd(employee);
		
		 Map<String,Object> model = new HashMap<String, Object>();
		 System.out.println("inside save controller");
		 
		 model.put("employees",personalInformationService.getPersInfList());
		 System.out.println("Save User Data");
				 return new ModelAndView("emp_Personal_Informations", model);
		
		//return new ModelAndView("PersonalInf");
		
	}
	
	@RequestMapping("/persoINFo")
	public ModelAndView getPersInf(){
		System.out.println("getuserlist1");
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("getuserlist2");
		model.put("employees", personalInformationService.getPersInfList());
		System.out.println("getuserlist3");
		ArrayList<PersonalInformationsPojo> al=new ArrayList<PersonalInformationsPojo>();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("getuserlist4");
		return new ModelAndView("emp_employeedetails", model);
	}
	
	@RequestMapping("/deleteemployee")
	public ModelAndView deleteEmployeePersonal(@ModelAttribute("command") PersonalInformationsPojo employee,
			BindingResult result){
		System.out.println("Delete User Data"+employee.getEmp_ID());
		
		personalInformationService.deleteEmployeePersonal(employee);
		System.out.println("Delete User Data");
			 Map<String,Object> model = new HashMap<String, Object>();
			// model.put("employee", null);
			 model.put("employees", personalInformationService.getPersInfList());
			 return new ModelAndView("emp_employeedetails", model);
	}
	
	
	
	@RequestMapping(value = "editemployee", method = RequestMethod.GET)
	 public ModelAndView editEmployeePersonal(@ModelAttribute("employee") EmployeePersonalDelete employeebean,
			 BindingResult result ){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebean.getEmp_ID());
		 
		 PersonalInformationsPojo employee1= new PersonalInformationsPojo();
		 System.out.println("che ");
		 employee1=personalInformationService.getEmployee(employeebean.getEmp_ID());
		 System.out.println("check ");
		 System.out.println(employeebean.getEmp_ID());
		 
		 System.out.println("check after array list");
		 model.put("employees",employee1);
		 System.out.println("check after model");
		 return new ModelAndView("emp_employeeedit", model);
	}
	
	
	@RequestMapping(value ="/updateemployee", method = RequestMethod.GET)
	public ModelAndView UpdateEmployee(@ModelAttribute("employee") PersonalInformationsPojo employeebeans,
			BindingResult result){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebeans.getEmp_ID());
		 personalInformationService.updateEmployeeInfo(employeebeans);
		 model.put("employees", personalInformationService.getPersInfList());
		 return new ModelAndView("emp_employeedetails", model);
	}
	
	
	
	/*private PersonalInformationsPojo prepareModel(EmployeePersonalDelete employeeperso){
		
		PersonalInformationsPojo employee1= new PersonalInformationsPojo();
		employee1.setEmp_ID(employeeperso.getEmp_ID());
		employee1.setFirst_name(employeeperso.getFirst_name());
		employee1.setMiddle_name(employeeperso.getMiddle_name());
		employee1.setLast_name(employeeperso.getLast_name());
		employee1.setGender(employeeperso.getGender());
		employee1.setAddress_line1(employeeperso.getAddress_line1());
		employee1.setAddress_line2(employeeperso.getAddress_line2());
		employee1.setCity(employeeperso.getCity());
		employee1.setState(employeeperso.getState());
		employee1.setCountry(employeeperso.getCountry());
		employee1.setPincode(employeeperso.getPincode());
		employee1.setEmail_ID(employeeperso.getEmail_ID());
		employee1.setPhone_number(employeeperso.getPhone_number());
		employee1.setDob(employeeperso.getDob());
		employee1.setBlood_group(employeeperso.getBlood_group());
		employee1.setMarital_status(employeeperso.getMarital_status());
		employee1.setCaste(employeeperso.getCaste());
		employee1.setNationality(employeeperso.getNationality());
		employee1.setId_number(employeeperso.getId_number());
		employee1.setPan_card_number(employeeperso.getPan_card_number());
		employee1.setPhoto(employeeperso.getPhoto());
		employee1.setParent_emp_id(employeeperso.getParent_emp_id());
		employee1.setUser_ID(employeeperso.getUser_ID());
		employee1.setPassword(employeeperso.getPassword());
		
		return employee1;
	}*/
}	
		/*    @RequestParam("first_name") String first_name,
								    @RequestParam("middle_name") String middle_name,
								    @RequestParam("last_name") String last_name,
								    @RequestParam("gender") String gender,
								    @RequestParam("address_line1") String address_line1,
								    @RequestParam("address_line2") String address_line2,
								    @RequestParam("city") String city,
								    @RequestParam("state") String state,
								    @RequestParam("country") String country,
								    @RequestParam("pincode") String pincode,
								    @RequestParam("email_ID") String email_ID,
								    @RequestParam("phone_number") String phone_number,
								    @RequestParam("dob") String dob,
								    @RequestParam("blood_group") String blood_group,
								    @RequestParam("marital_status") String marital_status,
								    @RequestParam("caste") String caste,
								    @RequestParam("nationality") String nationality,
								    @RequestParam("id_number") String id_number,
								    @RequestParam("pan_card_number") String pan_card_number,
								    @RequestParam("photo") String photo,
								    @RequestParam("parent_emp_id") String parent_emp_id,
								    @RequestParam("user_ID") String user_ID,
								    @RequestParam("password") String password)*/
								   
	
	/*@RequestMapping("/personal_information.do")
	public String Personal_Informations(@ModelAttribute("Personal_InformationsPojo") Personal_InformationsPojo employee)
	
	{
		System.out.println("inside controller");
		try
		{
		
			System.out.println("inside controller try");
			
		//	Personal_InformationsPojo d=new Personal_InformationsPojo();
			Personal_InformationsDao dd=new Personal_InformationsDao();*/
		
	/*	System.out.println("inside controller");
		try
		{
			System.out.println("h1");
			
			//ArrayList<Object> al = new ArrayList<Object>();
		//	al = dd.selectData();
			
			PersonalInformationsPojo d=new PersonalInformationsPojo();
			PersonalInformationsDao dd=new PersonalInformationsDao();
			
		/*	d.setEmp_ID(emp_ID);
			d.setFirst_name(first_name);
			d.setMiddle_name(middle_name);
			d.setLast_name(last_name);
			d.setGender(gender);
			d.setAddress_line1(address_line1);
			d.setAddress_line2(address_line2);
			d.setCity(city);
			d.setState(state);
			d.setCountry(country);
			d.setPincode(pincode);
			d.setEmail_ID(email_ID);
			d.setPhone_number(phone_number);
			d.setDob(dob);
			d.setBlood_group(blood_group);
			d.setMarital_status(marital_status);
			d.setCaste(caste);
			d.setNationality(nationality);
			d.setId_number(id_number);
			d.setPan_card_number(pan_card_number);
			d.setParent_emp_id(parent_emp_id);
			d.setPhoto(photo);
			d.setUser_ID(user_ID);
			d.setPassword(password);
			
			
			dd.insertValues(d);*/
			
		/*	dd.insertValues(personalInformationsPojo);
			System.out.println("h2");
			//dd.insertValues(employee);
			System.out.println("h3");
			
			
		}
	
		catch (SQLException e) 
		{     
			System.out.println(""+ e.getMessage());  
			
		}
		
	    finally
		{
	    	System.out.println("done");
		}

		System.out.println("h4");
                        
                        return "Education_Details.jsp";
                        
		}*/
	



	