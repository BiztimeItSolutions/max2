package com.biztime.campusg.controller;

/**
 * @author     Soumya
 * @Module     Master Data
 * @Purpose    Data Entry
 *
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.biztime.campusg.dao.MasterDataDAOImpl;
import com.biztime.campusg.model.AcademicYearmodel;
import com.biztime.campusg.model.ApplicantStatusmodel;
import com.biztime.campusg.model.Batchmodel;
import com.biztime.campusg.model.BloodGroupmodel;
import com.biztime.campusg.model.Categorymodel;
import com.biztime.campusg.model.CollegeDetail;
import com.biztime.campusg.model.CourseLevelmodel;
import com.biztime.campusg.model.Coursemodel;
import com.biztime.campusg.model.Departmentmodel;
import com.biztime.campusg.model.Documentmodel;
import com.biztime.campusg.model.LeaveTypemodel;
import com.biztime.campusg.model.Mapmodel;
import com.biztime.campusg.model.Modulemodel;
import com.biztime.campusg.model.Optionalmodel;
import com.biztime.campusg.model.Paymentmodemodel;
import com.biztime.campusg.model.Permissionmodel;
import com.biztime.campusg.model.Programmodel;
import com.biztime.campusg.model.Receiptmodel;
import com.biztime.campusg.model.Rolemodel;
import com.biztime.campusg.model.Subjectmodel;
import com.biztime.campusg.model.Usertypemodel;



@Controller
public class MasterDataController {

	private static final String sessionFactory = null;
	private MasterDataDAOImpl masterDataDAOImpl;
	
	
	@Autowired(required=true)
	@Qualifier(value="masterDataDAO")
	public void setMasterDataDAOImpl(MasterDataDAOImpl m){
		this.masterDataDAOImpl = m;
	}
	
	/*  Leave type Detail Insert*/
	@Transactional
	@RequestMapping(value = "/masterleavetypepage", method = RequestMethod.GET)
	public String masterPage(@ModelAttribute("leave") LeaveTypemodel leave,Model model) {
		
		model.addAttribute("leave", new LeaveTypemodel());
		
		return "LeaveType";
	}



	@Transactional
	@RequestMapping(value= "/saveLeaveDetail", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("leave") LeaveTypemodel leave,Model model)
		{
		
		
		int success=this.masterDataDAOImpl.saveLeaveDetail(leave);
		model.addAttribute("success", success);
		    return getLeaveDetail();
		
		
	}
	 
	/*  leave Detail View*/
	@Transactional
	@RequestMapping(value = "/viewleave", method = RequestMethod.GET)
	public ModelAndView getLeaveDetail()
	 {
			
	   Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Leave_detail());
		return new ModelAndView("LeaveTypeDetail", model);
			
	 }
	
	/*View Complete data of leave table*/
	@Transactional
	@RequestMapping(value = "/toviewcompleteleaveDetail", method = RequestMethod.GET)
	public String getLeaveDetailComplete(@ModelAttribute("leave") LeaveTypemodel leave,Model model,HttpServletRequest req)
	 {
		int leaveTypeId=Integer.parseInt(req.getParameter("leaveTypeId"));
		System.out.println("leaveTypeId:"+leaveTypeId);	
		model.addAttribute("p", this.masterDataDAOImpl.get_Leave_detailedit(leaveTypeId));
		//model.addAttribute("edit_college_detail", new CollegeDetail());
		return "LeaveCompleteDisplay";
			
	 }
	
	
	
	@Transactional
	@RequestMapping(value = "/viewleaveback", method = RequestMethod.POST)
	public ModelAndView getLeaveDetailback()
	 {
			
	   Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Leave_detail());
		return new ModelAndView("LeaveTypeDetail", model);
			
	 }
	

	
	/* leave Detail Edit*/
	@Transactional
	@RequestMapping(value = "/toeditleaveDetail", method = RequestMethod.GET)
	public String getToeditleaveDetail(@ModelAttribute("leave") LeaveTypemodel leave,Model model,HttpServletRequest req)
	
	 {
		int leaveTypeId=Integer.parseInt(req.getParameter("leaveTypeId"));
		System.out.println("leaveTypeId:"+leaveTypeId);	
		model.addAttribute("p", this.masterDataDAOImpl.get_Leave_detailedit(leaveTypeId));
		
		return "edit_leavetype";
		
		
	 }
	
	/*leave detail update*/
	@Transactional
	@RequestMapping(value= "/Update_Leave_view", method = RequestMethod.POST)
	public ModelAndView Update_leave_view(@ModelAttribute("leave") LeaveTypemodel leave,HttpServletRequest req){
		
		this.masterDataDAOImpl.Update_Leave_view(leave);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Leave_detail());
		
		return new ModelAndView("LeaveTypeDetail", model);
		//return "hello";
		
		}
	
	/*Category detail delete*/
	@Transactional
	@RequestMapping(value= "/todeleteleaveDetail", method = RequestMethod.GET)
	public ModelAndView Delete_Leave_view(@ModelAttribute("leave") LeaveTypemodel leave,HttpServletRequest req){
		
		this.masterDataDAOImpl.Delete_Leave_view(leave);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Category_detail());
		
		return new ModelAndView("LeaveTypeDisplay", model);
		//return "hello";
	}
		
	

	
	
	/*  College Detail Insert*/
	
	@Transactional
	@RequestMapping(value = "/masterpage", method = RequestMethod.GET)
	public String masterPage(@ModelAttribute("college") CollegeDetail m,Model model) {
		
		model.addAttribute("college", new CollegeDetail());
		
		return "CollegeDetailPage";
	}



	@Transactional
	@RequestMapping(value= "/saveCollegeDetail", method = RequestMethod.POST)
	public ModelAndView addcollege(@ModelAttribute("college") CollegeDetail m,Model model)
		{
		
		
		int success=this.masterDataDAOImpl.saveCollegedetail(m);
		model.addAttribute("success", success);
		    return getCollegeDetail();
		
		
	}
	 
	
	/*  College Detail View*/
	@Transactional
	@RequestMapping(value = "/viewcollege", method = RequestMethod.GET)
	public ModelAndView getCollegeDetail()
	 {
			
	   Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_College_detail());
		return new ModelAndView("CollegeDetailDisplay", model);
			
	 }
	/*View Complete data of college_detail table*/
	@Transactional
	@RequestMapping(value = "/toviewcompletecollegeDetail", method = RequestMethod.GET)
	public String getCollegeDetailComplete(@ModelAttribute("college") CollegeDetail m,Model model,HttpServletRequest req)
	 {
		int collegeId=Integer.parseInt(req.getParameter("collegeId"));
		System.out.println("collegeId:"+collegeId);	
		model.addAttribute("p", this.masterDataDAOImpl.get_College_detailedit(collegeId));
		//model.addAttribute("edit_college_detail", new CollegeDetail());
		return "CollegeDetailCompleteDisplay";
			
	 }
	
	@Transactional
	@RequestMapping(value = "/viewcollegeback", method = RequestMethod.POST)
	public ModelAndView getCollegeDetailback()
	 {
			
	   Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_College_detail());
		return new ModelAndView("CollegeDetailDisplay", model);
			
	 }
	
	/* College Detail Edit*/
	@Transactional
	@RequestMapping(value = "/toeditcollegeDetail", method = RequestMethod.GET)
	public String getToeditcollegeDetail(@ModelAttribute("college") CollegeDetail m,Model model,HttpServletRequest req)
	
	 {
		int collegeId=Integer.parseInt(req.getParameter("collegeId"));
		System.out.println("collegeId:"+collegeId);	
		model.addAttribute("p", this.masterDataDAOImpl.get_College_detailedit(collegeId));
		//model.addAttribute("edit_college_detail", new CollegeDetail());
		return "edit_college_detail";
		
		
	 }
	
	

	/*College detail update*/
	@Transactional
	@RequestMapping(value= "/Update_College_view", method = RequestMethod.POST)
	public ModelAndView Update_College_view(@ModelAttribute("college") CollegeDetail c,HttpServletRequest req){
		
		this.masterDataDAOImpl.Update_College_view(c);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_College_detail());
		
		return new ModelAndView("CollegeDetailDisplay", model);
		//return "hello";
		
		}
	
	@Transactional
	@RequestMapping(value= "/todeletecollegeDetail", method = RequestMethod.GET)
	public ModelAndView Delete_College_view(@ModelAttribute("college") CollegeDetail c,HttpServletRequest req){
		
		this.masterDataDAOImpl.Delete_College_view(c);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_College_detail());
		
		return new ModelAndView("CollegeDetailDisplay", model);
		//return "hello";
		
		}
	
	/*Insert Category Details*/
	
	@Transactional
	@RequestMapping(value = "/mastercategorypage", method = RequestMethod.GET)
	public String mastercategoryPage(@ModelAttribute("category") Categorymodel category,Model model) {
		
		model.addAttribute("category", new Categorymodel());
		
		return "CategoryDetailpage";
	}



	@Transactional
	@RequestMapping(value= "/saveCategoryDetail", method = RequestMethod.POST)
	public ModelAndView addcategory(@ModelAttribute("category") Categorymodel category,Model model){
		
		int success=this.masterDataDAOImpl.saveCategoryDetail(category);
		model.addAttribute("success",success);
	    return getCategoryDetail();

	}
	
	/*  Category Detail View*/
	@Transactional
	@RequestMapping(value = "/viewcategory", method = RequestMethod.GET)
	public ModelAndView getCategoryDetail()
	 {
			
	   Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Category_detail());
		return new ModelAndView("CategoryDetailview", model);
			
	 }
	
	@Transactional
	@RequestMapping(value = "/toviewcompletecategoryDetail", method = RequestMethod.GET)
	public String getCategoryDetailComplete(@ModelAttribute("category") Categorymodel category,Model model,HttpServletRequest req)
	 {
		int categoryId=Integer.parseInt(req.getParameter("categoryId"));
		System.out.println("categoryId:"+categoryId);	
		model.addAttribute("p", this.masterDataDAOImpl.get_Category_detailedit(categoryId));
		
		
		return "CategoryDetailCompleteDisplay";
			
	 }
	
	@Transactional
	@RequestMapping(value = "/viewcategoryback", method = RequestMethod.POST)
	public ModelAndView getCategoryDetailback()
	 {
			
	   Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Category_detail());
		return new ModelAndView("CategoryDetailview", model);
			
	 }
	
	
	/* Category Detail Edit*/
	@Transactional
	@RequestMapping(value = "/toeditcategoryDetail", method = RequestMethod.GET)
	public String getToeditcategoryDetail(@ModelAttribute("category") Categorymodel category,Model model,HttpServletRequest req)
	
	 {
		int categoryId=Integer.parseInt(req.getParameter("categoryId"));
		System.out.println("categoryId:"+categoryId);	
		model.addAttribute("p", this.masterDataDAOImpl.get_Category_detailedit(categoryId));
		
		return "edit_category_detail";
		
		
	 }
	
	/*Category detail update*/
	@Transactional
	@RequestMapping(value= "/Update_Category_view", method = RequestMethod.POST)
	public ModelAndView Update_Category_view(@ModelAttribute("category") Categorymodel category,HttpServletRequest req){
		
		this.masterDataDAOImpl.Update_Category_view(category);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Category_detail());
		
		return new ModelAndView("CategoryDetailview", model);
		//return "hello";
		
		}
	
	/*Category detail delete*/
	@Transactional
	@RequestMapping(value= "/todeletecategoryDetail", method = RequestMethod.GET)
	public ModelAndView Delete_Category_view(@ModelAttribute("category") Categorymodel category,HttpServletRequest req){
		
		this.masterDataDAOImpl.Delete_Category_view(category);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Category_detail());
		
		return new ModelAndView("CategoryDetailview", model);
		//return "hello";
		
		}

