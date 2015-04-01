<%@ page import="java.io.*,java.sql.*" %>

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
                    
                <%
   // Execute a query
   try
   {
 Connection con = null;
			
			System.out.println("Connecting to database...");
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "guest");
			System.out.println("Connected to database successfully...");
	
	String admin=null ,aca=null ,coll=null ,rep=null, user=null, confi=null, fin=null, hr=null, inv=null, tran=null, stu_add=null, tt=null, att=null, exam=null, place=null, events=null, tasks=null, news=null, email=null, reports=null, cr=null, de=null;
String course=null, stu_category=null, add_admission_additional_details=null, manage_sub=null, sms_module=null, manage_clients=null, general_settings=null;
String finance_report=null, donation=null, asset_liability_management=null, payslip=null, tally_export_view=null;
String settings=null, emp_leave_mgnt=null, emp_search=null, emp_mgnt=null, create_payslip=null, emp_payslip=null;    
   Statement stmt1 = con.createStatement();
   String sql1 = "SELECT menu_name from test.menu where menu_id = 1";
   ResultSet rs1 = stmt1.executeQuery(sql1);
   while (rs1.next()) 
   {
      admin = rs1.getString(1);
     }
   Statement stmt2 = con.createStatement();
  
   String sql2 = "SELECT menu_name from test.menu where menu_id = 2";
   ResultSet rs2 = stmt2.executeQuery(sql2);
   while (rs2.next()) 
   {
      aca = rs2.getString(1);
     }
  
  
   Statement stmt3 = con.createStatement();
  
   String sql3 = "SELECT menu_name from test.menu where menu_id = 3";
   ResultSet rs3 = stmt3.executeQuery(sql3);
   while (rs3.next()) 
   {
      coll = rs3.getString(1);
     }
  
   Statement stmt4 = con.createStatement();
  
   String sql4 = "SELECT menu_name from test.menu where menu_id = 4";
   ResultSet rs4 = stmt4.executeQuery(sql4);
   while (rs4.next()) 
   {
      rep = rs4.getString(1);
     }
   
   Statement stmt5 = con.createStatement();
  
   String sql5 = "SELECT menu_name from test.menu where parent = 1 and menu_name like 'User' ";
   ResultSet rs5 = stmt4.executeQuery(sql5);
   while (rs5.next()) 
   {
      user = rs5.getString(1);
     }
   
    Statement stmt6 = con.createStatement();
  
   String sql6 = "SELECT menu_name from test.menu where parent = 1 and menu_name like 'Configuration' ";
   ResultSet rs6 = stmt6.executeQuery(sql6);
   while (rs6.next()) 
   {
      confi = rs6.getString(1);
     }
   
    Statement stmt7 = con.createStatement();
  
   String sql7 = "SELECT menu_name from test.menu where parent = 1 and menu_name like 'Finance' ";
   ResultSet rs7 = stmt7.executeQuery(sql7);
   while (rs7.next()) 
   {
      fin = rs7.getString(1);
     }
    
    Statement stmt8 = con.createStatement();
  
   String sql8 = "SELECT menu_name from test.menu where parent = 1 and menu_name like 'Human Resource' ";
   ResultSet rs8 = stmt8.executeQuery(sql8);
   while (rs8.next()) 
   {
      hr = rs8.getString(1);
     }
   
    Statement stmt9 = con.createStatement();
  
   String sql9 = "SELECT menu_name from test.menu where parent = 1 and menu_name like 'Inventory' ";
   ResultSet rs9 = stmt9.executeQuery(sql9);
   while (rs9.next()) 
   {
      inv = rs9.getString(1);
     }
   
    Statement stmt10 = con.createStatement();
  
   String sql10 = "SELECT menu_name from test.menu where parent = 1 and menu_name like 'Transport' ";
   ResultSet rs10 = stmt10.executeQuery(sql10);
   while (rs10.next()) 
   {
      tran = rs10.getString(1);
     }
    Statement stmt11 = con.createStatement();
  
   String sql11 = "SELECT menu_name from test.menu where parent = 2 and menu_name like 'Student Admission' ";
   ResultSet rs11 = stmt10.executeQuery(sql11);
   while (rs11.next()) 
   {
      stu_add = rs11.getString(1);
     }
     
   Statement stmt12 = con.createStatement();
  
    String sql12 = "SELECT menu_name from test.menu where parent = 2 and menu_name like 'Time Table' ";
   ResultSet rs12 = stmt12.executeQuery(sql12);
   while (rs12.next()) 
   {
      tt = rs12.getString(1);
     }
     
   Statement stmt13 = con.createStatement();
  
     String sql13 = "SELECT menu_name from test.menu where parent = 2 and menu_name like 'Attendance' ";
   ResultSet rs13 = stmt13.executeQuery(sql13);
   while (rs13.next()) 
   {
      att = rs13.getString(1);
     }
     
   Statement stmt14= con.createStatement();
  
     String sql14 = "SELECT menu_name from test.menu where parent = 2 and menu_name like 'Examination' ";
   ResultSet rs14 = stmt14.executeQuery(sql14);
   while (rs14.next()) 
   {
      exam = rs14.getString(1);
     }
    
   Statement stmt15 = con.createStatement();
  
   String sql15 = "SELECT menu_name from test.menu where parent = 2 and menu_name like 'Placement' ";
   ResultSet rs15 = stmt15.executeQuery(sql15);
   while (rs15.next()) 
   {
      place = rs15.getString(1);
     }
   
   Statement stmt16 = con.createStatement();
  
   String sql16 = "SELECT menu_name from test.menu where parent = 3 and menu_name like 'Events' ";
   ResultSet rs16 = stmt16.executeQuery(sql16);
   while (rs16.next()) 
   {
      events = rs16.getString(1);
     }
     
   Statement stmt17 = con.createStatement();
  
     String sql17 = "SELECT menu_name from test.menu where parent = 3 and menu_name like 'Tasks' ";
   ResultSet rs17 = stmt17.executeQuery(sql17);
   while (rs17.next()) 
   {
      tasks = rs17.getString(1);
     }
     
   Statement stmt18 = con.createStatement();
  
     String sql18 = "SELECT menu_name from test.menu where parent = 3 and menu_name like 'News' ";
   ResultSet rs18 = stmt18.executeQuery(sql18);
   while (rs18.next()) 
   {
      news = rs18.getString(1);
     }
     
   Statement stmt19 = con.createStatement();
  
     String sql19 = "SELECT menu_name from test.menu where parent = 3 and menu_name like 'Email' ";
   ResultSet rs19 = stmt19.executeQuery(sql19);
   while (rs19.next()) 
   {
      email = rs19.getString(1);
     }
   
   Statement stmt20 = con.createStatement();
  
   String sql20 = "SELECT menu_name from test.menu where parent = 4 and menu_name like 'Reports' ";
   ResultSet rs20 = stmt20.executeQuery(sql20);
   while (rs20.next()) 
   {
      reports = rs20.getString(1);
     }
     
   Statement stmt21 = con.createStatement();
  
   String sql21 = "SELECT menu_name from test.menu where parent = 4 and menu_name like 'Custom Reports' ";
   ResultSet rs21 = stmt21.executeQuery(sql21);
   while (rs21.next()) 
   {
      cr = rs21.getString(1);
     }
     
   Statement stmt22 = con.createStatement();
  
   String sql22 = "SELECT menu_name from test.menu where parent = 4 and menu_name like 'Data Export' ";
   ResultSet rs22 = stmt22.executeQuery(sql22);
   while (rs22.next()) 
   {
      de = rs22.getString(1);
     }
              

    Statement stmt23 = con.createStatement();
  
   String sql23 = "SELECT menu_name from test.menu where parent = 6 and menu_name like 'Manage Course/Batch' ";
   ResultSet rs23 = stmt23.executeQuery(sql23);
   while (rs23.next()) 
   {
      course = rs23.getString(1);
     }
   
    Statement stmt24 = con.createStatement();
  
   String sql24 = "SELECT menu_name from test.menu where parent = 6 and menu_name like 'Manage Student Category' ";
   ResultSet rs24 = stmt24.executeQuery(sql24);
   while (rs24.next()) 
   {
      stu_category = rs24.getString(1);
     }
   
    Statement stmt25 = con.createStatement();
  
   String sql25 = "SELECT menu_name from test.menu where parent = 6 and menu_name like 'Add Admission Additional Details' ";
   ResultSet rs25 = stmt25.executeQuery(sql25);
   while (rs25.next()) 
   {
      add_admission_additional_details = rs25.getString(1);
     }
   
    Statement stmt26 = con.createStatement();
  
   String sql26 = "SELECT menu_name from test.menu where parent = 6 and menu_name like 'Manage Subjects' ";
   ResultSet rs26 = stmt26.executeQuery(sql26);
   while (rs26.next()) 
   {
      manage_sub = rs26.getString(1);
     }
   
    Statement stmt27 = con.createStatement();
  
   String sql27 = "SELECT menu_name from test.menu where parent = 6 and menu_name like 'SMS Module' ";
   ResultSet rs27 = stmt27.executeQuery(sql27);
   while (rs27.next()) 
   {
      sms_module = rs27.getString(1);
     }
   
    Statement stmt28 = con.createStatement();
  
   String sql28 = "SELECT menu_name from test.menu where parent = 6 and menu_name like 'Manage Clients' ";
   ResultSet rs28 = stmt28.executeQuery(sql28);
   while (rs28.next()) 
   {
      manage_clients = rs28.getString(1);
     }
   
    Statement stmt29 = con.createStatement();
  
   String sql29 = "SELECT menu_name from test.menu where parent = 6 and menu_name like 'General Settings' ";
   ResultSet rs29 = stmt29.executeQuery(sql29);
   while (rs29.next()) 
   {
      general_settings = rs29.getString(1);
     }
   
     
    Statement stmt30 = con.createStatement();
  
   String sql30 = "SELECT menu_name from test.menu where parent = 7 and menu_name like 'Finance Report' ";
   ResultSet rs30 = stmt30.executeQuery(sql30);
   while (rs30.next()) 
   {
      finance_report = rs30.getString(1);
     }
           
    Statement stmt31 = con.createStatement();
  
   String sql31 = "SELECT menu_name from test.menu where parent = 7 and menu_name like 'Donation' ";
   ResultSet rs31 = stmt31.executeQuery(sql31);
   while (rs31.next()) 
   {
      donation = rs31.getString(1);
     }
   
     Statement stmt32 = con.createStatement();
  
   String sql32 = "SELECT menu_name from test.menu where parent = 7 and menu_name like 'Asset Liability Management' ";
   ResultSet rs32 = stmt32.executeQuery(sql32);
   while (rs32.next()) 
   {
      asset_liability_management = rs32.getString(1);
     }
       
     Statement stmt33 = con.createStatement();
  
   String sql33 = "SELECT menu_name from test.menu where parent = 7 and menu_name like 'Payslip' ";
   ResultSet rs33 = stmt33.executeQuery(sql33);
   while (rs33.next()) 
   {
      payslip = rs33.getString(1);
     }
         
     Statement stmt34 = con.createStatement();
  
   String sql34 = "SELECT menu_name from test.menu where parent = 7 and menu_name like 'Tally Export View' ";
   ResultSet rs34 = stmt34.executeQuery(sql34);
   while (rs34.next()) 
   {
      tally_export_view = rs34.getString(1);
     }
           
  Statement stmt35 = con.createStatement();
  
   String sql35 = "SELECT menu_name from test.menu where parent = 8 and menu_name like 'Settings' ";
   ResultSet rs35 = stmt35.executeQuery(sql35);
   while (rs35.next()) 
   {
      settings = rs35.getString(1);
     }
  Statement stmt36 = con.createStatement();
  
   String sql36 = "SELECT menu_name from test.menu where parent = 8 and menu_name like 'Employee Leave Management' ";
   ResultSet rs36 = stmt36.executeQuery(sql36);
   while (rs36.next()) 
   {
      emp_leave_mgnt = rs36.getString(1);
     }
 
  Statement stmt37 = con.createStatement();
  
   String sql37 = "SELECT menu_name from test.menu where parent = 8 and menu_name like 'Employee Search' ";
   ResultSet rs37 = stmt37.executeQuery(sql37);
   while (rs37.next()) 
   {
      emp_search = rs37.getString(1);
     }
    
    Statement stmt38 = con.createStatement();
  
   String sql38 = "SELECT menu_name from test.menu where parent = 8 and menu_name like 'Employee Management' ";
   ResultSet rs38 = stmt38.executeQuery(sql38);
   while (rs38.next()) 
   {
      emp_mgnt = rs38.getString(1);
     }  
     
      Statement stmt39 = con.createStatement();
  
   String sql39 = "SELECT menu_name from test.menu where parent = 8 and menu_name like 'Create Payslip' ";
   ResultSet rs39 = stmt39.executeQuery(sql39);
   while (rs39.next()) 
   {
      create_payslip = rs39.getString(1);
     }
     
      Statement stmt40 = con.createStatement();
  
   String sql40 = "SELECT menu_name from test.menu where parent = 8 and menu_name like 'Employee Payslip' ";
   ResultSet rs40 = stmt40.executeQuery(sql40);
   while (rs40.next()) 
   {
      emp_payslip = rs40.getString(1);
     }
       %>		<li class="border"> 
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> <%= admin %> <span class="fa arrow"></span></a><!--First Level -->
                      
                     
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="User.jsp" ><%=user %></a><!-- -->
                            </li>
                            <li>
                                <a href="#"><%=confi %><span class="fa arrow"></span></a><!-- -->
                                <ul class="nav nav-third-level">
                                    
                                    <li>
                                        <a href="#"><%=course%><span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="ManageCourse.jsp">Manage Course</a>
                                    		</li>
                                    		<li>
                                        		<a href="ManageBatch.jsp">Manage Batch</a>
                                    		</li>	
										</ul>
							 		<!--/.nav-fourth-level-->										
                                    </li>
									 <li>
                                        <a href="StudentCategory.jsp"><%=stu_category%></a>
                                    </li>
									<li>
                                        <a href="AddAdditionalDetails.jsp"><%=add_admission_additional_details%></a>
                                    </li>
									<li>
                                        <a href="Subjects.jsp"><%=manage_sub%></a>
                                    </li>
									<li>
                                        <a href="SmsSettings.jsp"><%=sms_module%></a>
                                    </li>
									<li>
                                        <a href="#"><%=manage_clients%></a>
                                    </li>
									<li>
                                        <a href="GeneralSettings.jsp"><%=general_settings%></a>
                                    </li>
                                </ul>
                                <!--/.nav-third-level-->
                            </li>
							
							<li>
                                <a href="#"><%=fin %><span class="fa arrow"></span></a><!-- -->
                                <ul class="nav nav-third-level">
                                <li>
                                        <a href="#"> <%=finance_report %> <span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
										<li>
                                        		<a href="">compare Transactions</a>
                                    		</li>
                                    		<li>
                                        		<a href="">Finance Transaction View</a>
                                    		</li>
                                    		</ul>
                            </li>
                            
                            <li>
                                        <a href="#"><%=donation%> <span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
										<li>
                                        		<a href="">View Donation</a>
                                    		</li>
                                    		<li>
                                        		<a href="">Add New Donation</a>
                                    		</li>
                                    		</ul>
                            </li>
                             
                            <li>
                                        <a href="#"><%=asset_liability_management%> <span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
										<li>
                                        		<a href="">Asset<span class="fa arrow"></span>  </a>
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
                                        		<a href="">Liability<span class="fa arrow"></span>  </a>
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
                                        <a href="#"><%=payslip%> <span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
										<li>
                                        		<a href="">One Click Approve Payslip</a>
                                        		
                                    		</li>
                                    		<li>
                                        		<a href="">View Payslip</a>
                                        		
                                    		</li>
                                    		</ul>
                            </li>
                            
                            <li>
                                        <a href="#"><%=tally_export_view%> </a>
										
                            </li>
                            
                            </ul>
							</li>
							
							<li>
                                <a href="#"><%=hr %><span class="fa arrow"></span></a><!-- -->
                                <ul class="nav nav-third-level">
									<li>
                                        <a href="#"><%=settings%><span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="EmployeeCategory.jsp">Add Employee Category</a>
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
										<!--/.nav-fourth-level-->										
                                    </li>
									
									<li>
                                        <a href="#"><%=emp_leave_mgnt%><span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="AddNewLeaveTypes.jsp">Add Leave Types</a>
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
										<!--/.nav-fourth-level-->										
                                    </li>
									
									<li>
                                		<a href="EmployeeSearch.jsp"><%=emp_search%></a>
                            		</li>
									
									
									<li>
                                        <a href="#"><%=emp_mgnt%><span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="EmployeeAdmission.jsp">Employee Admission</a>
                                    		</li>
                                    		<li>
                                        		<a href="EmployeeSubjectAssociation.jsp">Employee Subject Association</a>
                                    		</li>
										</ul>
										<!--/.nav-fourth-level-->										
                                    </li>
									
									<li>
                                        <a href="#"><%=create_payslip%><span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="EmpPayslipGeneration.jsp">Select Employee</a>
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
										<!--/.nav-fourth-level-->										
                                    </li>
									
									<li>
                                		<a href="EmpDepwisePayslip.jsp"><%=emp_payslip%></a>
                            		</li>
									
                                    
									
								</ul>
							</li>
							
							<li>
                                <a href="InventoryHome"><%=inv %><span class="fa arrow"></span></a><!-- -->
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
                                        <a href="InventoryReport">Reports<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="InventoryGenerateReport.jsp">Generate Report</a>
                                    		</li>
											
											
											<li>
												<a href="InventoryGenerateSalesReport.jsp">Sales Reports<span class="fa arrow"></span></a>
												<ul class="nav nav-fifth-level">
                                   		 			<li>
                                        				<a href="InventoryGenerateItemwiseReport.jsp">Item Wise Report</a>
                                    				</li>
													<li>
                                        				<a href="InventoryGenerateDaywiseReport.jsp">Day Wise Report</a>
                                    				</li>
													<li>
                                        				<a href="InventoryInvoice.jsp">Invoice Report</a>
                                    				</li>
												</ul>
											</li>
										
											
											
                                    			
										</ul>
										<!--/.nav-fourth-level-->										
                                    </li>
								</ul>
							</li>
							<li>
                                <a href="#"><%=tran %><span class="fa arrow"></span></a><!-- -->
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
                                        <a href="#">Transport Fee<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="#">Manage Fee Collection</a>
                                    		</li>
                                    		<li>
                                        		<a href="#">Pay Fees</a>
                                    		</li>
											<li>
                                        		<a href="#">Defaulters</a>
                                    		</li>	
										</ul>
										<!--/.nav-fourth-level-->										
                                    </li>
								</ul>
							</li>
							
                        </ul>
                  <!--       <!--/.nav-second-level--> 
                    </li>



					
					<li class="border">
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> <%= aca %> <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            
							<li>
                                <a href="#"><%=stu_add%><span class="fa arrow"></span></a><!-- -->
                               <ul class="nav nav-third-level">
									 <li>
                                		<a href="AdmissionStudentDetails.jsp">Student Admission Process</a>
                            		</li>
									<li>
