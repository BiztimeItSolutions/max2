package com.biz.emp.prof.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.biz.emp.prof.domain.AccountsDetailsPojo;
import com.biz.emp.prof.domain.DesignationDetailsPojo;
import com.biz.emp.prof.domain.EducationDetailsPojo;
import com.biz.emp.prof.domain.EmpidCreationPojo;
import com.biz.emp.prof.domain.EmployeeAccountsEdit;
import com.biz.emp.prof.domain.EmployeeDesignationEdit;
import com.biz.emp.prof.domain.EmployeeEducationEdit;
import com.biz.emp.prof.domain.EmployeePersonalEdit;
import com.biz.emp.prof.domain.EmployeeWorkExperienceEdit;
import com.biz.emp.prof.domain.PersonalInformationsPojo;
import com.biz.emp.prof.domain.WorkExperienceDetailsPojo;
import com.biz.emp.prof.service.IPersonalInformationsService;



@Controller
@SessionAttributes("emp_ID")
public class PersonalInformationsController {

	@Autowired
	private IPersonalInformationsService personalInformationService;
	
	
	//empid creation
	@RequestMapping("/empidcreation")
	public ModelAndView empidCreation(@ModelAttribute("employee") EmpidCreationPojo employee,
			                            BindingResult result){
		
		return new ModelAndView("emp_EmployeeID_Creation");
	}
	
		@RequestMapping("/employeeidcreation")
		public ModelAndView empidCreationSave(@ModelAttribute("employee") EmpidCreationPojo employee,
				                            BindingResult result){
			
		System.out.println("fromsave "+employee.getEmp_ID());
		personalInformationService.empidCreationAdd(employee);
			
			/* Map<String,Object> model = new HashMap<String, Object>();
			 System.out.println("inside save controller");
			 
			 model.put("employees",personalInformationService.getPersInfList());
			 
			 System.out.println("Save User Data");*/
		//	 ModelAndView model1=new ModelAndView();
		// model1.addObject("emp_ID", employee.getEmp_ID());
			 
					//return new ModelAndView("emp_Education_Details",model);
		//	model1.setViewName("emp_Education_Details");
			 ModelAndView modelAndView = new ModelAndView();
		        modelAndView.addObject("emp_ID", employee.getValue());
		        modelAndView.setViewName("emp_Personal_Informations");
		        return modelAndView;
			//return new ModelAndView(model1);
			
		}
	
	
	@RequestMapping("/employeeinformation")
	public ModelAndView Personal_Informations(@ModelAttribute("employee") PersonalInformationsPojo employee,
			BindingResult result)
	{
				System.out.println("inside mvc personal controller");
		return new ModelAndView("emp_Personal_Informations");
		
	}
	
	@RequestMapping("/gotoeducation")
	public ModelAndView EduDetails(@ModelAttribute("employee") EducationDetailsPojo employee,
			BindingResult result)
	{
		
				System.out.println("inside mvc personal controller2");
		return new ModelAndView("emp_Education_Details");
		
	}
	
	@RequestMapping("/gotodesignation")
	public ModelAndView EduDetails(@ModelAttribute("employee") DesignationDetailsPojo employee,
			BindingResult result)
	{
		
				System.out.println("inside mvc personal controller2");
		return new ModelAndView("emp_Designation_Details");
		
	}
	