/*Insert Paymentmode Details*/
	
	@Transactional
	@RequestMapping(value = "/masterpaymentpage", method = RequestMethod.GET)
	public String masterpaymentPage(@ModelAttribute("payment") Paymentmodemodel payment,Model model) {
		
		model.addAttribute("payment", new Paymentmodemodel());
		
		return "PaymentmodeDetailPage";
	}



	@Transactional
	@RequestMapping(value= "/savePaymentDetail", method = RequestMethod.POST)
	public ModelAndView addpaymentmode(@ModelAttribute("payment") Paymentmodemodel payment,Model model){
		
		int success=this.masterDataDAOImpl.savePaymentDetail(payment);
		model.addAttribute("success",success);
	    return getPaymentmodeDetail();

	}
	
	/*  Payment Detail View*/
	
	@Transactional
	@RequestMapping(value = "/viewpaymentmode", method = RequestMethod.GET)
	public ModelAndView getPaymentmodeDetail()
	 {
			
	   Map<String, Object> model = new HashMap<String, Object>();
		model.put("p", this.masterDataDAOImpl.get_Payment_detail());
		return new ModelAndView("PaymentmodeDetailview", model);
			
	 }
	 
	 @Transactional
		@RequestMapping(value = "/toviewcompletepaymentDetail", method = RequestMethod.GET)
		public String getPaymentmodeDetailComplete(@ModelAttribute("payment") Paymentmodemodel payment,Model model,HttpServletRequest req)
		 {
			int paymentmodeId=Integer.parseInt(req.getParameter("paymentmodeId"));
			System.out.println("paymentmodeId:"+paymentmodeId);	
			model.addAttribute("p", this.masterDataDAOImpl.get_Paymentmode_detailedit(paymentmodeId));
			
			
			return "PaymentmodeDetailCompleteDisplay";
				
		 }
		
		@Transactional
		@RequestMapping(value = "/viewpaymentmodeback", method = RequestMethod.POST)
		public ModelAndView getPaymentmodeDetailback()
		 {
				
		   Map<String, Object> model = new HashMap<String, Object>();
			model.put("p", this.masterDataDAOImpl.get_Payment_detail());
			return new ModelAndView("PaymentmodeDetailview", model);
				
		 }
		
		/* Payment Detail Edit*/
		@Transactional
		@RequestMapping(value = "/toeditpaymentmodeDetail", method = RequestMethod.GET)
		public String getToeditpaymentDetail(@ModelAttribute("payment") Paymentmodemodel payment,Model model,HttpServletRequest req)
		
		 {
			int paymentmodeId=Integer.parseInt(req.getParameter("paymentmodeId"));
			System.out.println("paymentmodeId:"+paymentmodeId);	
			model.addAttribute("p", this.masterDataDAOImpl.get_Paymentmode_detailedit(paymentmodeId));
			
			return "edit_paymentmode_detail";
			
			
		 }
		
		/*Category detail update*/
		@Transactional
		@RequestMapping(value= "/Update_Paymentmode_view", method = RequestMethod.POST)
		public ModelAndView Update_Paymentmode_view(@ModelAttribute("payment") Paymentmodemodel payment,HttpServletRequest req){
			
			this.masterDataDAOImpl.Update_Paymentmode_view(payment);
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("p", this.masterDataDAOImpl.get_Payment_detail());
			
			return new ModelAndView("PaymentmodeDetailview", model);
			//return "hello";
			
			}
		
		/*Category detail delete*/
		@Transactional
		@RequestMapping(value= "/todeletepaymentmodeDetail", method = RequestMethod.GET)
		public ModelAndView Delete_Paymentmode_view(@ModelAttribute("payment") Paymentmodemodel payment,HttpServletRequest req){
			
			this.masterDataDAOImpl.Delete_Payment_view(payment);
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("p", this.masterDataDAOImpl.get_Payment_detail());
			
			return new ModelAndView("PaymentmodeDetailview", model);
			//return "hello";
			
			}
		