<!--                                 		<a href="AdmissionStudentParentGuardianDetails.jsp">Step-2 Parent/Guardian Details</a>
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
                                        <a href="#">Student Details<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="StudentDetailsViewDetails.jsp">View Details</a>
                                    		</li>
                                    		<li>
                                        		<a href="StudentAdvancedSearch.jsp">Advanced Search</a>
                                    		</li>	
										</ul>
										<!--/.nav-fourth-level-->										
                                    </li>
									
								</ul>
							</li>
							
							<li>
                                <a href="#"><%=tt%><span class="fa arrow"></span></a><!-- -->
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
                                        <a href="#">Time table tracker<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="TimetableSwapDetails.jsp">Swap time table</a>
                                    		</li>
                                    		<li>
                                        		<a href="TimetableSwapReport.jsp">Swapped time table report</a>
                                    		</li>	
										</ul>
										<!--/.nav-fourth-level-->										
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
                                        <a href="#">Class Room allocation<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="ManageBuildings.jsp">Manage Building</a>
                                    		</li>
                                    		<li>
                                        		<a href="NewBuildingsAllocate.jsp">Manage Allocate</a>
                                    		</li>	
										</ul>
										<!--/.nav-fourth-level-->										
                                    </li>
								</ul>
							</li>
							
							
							<li>
                                <a href="#"><%=att%><span class="fa arrow"></span></a><!-- -->
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
                                <a href="#"><%=exam%><span class="fa arrow"></span></a><!-- -->
                                <ul class="nav nav-third-level">
									<li>
                                        <a href="#">Settings<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="GradingLevels.jsp">Set Grading Level</a>
                                    		</li>
                                    		<li>
                                        		<a href="ManageRankingLevels.jsp">Ranking Levels</a>
                                    		</li>
											<li>
                                        		<a href="ManageClassDesignations.jsp">Class Designations</a>
                                    		</li>
											
										</ul>
										<!--/.nav-fourth-level-->										
                                    </li>
									
									<li>
                                        <a href="#">Exam Management<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="CreateExam.jsp">Create New Exam</a>
                                    		</li>
                                    		<li>
                                        		<a href="#">Enter Results</a>
                                    		</li>
												
										</ul>
										<!--/.nav-fourth-level-->										
                                    </li>
								
									<li>
                                        <a href="#">Online Exam<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="NewOnlineExam.jsp">New Online Exam</a>
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
										<!--/.nav-fourth-level-->										
                                    </li>
									
									<li>
                                        <a href="#">Report Center<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="ExamWiseReport.jsp">Exam wise Report</a>
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
										<!--/.nav-fourth-level-->										
                                    </li>
									<li>
                                        <a href="#">Generate Reports<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="GenerateReports.jsp">Generate Reports</a>
                                    		</li>
                                    		<li>
                                        		<a href="GeneratePreviousBatchReports.jsp">Generate Previous Batch Report</a>
                                    		</li>
										</ul>
										</li>		
								</ul>
							</li>
							
							<li>
								<a href="#"><%=place%></a>
							</li>
							
                        </ul>
                        <!--/.nav-second-level-->
                    </li>
                   
                   
				   
				     <li class="border">
                        <a href="#"><i class="fa fa-wrench fa-fw"></i><%= coll %><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            
							<li>
                                <a href="#"><%=events%><span class="fa arrow"></span></a><!-- -->
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
                                <a href="Tasks.jsp"><%=tasks%></a>
                            </li>
							<li>
                                <a href="#"><%=news%></a>
                            </li>
                           
						    <li>
                                <a href="#"><%=email%><span class="fa arrow"></span></a><!-- -->
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
                        <!--/.nav-second-level-->
                    </li>
                    
					
					
					<li class="border">
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> <%= rep %> <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">

							
                            
							<li>
                                <a href="#"><%=reports%><span class="fa arrow"></span></a><!-- -->
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
                                        <a href="#">Fees Headwise Report<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="Reports_BatchwiseReports.jsp">Batch Wise</a>
                                    		</li>
                                    		<li>
                                        		<a href="Reports_FeeCollectionwiseReport.jsp">Fee Collection Wise</a>
                                    		</li>
											<li>
                                        		<a href="Reports_StudentwiseReports.jsp">Student Wise</a>
                                    		</li>	
										</ul>
										<!--/.nav-fourth-level-->										
                                    </li>
									 
                                </ul>
                                <!--/.nav-third-level--> 
                            </li>
							
							
							
							<li>
                                <a href="CustomReports.jsp"><%=cr%><span class="fa arrow"></span></a><!-- -->
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
                                <a href="Exports_AllExports.jsp"><%=de%></a>
                            </li>
                        </ul>
                        <!--/.nav-second-level-->
                    </li>
                    
                </ul>
               <!-- /#side-menu  --> 
            </div>
            <!-- /.sidebar-collapse  --> <!-- /.navbar-static-side --> 




    </div>
<!--     /#wrapper -->

<!--     Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="js/sb-admin.js"></script>
    <%
   
   // Close the database objects
}
catch (Exception e) 
		{
			out.print(""+ e.getMessage());  
			return;     
		}	
   
%>

</body>

</html>