	@RequestMapping("/gotosuccess")
	public ModelAndView Success(@ModelAttribute("employee") PersonalInformationsPojo employee,
			BindingResult result)
	{
				System.out.println("inside mvc personal controller");
		return new ModelAndView("emp_Success");
		
	}
	
	
	
	
	//inserting 	
	@RequestMapping("/PersonalInfo")
	public ModelAndView personalInformationsSave(@ModelAttribute("employee") PersonalInformationsPojo employee,
			                            BindingResult result){
		
	System.out.println("fromsave "+employee.getFirst_name());
		personalInformationService.personalInformationsAdd(employee);
		
		/* Map<String,Object> model = new HashMap<String, Object>();
		 System.out.println("inside save controller");
		 
		 model.put("employees",personalInformationService.getPersInfList());
		 
		 System.out.println("Save User Data");*/
	//	 ModelAndView model1=new ModelAndView();
	// model1.addObject("emp_ID", employee.getEmp_ID());
		 
				//return new ModelAndView("emp_Education_Details",model);
	//	model1.setViewName("emp_Education_Details");
		 ModelAndView modelAndView = new ModelAndView();
	        modelAndView.addObject("emp_ID", employee.getEmp_ID());
	        modelAndView.setViewName("emp_Education_Details");
	        return modelAndView;
		//return new ModelAndView(model1);
		
	}
	
/*	@RequestMapping("/PersonalInfo")
	public ModelAndView personalInformationsSave(@RequestParam String emp_ID){
		 ModelAndView modelAndView = new ModelAndView();
	        modelAndView.addObject("emp_ID", emp_ID);
	        modelAndView.setViewName("emp_Education_Details");
	        return modelAndView;
	}*/
	
	
	@RequestMapping("EducationInfo")
	public ModelAndView educationDetailsSave(@ModelAttribute("employee") EducationDetailsPojo employee,
            BindingResult result){

System.out.println("from save id: "+employee.getEmp_ID());
personalInformationService.educationDetailsAdd(employee);

/*Map<String,Object> model = new HashMap<String, Object>();
System.out.println("inside save controller for edu");

model.put("employees",personalInformationService.getEduInfList());
System.out.println("Save User Data");*/

ModelAndView modelAndView = new ModelAndView();
modelAndView.addObject("emp_ID", employee.getEmp_ID());
modelAndView.setViewName("emp_Designation_Details");
return modelAndView;
//return new ModelAndView("emp_Education_Details", model);

//return new ModelAndView("PersonalInf");

}

	
	@RequestMapping("DesignationInfo")
	public ModelAndView designationDetailsSave(@ModelAttribute("employee") DesignationDetailsPojo employee,
            BindingResult result){

System.out.println("from save id: "+employee.getEmp_ID());
personalInformationService.designationDetailsAdd(employee);


ModelAndView modelAndView = new ModelAndView();
modelAndView.addObject("emp_ID", employee.getEmp_ID());
modelAndView.setViewName("emp_Work_Experience_Details");
return modelAndView;
//return new ModelAndView("emp_Education_Details", model);

//return new ModelAndView("PersonalInf");

}
	@RequestMapping("WorkExperienceInfo")
	public ModelAndView workexperienceDetailsSave(@ModelAttribute("employee") WorkExperienceDetailsPojo employee,
            BindingResult result){

System.out.println("from save id: "+employee.getEmp_ID());
personalInformationService.workexperienceDetailsAdd(employee);


ModelAndView modelAndView = new ModelAndView();
modelAndView.addObject("emp_ID", employee.getEmp_ID());
modelAndView.setViewName("emp_Accounts_Details");
return modelAndView;
//return new ModelAndView("emp_Education_Details", model);

//return new ModelAndView("PersonalInf");

}