/*Save status*/
		
		

		
		@Transactional
		@RequestMapping(value = "/masterstatuspage", method = RequestMethod.GET)
		public String masterstatusPage(@ModelAttribute("status") ApplicantStatusmodel status,Model model) {
			
			model.addAttribute("status", new ApplicantStatusmodel());
						return "ApplicantStatusDetailPage";
		}
		
		/*Save for status*/
		@Transactional
		@RequestMapping(value= "/saveStatusDetail", method = RequestMethod.POST)
		public ModelAndView addstatus(@ModelAttribute("status") ApplicantStatusmodel status,Model model){
			
			int success=this.masterDataDAOImpl.saveStatusDetail(status);
			model.addAttribute("success",success);
		    return getStatusDetail();

		}
		
		/*View status*/
		
		@Transactional
		@RequestMapping(value = "/viewstatus", method = RequestMethod.GET)
		public ModelAndView getStatusDetail()
		 {
				
		   Map<String, Object> model = new HashMap<String, Object>();
			model.put("p", this.masterDataDAOImpl.get_Status_detail());
			return new ModelAndView("ApplicantStatusvie", model);
				
		 }
		
		@Transactional
		@RequestMapping(value = "/toviewcompletestatusDetail", method = RequestMethod.GET)
		public String getStatusDetailComplete(@ModelAttribute("status") ApplicantStatusmodel status,Model model,HttpServletRequest req)
		 {
			int statusId=Integer.parseInt(req.getParameter("statusId"));
			System.out.println("statusId:"+statusId);	
			model.addAttribute("p", this.masterDataDAOImpl.get_Status_detailedit(statusId));
			
			
			return "ApplicantstatusDetailcompleteview";
				
		 }
		
		@Transactional
		@RequestMapping(value = "/viewstatusback", method = RequestMethod.POST)
		public ModelAndView getStatusback()
		 {
				
		   Map<String, Object> model = new HashMap<String, Object>();
			model.put("p", this.masterDataDAOImpl.get_Status_detail());
			return new ModelAndView("ApplicantStatusvie", model);
				
		 }
		
		/*Edit status*/
		
		@Transactional
		@RequestMapping(value = "/toeditstatusDetail", method = RequestMethod.GET)
		public String getToeditstatusDetail(@ModelAttribute("status") ApplicantStatusmodel status,Model model,HttpServletRequest req)
		
		 {
			int statusId=Integer.parseInt(req.getParameter("statusId"));
			System.out.println("categoryId:"+statusId);	
			model.addAttribute("p", this.masterDataDAOImpl.get_Status_detailedit(statusId));
			
			return "edit_status_detail";
			
			
		 }
		
		/*Category status update*/
		@Transactional
		@RequestMapping(value= "/Update_Status_view", method = RequestMethod.POST)
		public ModelAndView Update_Status_view(@ModelAttribute("status") ApplicantStatusmodel status,HttpServletRequest req){
			
			this.masterDataDAOImpl.Update_Status_view(status);
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("p", this.masterDataDAOImpl.get_Status_detail());
			
			return new ModelAndView("ApplicantStatusvie", model);
			//return "hello";
			
			}
		
		@Transactional
		@RequestMapping(value= "/todeletestatusDetail", method = RequestMethod.GET)
		public ModelAndView Delete_Status_view(@ModelAttribute("status") ApplicantStatusmodel status,HttpServletRequest req){
			
			this.masterDataDAOImpl.Delete_Status_view(status);
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("p", this.masterDataDAOImpl.get_Status_detail());
			
			return new ModelAndView("ApplicantStatusvie", model);
			
			}

		
/*Save program*/
		
		

		
		@Transactional
		@RequestMapping(value = "/masterprogrampage", method = RequestMethod.GET)
		public String masterprogramPage(@ModelAttribute("program") Programmodel program,Model model) {
			
			model.addAttribute("program", new Programmodel());
			
			return "ProgramDetailPage";
		}
		
		/*Save for program*/
		@Transactional
		@RequestMapping(value= "/saveProgramDetail", method = RequestMethod.POST)
		public ModelAndView addstatus(@ModelAttribute("program") Programmodel program,Model model){
			
			int success=this.masterDataDAOImpl.saveProgramDetail(program);
			
		    return getProgramDetail();

		}
		

		/*View program*/
		
		@Transactional
		@RequestMapping(value = "/viewprogram", method = RequestMethod.GET)
		public ModelAndView getProgramDetail()
		 {
				
		   Map<String, Object> model = new HashMap<String, Object>();
			model.put("p", this.masterDataDAOImpl.get_Program_detail());
			return new ModelAndView("Programview", model);
				
		 }
		
		@Transactional
		@RequestMapping(value = "/toviewcompleteprogramDetail", method = RequestMethod.GET)
		public String getprogramComplete(@ModelAttribute("program") Programmodel program,Model model,HttpServletRequest req)
		 {
			int programId=Integer.parseInt(req.getParameter("programId"));
			System.out.println("programId:"+programId);	
			model.addAttribute("p", this.masterDataDAOImpl.get_Program_detailedit(programId));
			
			
			return "ProgramCompleteview";
				
		 }
		
		@Transactional
		@RequestMapping(value = "/viewprogramback", method = RequestMethod.POST)
		public ModelAndView getPrGroogramupback()
		 {
			
			   Map<String, Object> model = new HashMap<String, Object>();
				model.put("p", this.masterDataDAOImpl.get_Program_detail());
				return new ModelAndView("Programview", model);

		 }
			
			
			
			/*Edit Program*/
				
				@Transactional
				@RequestMapping(value = "/toeditprogramDetail", method = RequestMethod.GET)
				public String getToeditprogramDetail(@ModelAttribute("program") Programmodel program,Model model,HttpServletRequest req)
				
				 {
					int ProgramId=Integer.parseInt(req.getParameter("programId"));
					System.out.println("ProgramId:"+ProgramId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Program_detailedit(ProgramId));
					
					return "edit_program_detail";
					
					
				 }
				
				
				/*Program update*/
				@Transactional
				@RequestMapping(value= "/Update_Program_view", method = RequestMethod.POST)
				public ModelAndView Update_Program_view(@ModelAttribute("program") Programmodel program,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Program_view(program);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Program_detail());
					
					return new ModelAndView("Programview", model);
					//return "hello";
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeleteprogramDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Program_view(@ModelAttribute("program") Programmodel program,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Program_view(program);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Program_detail());
					
					return new ModelAndView("Programview", model);
					
					}
				
				
				
				/*Save course*/
				
				
				@Transactional
				@RequestMapping(value = "/mastercoursepage", method = RequestMethod.GET)
				public String mastercoursePage(@ModelAttribute("course") Coursemodel course,Model model) {
			    
					
					
					return "CourseDetailPage";
				}
				
				/*Save for course*/
				
				
				@Transactional
				@RequestMapping(value= "/saveCourseDetails", method = RequestMethod.POST)
				public ModelAndView addstatus(@ModelAttribute("course") Coursemodel course,Model model){
					
					int success=this.masterDataDAOImpl.saveCourseDetails(course);
					
					model.addAttribute("success",success);
				    return getCourseDetail();

				}
				
				
				/*View course*/
				
				@Transactional
				@RequestMapping(value = "/viewcourse", method = RequestMethod.GET)
				public ModelAndView getCourseDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Course_detail());
					return new ModelAndView("CourseDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletecourseDetail", method = RequestMethod.GET)
				public String getcourseComplete(@ModelAttribute("course") Coursemodel course,Model model,HttpServletRequest req)
				 {
					int courseId=Integer.parseInt(req.getParameter("courseId"));
					System.out.println("courseId:"+courseId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Course_detailedit(courseId));
					
					
					return "CourseCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewcourseback", method = RequestMethod.POST)
				public ModelAndView getcourseback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Course_detail());
						return new ModelAndView("CourseDetailview", model);

				 }

				
