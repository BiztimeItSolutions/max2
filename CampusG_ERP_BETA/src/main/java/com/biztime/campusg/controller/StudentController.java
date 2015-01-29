package com.biztime.campusg.controller;

//import javax.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.biztime.campusg.dao.StudentDAOImpl;
import com.biztime.campusg.model.Student;
import com.biztime.campusg.model.StudentContact;
import com.biztime.campusg.model.StudentEducation;
import com.biztime.campusg.model.StudentParent;

@Controller
public class StudentController {
	
	
	private StudentDAOImpl studentDaoImpl;
	
	@Autowired(required=true)
	@Qualifier(value="studentDAO")
	public void setStudentDAOImpl(StudentDAOImpl s){
		this.studentDaoImpl = s;
	}
	
	
	
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String listStudents(Model model) {
		//model.addAttribute("student", new Student());
		//return "student";
		model.addAttribute("StudentForm", new Student());
		model.addAttribute("StudentContact",new StudentContact());
		model.addAttribute("StudentParent",new StudentParent());//me
		model.addAttribute("StudentEducation",new StudentEducation());//me
		model.addAttribute("ShowForm", "Personal");
		return "StudentForm";
	}
	
	
	
	@Transactional
	@RequestMapping(value= "/student", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student s,Model model){
		
		this.studentDaoImpl.saveStudent(s);
		model.addAttribute("StudentContact",new StudentContact());
		model.addAttribute("StudentParent",new StudentParent());//me
		model.addAttribute("StudentEducation",new StudentEducation());//me
		model.addAttribute("StudentForm", new Student());//me
		//model.addAttribute("StudentForm", s);
		model.addAttribute("ShowForm", "Contact");
		return "StudentForm";
		//return "StudentForm";
		
	}
	
	
	
	
	@Transactional
	@RequestMapping(value= "/studentContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("studentContact") StudentContact s,Model model){

		this.studentDaoImpl.saveStudentContact(s);
		
		model.addAttribute("StudentForm", new Student());
		model.addAttribute("StudentParent",new StudentParent());
		//model.addAttribute("StudentContact",s);
		model.addAttribute("StudentContact",new StudentContact());//me
		model.addAttribute("StudentEducation",new StudentEducation());//me

		model.addAttribute("ShowForm", "Parent");
		return "StudentForm";
		
	}
	
	
	@Transactional
	@RequestMapping(value= "/studentParent", method = RequestMethod.POST)
	public String addParent(@ModelAttribute("studentParent") StudentParent s,Model model){
		
		this.studentDaoImpl.saveStudentParent(s);
		model.addAttribute("StudentForm", new Student());
		model.addAttribute("StudentContact",new StudentContact());
		model.addAttribute("StudentParent",new StudentParent());//me
		model.addAttribute("StudentEducation",new StudentEducation());
		
		model.addAttribute("ShowForm", "Educational");
		return "StudentForm";
		
	}
	
	@Transactional
	@RequestMapping(value= "/studentEducation", method = RequestMethod.POST)
	public String addEducation(@ModelAttribute("studentEducation") StudentEducation s,Model model){
		
		this.studentDaoImpl.saveStudentEducation(s);;
		return "hello";
		
		//model.addAttribute("StudentForm", new Student());//me
		//model.addAttribute("StudentContact",new StudentContact());//me
		//model.addAttribute("StudentParent",new StudentParent());//me
		//model.addAttribute("StudentEducation",new StudentEducation());//me
		
		//model.addAttribute("ShowForm", "Personal");//me
		//return "StudentForm";
		
		
		//model.addAttribute("student",new Student());
		//return "student";
		
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		
		
		return "viewAll";
		
	}
	@Transactional
	@RequestMapping(value = "/list1", method = RequestMethod.GET)
	public ModelAndView getAllStud() {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.studentDaoImpl.getStudentPersonal());
		return new ModelAndView("viewAll", model);
		
	}
	  
	
	

	
}