	@RequestMapping("AccountsInfo")
	public ModelAndView accountsDetailsSave(@ModelAttribute("employee") AccountsDetailsPojo employee,
            BindingResult result){

System.out.println("from save id: "+employee.getEmp_ID());
personalInformationService.accountsDetailsAdd(employee);

System.out.println("going to mvc");
ModelAndView modelAndView = new ModelAndView();
modelAndView.addObject("emp_ID", employee.getEmp_ID());
modelAndView.setViewName("emp_Success");
return modelAndView;
//return new ModelAndView("emp_Education_Details", model);

//return new ModelAndView("PersonalInf");

}
	
	
	
	
//to view the inserted values	
	
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
	
@RequestMapping("/eduINFo")
	public ModelAndView getEduInf(){
		System.out.println("getuserlist1");
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("getuserlist2");
		model.put("employees", personalInformationService.getEduInfList());
		System.out.println("getuserlist3");
		ArrayList<EducationDetailsPojo> al=new ArrayList<EducationDetailsPojo>();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("getuserlist4");
		return new ModelAndView("emp_employeedetailsedu", model);
	}

	
@RequestMapping("/desigINFo")
public ModelAndView getDesigInf(){
	System.out.println("getuserlist1");
Map<String, Object> model = new HashMap<String, Object>();
	System.out.println("getuserlist2");
	model.put("employees", personalInformationService.getDesigInfList());
	System.out.println("getuserlist3");
	ArrayList<DesignationDetailsPojo> al=new ArrayList<DesignationDetailsPojo>();
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("getuserlist4");
	return new ModelAndView("emp_employeedetailsdesig", model);
}

@RequestMapping("/workexpINFo")
public ModelAndView getWorkExpInf(){
	System.out.println("getuserlist1");
Map<String, Object> model = new HashMap<String, Object>();
	System.out.println("getuserlist2");
	model.put("employees", personalInformationService.getWorkExpInfList());
	System.out.println("getuserlist3");
	ArrayList<WorkExperienceDetailsPojo> al=new ArrayList<WorkExperienceDetailsPojo>();
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("getuserlist4");
	return new ModelAndView("emp_employeedetailsworkexp", model);
}

@RequestMapping("/acntINFo")
public ModelAndView getAcntInf(){
	System.out.println("getuserlist1");
Map<String, Object> model = new HashMap<String, Object>();
	System.out.println("getuserlist2");
	model.put("employees", personalInformationService.getAcntInfList());
	System.out.println("getuserlist3");
	ArrayList<AccountsDetailsPojo> al=new ArrayList<AccountsDetailsPojo>();
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("getuserlist4");
	return new ModelAndView("emp_employeedetailsacnt", model);
}
	
	
//to delete values from db	
	
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
	}
	
	@RequestMapping("/deleteemployeeedu")
	public ModelAndView deleteEmployeeEducation(@ModelAttribute("command") EducationDetailsPojo employee,
			BindingResult result){
		System.out.println("Delete User Data"+employee.getId());
		
		personalInformationService.deleteEmployeeEducation(employee);
		System.out.println("Delete User Data");
			 Map<String,Object> model = new HashMap<String, Object>();
			// model.put("employee", null);
			 model.put("employees", personalInformationService.getEduInfList());
			 return new ModelAndView("emp_employeedetailsedu", model);
	}
	
	
	@RequestMapping("/deleteemployeedesig")
	public ModelAndView deleteEmployeeDesignation(@ModelAttribute("command") DesignationDetailsPojo employee,
			BindingResult result){
		System.out.println("Delete User Data"+employee.getId());
		
		personalInformationService.deleteEmployeeDesignation(employee);
		System.out.println("Delete User Data");
			 Map<String,Object> model = new HashMap<String, Object>();
			// model.put("employee", null);
			 model.put("employees", personalInformationService.getDesigInfList());
			 return new ModelAndView("emp_employeedetailsdesig", model);
	}
	
	
	@RequestMapping("/deleteemployeeworkexp")
	public ModelAndView deleteEmployeeworkExperience(@ModelAttribute("command") WorkExperienceDetailsPojo employee,
			BindingResult result){
		System.out.println("Delete User Data"+employee.getId());
		
		personalInformationService.deleteEmployeeWorkExperience(employee);
		System.out.println("Delete User Data");
			 Map<String,Object> model = new HashMap<String, Object>();
			// model.put("employee", null);
			 model.put("employees", personalInformationService.getWorkExpInfList());
			 return new ModelAndView("emp_employeedetailsworkexp", model);
	}
	
	
	@RequestMapping("/deleteemployeeacnt")
	public ModelAndView deleteEmployeeaccount(@ModelAttribute("command") AccountsDetailsPojo employee,
			BindingResult result){
		System.out.println("Delete User Data"+employee.getId());
		
		personalInformationService.deleteEmployeeAccount(employee);
		System.out.println("Delete User Data");
			 Map<String,Object> model = new HashMap<String, Object>();
			// model.put("employee", null);
			 model.put("employees", personalInformationService.getAcntInfList());
			 return new ModelAndView("emp_employeedetailsacnt", model);
	}
	
	
	