/*Edit Program*/
				
				@Transactional
				@RequestMapping(value = "/toeditcourseDetail", method = RequestMethod.GET)
				public String getToeditcourseDetail(@ModelAttribute("course") Coursemodel course,Model model,HttpServletRequest req)
				
				 {
					int courseId=Integer.parseInt(req.getParameter("courseId"));
					System.out.println("courseId:"+courseId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Course_detailedit(courseId));
					
					return "edit_course_detail";
					
					
				 }
				
				
				/*Program update*/
				@Transactional
				@RequestMapping(value= "/Update_Course_view", method = RequestMethod.POST)
				public ModelAndView Update_Program_view(@ModelAttribute("course") Coursemodel course,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Course_view(course);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Course_detail());
					
					return new ModelAndView("CourseDetailview", model);
					//return "hello";
					
					}
				
				@Transactional
				@RequestMapping(value= "/todeletecourseDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Course_view(@ModelAttribute("course") Coursemodel course,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Course_view(course);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Course_detail());
					
					return new ModelAndView("Programview", model);
					
					}
				
				
/*Save courselevel*/
				
				
				@Transactional
				@RequestMapping(value = "/mastercourselevelpage", method = RequestMethod.GET)
				public String mastercoursePage(@ModelAttribute("courselevel") CourseLevelmodel courselevel,Model model) {
			    
					model.addAttribute("course", new CourseLevelmodel());
					
					return "CourselevelDetailPage";
				}
				
				/*Save for course*/
				@Transactional
				@RequestMapping(value= "/saveCourselevelDetail", method = RequestMethod.POST)
				public ModelAndView addcourselevel(@ModelAttribute("courselevel") CourseLevelmodel courselevel,Model model){
					
					int success=this.masterDataDAOImpl.saveCourselevelDetail(courselevel);
				    model.addAttribute("success", success);
				    return getCourselevelDetail();

				}
				
				
/*View courselevel*/
				
				@Transactional
				@RequestMapping(value = "/viewcourselevel", method = RequestMethod.GET)
				public ModelAndView getCourselevelDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Courselevel_detail());
					return new ModelAndView("CourseLevelDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletecourselevelDetail", method = RequestMethod.GET)
				public String getcourseComplete(@ModelAttribute("courselevel") CourseLevelmodel courselevel,Model model,HttpServletRequest req)
				 {
					int courselevelId=Integer.parseInt(req.getParameter("courselevelId"));
					System.out.println("courselevelId:"+courselevelId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Courselevel_detailedit(courselevelId));
					
					
					return "CourseLevelCompleteDetailview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewcourselevelback", method = RequestMethod.POST)
				public ModelAndView getcourselevelback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Courselevel_detail());
						return new ModelAndView("CourseLevelDetailview", model);

				 }
				
/*Edit courselevel*/
				
				@Transactional
				@RequestMapping(value = "/toeditcourselevelDetail", method = RequestMethod.GET)
				public String getToeditcourselevelDetail(@ModelAttribute("courselevel") CourseLevelmodel courselevel,Model model,HttpServletRequest req)
				
				 {
					int courselevelId=Integer.parseInt(req.getParameter("courselevelId"));
					System.out.println("courselevelId:"+courselevelId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Courselevel_detailedit(courselevelId));
					
					return "edit_courselevel_detail";
					
					
				 }
				
				
				/*courselevel update*/
				@Transactional
				@RequestMapping(value= "/Update_Courselevel_view", method = RequestMethod.POST)
				public ModelAndView Update_Courselevel_view(@ModelAttribute("courselevel") CourseLevelmodel courselevel,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Courselevel_view(courselevel);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Courselevel_detail());
					
					return new ModelAndView("CourseLevelDetailview", model);
					
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeletecourselevelDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Courselevel_view(@ModelAttribute("courselevel") CourseLevelmodel courselevel,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Courselevel_view(courselevel);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Courselevel_detail());
					
					return new ModelAndView("CourseLevelDetailview", model);
					
					}
				
				
/*Save department*/
				
				
				@Transactional
				@RequestMapping(value = "/masterdepartmentpage", method = RequestMethod.GET)
				public String mastercoursePage(@ModelAttribute("department") Departmentmodel department,Model model) {
			    
					model.addAttribute("department", new Departmentmodel());
					
					return "DepartmentDetailpage";
				}
				
				/*Save for course*/
				@Transactional
				@RequestMapping(value= "/saveDepartmentDetail", method = RequestMethod.POST)
				public ModelAndView addcourselevel(@ModelAttribute("department") Departmentmodel department,Model model){
					
					int success=this.masterDataDAOImpl.savedepartmentDetail(department);
					model.addAttribute("success",success);
				    return getDepartmentDetail();

				}
				
				
/*Save permission*/
				
				
				@Transactional
				@RequestMapping(value = "/masterpermissionpage", method = RequestMethod.GET)
				public String mastercoursePage(@ModelAttribute("permission") Permissionmodel permission,Model model) {
			    
					model.addAttribute("course", new Permissionmodel());
					
					return "PermissionDetailpage";
				}
				
				/*Save for course*/
				@Transactional
				@RequestMapping(value= "/savePermissionDetail", method = RequestMethod.POST)
				public ModelAndView addcourselevel(@ModelAttribute("permission") Permissionmodel permission,Model model){
					
					int success=this.masterDataDAOImpl.savePermissionDetail(permission);
					model.addAttribute("success", success);
				    return getPermissionDetail();

				}

				
/*View departmnet*/
				
				@Transactional
				@RequestMapping(value = "/viewdepartment", method = RequestMethod.GET)
				public ModelAndView getDepartmentDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Department_detail());
					return new ModelAndView("DepartmentDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletedepartmentDetail", method = RequestMethod.GET)
				public String getdepartmentComplete(@ModelAttribute("department") Departmentmodel department,Model model,HttpServletRequest req)
				 {
					int departmentId=Integer.parseInt(req.getParameter("departmentId"));
					System.out.println("departmentId:"+departmentId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Department_detailedit(departmentId));
					
					
					return "DepartmentCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewdepartmentback", method = RequestMethod.POST)
				public ModelAndView getdepartmentback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Department_detail());
						return new ModelAndView("DepartmentDetailview", model);

				 }
				
				
				/*view permission*/
				

				
				@Transactional
				@RequestMapping(value = "/viewpermission", method = RequestMethod.GET)
				public ModelAndView getPermissionDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Permission_detail());
					return new ModelAndView("PermissionDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletepermissionDetail", method = RequestMethod.GET)
				public String getpermissionComplete(@ModelAttribute("permission") Permissionmodel permission,Model model,HttpServletRequest req)
				 {
					int permissionId=Integer.parseInt(req.getParameter("permissionId"));
					System.out.println("permissionId:"+permissionId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Permission_detailedit(permissionId));
					
					
					return "PermissionCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewpermissionback", method = RequestMethod.POST)
				public ModelAndView getpermissionback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Permission_detail());
						return new ModelAndView("PermissionDetailview", model);

				 }
				
				
				/*Edit deaprtment*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditdepartmentDetail", method = RequestMethod.GET)
				public String getToeditdepartmentDetail(@ModelAttribute("department") Departmentmodel department,Model model,HttpServletRequest req)
				
				 {
					int departmentId=Integer.parseInt(req.getParameter("departmentId"));
					System.out.println("departmentId:"+departmentId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Department_detailedit(departmentId));
					
					return "edit_department";
					
					
				 }
				
				
				/*courselevel update*/
				@Transactional
				@RequestMapping(value= "/Update_Department_view", method = RequestMethod.POST)
				public ModelAndView Update_Department_view(@ModelAttribute("department") Departmentmodel department,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Department_view(department);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Department_detail());
					
					return new ModelAndView("DepartmentDetailview", model);
					
					
					}
				
				
