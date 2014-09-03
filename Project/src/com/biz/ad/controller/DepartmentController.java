package com.biz.ad.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ad.pojo.Department;
import com.biz.ad.service.DepartmentService;




@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService dept_serv;
	
	
	@RequestMapping("/indexnew")
	public ModelAndView getName() {
		
		return new ModelAndView("ad_index");
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
		return new ModelAndView("ad_index");
	}
	
	
	//view
		@RequestMapping("/ad_department")
		public ModelAndView getDepartments() {
			
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("DEPT", dept_serv.getDepartment());
			return new ModelAndView("ad_department", model);
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
		 Map<String, Object> model = new HashMap<String, Object>();
		 dept_serv.updateDepartment(department);
		 model.put("DEPT", dept_serv.getDepartment());
		 return new ModelAndView("ad_department", model);
		 }
		
		
	//Delete	 
		@RequestMapping("/deletedept")
		public ModelAndView deleteStud(@ModelAttribute("department")  Department department, BindingResult result)
		{
		 dept_serv.deleteDepartment(department);
		 Map<String, Object> model = new HashMap<String, Object>();
		 model.put("DEPT", dept_serv.getDepartment());
		 return new ModelAndView("ad_department", model);
		}
	
}


