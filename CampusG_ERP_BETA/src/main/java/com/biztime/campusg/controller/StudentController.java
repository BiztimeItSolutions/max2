package com.biztime.campusg.controller;

//import javax.servlet.http.HttpSession;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import com.biztime.campusg.dao.StudentDAOImpl;
import com.biztime.campusg.model.Candidate;
import com.biztime.campusg.model.Create_user;

import com.biztime.campusg.model.LoginCombined;
import com.biztime.campusg.model.Privalage_mapping;
import com.biztime.campusg.model.Role_module;

import com.biztime.campusg.model.User_role;

import com.biztime.campusg.model.User_transaction;
import com.biztime.campusg.model.User_temp;
import com.biztime.campusg.model.Employee;
import com.biztime.campusg.model.User_role_module;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import com.biztime.campusg.model.FeeCommand;
import com.biztime.campusg.model.FeeType;

import com.biztime.campusg.model.Student;
import com.biztime.campusg.model.StudentContact;
import com.biztime.campusg.model.StudentEducation;
import com.biztime.campusg.model.StudentFee;
import com.biztime.campusg.model.StudentParent;
import com.biztime.campusg.model.StudentStatus;





@Controller
public class StudentController {
	
	

	
	private StudentDAOImpl studentDaoImpl;
	