/*Edit Permission*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditpermissionDetail", method = RequestMethod.GET)
				public String getToeditpermissionDetail(@ModelAttribute("permission") Permissionmodel permission,Model model,HttpServletRequest req)
				
				 {
					int permissionId=Integer.parseInt(req.getParameter("permissionId"));
					System.out.println("permissionId:"+permissionId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Permission_detailedit(permissionId));
					
					return "edit_permission";
					
					
				 }
				
				
				/*courselevel update*/
				@Transactional
				@RequestMapping(value= "/Update_Permission_view", method = RequestMethod.POST)
				public ModelAndView Update_Permission_view(@ModelAttribute("permission") Permissionmodel permission,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Permission_view(permission);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Permission_detail());
					
					return new ModelAndView("PermissionDetailview", model);
					
					
					}
				
				
				/*delete departnet*/
				@Transactional
				@RequestMapping(value= "/todeletedepartmentDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Department_view(@ModelAttribute("department") Departmentmodel department,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Department_view(department);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Department_detail());
					
					return new ModelAndView("DepartmentDetailview", model);
					
					}
				
				
				/*delete permission*/
				
				@Transactional
				@RequestMapping(value= "/todeletepermissionDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Permission_view(@ModelAttribute("permission") Permissionmodel permission,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Permission_view(permission);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Permission_detail());
					
					return new ModelAndView("PermissionDetailview", model);
					
					}
				
/*Save receipt*/
				
				
				@Transactional
				@RequestMapping(value = "/masterreceiptpage", method = RequestMethod.GET)
				public String mastercoursePage(@ModelAttribute("receipt") Receiptmodel receipt,Model model) {
			    
					model.addAttribute("receipt", new Receiptmodel());
					
					return "ReceiptDetailpage";
				}
				
				/*Save for Receipt*/
				@Transactional
				@RequestMapping(value= "/saveReceiptDetail", method = RequestMethod.POST)
				public ModelAndView addreceipt(@ModelAttribute("receipt") Receiptmodel receipt,Model model){
					
					int success=this.masterDataDAOImpl.savereceiptDetail(receipt);
					model.addAttribute("success", success);
				    return getreceiptDetail();

				}
				
				
/*Save Optional*/
				
				
				@Transactional
				@RequestMapping(value = "/masteroptionalpage", method = RequestMethod.GET)
				public String mastercoursePage(@ModelAttribute("optional") Optionalmodel optional,Model model) {
			    
					model.addAttribute("optional", new Optionalmodel());
					
					return "OptionalDetailpage";
				}
				
				/*Save for optional*/
				@Transactional
				@RequestMapping(value= "/saveOptionalDetail", method = RequestMethod.POST)
				public ModelAndView addoptional(@ModelAttribute("optional") Optionalmodel optional,Model model){
					
					int success=this.masterDataDAOImpl.saveOptionalDetail(optional);
					model.addAttribute("success",success);
				    return getOptionalDetail();

				}
				

				
/*View optional*/
				
				@Transactional
				@RequestMapping(value = "/viewoptional", method = RequestMethod.GET)
				public ModelAndView getOptionalDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Optional_detail());
					return new ModelAndView("OptionalDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompleteoptionalDetail", method = RequestMethod.GET)
				public String getoptionalComplete(@ModelAttribute("optional") Optionalmodel optional,Model model,HttpServletRequest req)
				 {
					int optionalId=Integer.parseInt(req.getParameter("optionalId"));
					System.out.println("optionalId:"+optionalId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Optional_detailedit(optionalId));
					
					return "OptionalCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewoptionalback", method = RequestMethod.POST)
				public ModelAndView getoptionalback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Optional_detail());
						return new ModelAndView("OptionalDetailview", model);

				 }
				
				
			
/*View receipt*/
				
				@Transactional
				@RequestMapping(value = "/viewreceipt", method = RequestMethod.GET)
				public ModelAndView getreceiptDetail(
						)
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Receipt_detail());
					return new ModelAndView("ReceiptDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletereceiptDetail", method = RequestMethod.GET)
				public String getreceiptComplete(@ModelAttribute("receipt") Receiptmodel receipt,Model model,HttpServletRequest req)
				 {
					int receiptId=Integer.parseInt(req.getParameter("receiptId"));
					System.out.println("receiptId:"+receiptId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Receipt_detailedit(receiptId));
					
					
					return "ReceiptCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewreceiptback", method = RequestMethod.POST)
				public ModelAndView getreceiptback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Receipt_detail());
						return new ModelAndView("ReceiptDetailview", model);

				 }
				
				
				/*Edit optional*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditoptionalDetail", method = RequestMethod.GET)
				public String getToeditoptionalDetail(@ModelAttribute("optional") Optionalmodel optional,Model model,HttpServletRequest req)
				
				 {
					int optionalId=Integer.parseInt(req.getParameter("optionalId"));
					System.out.println("optionalId:"+optionalId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Optional_detailedit(optionalId));
					
					return "edit_optional_detail";
					
					
				 }
				
				
				/*optional update*/
				@Transactional
				@RequestMapping(value= "/Update_Optional_view", method = RequestMethod.POST)
				public ModelAndView Update_Optional_view(@ModelAttribute("optional") Optionalmodel optional,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Optional_view(optional);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Optional_detail());
					
					return new ModelAndView("OptionalDetailview", model);
					
					
					}
				
				
/*Edit Receipt*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditreceiptDetail", method = RequestMethod.GET)
				public String getToeditreceiptDetail(@ModelAttribute("receipt") Receiptmodel receipt,Model model,HttpServletRequest req)
				
				 {
					int receiptId=Integer.parseInt(req.getParameter("receiptId"));
					System.out.println("receiptId:"+receiptId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Receipt_detailedit(receiptId));
					
					return "edit_receipt_detail";
					
					
				 }
				
				
				/*receipt update*/
				@Transactional
				@RequestMapping(value= "/Update_Receipt_view", method = RequestMethod.POST)
				public ModelAndView Update_Receipt_view(@ModelAttribute("receipt") Receiptmodel receipt,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Receipt_view(receipt);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Receipt_detail());
					
					return new ModelAndView("ReceiptDetailview", model);
					
					
					}
				
				
				/*delete optional*/
				
				
				@Transactional
				@RequestMapping(value= "/todeleteoptionalDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Optional_view(@ModelAttribute("optional") Optionalmodel optional,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Optional_view(optional);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Optional_detail());
					
					return new ModelAndView("OptionalDetailview", model);
					
					}
				
				
				/*delete receipt*/
				
				@Transactional
				@RequestMapping(value= "/todeletereceiptDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Receipt_view(@ModelAttribute("receipt") Receiptmodel receipt,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Receipt_view(receipt);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Receipt_detail());
					
					return new ModelAndView("ReceiptDetailview", model);
					
					}
				
				
				
				/*Save role*/
				
				
				@Transactional
				@RequestMapping(value = "/masterrolepage", method = RequestMethod.GET)
				public String masterrolePage(@ModelAttribute("role") Rolemodel role,Model model) {
			    
					model.addAttribute("role", new Rolemodel());
					
					return "RoleDetailpage";
				}
				
				/*Save for role*/
				
				
				@Transactional
				@RequestMapping(value= "/saveRoleDetail", method = RequestMethod.POST)
				public ModelAndView addrole(@ModelAttribute("role") Rolemodel role,Model model){
					
					int success=this.masterDataDAOImpl.saveroleDetail(role);
					model.addAttribute("success",success);
				    return getRoleDetail();

				}

				
/*View role*/
				
				@Transactional
				@RequestMapping(value = "/viewrole", method = RequestMethod.GET)
				public ModelAndView getRoleDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Role_detail());
					return new ModelAndView("RoleDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompleteroleDetail", method = RequestMethod.GET)
				public String getrolelComplete(@ModelAttribute("role") Rolemodel role,Model model,HttpServletRequest req)
				 {
					int roleId=Integer.parseInt(req.getParameter("roleId"));
					System.out.println("roleId:"+roleId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Role_detailedit(roleId));
					
					
					return "RoleCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewroleback", method = RequestMethod.POST)
				public ModelAndView getrolelback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Role_detail());
						return new ModelAndView("RoleDetailview", model);

				 }
				
