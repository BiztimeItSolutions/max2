<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>campus_G</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Blank -->

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">

</head>
<body>

    <div id="wrapper">


        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="">
                <ul class="nav" id="side-menu">
<!--                    <li class="sidebar-search">
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>

                    </li>-->   <!-- /input-group -->
                    <li class="border">  <!-- class="active" -->
                        <a href="#"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a><!-- /First Level -->
                    </li>
                    
                    <c:forEach items="${p}" var="c">
					<li class="border">
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> <c:out value="${c.module_name}"/><span class="fa arrow"></span></a><!--First Level -->
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="User.jsp">User</a><!--Second Level -->
                            </li>
                            <li>
                                <a href="#">Configuration<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
                                    
                                    <li>
                                        <a href="#">Manage Course/Batch<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="ManageCourse.jsp">Manage Course</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="ManageBatch.jsp">Manage Batch</a>
                                    		</li>	
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									 <li>
                                        <a href="StudentCategory.jsp">Manage Student Category</a><!--Third Level -->
                                    </li>
									<li>
                                        <a href="AddAdditionalDetails.jsp">Add Admission additional Details</a>
                                    </li>
									<li>
                                        <a href="Subjects.jsp">Manage Subjects</a>
                                    </li>
									<li>
                                        <a href="SmsSettings.jsp">SMS Module</a>
                                    </li>
									<li>
                                        <a href="#">Manage Clients</a>
                                    </li>
									<li>
                                        <a href="GeneralSettings.jsp">General Settings</a>
                                    </li>
                                </ul>
                                <!-- /.nav-third-level -->
                            </li>
							
						


                                <!--start of master data mennnu -->
							
                             <li>
                                <a href="#">MasterData<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
                                    
                                    <li>
                                        <a href="viewcollege">College Data</a></a><!--Third Level -->
										
																			
                                    </li>
									
									
									
									
									
									<li>
                                        <a href="viewpermission"> Permission Settings</a><!--Third Level -->
																		
                                    </li>
									<li>
                                        <a href="viewmodule"> Module Settings</a><!--Third Level -->
																		
                                    </li>
									
									<li>
                                        <a href="viewprogram"> Program Settings</a><!--Third Level -->
																		
                                    </li>
									
									
									
									
									
									<li>
                                        <a href="viewrole"> Role  Details</a><!--Third Level -->
																		
                                    </li>
									
									
									
									
									
									<li>
                                        <a href="viewusertype">User type Details</a><!--Third Level -->
																		
                                    </li>
									
									<!-- Others-->
									
									<ul class="nav nav-third-level">
                                    
                                    <li>
                                        <a href="#">Others<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
										<li>
                                        <a href="viewstatus">Applicant Status</a></a><!--Third Level -->
										
																			
                                        </li>
									
									
									<li>
                                        <a href="viewblood">Blood Group</a><!--Third Level -->
										
																		
                                    </li>
									
									
									<li>
                                        <a href="viewcategory">Category Details</a><!--Third Level -->
										
																			
                                    </li>
									<li>
                                        <a href="viewcourse">Course Details</a><!--Third Level -->
										
																			
                                    </li>
									
									
									<li>
                                        <a href="viewcourselevel">Course level Details</a><!--Third Level -->
																			
                                    </li>
									
									
									<li>
                                        <a href="masterdepartmentpage">Department Details</a><!--Third Level -->
																			
                                    </li>
									
									
									<li>
                                        <a href="viewdocument">Document Details</a><!--Third Level -->
																		
                                    </li>
									 
                               
							
							
							
							         <li>
                                        <a href="viewpaymentmode"> Payment mode Details</a><!--Third Level -->
																
                                    </li>
									
									
									
									<li>
                                        <a href="viewoptional"> Optional Subject Details</a><!--Third Level -->
																		
                                    </li>
									
									<li>
                                        <a href="viewreceipt">Receipt Book Details</a><!--Third Level -->
																		
                                    </li>
									
									<li>
                                        <a href="viewsubject"> Subject Details</a><!--Third Level -->
																			
                                    </li>
									
									</li>
                                   		 	
										</ul>
										</li></ul>
									
									
									
							</ul>
							
							</li>
							
							
							
							
							
							
							<li>
                                <a href="#">Finance<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
                                <li>
                                        <a href="#"> Finance Report <span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
										<li>
                                        		<a href="">compare Transactions</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="">Finance Transaction View</a>
                                    		</li>
                                    		</ul>
                            </li>
                            
                            <li>
                                        <a href="#">Donation <span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
										<li>
                                        		<a href="">View Donation</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="">Add New Donation</a>
                                    		</li>
                                    		</ul>
                            </li>
                             
                            <li>
                                        <a href="#">Asset Liability Management <span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
										<li>
                                        		<a href="">Asset<span class="fa arrow"></span>  </a><!--Fourth Level -->
                                        		<ul class="nav nav-third-level">
                                        		<li>
                                        		<a href="">Asset Create</a>
                                        		</li>
                                        		<li>
                                        		<a href="">Asset View </a>
                                        		</li>
                                        		</ul>
                                    		</li>
                                    		<li>
                                        		<a href="">Liability<span class="fa arrow"></span>  </a><!--Fourth Level -->
                                        		<ul class="nav nav-third-level">
                                        		<li>
                                        		<a href="">Liability Create</a>
                                        		</li>
                                        		<li>
                                        		<a href="">Liability View </a>
                                        		</li>
                                        		</ul>
                                    		</li>
                                    		</ul>
                            </li>
                            
                             <li>
                                        <a href="#">Payslip <span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
										<li>
                                        		<a href="">One Click Approve Payslip</a><!--Fourth Level -->
                                        		
                                    		</li>
                                    		<li>
                                        		<a href="">View Payslip</a><!--Fourth Level -->
                                        		
                                    		</li>
                                    		</ul>
                            </li>
                            
                            <li>
                                        <a href="#">Tally Export View </a><!--Third Level -->
										
                            </li>
                            
                            </ul>
							</li>
							
							<li>
                                <a href="#">Human Resource<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
									<li>
                                        <a href="#">Settings<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="EmployeeCategory.jsp">Add Employee Category</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="AddEmployeeDepartment.jsp">Add Employee Department</a>
                                    		</li>
											<li>
                                        		<a href="AddNewPayrollCategory.jsp">Add Payroll Category</a>
                                    		</li>
											<li>
                                        		<a href="AddAdditionalEmpdetails.jsp">Add Additional Details</a>
                                    		</li>	
											<li>
                                        		<a href="AddEmployeePosition.jsp">Add Employee Position</a>
                                    		</li>
											<li>
                                        		<a href="AddEmployeeGrade.jsp">Add Employee Grade</a>
                                    		</li>
											<li>
                                        		<a href="AddBankDetails.jsp">Add Bank Details</a>
                                    		</li>
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									
									<li>
                                        <a href="#">Employee Leave Management<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="AddNewLeaveTypes.jsp">Add Leave Types</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="EmpAttendanceReport.jsp">Attendance Report</a>
                                    		</li>
											<li>
                                        		<a href="EmpAttandanceRegister.jsp">Attendance Register</a>
                                    		</li>
											<li>
                                        		<a href="#">Reset Leave</a>
                                        		<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="EmpResetLeave.jsp">Leave Reset Settings</a>
                                    		</li>
                                    		<li>
                                        		<a href="EmpDeptLeaveReset.jsp">Department Reset</a>
                                    		</li>
                                    		<li>
                                        		<a href="EmpFullResetLeave.jsp">Reset All</a>
                                    		</li>
                                    		<li>
                                        		<a href="EmpIndividualResetleaves.jsp">Individual Reset</a>
                                    		</li>	
										</ul>
                                    		</li>	
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									
									<li>
                                		<a href="EmployeeSearch.jsp">Employee Search</a>
                            		</li>
									
									
									<li>
                                        <a href="#">Employee Management<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="EmployeeAdmission.jsp">Employee Admission</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="EmployeeSubjectAssociation.jsp">Employee Subject Association</a>
                                    		</li>
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									
									<li>
                                        <a href="#">Create Payslip<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="EmpPayslipGeneration.jsp">Select Employee</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="EmpRejectedPayslip.jsp">Rejected Employee</a>
                                    		</li>
											<li>
                                        		<a href="#">OnClick Payslip Generator</a>
                                    		</li>
											<li>
                                        		<a href="#">OnClick Payslip Reverter</a>
                                    		</li>
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									
									<li>
                                		<a href="EmpDepwisePayslip.jsp">Employee Payslip</a>
                            		</li>
									
                                    
									
								</ul>
							</li>
							
							<li>
                                <a href="InventoryHome">Inventory<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
									<li>
                                		<a href="InventoryStoreCategory.jsp">Store Category</a>
                            		</li>
									<li>
                                		<a href="InventoryStoreType.jsp">Store Type</a>
                            		</li>
									<li>
                                		<a href="InventoryStoreType.jsp">Store</a>
                            		</li>
									<li>
                                		<a href="InventoryItemCategory.jsp">Item Category</a>
                            		</li>
									<li>
                                		<a href="InventoryStoreItem.jsp">Store Items</a>
                            		</li>
									<li>
                                		<a href="InventorySupplierType.jsp">Suppplier Type</a>
                            		</li>
									<li>
                                		<a href="InventorySupplier.jsp">Supplier</a>
                            		</li>
									<li>
                                		<a href="#">Indents</a>
                            		</li>
									<li>
                                		<a href="InventoryPurchase.jsp">Purchase Order</a>
                            		</li>
									<li>
                                		<a href="InventoryBilling.jsp">Billing</a>
                            		</li>
									<li>
                                		<a href="InventoryGRN">GRN</a>
                            		</li>
                                    
                                    <li>
                                        <a href="InventoryReport">Reports<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="InventoryGenerateReport.jsp">Generate Report</a><!--Fourth Level -->
                                    		</li>
											
											
											<li>
												<a href="InventoryGenerateSalesReport.jsp">Sales Reports<span class="fa arrow"></span></a><!--Third Level -->
												<ul class="nav nav-fifth-level">
                                   		 			<li>
                                        				<a href="InventoryGenerateItemwiseReport.jsp">Item Wise Report</a><!--Fourth Level -->
                                    				</li>
													<li>
                                        				<a href="InventoryGenerateDaywiseReport.jsp">Day Wise Report</a><!--Fourth Level -->
                                    				</li>
													<li>
                                        				<a href="InventoryInvoice.jsp">Invoice Report</a><!--Fourth Level -->
                                    				</li>
												</ul>
											</li><!-- Fifth level-->
										
											
											
                                    			
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
								</ul>
							</li>
							<li>
                                <a href="#">Transport<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
									<li>
                                		<a href="Transport_UserDetails.jsp">User Details</a>
                            		</li>
									
									<li>
                                		<a href="Transport_RouteDetails.jsp">Route Details</a>
                            		</li>
									<li>
                                		<a href="#">Vehicles</a>
                            		</li>
									<li>
                                		<a href="Transport_TansportDetails.jsp">Transport Details</a>
                            		</li>
									
                                    <li>
                                        <a href="#">Transport Fee<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="#">Manage Fee Collection</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="#">Pay Fees</a>
                                    		</li>
											<li>
                                        		<a href="#">Defaulters</a>
                                    		</li>	
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
								</ul>
							</li>
							
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>



					
					<li class="border">
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Academics <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            
							<li>
                                <a href="#">Student Admission<span class="fa arrow"></span></a><!--Second Level -->
                               <ul class="nav nav-third-level">
									 <li>
                                		<a href="AdmissionStudentDetails.jsp">Student Admission Process</a>
                            		</li>
									<!-- <li>
                                		<a href="AdmissionStudentParentGuardianDetails.jsp">Step-2 Parent/Guardian Details</a>
                            		</li>
									<li>
                                		<a href="AdmissionStudentEmergencyContact.jsp">Step-3 Emergency detail</a>
                            		</li>
									<li>
                                		<a href="AdmissionStudentAdditionalDetails.jsp">Step-4 Additional Details</a>
                            		</li> -->
									<li>
                                		<a href="StudentInformation.jsp">Student Info</a>
                            		</li>
									
									<li>
                                        <a href="#">Student Details<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="StudentDetailsViewDetails.jsp">View Details</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="StudentAdvancedSearch.jsp">Advanced Search</a>
                                    		</li>	
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									
								</ul>
							</li>
							
							<li>
                                <a href="#">Time Table<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
									<li>
                                		<a href="TimetableWeekdays.jsp">Create Weekdays</a>
                            		</li>
									<li>
                                		<a href="TimetableWorkAllotment.jsp">Work Allotment</a>
                            		</li>
									<li>
                                		<a href="EditTimetable.jsp">Edit Time Table</a>
                            		</li>
									<li>
                                		<a href="TeacherTimetable.jsp">Teacher Time Table</a>
                            		</li>
									
									
                                    <li>
                                        <a href="#">Time table tracker<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="TimetableSwapDetails.jsp">Swap time table</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="TimetableSwapReport.jsp">Swapped time table report</a>
                                    		</li>	
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									<li>
                                		<a href="ManageClassTiming.jsp">Set Class Timings</a>
                            		</li>
									<li>
                                		<a href="NewTimeTable.jsp">Create Time Table</a>
                            		</li>
									<li>
                                		<a href="#">View Time Table</a>
                            		</li>
									<li>
                                		<a href="InstitutionalTimetable.jsp">Institutional Time Table</a>
                            		</li>
									<li>
                                        <a href="#">Class Room allocation<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="ManageBuildings.jsp">Manage Building</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="NewBuildingsAllocate.jsp">Manage Allocate</a>
                                    		</li>	
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
								</ul>
							</li>
							
							
							<li>
                                <a href="#">Attendance<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
									<li>
                                		<a href="AttendanceRegister.jsp">Attendance Register</a>
                            		</li>
									<li>
                                		<a href="AttendanceReport.jsp">Attendance Report</a>
                            		</li>
								</ul>
							</li>
						
							<li>
                                <a href="#">Examination<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
									<li>
                                        <a href="#">Settings<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="GradingLevels.jsp">Set Grading Level</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="ManageRankingLevels.jsp">Ranking Levels</a>
                                    		</li>
											<li>
                                        		<a href="ManageClassDesignations.jsp">Class Designations</a>
                                    		</li>
											
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									
									<li>
                                        <a href="#">Exam Management<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="CreateExam.jsp">Create New Exam</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="#">Enter Results</a>
                                    		</li>
												
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
								
									<li>
                                        <a href="#">Online Exam<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="NewOnlineExam.jsp">New Online Exam</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="ViewOnlineExams.jsp">View Online Exam</a>
                                    		</li>
											<li>
                                        		<a href="ViewResults.jsp">View Exam Results</a>
                                    		</li>
											<li>
                                        		<a href="ResetExam.jsp">Reset Exam</a>
                                    		</li>
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									
									<li>
                                        <a href="#">Report Center<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="ExamWiseReport.jsp">Exam wise Report</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="ExamSubjectWiseReport.jsp">Subject wise Report</a>
                                    		</li>
											<li>
                                        		<a href="GroupedExamReports.jsp">Grouped Exam Report</a>
                                    		</li>
											<li>
                                        		<a href="ArchivedGroupedExamReports.jsp">Archieved Student Report</a>
                                    		</li>
											<li>
                                        		<a href="StudentRankingPerSubject.jsp">Student Ranking per Subject</a>
                                    		</li>
											<li>
                                        		<a href="StudentRankingPerBatch.jsp">Student Ranking Per Batch</a>
                                    		</li>
											<li>
                                        		<a href="StudentRankingPerCourse.jsp">Student Ranking Per Course</a>
                                    		</li>
											<li>
                                        		<a href="StudentRankingPerSchool.jsp">Student Ranking Per School</a>
                                    		</li>
											<li>
                                        		<a href="StudentRankingPerAttendance.jsp">Student Ranking Per Attendance</a>
                                    		</li>
											<li>
                                        		<a href="RankingLevelReport.jsp">Ranking Level Report</a>
                                    		</li>
											<li>
                                        		<a href="ViewTranscripts.jsp">View Transeripts</a>
                                    		</li>
											<li>
                                        		<a href="CombinedReport.jsp">Combined Reports</a>
                                    		</li>
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									<li>
                                        <a href="#">Generate Reports<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="GenerateReports.jsp">Generate Reports</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="GeneratePreviousBatchReports.jsp">Generate Previous Batch Report</a>
                                    		</li>
										</ul>
										</li>		
								</ul>
							</li>
							
							<li>
								<a href="#">Placement</a>
							</li>
							
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                   
                   
				   
				     <li class="border">
                        <a href="#"><i class="fa fa-wrench fa-fw"></i>Collaboration<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            
							<li>
                                <a href="#">Events<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
									<li>
                             			<a href="EventCreation.jsp">Create</a>
		                            </li>
									<li>
        		                     	<a href="EventConfirmationview.jsp">View</a>
            		                </li>
								</ul>
							</li>
							
                            <li>
                                <a href="Tasks.jsp">Tasks</a>
                            </li>
							<li>
                                <a href="#">News</a>
                            </li>
                           
						    <li>
                                <a href="#">Email<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
								<li>
                             		<a href="EmailToEmployee.jsp">To Employee</a>
	                            </li>
								<li>
        	                     	<a href="EmailToStudent.jsp">To Students</a>
            	                </li>
							    <li>
                    		           <a href="EmailToParent.jsp">To Guardians</a>
                            	</li>
								<li>
                    		           <a href="EmailAlertSetting">Settings</a>
                            	</li>
								<li>
                    		           <a href="EmailUnsubscription">Unsubscription</a>
                            	</li>
								</ul>
							</li>
							
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    
					
					
					<li class="border">
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Data and Reports <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">

							
                            
							<li>
                                <a href="#">Reports<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
									
									
							<li>
                             	<a href="Reports_AllCourses.jsp">All Courses</a>
                            </li>
							<li>
                             	<a href="Reports_AlBatches.jsp">All Batches</a>
                            </li>
							<li>
                             	<a href="Reports_AllStudents.jsp">All Students</a>
                            </li>
							<li>
                             	<a href="Reports_AllEmployees.jsp">All Employees</a>
                            </li>
							<li>
                             	<a href="Reports_FormerStudentsDetails.jsp">Former Student Details</a>
                            </li>
							<li>
                             	<a href="Reports_FormerEmployeeDetails.jsp">Former Employee Details</a>
                            </li>
							<li>
                             	<a href="Reports_SubjectDetails.jsp">Subject Details</a>
                            </li>
							<li>
                             	<a href="Reports_EmployeeSubjectAssociationDetails.jsp">Employee Subject Association Details</a>
                            </li>
							<li>
                             	<a href="Reports_EmployeePayrollDetails.jsp">Employee Payroll Details</a>
                            </li>
                            <li>
                             	<a href="Reports_ExamScheduleDetails.jsp">Exam Schedule Details</a>
                            </li>
                            
                            
							<li>
                             	<a href="Reports_FeeCollectionDetails.jsp">Fee Collection Details</a>
                            </li>
							<li>
                             	<a href="Reports_CourseFeesDefaulters.jsp">Course Fees Defaulters</a>
                            </li>
							<li>
                             	<a href="Reports_StudentsFeesDefaulters.jsp">Student Fees Defaulters</a>
                            </li>
									
									
									
								
								    <li>
                                        <a href="#">Fees Headwise Report<span class="fa arrow"></span></a><!--Third Level -->
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="Reports_BatchwiseReports.jsp">Batch Wise</a><!--Fourth Level -->
                                    		</li>
                                    		<li>
                                        		<a href="Reports_FeeCollectionwiseReport.jsp">Fee Collection Wise</a>
                                    		</li>
											<li>
                                        		<a href="Reports_StudentwiseReports.jsp">Student Wise</a>
                                    		</li>	
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
									 
                                </ul>
                                <!-- /.nav-third-level -->
                            </li>
							
							
							
							<li>
                                <a href="CustomReports.jsp">Custom Reports<span class="fa arrow"></span></a><!--Second Level -->
                                <ul class="nav nav-third-level">
								
									<li>
    	    	                        <a href="#">New Student Report</a>
	           	                    </li>
									<li>
    	    	                        <a href="#">New Employee Report</a>
	           	                    </li>
								</ul>
							</li>

							<li>
                                <a href="Exports_AllExports.jsp">Data Export</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                                                            </c:forEach>
                    
                </ul>
                <!-- /#side-menu -->
            </div>
            <!-- /.sidebar-collapse -->
        </nav>
        <!-- /.navbar-static-side -->




    </div>
    <!-- /#wrapper -->

    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Blank -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Blank - Use for reference -->

</body>

</html>
