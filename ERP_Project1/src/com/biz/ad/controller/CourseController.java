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
import com.biz.ad.service.CourseService;
import com.biz.ad.service.DepartmentService;


@Controller
public class CourseController {
	
	@Autowired
	private CourseService cor_serv;
	
	@Autowired
	private DepartmentService dept_serv;
	
/*	
	@RequestMapping("/ad_add_course1")
	public ModelAndView getName() {
		
		return new ModelAndView("ad_add_course");
	}*/
	
	@RequestMapping("/ad_add_course1")
	public ModelAndView getDept() {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("DEPT", dept_serv.getDepartment());
		return new ModelAndView("ad_add_course", model);
		
	}
	
	//view
	@RequestMapping("/ad_course")
	public ModelAndView getCourse() {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("COURSE", cor_serv.getCourse());
		
		return new ModelAndView("ad_course",model);
		
	}
	
	
	
	//Save
		@RequestMapping("/save_course")
		public ModelAndView save_course(@ModelAttribute("course") Course course,
				BindingResult result) {
			
			
			cor_serv.addCourse(course);
			
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("DEPT", dept_serv.getDepartment());
			model.put("msg","Course Added Successfully");
			return new ModelAndView("ad_add_course", model);
			
			//return new ModelAndView("ad_add_course");
		}
		
	
			
	//edit		
	@RequestMapping("/editcourse")
			public ModelAndView editCourse(@ModelAttribute("course") Course course,
			 BindingResult result) {
				
			 Map<String, Object> model = new HashMap<String, Object>();
			 Course c=new Course();
			 c=cor_serv.getEachCourse(course.getCourse_id());
			 model.put("COURSE",c);
			
			 System.out.println("c_id"+c.getCourse_id());
			 System.out.println("c_name"+c.getCourse_name());
			 System.out.println("d_name_"+c.getDepartment_name());
			 
			 model.put("DEPT", dept_serv.getDepartment());
			 return new ModelAndView("ad_edit_course", model);
			 }
	
	//Update
			@RequestMapping(value = "/updatecourse", method = RequestMethod.GET)
			public ModelAndView UpdateCourse(@ModelAttribute("course")  Course course, BindingResult result)
			{
			 cor_serv.updateCourse(course);
			 Map<String, Object> model = new HashMap<String, Object>();
				model.put("COURSE", cor_serv.getCourse());
				model.put("msg","Course Updated Successfully");
				return new ModelAndView("ad_course",model);
			 //return new ModelAndView("ad_course_updated");
			 }
			
		//Delete	 
			@RequestMapping("/deletecourse")
			public ModelAndView deleteCourse(@ModelAttribute("course")  Course course, BindingResult result)
			{
				cor_serv.deleteCourse(course);
				Map<String, Object> model = new HashMap<String, Object>();
				model.put("COURSE", cor_serv.getCourse());
				model.put("msg1","Course Deleted Successfully");
				return new ModelAndView("ad_course",model);
			}
			
			
			
		/*	@RequestMapping("/getcurrdept")
			public ModelAndView dothereg(@RequestParam("count") String grad)
			{
				System.out.println("Grad:"+grad);
				Map<String, Object> model = new HashMap<String, Object>();
			    System.out.println("B4 dept");
				
			    model.put("GRAD", cor_serv.getdeptforgrad(grad));
				
			    System.out.println("Af8er dept");
				return new ModelAndView("ad_add_course", model);
			}*/
		

	
	

}