/*Edit role*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditroleDetail", method = RequestMethod.GET)
				public String getToeditrolelDetail(@ModelAttribute("role") Rolemodel role,Model model,HttpServletRequest req)
				
				 {
					int roleId=Integer.parseInt(req.getParameter("roleId"));
					System.out.println("roleId:"+roleId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Role_detailedit(roleId));
					
					return "edit_role";
					
					
				 }
				
				
				/*role update*/
				@Transactional
				@RequestMapping(value= "/Update_Role_view", method = RequestMethod.POST)
				public ModelAndView Update_Role_view(@ModelAttribute("role") Rolemodel role,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Role_view(role);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Role_detail());
					
					return new ModelAndView("RoleDetailview", model);
					
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeleteroleDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Role_view(@ModelAttribute("role") Rolemodel role,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Role_view(role);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Role_detail());
					
					return new ModelAndView("RoleDetailview", model);
					
					}
				
				/*Save doc*/
				@Transactional
				@RequestMapping(value = "/masterdocpage", method = RequestMethod.GET)
				public String masterdocPage(@ModelAttribute("document") Documentmodel document,Model model) {
			    
					model.addAttribute("role", new Documentmodel());
					
					return "DocumentDetailpage";
				}
				
				/*Save for doc*/
				@Transactional
				@RequestMapping(value= "/saveDocumentDetail", method = RequestMethod.POST)
				public ModelAndView adddocument(@ModelAttribute("document") Documentmodel document,Model model){
					
					int success=this.masterDataDAOImpl.savedocumentDetail(document);
					model.addAttribute("success",success);
				    return getDocumentDetail();

				}

				
/*View doc*/
				
				@Transactional
				@RequestMapping(value = "/viewdocument", method = RequestMethod.GET)
				public ModelAndView getDocumentDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Document_detail());
					return new ModelAndView("DocumentDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletedocumentDetail", method = RequestMethod.GET)
				public String getdocumentlComplete(@ModelAttribute("document") Documentmodel document,Model model,HttpServletRequest req)
				 {
					int documentId=Integer.parseInt(req.getParameter("documentId"));
					System.out.println("documentId:"+documentId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Document_detailedit(documentId));
					
					
					return "DocumentCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewdocumentback", method = RequestMethod.POST)
				public ModelAndView getdocumentlback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Document_detail());
						return new ModelAndView("DocumentDetailview", model);

				 }
				
/*Edit doc*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditdocumentDetail", method = RequestMethod.GET)
				public String getToeditdocumentlDetail(@ModelAttribute("document") Documentmodel document,Model model,HttpServletRequest req)
				
				 {
					int documentId=Integer.parseInt(req.getParameter("documentId"));
					System.out.println("documentId:"+documentId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Document_detailedit(documentId));
					
					return "edit_document";
					
					
				 }
				
				
				/*doc update*/
				@Transactional
				@RequestMapping(value= "/Update_Document_view", method = RequestMethod.POST)
				public ModelAndView Update_Document_view(@ModelAttribute("document") Documentmodel document,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Document_view(document);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Document_detail());
					
					return new ModelAndView("DocumentDetailview", model);
					
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeletedocumentDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Document_view(@ModelAttribute("document") Documentmodel document,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Document_view(document);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Document_detail());
					
					return new ModelAndView("DocumentDetailview", model);
					
					}
				
				

				
			/*save batch*/
				@Transactional
				@RequestMapping(value = "/masterbatchpage", method = RequestMethod.GET)
				public String masterbatchPage(@ModelAttribute("batch") Batchmodel batch,Model model) {
			    
					model.addAttribute("subject", new Subjectmodel());
					
					return "BatchDetailpage";
				}
				
				/*save batch*/
				@Transactional
				@RequestMapping(value= "/saveBatchDetails", method = RequestMethod.POST)
				public ModelAndView addbatch(@ModelAttribute("batch") Batchmodel batch,Model model){
					
					int success=this.masterDataDAOImpl.savebatchDetail(batch);
					model.addAttribute("success",success);
				    return getBatchDetail();

				}
				
				
				
				
				
/*View batch*/
				
				@Transactional
				@RequestMapping(value = "/viewbatch", method = RequestMethod.GET)
				public ModelAndView getBatchDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Batch_detail());
					return new ModelAndView("BatchDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletebatchDetail", method = RequestMethod.GET)
				public String getbatchComplete(@ModelAttribute("batch") Batchmodel batch,Model model,HttpServletRequest req)
				 {
					int batchId=Integer.parseInt(req.getParameter("batchId"));
					System.out.println("batchId:"+batchId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Batch_detailedit(batchId));
					
					
					return "BatchDetailComplete";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewbatchback", method = RequestMethod.POST)
				public ModelAndView getbatchback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Batch_detail());
						return new ModelAndView("BatchDetailview", model);

				 }
				
				
				
/*Edit batch*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditbatchDetail", method = RequestMethod.GET)
				public String getToeditbatchDetail(@ModelAttribute("batch") Batchmodel batch,Model model,HttpServletRequest req)
				
				 {
					int batchId=Integer.parseInt(req.getParameter("batchId"));
					System.out.println("batchId:"+batchId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Batch_detailedit(batchId));
					
					return "edit_batch";
					
					
				 }
				
				
				/*update subject*/
				@Transactional
				@RequestMapping(value= "/Update_Batch_view", method = RequestMethod.POST)
				public ModelAndView Update_Batch_view(@ModelAttribute("batch") Batchmodel batch,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Batch_view(batch);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Batch_detail());
					
					return new ModelAndView("BatchDetailview", model);
					
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeletebatchDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Batch_view(@ModelAttribute("batch") Batchmodel batch,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Batch_view(batch);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Batch_detail());
					
					return new ModelAndView("BatchDetailview", model);
					
					}
				
				
				
				/*Save sub*/
				@Transactional
				@RequestMapping(value = "/mastersubjectpage", method = RequestMethod.GET)
				public String masterdocPage(@ModelAttribute("subject") Subjectmodel subject,Model model) {
			    
					model.addAttribute("subject", new Subjectmodel());
					
					return "SubjectDetailpage";
				}
				
				/*Save for sub*/
				@Transactional
				@RequestMapping(value= "/saveSubjectDetail", method = RequestMethod.POST)
				public ModelAndView addsubject(@ModelAttribute("subject") Subjectmodel subject,Model model){
					
					int success=this.masterDataDAOImpl.savesubjectDetail(subject);
					model.addAttribute("success",success);
				    return getSubjectDetail();

				}
				
				
/*View subject*/
				
				@Transactional
				@RequestMapping(value = "/viewsubject", method = RequestMethod.GET)
				public ModelAndView getSubjectDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Subject_detail());
					return new ModelAndView("SubjectDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletesubjectDetail", method = RequestMethod.GET)
				public String getsubjectComplete(@ModelAttribute("subject") Subjectmodel subject,Model model,HttpServletRequest req)
				 {
					int subjectId=Integer.parseInt(req.getParameter("subjectId"));
					System.out.println("subjectId:"+subjectId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Subject_detailedit(subjectId));
					
					
					return "SubjectCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewsubjectback", method = RequestMethod.POST)
				public ModelAndView getsubjectback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Subject_detail());
						return new ModelAndView("SubjectDetailview", model);

				 }
				
/*Edit sub*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditsubjectDetail", method = RequestMethod.GET)
				public String getToeditsubjectDetail(@ModelAttribute("subject") Subjectmodel subject,Model model,HttpServletRequest req)
				
				 {
					int subjectId=Integer.parseInt(req.getParameter("subjectId"));
					System.out.println("subjectId:"+subjectId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Subject_detailedit(subjectId));
					
					return "edit_subject";
					
					
				 }
				
				
				/*update subject*/
				@Transactional
				@RequestMapping(value= "/Update_Subject_view", method = RequestMethod.POST)
				public ModelAndView Update_Subject_view(@ModelAttribute("subject") Subjectmodel subject,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Subject_view(subject);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Subject_detail());
					
					return new ModelAndView("SubjectDetailview", model);
					
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeletesubjectDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Subject_view(@ModelAttribute("subject") Subjectmodel subject,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Subject_view(subject);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Subject_detail());
					
					return new ModelAndView("SubjectDetailview", model);
					
					}
				
				
