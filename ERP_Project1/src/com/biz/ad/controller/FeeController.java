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

import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Fees;
import com.biz.ad.pojo.FeesStructure;

import com.biz.ad.service.CourseService;
import com.biz.ad.service.FeeService;

@Controller
public class FeeController {
	
	@Autowired
	private FeeService fee_serv;
	
	@Autowired
	private CourseService cor_serv;
	
	
	//view
	@RequestMapping("/ad_fees")
	public ModelAndView save_fs() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("FEES", fee_serv.getFee());		
		return new ModelAndView("ad_fees",model);
		//return new ModelAndView("ad_fees");
		
	}
	
	@RequestMapping("/ad_add_fees1")
	public ModelAndView save_fe() {
		
		return new ModelAndView("ad_add_fees");
		
	}

	//Save
			@RequestMapping("/save_fees")
			public ModelAndView save_fees123(@ModelAttribute("fees") Fees fees,
					BindingResult result) {
		
				//String feename=fees.
				fee_serv.addFee(fees);
				
				Map<String, Object> model = new HashMap<String, Object>();
				model.put("msg","Fees Added Successfully");
			    return new ModelAndView("ad_add_fees", model);
			}
			
			//edit		
			@RequestMapping("/editfees")
					public ModelAndView editCourse(@ModelAttribute("fees") Fees fees,
					 BindingResult result) {
						
					 Map<String, Object> model = new HashMap<String, Object>();
					 Fees f=new Fees();
					 f=fee_serv.getEachFees(fees.getFee_id());
					 model.put("FEES",f);
					
					 //model.put("DEPT", dept_serv.getDepartment());
					 return new ModelAndView("ad_edit_fees", model);
					 }
			
			//Update
					@RequestMapping(value = "/updatefees", method = RequestMethod.GET)
					public ModelAndView UpdateCourse(@ModelAttribute("fees")  Fees fees, BindingResult result)
					{
						
						fee_serv.updateFees(fees);
						Map<String, Object> model = new HashMap<String, Object>();
						
						
						model.put("FEES", fee_serv.getFee());		
						model.put("msg","Fees Updated Successfully");
						return new ModelAndView("ad_fees",model);
						//return new ModelAndView("ad_course_updated");
					 }
					
			//Delete	 
			@RequestMapping("/deletefees")
			public ModelAndView deleteCourse(@ModelAttribute("fees")  Fees fees, BindingResult result)
					{
						
						fee_serv.deleteFees(fees);
						Map<String, Object> model = new HashMap<String, Object>();
						model.put("FEES", fee_serv.getFee());
						model.put("msg1","Course Deleted Successfully");
						
						return new ModelAndView("ad_fees",model);
					}
			
			/*@RequestMapping("/ad_fees_struct")
			public ModelAndView AdFeesStructure(@ModelAttribute("fees_str")  FeesStructure fees_str, BindingResult result)
			{
				Map<String, Object> model = new HashMap<String, Object>();
				model.put("COURSE", cor_serv.getCourse());
				
				fee_serv.
				return new ModelAndView("ad_fees_structure",model);
		
			}*/
					
						
					
	
}
