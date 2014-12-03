package com.biz.ad.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.biz.ad.pojo.Course;
import com.biz.ad.pojo.Subject;
import com.biz.ad.service.CourseService;
import com.biz.ad.service.SubjectService;

@Controller
public class SubjectController {
	
	@Autowired
	private CourseService cor_serv;
	
	@Autowired
	private SubjectService sub_serv;
	
	
	@RequestMapping("/ad_add_subject")
	public ModelAndView getCourse() {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("COURSE", cor_serv.getCourse());
		return new ModelAndView("ad_add_subject",model);
		
	}
	
	
	//Save
		@RequestMapping("/save_subject")
		public ModelAndView save_course(@ModelAttribute("subject") Subject subject,
				BindingResult result) {
			
			sub_serv.addSubject(subject);
			Map<String, Object> model = new HashMap<String, Object>();
			//model.put("SUBJECT", sub_serv.getSubject());
			model.put("COURSE", cor_serv.getCourse());
			model.put("msg","Subject Added Successfully");
		    return new ModelAndView("ad_subject1",model);
			
			//return new ModelAndView("ad_subject");
		}
		
	//view	
		@RequestMapping("/ad_subject")
		public ModelAndView getSubject() {
			
			Map<String, Object> model = new HashMap<String, Object>();
			//model.put("SUBJECT", sub_serv.getSubject());
		    
		    
		    //Map<String, Object> model = new HashMap<String, Object>();
			model.put("COURSE", cor_serv.getCourse());
			return new ModelAndView("ad_subject1",model);
			//return new ModelAndView("ad_subject");
			
		}
		
		//delete
		@RequestMapping("/deletesubject")
		public ModelAndView deletesubject(@ModelAttribute("subject")  Subject subject, BindingResult result)
		{
			sub_serv.deleteSubject(subject);
			//cor_serv.deleteCourse(course);
		 	//return new ModelAndView("ad_course_deleted");
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("SUBJECT", sub_serv.getSubject());
		    return new ModelAndView("ad_subject",model);
			
		}
		
		
		
	//edit		
	@RequestMapping("/editsubject")
			public ModelAndView editDepartment(@ModelAttribute("subject")  Subject subject,
			 BindingResult result) {
				
			 Map<String, Object> model = new HashMap<String, Object>();
			 Subject s=new Subject();
			 //Course c=new Course();
			 
			 s=sub_serv.getEachSubject(subject.getSubject_id());
			 model.put("SUBJECT",s);
			
			 //model.put("DEPT", dept_serv.getDepartment());
			 model.put("COURSE", cor_serv.getCourse());
				
			 return new ModelAndView("ad_edit_subject", model);
			 }
	
	//Update
			@RequestMapping(value = "/updatesubject", method = RequestMethod.GET)
			public ModelAndView UpdateCourse(@ModelAttribute("subject")  Subject subject, BindingResult result)
			{
				sub_serv.updateSubject(subject);
				Map<String, Object> model = new HashMap<String, Object>();
				model.put("SUBJECT", sub_serv.getSubject());
			    return new ModelAndView("ad_subject",model);
			}
				
			//Trial tab
			@RequestMapping("/ad_subject1")
			public ModelAndView getCou() {
				
				Map<String, Object> model = new HashMap<String, Object>();
				model.put("COURSE", cor_serv.getCourse());
			    return new ModelAndView("ad_subject_tab",model);
				//return new ModelAndView("ad_subject");
				
			}
			
			
			
		
			@RequestMapping(value = "/get_semester_values", method = RequestMethod.GET)
			public ModelAndView getSubjs(@ModelAttribute("subject")  Subject subject, BindingResult result)
					//@RequestParam"course_name") String course) 
					
			{
				//Subject s=new Subject();
				String course=subject.getCourse_name();
				System.out.println("In Controller: Course--"+course);
				
				Map<String, Object> model = new HashMap<String, Object>();
				
				model.put("first", sub_serv.getfirstsubj(course));
				model.put("second", sub_serv.getsecondsubj(course));
				model.put("third", sub_serv.getthirdsubj(course));
				model.put("fourth", sub_serv.getfourthsubj(course));
				model.put("fifth", sub_serv.getfifthsubj(course));
				model.put("sixth", sub_serv.getsixthsubj(course));
				model.put("seventh", sub_serv.getseventhsubj(course));
				model.put("eighth", sub_serv.geteighthsubj(course));
				
				model.put("sub", course);
				
			    return new ModelAndView("ad_subject_view1",model);
			}

	

}