/*Save usertype*/
				@Transactional
				@RequestMapping(value = "/masterusertypepage", method = RequestMethod.GET)
				public String masterusertypePage(@ModelAttribute("usertype") Usertypemodel usertype,Model model) {
			    
					model.addAttribute("usertype", new Usertypemodel());
					
					return "UsertypeDetailpage";
				}
				
				/*Save for doc*/
				@Transactional
				@RequestMapping(value= "/saveUsertypeDetail", method = RequestMethod.POST)
				public ModelAndView addusertype(@ModelAttribute("usertype") Usertypemodel usertype,Model model){
					
					int success=this.masterDataDAOImpl.saveusertypeDetail(usertype);
					model.addAttribute("success",success);
				    return getUsertypeDetail();

				}

				
/*View usertype*/
				
				@Transactional
				@RequestMapping(value = "/viewusertype", method = RequestMethod.GET)
				public ModelAndView getUsertypeDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Usertype_detail());
					return new ModelAndView("UsertypeDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompleteusertypeDetail", method = RequestMethod.GET)
				public String getusertypeComplete(@ModelAttribute("usertype") Usertypemodel usertype,Model model,HttpServletRequest req)
				 {
					int usertypeId=Integer.parseInt(req.getParameter("usertypeId"));
					System.out.println("usertypeId:"+usertypeId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Usertype_detailedit(usertypeId));
					
					
					return "UsertypeCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewusertypeback", method = RequestMethod.POST)
				public ModelAndView getusertypeback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Usertype_detail());
						return new ModelAndView("UsertypeDetailview", model);

				 }
				
/*Edit usertypw*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditusertypeDetail", method = RequestMethod.GET)
				public String getToeditusertypeDetail(@ModelAttribute("usertype") Usertypemodel usertype,Model model,HttpServletRequest req)
				
				 {
					int usertypeId=Integer.parseInt(req.getParameter("usertypeId"));
					System.out.println("usertypeId:"+usertypeId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Usertype_detailedit(usertypeId));
					
					return "edit_usertype";
					
					
				 }
				
				
				/*doc subject*/
				@Transactional
				@RequestMapping(value= "/Update_Usertype_view", method = RequestMethod.POST)
				public ModelAndView Update_Usertype_view(@ModelAttribute("usertype") Usertypemodel usertype,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Usertype_view(usertype);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Usertype_detail());
					
					return new ModelAndView("UsertypeDetailview", model);
					
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeleteusertypeDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Usertype_view(@ModelAttribute("usertyep") Usertypemodel usertype,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Usertype_view(usertype);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Usertype_detail());
					
					return new ModelAndView("UsertypeDetailview", model);
					
					}
				
				
	/*Save blood*/
				
				
				@Transactional
				@RequestMapping(value = "/masterbloodpage", method = RequestMethod.GET)
				public String masterbloodPage(@ModelAttribute("blood") BloodGroupmodel blood,Model model) {
			    
					model.addAttribute("blood", new BloodGroupmodel());
					
					return "BloodGroupDetailPage";
				}
				
				/*Save for blood*/
				
				
				@Transactional
				@RequestMapping(value= "/saveBloodDetail", method = RequestMethod.POST)
				public ModelAndView addblood(@ModelAttribute("blood") BloodGroupmodel blood,Model model){
					
					int success=this.masterDataDAOImpl.savebloodDetail(blood);
					model.addAttribute("success",success);
				    return getBloodDetail();

				}

				
/*View blood */
				
				@Transactional
				@RequestMapping(value = "/viewblood", method = RequestMethod.GET)
				public ModelAndView getBloodDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Blood_detail());
					return new ModelAndView("BloodGroupDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletebloodgroupDetail", method = RequestMethod.GET)
				public String getbloodgroupComplete(@ModelAttribute("blood") BloodGroupmodel blood,Model model,HttpServletRequest req)
				 {
					int groupId=Integer.parseInt(req.getParameter("groupId"));
					System.out.println("groupId:"+groupId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Bloodgroup_detailedit(groupId));
					
					
					return "BloodGroupDetailCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewbloodgroupback", method = RequestMethod.POST)
				public ModelAndView getbloodgrouplback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_Blood_detail());
						return new ModelAndView("BloodGroupDetailview", model);

				 }
				
/*Edit blood group*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditbloodgroupDetail", method = RequestMethod.GET)
				public String getToeditrbloodgrouplDetail(@ModelAttribute("blood") BloodGroupmodel blood,Model model,HttpServletRequest req)
				
				 {
					int groupId=Integer.parseInt(req.getParameter("groupId"));
					System.out.println("groupId:"+groupId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Bloodgroup_detailedit(groupId));
					
					return "edit_bloodgroup_detail";
					
					
				 }
				
				
				/*role update*/
				@Transactional
				@RequestMapping(value= "/Update_Bloodgroup_view", method = RequestMethod.POST)
				public ModelAndView Update_Bloodgroup_view(@ModelAttribute("blood") BloodGroupmodel blood,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Bloodgroup_view(blood);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Blood_detail());
					
					return new ModelAndView("BloodGroupDetailview", model);
					
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeletebloodgroupDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Bloodgroup_view(@ModelAttribute("blood") BloodGroupmodel blood,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Bloodgroup_view(blood);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_Blood_detail());
					
					return new ModelAndView("BloodGroupDetailview", model);
					
					}
				
				
/*Save module*/
				
				
				@Transactional
				@RequestMapping(value = "/mastermodulepage", method = RequestMethod.GET)
				public String mastermodulePage(@ModelAttribute("module") Modulemodel module,Model model) {
			    
					model.addAttribute("module", new Modulemodel());
					
					return "ModuleDetailpage";
				}
				
				/*Save for module*/
				
				
				@Transactional
				@RequestMapping(value= "/saveModuleDetail", method = RequestMethod.POST)
				public ModelAndView addmodule(@ModelAttribute("module") Modulemodel module,Model model){
					
					int success=this.masterDataDAOImpl.savemoduleDetail(module);
					model.addAttribute("success",success);
				    return getmoduleDetail();

				}

				
/*View blood */
				
				@Transactional
				@RequestMapping(value = "/viewmodule", method = RequestMethod.GET)
				public ModelAndView getmoduleDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_module_detail());
					return new ModelAndView("ModuleDetailview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompletemoduleDetail", method = RequestMethod.GET)
				public String getmoduleComplete(@ModelAttribute("module") Modulemodel module,Model model,HttpServletRequest req)
				 {
					int moduleId=Integer.parseInt(req.getParameter("moduleId"));
					System.out.println("moduleId:"+moduleId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Module_detailedit(moduleId));
					
					
					return "ModuleCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewmoduleback", method = RequestMethod.POST)
				public ModelAndView getmoduleback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_module_detail());
						return new ModelAndView("ModuleDetailview", model);

				 }
				
/*Edit module*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditmoduleDetail", method = RequestMethod.GET)
				public String getToeditmodulelDetail(@ModelAttribute("module") Modulemodel module,Model model,HttpServletRequest req)
				
				 {
					int moduleId=Integer.parseInt(req.getParameter("moduleId"));
					System.out.println("moduleId:"+moduleId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Module_detailedit(moduleId));
					
					return "edit_module";
					
					
				 }
				
				
				/*update module*/
				@Transactional
				@RequestMapping(value= "/Update_module_view", method = RequestMethod.POST)
				public ModelAndView Update_Module_view(@ModelAttribute("module") Modulemodel module,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Module_view(module);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_module_detail());
					
					return new ModelAndView("ModuleDetailview", model);
					
					
					}
				
				
				@Transactional
				@RequestMapping(value= "/todeletemoduleDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Module_view(@ModelAttribute("module") Modulemodel module,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Module_view(module);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_module_detail());
					
					return new ModelAndView("ModuleDetailview", model);
					
					}
				
					
				
				