//to edit
	
	@RequestMapping(value = "editemployee", method = RequestMethod.GET)
	 public ModelAndView editEmployeePersonal(@ModelAttribute("employee") EmployeePersonalEdit employeebean,
			 BindingResult result ){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebean.getId());
		 
		 PersonalInformationsPojo employee1= new PersonalInformationsPojo();
		 System.out.println("che ");
		 employee1=personalInformationService.getEmployee(employeebean.getId());
		 System.out.println("check ");
		 System.out.println(employeebean.getId());
		 
		 System.out.println("check after array list");
		 model.put("employees",employee1);
		 System.out.println("check after model");
		 return new ModelAndView("emp_employeeedit", model);
	}
	
	
	@RequestMapping(value ="/updateemployee", method = RequestMethod.GET)
	public ModelAndView UpdateEmployee(@ModelAttribute("employee") PersonalInformationsPojo employeebeans,
			BindingResult result){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebeans.getId());
		 personalInformationService.updateEmployeeInfo(employeebeans);
		 model.put("employees", personalInformationService.getPersInfList());
		 return new ModelAndView("emp_employeedetails", model);
	}
	
	
	
	@RequestMapping(value = "editemployeeedu", method = RequestMethod.GET)
	 public ModelAndView editEmployeeEducation(@ModelAttribute("employee") EmployeeEducationEdit employeebean,
			 BindingResult result ){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebean.getId());
		 
		 EducationDetailsPojo employee1= new EducationDetailsPojo();
		 System.out.println("che ");
		 employee1=personalInformationService.getEmployeeEdu(employeebean.getId());
		 System.out.println("check ");
		 System.out.println(employeebean.getId());
		 
		 System.out.println("check after array list");
		 model.put("employees",employee1);
		 System.out.println("check after model");
		 return new ModelAndView("emp_employeeedit_edu", model);
	}
	
	
	@RequestMapping(value ="/updateemployeeedu", method = RequestMethod.GET)
	public ModelAndView UpdateEmployee(@ModelAttribute("employee") EducationDetailsPojo employeebeans,
			BindingResult result){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebeans.getId());
		 personalInformationService.updateEmployeeEdu(employeebeans);
		 model.put("employees", personalInformationService.getEduInfList());
		 return new ModelAndView("emp_employeedetailsedu", model);
	}
	
	
	
	
	
	@RequestMapping(value = "editemployeedesig", method = RequestMethod.GET)
	 public ModelAndView editDesignation(@ModelAttribute("employee") EmployeeDesignationEdit employeebean,
			 BindingResult result ){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebean.getId());
		 
		 DesignationDetailsPojo employee1= new DesignationDetailsPojo();
		 System.out.println("che ");
		 employee1=personalInformationService.getEmployeeDesig(employeebean.getId());
		 System.out.println("check ");
		 System.out.println(employeebean.getId());
		 
		 System.out.println("check after array list");
		 model.put("employees",employee1);
		 System.out.println("check after model");
		 return new ModelAndView("emp_employeeedit_desig", model);
	}
	
	
	@RequestMapping(value ="/updateemployeedesig", method = RequestMethod.GET)
	public ModelAndView UpdateEmployeeDesig(@ModelAttribute("employee") DesignationDetailsPojo employeebeans,
			BindingResult result){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebeans.getId());
		 personalInformationService.updateEmployeeDesig(employeebeans);
		 model.put("employees", personalInformationService.getDesigInfList());
		 return new ModelAndView("emp_employeedetailsdesig", model);
	}
	
	
	
	@RequestMapping(value = "editemployeeworkexp", method = RequestMethod.GET)
	 public ModelAndView editEmployeeWorkExperience(@ModelAttribute("employee") EmployeeWorkExperienceEdit employeebean,
			 BindingResult result ){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebean.getId());
		 
		 WorkExperienceDetailsPojo employee1= new WorkExperienceDetailsPojo();
		 System.out.println("che ");
		 employee1=personalInformationService.getEmployeeWorkExp(employeebean.getId());
		 System.out.println("check ");
		 System.out.println(employeebean.getId());
		 
		 System.out.println("check after array list");
		 model.put("employees",employee1);
		 System.out.println("check after model");
		 return new ModelAndView("emp_employeeedit_workexp", model);
	}
	
	
	@RequestMapping(value ="/updateemployeeworkexp", method = RequestMethod.GET)
	public ModelAndView UpdateEmployeeWorkExp(@ModelAttribute("employee") WorkExperienceDetailsPojo employeebeans,
			BindingResult result){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebeans.getId());
		 personalInformationService.updateEmployeeWorkExp(employeebeans);
		 model.put("employees", personalInformationService.getWorkExpInfList());
		 return new ModelAndView("emp_employeedetailsworkexp", model);
	}
	
	
	
	@RequestMapping(value = "editemployeeacnt", method = RequestMethod.GET)
	 public ModelAndView editEmployeeAccount(@ModelAttribute("employee") EmployeeAccountsEdit employeebean,
			 BindingResult result ){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebean.getId());
		 
		 AccountsDetailsPojo employee1= new AccountsDetailsPojo();
		 System.out.println("che ");
		 employee1=personalInformationService.getEmployeeAcnt(employeebean.getId());
		 System.out.println("check ");
		 System.out.println(employeebean.getId());
		 
		 System.out.println("check after array list");
		 model.put("employees",employee1);
		 System.out.println("check after model");
		 return new ModelAndView("emp_employeeedit_acnt", model);
	}
	
	
	@RequestMapping(value ="/updateemployeeacnt", method = RequestMethod.GET)
	public ModelAndView UpdateEmployeeAccount(@ModelAttribute("employee") AccountsDetailsPojo employeebeans,
			BindingResult result){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebeans.getId());
		 personalInformationService.updateEmployeeAccount(employeebeans);
		 model.put("employees", personalInformationService.getAcntInfList());
		 return new ModelAndView("emp_employeedetailsacnt", model);
	}

	
	// fetch
	
	
	@RequestMapping(value = "fetchemployee", method = RequestMethod.GET)
	 public ModelAndView fetch(@ModelAttribute("employee") EmployeePersonalEdit employeebean,
			 BindingResult result ){
		 Map<String, Object> model = new HashMap<String, Object>();
		 System.out.println("edit employee data="+employeebean.getId());
		 
		 PersonalInformationsPojo employee1= new PersonalInformationsPojo();
		 System.out.println("che ");
		 employee1=personalInformationService.getFetchEmployee(employeebean.getId());
		 System.out.println("check ");
		 System.out.println(employeebean.getId());
		 
		 System.out.println("check after array list");
		 model.put("employees",employee1);
		 System.out.println("check after model");
		 return new ModelAndView("emp_employeeFetch", model);
	}
	
}
	


	