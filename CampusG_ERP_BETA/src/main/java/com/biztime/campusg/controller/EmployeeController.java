package com.biztime.campusg.controller;

/**
 * @author     Anuvidhya
 * @Module     EmployeeProfile
 * @Purpose    Maintain Employee Details
 *
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.biztime.campusg.dao.EmployeeDAOImpl;

import com.biztime.campusg.model.Candidate;
import com.biztime.campusg.model.Employee;
import com.biztime.campusg.model.EmployeeCommand;
import com.biztime.campusg.model.EmployeeSubjectAssociation;
import com.biztime.campusg.model.FeeCommand;
import com.biztime.campusg.model.FeeType;
import com.biztime.campusg.model.StudentFee;

import com.biztime.campusg.model.EmployeeLeave;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


@Controller
public class EmployeeController {
	
private EmployeeDAOImpl employeeDaoImpl;

@Autowired(required=true)
@Qualifier(value="employeeDAO")
public void setEmployeeDAOImpl(EmployeeDAOImpl e){
	this.employeeDaoImpl = e;
}




@Transactional
@RequestMapping(value = "/first_page", method = RequestMethod.GET)
public String empPage(@ModelAttribute("employee") Employee e,Model model) {
	
	model.addAttribute("emp", new Employee());
	
	return "EmployeeProfile";
}



@Transactional
@RequestMapping(value= "/saveEmployee", method = RequestMethod.POST)
public String addEmployee(@ModelAttribute("employee") Employee e,Model model,HttpServletRequest req){
	
	int success=this.employeeDaoImpl.saveEmployee(e);
	

	model.addAttribute("success", success);
	
    return "EmployeeProfile";

}




@Transactional
@RequestMapping(value = "/leave", method = RequestMethod.GET)
public String empleavePage(@ModelAttribute("employeeleave") EmployeeLeave employeeLeave,Model model) {
	
	model.addAttribute("emp", new Employee());
	
	return "EmployeeLeave";
}

@Transactional
@RequestMapping(value= "/saveEmployeeLeave", method = RequestMethod.POST)
public ModelAndView addEmployeeLeave(@ModelAttribute("employeeleave") EmployeeLeave leave,Model model,HttpServletRequest req){
	
	this.employeeDaoImpl.saveEmployeeLeaveId(leave);//insert only leave id
	
	//this.employeeDaoImpl.saveEmployeeLeave(leave);//updating the entire values

	int success=this.employeeDaoImpl.saveEmployeeLeave(leave);
	model.addAttribute("success", success);
	
	
    return new ModelAndView("EmployeeLeave");

}

@Transactional
@RequestMapping(value = "/employeeDetail", method = RequestMethod.GET)
public ModelAndView getAllEmployeeDetail()
 {
		
    Map<String, Object> model = new HashMap<String, Object>();
	model.put("emp", this.employeeDaoImpl.getEmployee());
	return new ModelAndView("EmployeeViewProfileBasicDetail", model);
		
 }
 
 @Transactional
 @RequestMapping(value = "/viewEmployeeAllDetail", method = RequestMethod.GET)
 public String listEmployeeDetail(@ModelAttribute("employee") Employee e,Model model,HttpServletRequest req) 
  {

 	int employeeId=Integer.parseInt(req.getParameter("employeeId"));
 	System.out.println("employeeId:"+employeeId);
 	
 	model.addAttribute("e", this.employeeDaoImpl.getEmployeeViewDetail(employeeId));
 	
 	return "EmployeeViewProfileAllDetail";
 		
  }
 

 
 @SuppressWarnings("unchecked")
 @Transactional
 @RequestMapping(value = "/viewEmployeeDocumentVerification", method = RequestMethod.GET)
 public ModelAndView listDocument(@ModelAttribute("employeeCommand") EmployeeCommand command,Model model,HttpServletRequest req)
  {

	 int employeeId=Integer.parseInt(req.getParameter("employeeId"));
	 	System.out.println("employeeId:"+employeeId);
 	
 	 model.addAttribute("e", this.employeeDaoImpl.getEmployeeViewDetail(employeeId));
 	 
 	 ((Map<String, Object>) model).put("d", this.employeeDaoImpl.getEmployeeDocument());
 		
      return new ModelAndView("EmployeeDocumentVerification");
 		
  }


 @Transactional
 @RequestMapping(value= "/saveEmployeeDocument", method = RequestMethod.POST)
 public ModelAndView addDocument(@ModelAttribute("employeeCommand") EmployeeCommand command,Model model,HttpServletRequest req)

  {
 	this.employeeDaoImpl.saveEmployeeDocument(command);
 	this.employeeDaoImpl.saveEmployeeDocumentName(command);

 	
     return  new ModelAndView("result");

 	
 			
  }
 	

@Transactional
@RequestMapping(value = "/leavedetail", method = RequestMethod.GET)
public ModelAndView getAllleave()
 {
		
    Map<String, Object> model = new HashMap<String, Object>();
	model.put("l", this.employeeDaoImpl.getEmployeeLeave());
	return new ModelAndView("EmployeeLeaveDetail", model);
		
 }

@Transactional
@RequestMapping(value = "/view_employee_leave_detail", method = RequestMethod.GET)
public String listleave(@ModelAttribute("employeeleave") EmployeeLeave leave,Model model,HttpServletRequest req) 
 {

	int employee_leave_id=Integer.parseInt(req.getParameter("employee_leave_id"));
	System.out.println("employee_leave_id:"+employee_leave_id);
	
	model.addAttribute("l", this.employeeDaoImpl.getEmployeeLeaveDetail(employee_leave_id));
	
	return "EmployeeLeaveAllDetail";
		
 }


@Transactional
@RequestMapping(value= "/updateEmployeeLeave", method = RequestMethod.POST)
public ModelAndView addDocument(@ModelAttribute("employeeleave") EmployeeLeave leave,HttpServletRequest req)

 {
	   this.employeeDaoImpl.saveEmployeeLeaveDetail(leave);
	   Map<String, Object> model = new HashMap<String, Object>();
	   model.put("l", this.employeeDaoImpl.getEmployeeLeave());
		return new ModelAndView("EmployeeLeaveDetail", model);
		
 }

@Transactional
@RequestMapping(value = "/subject", method = RequestMethod.GET)
public String empSubjectAssociationPage(@ModelAttribute("employee") EmployeeSubjectAssociation s,Model model) {
	
	model.addAttribute("emp", new EmployeeSubjectAssociation());
	
	return "EmployeeSubjectAssociation";
}

@Transactional
@RequestMapping(value= "/saveEmployeeSubjectAssociation", method = RequestMethod.POST)
public String addEmployeeSubject(@ModelAttribute("employee") EmployeeSubjectAssociation s,Model model,HttpServletRequest req){
	
	this.employeeDaoImpl.saveEmployeeSubjectAssociation(s);
	this.employeeDaoImpl.saveEmployeeSubjectAssociationName(s);
	
    return "result";

}

@Transactional
@RequestMapping(value = "/payroll", method = RequestMethod.GET)
public String empIndividualPayroll(@ModelAttribute("employeeCommand") EmployeeCommand command,Model model) {
	
	model.addAttribute("emp", new EmployeeCommand());
	
	return "EmployeeIndividualPayroll";
}

//**********************Dropdown values from database******************************************************



@Transactional
@RequestMapping("/get_leave_name.html")
public void receiptBook(HttpServletRequest req,HttpServletResponse resp)
{
	String leavetype=this.employeeDaoImpl.getLeaveType();
	//get data for first drop down
	try {
		 resp.getWriter().write(leavetype);
		} 
	catch (IOException e)
		{
		// TODO Auto-generated catch block
		  e.printStackTrace();
		}
		
}


@Transactional
@RequestMapping("/get_leave_Count")
public void leavecount(HttpServletRequest req,HttpServletResponse resp)
 {
	String selecteditem=req.getParameter("selecteditem");
    String leavecount=this.employeeDaoImpl.getLeaveCount(selecteditem); //get data for first drop down
	try {
		 resp.getWriter().write(leavecount);
		} 
	catch (IOException e)
		{
	     // TODO Auto-generated catch block
		 e.printStackTrace();
		}
		
 }

@Transactional
@RequestMapping("/get_leave_code")
public void leavecode(HttpServletRequest req,HttpServletResponse resp)
 {
	String selecteditem=req.getParameter("selecteditem");
    String leavecode=this.employeeDaoImpl.getLeaveCode(selecteditem); //get data for first drop down
	try {
		 resp.getWriter().write(leavecode);
		} 
	catch (IOException e)
		{
	     // TODO Auto-generated catch block
		 e.printStackTrace();
		}
		
 }

@Transactional
@RequestMapping("/get_leave_status")
public void leavestatus(HttpServletRequest req,HttpServletResponse resp)
 {
	String selecteditem=req.getParameter("selecteditem");
    String leavestatus=this.employeeDaoImpl.getLeaveStatus(selecteditem); //get data for first drop down
	try {
		 resp.getWriter().write(leavestatus);
		} 
	catch (IOException e)
		{
	     // TODO Auto-generated catch block
		 e.printStackTrace();
		}
		
 }

 
 
 @Transactional
 @RequestMapping("/get_detail.html")
 public void department(HttpServletRequest req,HttpServletResponse resp)
 {
 	String department=this.employeeDaoImpl.getDetail();
 	//get data for first drop down
 	try {
 		 resp.getWriter().write(department);
 		} 
 	catch (IOException e)
 		{
 		// TODO Auto-generated catch block
 		  e.printStackTrace();
 		}
 		
 }
 
 @Transactional
 @RequestMapping("/get_employee_detail")
 public void feetype(HttpServletRequest req,HttpServletResponse resp)
  {
 	System.out.println("from ajax");
 	String selecteditem=req.getParameter("selecteditem");
     List<Employee> employeeDetail=this.employeeDaoImpl.getEmployeeDetail(selecteditem); //get data for first drop down
    
     JsonObject jObj=new JsonObject();
     JsonArray jArray=new JsonArray();
     for (Employee employee : employeeDetail){
     	
     	JsonObject jemployee=new JsonObject();
     	jemployee.addProperty("employeeId", employee.getEmployeeId());
     	jemployee.addProperty("firstName",employee.getFirstName());
     	jArray.add(jemployee);
     	
     }
     jObj.add("employee", jArray);
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
 
 
 @Transactional
 @RequestMapping("/get_batch.html")
 public void batch(HttpServletRequest req,HttpServletResponse resp)
 {
 	String batch=this.employeeDaoImpl.getBatch();
 	//get data for first drop down
 	try {
 		 resp.getWriter().write(batch);
 		} 
 	catch (IOException e)
 		{
 		// TODO Auto-generated catch block
 		  e.printStackTrace();
 		}
 		
 }
 @Transactional
 @RequestMapping("/get_semester.html")
 public void semester(HttpServletRequest req,HttpServletResponse resp)
 {
 	String semester=this.employeeDaoImpl.getSemester();
 	//get data for first drop down
 	try {
 		 resp.getWriter().write(semester);
 		} 
 	catch (IOException e)
 		{
 		// TODO Auto-generated catch block
 		  e.printStackTrace();
 		}
 		
 }
 
 @Transactional
 @RequestMapping("/get_subject")
 public void subject(HttpServletRequest req,HttpServletResponse resp)
  {
 	String selecteditem=req.getParameter("selecteditem");
 	String batch_name =req.getParameter("batch_name");
 	System.out.println("batch_name"+batch_name);
 	
     String subject=this.employeeDaoImpl.getSubject(selecteditem,batch_name); //get data for first drop down
 	try {
 		 resp.getWriter().write(subject);
 		} 
 	catch (IOException e)
 		{
 	     // TODO Auto-generated catch block
 		 e.printStackTrace();
 		}
 		
  }
 
 
 @Transactional
 @RequestMapping("/get_employee_id")
 public void employeeId(HttpServletRequest req,HttpServletResponse resp)
  {
 	String selecteditem=req.getParameter("selecteditem");
     String id=this.employeeDaoImpl.getEmployeeid(selecteditem); //get data for first drop down
 	try {
 		 resp.getWriter().write(id);
 		} 
 	catch (IOException e)
 		{
 	     // TODO Auto-generated catch block
 		 e.printStackTrace();
 		}
 		
  }
 
 
 @Transactional
 @RequestMapping("/get_employee_name")
 public void employeeName(HttpServletRequest req,HttpServletResponse resp)
  {
 	String employeeid=req.getParameter("employeeid");
     String name=this.employeeDaoImpl.getEmployeename(employeeid); //get data for first drop down
 	try {
 		 resp.getWriter().write(name);
 		} 
 	catch (IOException e)
 		{
 	     // TODO Auto-generated catch block
 		 e.printStackTrace();
 		}
 		
  }
  
  @Transactional
  @RequestMapping("/get_employee_designation")
  public void employeeDesignation(HttpServletRequest req,HttpServletResponse resp)
   {
  	String employeeid=req.getParameter("employeeid");
      String designation=this.employeeDaoImpl.getEmployeedesignation(employeeid); //get data for first drop down
  	try {
  		 resp.getWriter().write(designation);
  		} 
  	catch (IOException e)
  		{
  	     // TODO Auto-generated catch block
  		 e.printStackTrace();
  		}
  		
   }
   

  @Transactional
  @RequestMapping("/get_employee_ctc")
  public void employeeCtc(HttpServletRequest req,HttpServletResponse resp)
   {
  	String employeeid=req.getParameter("employeeid");
  	System.out.println("check ctc controller ");
      String ctc=this.employeeDaoImpl.getEmployeeCtc(employeeid); //get data for first drop down
  	try {
  		 resp.getWriter().write(ctc);
  		} 
  	catch (IOException e)
  		{
  	     // TODO Auto-generated catch block
  		 e.printStackTrace();
  		}
  		
   }
   @Transactional
   @RequestMapping("/get_college_calendar")
   public void collegeCalendar(HttpServletRequest req,HttpServletResponse resp)
    {
   
       String month=this.employeeDaoImpl.getMonth(); //get data for first drop down
   	try {
   		 resp.getWriter().write(month);
   		} 
   	catch (IOException e)
   		{
   	     // TODO Auto-generated catch block
   		 e.printStackTrace();
   		}
   		
    }
 
   @Transactional
   @RequestMapping("/get_total_days")
   public void monthTotalDays(HttpServletRequest req,HttpServletResponse resp)
    {
   	String month=req.getParameter("month");
       String totaldays=this.employeeDaoImpl.getTotalDays(month); //get data for first drop down
   	try {
   		 resp.getWriter().write(totaldays);
   		} 
   	catch (IOException e)
   		{
   	     // TODO Auto-generated catch block
   		 e.printStackTrace();
   		}
   		
    }
    
   @Transactional
   @RequestMapping("/get_working_days")
   public void monthWorkingDays(HttpServletRequest req,HttpServletResponse resp)
    {
   	String month=req.getParameter("month");
       String workingdays=this.employeeDaoImpl.getWorkingDays(month); //get data for first drop down
   	try {
   		 resp.getWriter().write(workingdays);
   		} 
   	catch (IOException e)
   		{
   	     // TODO Auto-generated catch block
   		 e.printStackTrace();
   		}
   		
    }
   
   @Transactional
   @RequestMapping("/get_holidays")
   public void monthHolidays(HttpServletRequest req,HttpServletResponse resp)
    {
   	String month=req.getParameter("month");
       String holidays=this.employeeDaoImpl.getHolidays(month); //get data for first drop down
   	try {
   		 resp.getWriter().write(holidays);
   		} 
   	catch (IOException e)
   		{
   	     // TODO Auto-generated catch block
   		 e.printStackTrace();
   		}
   		
    }
   
   
 
   @Transactional
   @RequestMapping("/get_total_working_days")
   public void totalWorkingDays(HttpServletRequest req,HttpServletResponse resp)
    {
   	String employeeid=req.getParameter("employeeid");
   	System.out.println("employeeid"+employeeid);
   	String month =req.getParameter("month");
   	System.out.println("month"+month);
   	
       String totalworkingdays=this.employeeDaoImpl.getTotalWorkingDays(employeeid,month); //get data for first drop down
   	try {
   		 resp.getWriter().write(totalworkingdays);
   		} 
   	catch (IOException e)
   		{
   	     // TODO Auto-generated catch block
   		 e.printStackTrace();
   		}
   		
    }
   
   
   @Transactional
   @RequestMapping("/get_absent_days")
   public void absentDays(HttpServletRequest req,HttpServletResponse resp)
    {
   	String employeeid=req.getParameter("employeeid");
   	System.out.println("employeeid"+employeeid);
   	String month=req.getParameter("month");
   	
       List<EmployeeLeave> absentdays=this.employeeDaoImpl.getAbsentDays(employeeid,month);
       
       JsonArray jArray=new JsonArray();
       JsonObject jObj=new JsonObject();
       
       for(EmployeeLeave empLeave : absentdays){
    	   String code=empLeave.getLeaveCode().trim();
    	   System.out.println("leave code: "+code);
    	 /*  if(code != "PL"){*/
    		   JsonObject jLeave=new JsonObject();
    		   jLeave.addProperty("daysRequest", Integer.valueOf(empLeave.getDaysRequest()));
    		   jArray.add(jLeave);
    	 /*  }*/
      }
       jObj.add("leaveReqDays", jArray);
       
       
   	try {
   		 resp.getWriter().write(jObj.toString());
   		} 
   	catch (IOException e)
   		{
   	     // TODO Auto-generated catch block
   		 e.printStackTrace();
   		}
   		
    }
   @Transactional
   @RequestMapping("/get_payable_days")
   public void payableDays(HttpServletRequest req,HttpServletResponse resp)
    {
   	String employeeid=req.getParameter("employeeid");
   	System.out.println("employeeid"+employeeid);
  	String month=req.getParameter("month");
   	
       List<EmployeeLeave> payableDays=this.employeeDaoImpl.getPayableDays(employeeid,month);
       
       JsonArray jArray=new JsonArray();
       JsonObject jObj=new JsonObject();
       
       for(EmployeeLeave empLeave : payableDays){
    	  
    		   JsonObject jLeave=new JsonObject();
    		   jLeave.addProperty("payableDays", Integer.valueOf(empLeave.getDaysRequest()));
    		   jArray.add(jLeave);
    	
      }
       jObj.add("leavepayableDays", jArray);
       
       
   	try {
   		 resp.getWriter().write(jObj.toString());
   		} 
   	catch (IOException e)
   		{
   	     // TODO Auto-generated catch block
   		 e.printStackTrace();
   		}
   		
    }
 
}