/*Save academic*/
				
				
				@Transactional
				@RequestMapping(value = "/masteracademicpage", method = RequestMethod.GET)
				public String masteracademicPage(@ModelAttribute("academic") AcademicYearmodel academic,Model model) {
			    
					model.addAttribute("academic", new AcademicYearmodel());
					
					return "AcademicDetailpage";
				}
				
				/*Save for academic*/
				
				
				@Transactional
				@RequestMapping(value= "/saveAcademicDetail", method = RequestMethod.POST)
				public ModelAndView addacademic(@ModelAttribute("academic") AcademicYearmodel academic,Model model){
					
					int success= this.masterDataDAOImpl.saveacademicDetail(academic);
					
					model.addAttribute("success", success);
				   
					return getacademicDetail();

				}
				
				
/*View academic */
				
				@Transactional
				@RequestMapping(value = "/viewacademic", method = RequestMethod.GET)
				public ModelAndView getacademicDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_academic_detail());
					return new ModelAndView("Academicview", model);
						
				 }
				
				@Transactional
				@RequestMapping(value = "/toviewcompleteacademicDetail", method = RequestMethod.GET)
				public String getacademicComplete(@ModelAttribute("academic") AcademicYearmodel academic,Model model,HttpServletRequest req)
				 {
					int academicyearId=Integer.parseInt(req.getParameter("academicyearId"));
					System.out.println("academicyearId:"+academicyearId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Academic_detailedit(academicyearId));
					
					
					return "AcademicCompleteview";
						
				 }
				
				@Transactional
				@RequestMapping(value = "/viewacademicback", method = RequestMethod.POST)
				public ModelAndView getacademicback()
				 {
					
					   Map<String, Object> model = new HashMap<String, Object>();
						model.put("p", this.masterDataDAOImpl.get_academic_detail());
						return new ModelAndView("Academicview", model);

				 }
				

				
/*Edit academic*/
				
				
				@Transactional
				@RequestMapping(value = "/toeditacademicDetail", method = RequestMethod.GET)
				public String getToeditacademicDetail(@ModelAttribute("academic") AcademicYearmodel academic,Model model,HttpServletRequest req)
				
				 {
					int academicyearId=Integer.parseInt(req.getParameter("academicyearId"));
					System.out.println("academicyearId:"+academicyearId);	
					model.addAttribute("p", this.masterDataDAOImpl.get_Academic_detailedit(academicyearId));
					
					return "edit_academic";
					
					
				 }
				
				
				/*update academic*/
				@Transactional
				@RequestMapping(value= "/Update_Academic_view", method = RequestMethod.POST)
				public ModelAndView Update_Academic_view(@ModelAttribute("academic") AcademicYearmodel academic,HttpServletRequest req){
					
					this.masterDataDAOImpl.Update_Academic_view(academic);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_academic_detail());
					
					return new ModelAndView("Academicview", model);
					
					
					}
				
				/*delete academic*/	
				@Transactional
				@RequestMapping(value= "/todeleteacademicDetail", method = RequestMethod.GET)
				public ModelAndView Delete_Academic_view(@ModelAttribute("academic") AcademicYearmodel academic,HttpServletRequest req){
					
					this.masterDataDAOImpl.Delete_Academic_view(academic);
					Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_academic_detail());
					
					return new ModelAndView("Academicview", model);
					
					}

				
				
				@Transactional
				@RequestMapping(value = "/mastermanagepage", method = RequestMethod.GET)
				public String mastermanagePage(@ModelAttribute("manage") Batchmodel module,Model model) {
			    
					model.addAttribute("manage", new Batchmodel());
					
					return "Coursemanage";
				}
				
				
				@Transactional
				@RequestMapping(value = "/mastermappage", method = RequestMethod.GET)
				public String mastermapPage(@ModelAttribute("map") Mapmodel map,Model model) {
			    
					model.addAttribute("map", new Mapmodel());
					
					return "BatchStudentEmployeemap";
				}
				
				
				
				
				

				
				/*Save for map*/
				
				
				@Transactional
				@RequestMapping(value= "/saveMapDetails", method = RequestMethod.POST)
				public ModelAndView addmap(@ModelAttribute("map") Mapmodel map,Model model){
					
					int success= this.masterDataDAOImpl.savemapDetail(map);
					
					model.addAttribute("success", success);
				   
					return getmapDetail();

				}
				
				@Transactional
				@RequestMapping(value = "/viewmap", method = RequestMethod.GET)
				public ModelAndView getmapDetail()
				 {
						
				   Map<String, Object> model = new HashMap<String, Object>();
					model.put("p", this.masterDataDAOImpl.get_map_detail());
					return new ModelAndView("BatchEmployeeSubjectmappedview", model);
						
				 }
				
				
				
				/*****************************************************Dropdown******************************************************/
				
				@Transactional
				@RequestMapping("/get_college_id")
				public void receiptBook(HttpServletRequest req,HttpServletResponse resp)
				 {
					String collegeIdlist=this.masterDataDAOImpl.getCollegeIdlist();
					//get data for first drop down
					try {
						 resp.getWriter().write(collegeIdlist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				
				@Transactional
				@RequestMapping("/get_courselevel_name")
				public void courselevel(HttpServletRequest req,HttpServletResponse resp)
				 {
					String courselevelnamelist=this.masterDataDAOImpl.getCourselevelnamelist();
					//get data for first drop down
					try {
						 resp.getWriter().write(courselevelnamelist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				
				@Transactional
				@RequestMapping("/get_program_name")
				public void programname(HttpServletRequest req,HttpServletResponse resp)
				 {
					String getProgramnamelist=this.masterDataDAOImpl.getProgramnamelist();
					//get data for first drop down
					try {
						 resp.getWriter().write(getProgramnamelist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				
				@Transactional
				@RequestMapping("/get_parent_module_name")
				public void modulename(HttpServletRequest req,HttpServletResponse resp)
				 {
					String Modulelist=this.masterDataDAOImpl.getModulelist();
					//get data for first drop down
					try {
						 resp.getWriter().write(Modulelist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				
				 @Transactional
					@RequestMapping("/get_course_code")
				 public void coursecode(HttpServletRequest req,HttpServletResponse resp)
				 {
					String Coursecodelist=this.masterDataDAOImpl.getCoursecodelist();
					//get data for first drop down
					try {
						 resp.getWriter().write(Coursecodelist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				 
				 
				 

				 @Transactional
					@RequestMapping("/get_batch_name")
				 public void batchname(HttpServletRequest req,HttpServletResponse resp)
				 {
					String Batchnamelist=this.masterDataDAOImpl.getBatchNamelist();
					//get data for first drop down
					try {
						 resp.getWriter().write(Batchnamelist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				 
				 
				 @Transactional
					@RequestMapping("/get_subject_name")
				 public void subjectname(HttpServletRequest req,HttpServletResponse resp)
				 {
					String Subjectnamelist=this.masterDataDAOImpl.getSubjectNamelist();
					//get data for first drop down
					try {
						 resp.getWriter().write(Subjectnamelist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				 
				 
				 @Transactional
					@RequestMapping("/get_employeename")
				 public void studentname(HttpServletRequest req,HttpServletResponse resp)
				 {
					String Employeenamelist=this.masterDataDAOImpl.getEmployeeNamelist();
					//get data for first drop down
					try {
						 resp.getWriter().write(Employeenamelist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				 @Transactional
					@RequestMapping("/get_coursecode_type")
				 public void coursecodetype(HttpServletRequest req,HttpServletResponse resp)
				 {   
					 
					String selecteditem=req.getParameter("selecteditem");
					String Coursecodelist=this.masterDataDAOImpl.getCoursecodetype(selecteditem);
					//get data for first drop down
					try {
						 resp.getWriter().write(Coursecodelist);
						} 
					catch (IOException e)
						{
						// TODO Auto-generated catch block
						  e.printStackTrace();
						}
						
				 }
				 
				 
				 
				 /************************************************Left menu*****************************************************/
				
				 
				
					
}
		
		