	@Autowired(required=true)
	@Qualifier(value="studentDAO")
	public void setStudentDAOImpl(StudentDAOImpl s){
		this.studentDaoImpl = s;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(
	            dateFormat, false));
	}

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		//model.addAttribute("Course_l", new Candidate());
	
		return "index1";
	}
	
	
	@Transactional
	@RequestMapping(value = "/adm_first_page", method = RequestMethod.GET)
	public String listadc(Model model) {
		
		model.addAttribute("Course_l", new Candidate());
	
		return "Course_level";
	}
	
	
	
	//controller for ajax call for first drop down(course_level)
	@Transactional
	@RequestMapping("/get_course_level")
	public void Course_Level(HttpServletRequest req,HttpServletResponse resp){
		
		//String aString=service.getA();// get data for first drop down
		String course_level=this.studentDaoImpl.get_Course_level(); //get data for first drop down
		
		try {
			resp.getWriter().write(course_level);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Transactional
	@RequestMapping("/getprogram")
	public void program(HttpServletRequest req,HttpServletResponse resp){
		String selecteditem=req.getParameter("selecteditem");
		//String aString=service.getA();// get data for first drop down
		String program=this.studentDaoImpl.getProgram(selecteditem); //get data for first drop down
		
		try {
			resp.getWriter().write(program);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Transactional
	@RequestMapping("/getdepartment")
	public void department(HttpServletRequest req,HttpServletResponse resp){
		String selecteditem=req.getParameter("selecteditem");
		//String aString=service.getA();// get data for first drop down
	
		String department=this.studentDaoImpl.getDepartment(selecteditem); //get data for first drop down
		
		try {
			resp.getWriter().write(department);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Transactional
	@RequestMapping("/getcourse")
	public void course(HttpServletRequest req,HttpServletResponse resp){
		String selecteditem=req.getParameter("selecteditem");
		//String aString=service.getA();// get data for first drop down
	
		String course=this.studentDaoImpl.getCourse_Name(selecteditem); //get data for first drop down
		
		try {
			resp.getWriter().write(course);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Transactional
	@RequestMapping("/get_quota")
	public void quota(HttpServletRequest req,HttpServletResponse resp){
		
		//String selecteditem=req.getParameter("selecteditem");
		//String aString=service.getA();// get data for first drop down
	
		String quota=this.studentDaoImpl.get_quota(); //get data for first drop down
		
		try {
			resp.getWriter().write(quota);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Transactional
	@RequestMapping(value = "/save_candidate_basic", method = RequestMethod.POST)
	public String listStudents(@ModelAttribute("Candidate") Candidate b, HttpServletRequest req, Model model) {
		
		int i=this.studentDaoImpl.Save_Candidate_Basic_GetId(b);
		//String i=req.getParameter("candidate_id");
		String c=req.getParameter("course_level");
		String p=req.getParameter("program");
		String d=req.getParameter("department");
		String e=req.getParameter("course_name");
		String q=req.getParameter("quota");
		String m=req.getParameter("mobile");
		String em=req.getParameter("email");
		
		/*HttpSession se=req.getSession();  
	     se.setAttribute("candidate_id",i);  
		 se.setAttribute("course_level",c);
		 se.setAttribute("program",p);
		 se.setAttribute("department",d);
		 se.setAttribute("course_name",e);*/
		 
		 model.addAttribute("i",i);
		 model.addAttribute("c",c);
		 model.addAttribute("p",p);
		 model.addAttribute("d",d);
		 model.addAttribute("e",e);
		 model.addAttribute("m",m);
		 model.addAttribute("q",q);
		 model.addAttribute("em",em);
		 
		 model.addAttribute("Candidate_registration", new Candidate());
		 
		return "Candidate_registration";
	}//
	
	@Transactional
	@RequestMapping(value= "/Save_Candidate_All", method = RequestMethod.POST)
	public String Save_Candidate_Details(@ModelAttribute("candidate") Candidate c,Model model,HttpServletRequest req){
		
		int candidate_id=Integer.parseInt(req.getParameter("candidate_id"));
		this.studentDaoImpl.Save_Candidate_Details(c);//update
		model.addAttribute("p", this.studentDaoImpl.getCandidate(candidate_id));
		
		return "Plain_html_view";
		
		}
	
	

	@Transactional
	@RequestMapping(value = "/admission", method = RequestMethod.GET)
	public ModelAndView getAllStud() {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.studentDaoImpl.get_Candidate_first_adm());
		
		//List <Candidate> c= this.studentDaoImpl.get_Candidate_first_adm();
	
		
		return new ModelAndView("View_Candidate_Basic_Admission", model);
		
	}//
	
	
	@Transactional
	@RequestMapping(value= "/Update_Candidate_admission", method = RequestMethod.POST)
	public ModelAndView Update_Candidate(@ModelAttribute("candidate") Candidate c,HttpServletRequest req){
		
		this.studentDaoImpl.Update_Candidate(c);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.studentDaoImpl.get_Candidate_first_adm());
		
		return new ModelAndView("View_Candidate_Basic_Admission", model);
		//return "hello";
		
		}
	
	
	
	
	
	@Transactional
	@RequestMapping(value = "/view_candidate_detail_admission", method = RequestMethod.GET)
	public String list(Model model,HttpServletRequest req) {

		//String candidate_id=req.getParameter("candidate_id");
		int candidate_id=Integer.parseInt(req.getParameter("candidate_id"));
		System.out.println("candidate_id:"+candidate_id);
	
		model.addAttribute("p", this.studentDaoImpl.getCandidate(candidate_id));
		model.addAttribute("View_Candidate_All_Details_Admission", new Candidate());
		
		return "View_Candidate_All_Details_Admission";
		
	}
	
	@Transactional
	@RequestMapping(value = "/office", method = RequestMethod.GET)
	public ModelAndView getAllStud1() {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.studentDaoImpl.get_Candidate_first_office());
		
		return new ModelAndView("View_Candidate_Basic_Office", model);
		
	}//
	

	
	@Transactional
	@RequestMapping(value = "/view_candidate_detail_office", method = RequestMethod.GET)
	public String list1(Model model,HttpServletRequest req) {

		int candidate_id=Integer.parseInt(req.getParameter("candidate_id"));
		System.out.println("candidate_id:"+candidate_id);
	
		model.addAttribute("p", this.studentDaoImpl.getCandidate(candidate_id));
		model.addAttribute("View_Candidate_All_Details_Admission", new Candidate());
		
		return "View_Candidate_All_Details_Office";
		
	}
	
	
	@Transactional
	@RequestMapping(value= "/Update_Candidate_office", method = RequestMethod.POST)
	public ModelAndView Update_Candidate_office(HttpServletRequest req){
		int id=Integer.parseInt(req.getParameter("candidate_id"));
		String status=req.getParameter("office_status");
		String status_rem=req.getParameter("office_status_remarks");
		
		System.out.println("office status:"+status);
		
		this.studentDaoImpl.Update_candidate_status_office(id,status,status_rem);
		//this.studentDaoImpl.Update_Candidate(c);
		//return "hello";
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.studentDaoImpl.get_Candidate_first_office());
		
		return new ModelAndView("View_Candidate_Basic_Office", model);
		
		}
	
	
	/*************PDF*******************/
	
	@RequestMapping(value = "/pdf", method = RequestMethod.GET)
	public ModelAndView pdf() {
		
		return new ModelAndView("pdf");
	}
	
	@Transactional
	@RequestMapping(value = "/downloadPDF", method = RequestMethod.GET)
	public ModelAndView downloadExcel(HttpServletRequest req) {
		
		ModelAndView model=new ModelAndView("pdfView");
		
		//model.addObject("p", this.studentDaoImpl.getCandidate(candidate_id));
		
		int candidate_id=Integer.parseInt(req.getParameter("id"));
		Candidate c=this.studentDaoImpl.getCandidate(candidate_id);
		System.out.println("ID:"+c.getCandidate_id());
		System.out.println("Fname:"+c.getFirstname());
		model.addObject("p", c); 
		 return model;

		
		//return new ModelAndView("pdfView", "p", p);
	}
	
	
	@RequestMapping("/reg")
	public String show(Model m){
		String x="x";
		String y="x";
		//String account="account";		
		//String admin="admin";
		
		if(x==y)
		{
		String a="one";
		m.addAttribute("a", a);
		m.addAttribute("ShowForm", "first");
		}
		else
		{
		String b="two";
		m.addAttribute("b", b);
		m.addAttribute("ShowForm", "second");
		}
		return "show";
	}
	
	
	
	/*LOGIN*/
	
	@RequestMapping("/login")
	public String log(){
		return "login";
	
	}
//
	
	
	//@SuppressWarnings("rawtypes")
	@Transactional
	@RequestMapping(value = "/login_action", method = RequestMethod.POST)
	public String Login(@ModelAttribute("LoginCombined") LoginCombined user, Model m) {
		
		
		String namejsp=user.getCreate_user().getUser_name();
		String passwordjsp=user.getCreate_user().getPassword();
	
		
		System.out.println("From jsp Name:"+namejsp);
		System.out.println("From jsp password:"+ passwordjsp);
		
		List<LoginCombined> l=this.studentDaoImpl.Login_Info();
		
		for(LoginCombined login:l){
			System.out.println("User name from db"+login.getCreate_user().getUser_name());
			System.out.println("Password :"+login.getCreate_user().getPassword());
		//	System.out.println("type :"+login.getCreate_user().getUser_type());
			System.out.println("Role :"+login.getUser_role().getUser_role());
			
			
			
		}
		return "hello";
		
	}
		
	
	/*	//List<User_transaction> u=this.studentDaoImpl.
	
		boolean test1=false;
		boolean test2=false;
		boolean test3=false;
		System.out.println("check1");
		for (Iterator iterator =l.iterator(); iterator.hasNext();)
		{
			System.out.println("check2");
			
			LoginCombined us= (LoginCombined) iterator.next(); 
			System.out.println("check3");
			String namedb=us.getCreate_user().getUser_name().trim();				System.out.println("From dao Name:"+namedb);
			String passworddb=us.getCreate_user().getPassword().trim();				System.out.println("From dao Password:"+ passworddb);
			String typedb=us.getCreate_user().getUser_type().trim();				System.out.println("From dao User type:"+ typedb);
			String roledb=us.getUser_role().getUser_role().trim();					System.out.println("From dao role:"+roledb);
			String deptdb=us.getUser_transaction().getUser_department().trim();		System.out.println("From dao Department:"+deptdb);
		//}
		if(namedb.equals(namejsp) && passworddb.equals(passwordjsp) && roledb.equals("Admission_Admin") && typedb.equals("Employee"))
		{
			test1=true;
			break;
		}
		else if(namedb.equals(namejsp) && passworddb.equals(passwordjsp) && roledb.equals("Office_Admin") && typedb.equals("Employee"))
		{
			test2=true;
			break;
		}
		
		else if(namedb.equals(namejsp) && passworddb.equals(passwordjsp) && roledb.equals("Account_Admin") && typedb.equals("Employee"))
		{
			test3=true;
			break;
		}
		
		}//for
		
		if(test1==true)
		{
			return "redirect:/admission";
		}
		else if(test2==true)
		{
			return "redirect:/office";
		}
		else if(test3==true)
		{
			return "redirect:/account";
		}
		else
		{
			m.addAttribute("msg","Login Failed!!! Check User name and password");
			return "login";
		}
		//return null;
*/	

	
	

	/*User Create*/
	@Transactional
	@RequestMapping(value = "/user1", method = RequestMethod.GET)
	public String User1(Model model) {
		model.addAttribute("user1", new User_transaction());
		return "User_create";
	}
	
	@Transactional
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String User(Model model) {
		model.addAttribute("user", new Create_user());
		return "Create_user";
	}
	
	@Transactional
	@RequestMapping("/get_student_employee_parent")
	public void searchOnId(HttpServletRequest request, HttpServletResponse response) {
		
		String user_type=request.getParameter("user_type");
		String user_name=request.getParameter("user_name");
		
		String e="Employee";
		String s="Student";
		String p="Parent";
		
		System.out.println("User type in controller first: "+user_type);
		System.out.println("User name in controller first: "+user_name);
		
		if(user_type.equals(s))
		{
			List<Candidate> c=this.studentDaoImpl.get_Student(user_name);
			JsonArray jArray=new JsonArray();
			JsonObject jObj=new JsonObject();
			
			for(Candidate Candidate:c){

				JsonObject jsonStud=new JsonObject();
				jsonStud.addProperty("id", Candidate.getCandidate_id());
				jsonStud.addProperty("dept", Candidate.getDepartment());
				jsonStud.addProperty("prog", Candidate.getProgram());
				
				jArray.add(jsonStud);
				
			}
			
			jObj.add("candi",jArray);
			try {
				
				response.getWriter().write(jObj.toString());
			} catch (IOException z) {
				// TODO Auto-generated catch block
				z.printStackTrace();
			}
		}
		else if(user_type.equals(e))
		{
			List<Employee> y=this.studentDaoImpl.get_Employee(user_name);
			JsonArray jArray=new JsonArray();
			JsonObject jObj=new JsonObject();
			
			for(Employee Employee:y){

				JsonObject jsonStud=new JsonObject();
				jsonStud.addProperty("id", Employee.getEmployeeId());
				jsonStud.addProperty("dept", Employee.getDepartment());
				jsonStud.addProperty("prog", Employee.getDesignation());
				
				jArray.add(jsonStud);
				
			}
			
			jObj.add("candi",jArray);
			try {
				
				response.getWriter().write(jObj.toString());
			} catch (IOException z) {
				// TODO Auto-generated catch block
				z.printStackTrace();
			}
			
		}
		else if(user_type.equals(p))
		{
			List<Candidate> q=this.studentDaoImpl.get_Parent(user_name);
			JsonArray jArray=new JsonArray();
			JsonObject jObj=new JsonObject();
			
			for(Candidate Candidate:q){

				JsonObject jsonStud=new JsonObject();
				System.out.println("User name in controller first: "+Candidate.getFatheroccupation());
				jsonStud.addProperty("id", Candidate.getCandidate_id());
				jsonStud.addProperty("dept", Candidate.getFatheroccupation());
				jsonStud.addProperty("prog", Candidate.getFatheranualincome());
				
				jArray.add(jsonStud);
				
			}
			
			jObj.add("candi",jArray);
			try {
				
				response.getWriter().write(jObj.toString());
			} catch (IOException z) {
				// TODO Auto-generated catch block
				z.printStackTrace();
			}
			
		}
	}


	@RequestMapping(value = "/role", method = RequestMethod.GET)
	public String role(Model model) {
		model.addAttribute("user_role", new User_role());
		return "User_role";
	}
	@Transactional
	@RequestMapping(value = "/transaction", method = RequestMethod.GET)
	public ModelAndView transaction(Model model) {
		
		
		model.addAttribute("user_transaction", new User_transaction());
		//model.addAttribute("m",this.studentDaoImpl.get_module());
		System.out.println("From controller for module");
		
		//Map<String, Object> mo = new HashMap<String, Object>();
		((Map<String, Object>) model).put("p", this.studentDaoImpl.get_module());
		
		
		//return "";
		return new ModelAndView("User_transaction");
	}
	
	//controller for ajax call for first drop down(course_level)
		@Transactional
		@RequestMapping("/get_user_type")
		public void get_user_type(HttpServletRequest req,HttpServletResponse resp){
			String user_type=this.studentDaoImpl.get_User_type();
			try {
				resp.getWriter().write(user_type);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Transactional
		@RequestMapping("/get_users")
		public void get_users(HttpServletRequest req,HttpServletResponse resp){
			String selecteditem=req.getParameter("selecteditem");
			System.out.println("Selected from user type:"+selecteditem);
			String user=this.studentDaoImpl.getUser(selecteditem);			
			try 
			{
				resp.getWriter().write(user);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		@Transactional
		@RequestMapping("/get_role_type")
		public void get_role_type(HttpServletRequest req,HttpServletResponse resp){
			String role_type=req.getParameter("selecteditem");
			
			String role=this.studentDaoImpl.getRole(role_type);
			try {
				resp.getWriter().write(role);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//
		
		@Transactional
		@RequestMapping("/get_department")
		public void get_department(HttpServletRequest req,HttpServletResponse resp){
			
			String department=this.studentDaoImpl.get_department();
			try {
				resp.getWriter().write(department);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//
		
/*		@Transactional
		@RequestMapping("/get_module")
		public void get_module(HttpServletRequest req,HttpServletResponse resp){
			
			String module=this.studentDaoImpl.get_module();
			try {
				resp.getWriter().write(module);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//get_module
*/		
		
		
		@Transactional
		@RequestMapping(value= "/Create_User", method = RequestMethod.POST)
		public String User_create(@ModelAttribute("Create_user") Create_user c,Model model,HttpServletRequest req){

			this.studentDaoImpl.Create_user(c);
			return "hello";			
			}
		
		@Transactional
		@RequestMapping(value= "/User_role", method = RequestMethod.POST)
		public String Create_role(@ModelAttribute("User_role") User_role c,Model model,HttpServletRequest req){

			this.studentDaoImpl.User_role(c);
			return "hello";			
			}
		
		@Transactional
		@RequestMapping(value= "/User_transaction", method = RequestMethod.POST)
		public String Create_role(@ModelAttribute("User_transaction") User_transaction c,Model model,HttpServletRequest req){

			this.studentDaoImpl.User_transaction(c);
			return "hello";			
			}
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*Login trail*/
		
		
		
		@RequestMapping(value = "/login_action1", method = RequestMethod.POST)
		public String Login1(@RequestParam("name") String name,@RequestParam("password") String password, Model m) {
			
			String u="abc";
			String p="abc";
			
			String u1="xyz";
			String p1="xyz";
			
			String u2="mno";
			String p2="mno";
			
			if(name.equals(u) && password.equals(p))
			{
				m.addAttribute("u", name);
				m.addAttribute("ShowForm", "first");
				
			}
			else if(name.equals(u1) && password.equals(p1))
			{
				m.addAttribute("u", name);
				m.addAttribute("ShowForm", "second");
				
			}
			else if(name.equals(u2) && password.equals(p2))
			{
				m.addAttribute("u", name);
				
				
			}
			else
			{
				m.addAttribute("msg","Login Failed!!! Check User name and password");
				return "login";
			}
			return "hello";
			
			
			
		
			
		/*	if(test1==true)
			{
				return "redirect:/admission";
			}
			else if(test2==true)
			{
				return "redirect:/office";
			}
			else if(test3==true)
			{
				return "redirect:/account";
			}
			else
			{
				m.addAttribute("msg","Login Failed!!! Check User name and password");
				return "login";
			}*/

		}
		
		
		@RequestMapping(value = "/priv", method = RequestMethod.GET)
		public String Privilage(Model model) {
			model.addAttribute("privilage", new Privalage_mapping());
			return "Privilage_Mapping";
		}
		
		@Transactional
		@RequestMapping("/get_user")
		public void get_user(HttpServletRequest req,HttpServletResponse resp) {
			
			String user=this.studentDaoImpl.get_User(); //Employee
			try {
				resp.getWriter().write(user);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Transactional
		@RequestMapping("/get_role")
		public void get_role(HttpServletRequest req,HttpServletResponse resp) {
			
			String user=this.studentDaoImpl.get_Role(); //Employee
			try {
				resp.getWriter().write(user);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Transactional
		@RequestMapping("/get_module")
		public void get_module(HttpServletRequest req,HttpServletResponse resp) {
			
			String user=this.studentDaoImpl.get_Module(); //Employee
			try {
				resp.getWriter().write(user);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Transactional
		@RequestMapping("/get_privilage")
		public void get_privilage(HttpServletRequest req,HttpServletResponse resp) {
			
			String user=this.studentDaoImpl.get_privilage(); //Employee
			try {
				resp.getWriter().write(user);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	//
		@Transactional
		@RequestMapping(value= "/privilage_mapping", method = RequestMethod.POST)
		public String Privalage_mapping(@ModelAttribute("Privalage_mapping") Privalage_mapping p,Model model){

			this.studentDaoImpl.Privalage_mapping(p);
			return "hello";			
			}
		
		@SuppressWarnings("unchecked")
		@Transactional
		@RequestMapping(value = "/rolemod", method = RequestMethod.GET)
		public ModelAndView rolemod(Model model) {
			
			model.addAttribute("Role_module", new Role_module());
			((Map<String, Object>) model).put("p", this.studentDaoImpl.get_privilege());
			return new ModelAndView("Role_module");
		}






	@SuppressWarnings("unchecked")
		@Transactional
		@RequestMapping(value = "/urm", method = RequestMethod.GET)
		public ModelAndView roleusermod(Model model) {
			
			model.addAttribute("urm", new User_role_module());
			((Map<String, Object>) model).put("p", this.studentDaoImpl.get_privilege());
			return new ModelAndView("User_Role_Module");
		}
		@Transactional
		@RequestMapping(value= "/Role_module", method = RequestMethod.POST)
		public String Privalage_mapping(@ModelAttribute("Role_module") Role_module p,Model model){

			this.studentDaoImpl.Save_Role_module(p);
			return "hello";			
			}
		
		@Transactional
		@RequestMapping(value= "/privilage", method = RequestMethod.POST)
		public String User_role_module(@ModelAttribute("User_role_module") User_role_module p,Model model){

			this.studentDaoImpl.Save_User_role_module(p);
			return "hello";			
			}
		
		@Transactional
		@RequestMapping("/get_users_f")
		public void get_users_f(HttpServletRequest req,HttpServletResponse resp){
			String selecteditem=req.getParameter("selecteditem");
			System.out.println("Selected from user type:"+selecteditem);
			String user=this.studentDaoImpl.getUser_f(selecteditem);			
			try 
			{
				resp.getWriter().write(user);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//
		@Transactional
		@RequestMapping("/get_user_create")
		public void get_user_create(HttpServletRequest req,HttpServletResponse resp) {
			
			String user=this.studentDaoImpl.get_user_create(); //Employee
			try {
				resp.getWriter().write(user);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Transactional
		@RequestMapping(value = "/roleModule", method = RequestMethod.GET)
		public void roleModule(Model model,HttpServletRequest req,HttpServletResponse resp) {
			String roleName=req.getParameter("selectedRole");
			System.out.println("in controller through ajax, selected role: "+roleName);
			//calling DAO method to get module on role_name
			String module=this.studentDaoImpl.getModule(roleName);
			
			
			/*String mod=module.replaceAll("\\[", ""); 
			String mod1=mod.replaceAll("\\]", ""); //Remove paranthesis
			System.out.println("After removing of paranthesis:"+mod1 );
			
			List<String> items = Arrays.asList(mod1.split(","));
			Iterator<String> it = items.iterator();
			if(it.hasNext())
			{
				System.out.println("After removing of comma :"+items);
			}*/
			
			/*String animals = "dog, cat, bear, elephant, giraffe";
			String[] animalsArray = animals.split(",");
			for(int i=0; i<animalsArray.length; i++ )
			{
				System.out.println("Animals :"+ animalsArray);
			}*/
			
			try {
				resp.getWriter().write(module);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		@Transactional
		@RequestMapping(value= "/fruits", method = RequestMethod.GET)
		public String array(Model model,HttpServletRequest req){
			System.out.println("hello");
			String[] a=req.getParameterValues("one");
			String[] b=req.getParameterValues("two");
			
			//for(LoginCombined login:l){
			for(int i=0; i<a.length; i++)
			{
				System.out.println("From first"+i);
			}
			
			System.out.println("From first"+a);
			System.out.println("From second"+b);

			//this.studentDaoImpl.Privalage_mapping(p);
			return "null";			
			}

		

		
		//@SuppressWarnings("rawtypes")
		@Transactional
		@RequestMapping(value = "/login_action2", method = RequestMethod.POST)
		public String login_action2(@ModelAttribute("Create_user") Create_user user, Model m,HttpServletRequest req) {
			
			String namejsp=user.getUser_name();
			String passwordjsp=user.getPassword();
			
			System.out.println("From jsp Name:"+namejsp);
			System.out.println("From jsp password:"+ passwordjsp);
			
			List<Create_user> l=this.studentDaoImpl.Login_Info_priv();
			
			boolean test=false;
			
			for (Iterator iterator =l.iterator(); iterator.hasNext();)
			{
				Create_user us= (Create_user) iterator.next(); 
				String namedb=us.getUser_name().trim();			System.out.println("From dao Name:"+namedb);
				String passworddb=us.getPassword().trim();		System.out.println("From dao Password:"+passworddb);
				String privdb=us.getPrivilege().trim();			System.out.println("From dao Privilege:"+privdb);
				
				HttpSession se=req.getSession();  
			     se.setAttribute("name",namedb);
			     se.setAttribute("password",passworddb);
			     se.setAttribute("privilege",privdb);
				 
			
				if(namedb.equals(namejsp) && passworddb.equals(passwordjsp))
				{
					test=true;
					break;
				}
			
			}//for
			
			if(test==true)
			{
				 HttpSession se=req.getSession(false); 
				 String name=(String)se.getAttribute("name");
				 String passsword=(String)se.getAttribute("passsword");
				 String privilege=(String)se.getAttribute("privilege");
				 m.addAttribute("name",name);
				 m.addAttribute("passsword",passsword);
				 m.addAttribute("privilege",privilege);
				return "Sample";
			}
			else
			{
				m.addAttribute("msg","Login Failed!!! Check User name and password");
				return "login";
			}
			//return null;		
		}
		
		
		//@RequestMapping("/Transport_manage")
		@RequestMapping({"/Transport_manage", "/Transport_view", "/Transport_delete"})
		public String transport(HttpServletRequest request, Model m){
			
			//String uri = request.getRequestURI();
			//System.out.println("uri :"+uri);
			
			/*String mm="Transport_manage";
			String v="Transport_view";
			String d="Transport_delete";*/
			
			//String s=":/campus/rep/transport_view";
			String s=request.getRequestURI();
			String[] sArray=s.split("/");
			int i=sArray.length;
			
			//<%=sArray[i-1]%>
			String url_val=sArray[i-1];
			System.out.println("URL VAL FROM FUNCT :"+url_val);
			
			if(url_val.equals("Transport_manage"))
			{
				//m.addAttribute("u",  );
				m.addAttribute("ShowForm", "manager");
				
			}
			else if(url_val.equals("Transport_view"))
			{
				//m.addAttribute("u", );
				m.addAttribute("ShowForm", "view");
			}
			else if(url_val.equals("Transport_delete"))
			{
				//m.addAttribute("u", );
				m.addAttribute("ShowForm", "delete");
			}
			return "Transport";
		
		}
			
		



	
	
//************************************ACCOUNT START*******************************************************************
	/**
	 * @Module     Account Department
	 * @Purpose    Maintain Account Details
	 *
	 */
	
	
@Transactional
@RequestMapping(value = "/account", method = RequestMethod.GET)
public ModelAndView getAllstud()
 {
		
    Map<String, Object> model = new HashMap<String, Object>();
	model.put("p", this.studentDaoImpl.get_Candidate_first());
	return new ModelAndView("View_Candidate_Basic_Account", model);
		
 }
	

@Transactional
@RequestMapping(value = "/view_candidate_detail_account", method = RequestMethod.GET)
public String listAccount(Model model,HttpServletRequest req) 
 {

	int candidate_id=Integer.parseInt(req.getParameter("candidate_id"));
	System.out.println("candidate_id:"+candidate_id);
	
	model.addAttribute("p", this.studentDaoImpl.getCandidate(candidate_id));
	model.addAttribute("View_Candidate_All_Details_Admission", new Candidate());
		
	return "View_Candidate_All_Details_Account";
		
 }
	
@SuppressWarnings("unchecked")
@Transactional
@RequestMapping(value = "/view_candidate_account_detail", method = RequestMethod.GET)
public ModelAndView listAccount(@ModelAttribute("feeCommand") FeeCommand command,Model model,HttpServletRequest req)
  {

	int candidate_id=Integer.parseInt(req.getParameter("candidate_id"));
    System.out.println("candidate_id:"+candidate_id);
	
	model.addAttribute("p", this.studentDaoImpl.getCandidate(candidate_id));
       
    ((Map<String, Object>) model).put("f", this.studentDaoImpl.getfeeType());
    
    model.addAttribute("c", this.studentDaoImpl.getCandidate(candidate_id));
   
    model.addAttribute("fee", new StudentFee());
	
    return new ModelAndView("AccountDetail");
		
 }
	
@SuppressWarnings("unchecked")
@Transactional
@RequestMapping(value= "/saveAccount", method = RequestMethod.POST)
public String addAccount(@ModelAttribute("feeCommand") FeeCommand command,Model model,HttpServletRequest req)
 {
		
    this.studentDaoImpl.saveStudentFee(command);//insert
	this.studentDaoImpl.saveStudentFeeDateAmount(command);//update
	

	int candidate_id=command.getCandidate().getCandidate_id();
	System.out.println("save document candidate id="+candidate_id);
	
	
	 ((Map<String, Object>) model).put("p", this.studentDaoImpl.getStudentFee(candidate_id));
	return "Plain_html_AccountView";
	
 }

@Transactional
@RequestMapping(value = "/downloadAccount", method = RequestMethod.GET)
public ModelAndView downloadAccount(HttpServletRequest req)
 {
		
	ModelAndView model=new ModelAndView("pdfaccountview");
		
	/*int candidate_id=Integer.parseInt(req.getParameter("id"));
	StudentFee f=this.studentDaoImpl.getStudentFee(candidate_id);
	System.out.println("ID:"+f.getCandidate_id());
	
	model.addObject("fee", f); */
	int id=Integer.parseInt(req.getParameter("id"));
	StudentFee fee=this.studentDaoImpl.getStudentFeePdf(id);
	System.out.println("ID:"+fee.getCandidate_id());
	
	model.addObject("fee", fee); 
	return model;

 }

/**
 * @Module     Account Department
 * @Purpose    Maintain and verify document details
 *
 */


@SuppressWarnings("unchecked")
@Transactional
@RequestMapping(value = "/view_candidate_document_detail", method = RequestMethod.GET)
public ModelAndView listDocument(@ModelAttribute("feeCommand") FeeCommand command,Model model,HttpServletRequest req)
 {

	 int candidate_id=Integer.parseInt(req.getParameter("candidate_id"));
	 System.out.println("candidate_id:"+candidate_id);
	
	 ((Map<String, Object>) model).put("d", this.studentDaoImpl.getStudentDocument());
		
	 model.addAttribute("p", this.studentDaoImpl.getCandidateAccount(candidate_id));
	 model.addAttribute("c", this.studentDaoImpl.getCandidate(candidate_id));
	 model.addAttribute("fee", new StudentFee());
     return new ModelAndView("DocumentDetail");
		
 }

@SuppressWarnings("unchecked")
@Transactional
@RequestMapping(value= "/saveDocument", method = RequestMethod.POST)
public ModelAndView addDocument(@ModelAttribute("feeCommand") FeeCommand command,Model model,HttpServletRequest req)

 {
	this.studentDaoImpl.saveStudentDocument(command);

	int candidate_id=command.getCandidate().getCandidate_id();
	System.out.println("save document candidate id="+candidate_id);
	
	
	 ((Map<String, Object>) model).put("p", this.studentDaoImpl.getStudentFee(candidate_id));
	
    return  new ModelAndView("PlainHtmlDocumentView");

	
			
 }
	
@Transactional
@RequestMapping(value = "/downloadDocument", method = RequestMethod.GET)
public ModelAndView downloadDocument(HttpServletRequest req)
 {
		
	ModelAndView model=new ModelAndView("pdfdocumentview");
	int id=Integer.parseInt(req.getParameter("id"));
	StudentFee docs=this.studentDaoImpl.getStudentFeePdf(id);
	int candidateId=docs.getCandidate_id();
	System.out.println("ID:"+candidateId);
	Candidate candidate=this.studentDaoImpl.getCandidate(candidateId);
	model.addObject("docs", docs);
	model.addObject("candidate", candidate);
	return model;
	

 }
	
//**********************Dropdown values from database******************************************************



@Transactional
@RequestMapping("/get_receipt_book")
public void receiptBook(HttpServletRequest req,HttpServletResponse resp)
 {
	String receiptbook=this.studentDaoImpl.getReceiptBook();
	//get data for first drop down
	try {
		 resp.getWriter().write(receiptbook);
		} 
	catch (IOException e)
		{
		// TODO Auto-generated catch block
		  e.printStackTrace();
		}
		
 }


@Transactional
@RequestMapping("/get_mode_of_payment")
public void modePayment(HttpServletRequest req,HttpServletResponse resp)
 {
		
    String payment=this.studentDaoImpl.getModePayment(); //get data for first drop down
	try {
		 resp.getWriter().write(payment);
		} 
	catch (IOException e)
		{
	     // TODO Auto-generated catch block
		 e.printStackTrace();
		}
		
 }


@Transactional
@RequestMapping("/get_fee_type")
public void feetype(HttpServletRequest req,HttpServletResponse resp)
 {
	System.out.println("from ajax");
	String selecteditem=req.getParameter("selecteditem");
    List<FeeType> feeList=this.studentDaoImpl.getFeeTypeList(selecteditem); //get data for first drop down
   /* System.out.println("in controller: "+feeList.toString());*/
    JsonObject jObj=new JsonObject();
    JsonArray jArray=new JsonArray();
    for (FeeType feetype : feeList){
    	System.out.println("in controller for: "+feetype.toString());
    	JsonObject jFeeType=new JsonObject();
    	jFeeType.addProperty("feeName", feetype.getFeeName());
    	jFeeType.addProperty("amount",feetype.getAmount());
    	jArray.add(jFeeType);
    	
    }
    jObj.add("feeType", jArray);
	try {
		System.out.println("array to string : "+jObj.toString());
		 resp.getWriter().write(jObj.toString());
		} 
	catch (IOException e)
		{
	     // TODO Auto-generated catch block
		 e.printStackTrace();
		}
		
 }

//************************************************ACCOUNT END**************************************************************

	
}
	

