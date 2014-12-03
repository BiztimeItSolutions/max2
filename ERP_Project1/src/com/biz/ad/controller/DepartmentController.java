package com.biz.ad.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import com.biz.ad.pojo.Department;
import com.biz.ad.service.DepartmentService;


@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService dept_serv;
	
/*	@RequestMapping("/adduser")
	public ModelAndView getNam() 
	{
		
		return new ModelAndView("UserList");
	}	
*/
	@RequestMapping("/login")
	public ModelAndView Login() {
		
		return new ModelAndView("ad_login");
	}
	
	
	
/*	@RequestMapping("/logincheck")
	public String logincheck123(@RequestParam(username) String name, @RequestParam(password) String password, @RequestParam(role) String role, Model m) {
		
		if(name.equals("admin") && password.equals("admin"))
		{
			if(role.equals("admin"))
			{
				return "ad_index";				
			}
			else if(role.equals("student"))
			{
				return "ad_student";
			}	
		}
		else
		{
			m.addAttribute("msg","Login Failed!!! Check User name and password");
			return "ad_login";
		}
	}
*/		
		//return new ModelAndView("ad_index");
	@RequestMapping("/logincheck")
	public String logincheck(@RequestParam("username") String name, @RequestParam("password") String password, @RequestParam("role") String role, Model m)
	{
		if(name.equals("admin") && password.equals("admin"))
		{
			if(role.equals("admin"))
			{
				return "ad_index";				
			}
			else if(role.equals("student"))
			{
				return "ad_student";
			}
		}
		
		else
		{
			m.addAttribute("msg","Login Failed!!! Check User name and password");
			return "ad_login";
		}
		return null;
	}
		
		
	
		
	
	@RequestMapping("/ad_add_department")
	public ModelAndView getName2() {
		
		return new ModelAndView("ad_add_department");
	}
	
	
	//Save
	@RequestMapping("/save_department")
	public ModelAndView save_department(@ModelAttribute("department") Department department,
			BindingResult result) {
	
		dept_serv.addDepartment(department);	
		//return new ModelAndView("ad_index");
		
		//return new ModelAndView("ad_dept_added");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("msg", "Department Added Successfully");
		return new ModelAndView("ad_add_department", model);
	}
	
	
	//view
		@RequestMapping("/ad_department")
		public ModelAndView getDepartments() {
			
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("DEPT", dept_serv.getDepartment());
			
			return new ModelAndView("ad_department_new", model);
			//return new ModelAndView("ad_department");
		}

		
	//edit
	@RequestMapping("/editdept")
	public ModelAndView editDept(@ModelAttribute("department") Department department,
	 BindingResult result) {
		
	 Map<String, Object> model = new HashMap<String, Object>();
	 Department d=new Department();
	 d=dept_serv.getEachDepartment(department.getDept_id());
	 model.put("DEPT",d); 
	 return new ModelAndView("ad_edit_department", model); 
	
	 }
	
	//Update
		@RequestMapping(value = "/updatedept", method = RequestMethod.GET)
		public ModelAndView UpdateStud(@ModelAttribute("department")  Department department, BindingResult result)
		{
			dept_serv.updateDepartment(department);
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("DEPT", dept_serv.getDepartment());
			model.put("msg", "Department Updated Successfully");
			return new ModelAndView("ad_department_new", model);
		 //return new ModelAndView("ad_dept_updated");
		 }
		
		
	//Delete	 
		@RequestMapping("/deletedept")
		public ModelAndView deleteStud(@ModelAttribute("department")  Department department, BindingResult result)
		{
		 dept_serv.deleteDepartment(department);
		 //Map<String, Object> model = new HashMap<String, Object>();
		 //model.put("DEPT", dept_serv.getDepartment());
		 Map<String, Object> model = new HashMap<String, Object>();
			model.put("DEPT", dept_serv.getDepartment());
			model.put("msg1", "Department Deleted Successfully");
			return new ModelAndView("ad_department_new", model);
		// return new ModelAndView("ad_dept_deleted", model);
		}
	
}


