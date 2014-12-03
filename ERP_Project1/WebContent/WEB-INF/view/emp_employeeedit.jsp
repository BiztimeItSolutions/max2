<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Biztime EduERP</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Blank -->

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">
		<style type="text/css">
    <!--
	.style1 {color: #FF0000}
	-->
    </style>

<script type= "text/javascript" src = "script/countries.js"></script>
</head>

<body>


    <div id="wrapper">

        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
		<div><img src="images/Biztime_Logo.png" width="250" height="50">
<!--            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">SB Admin v2.0</a>
					      <div><img src="images/Biztime_Logo.png" width="250" height="50"></div>
            </div>-->

			
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Read All Messages</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 1</strong>
                                        <span class="pull-right text-muted">40% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 2</strong>
                                        <span class="pull-right text-muted">20% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                            <span class="sr-only">20% Complete</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 3</strong>
                                        <span class="pull-right text-muted">60% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 4</strong>
                                        <span class="pull-right text-muted">80% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete (danger)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Tasks</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-tasks -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-comment fa-fw"></i> New Comment
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                    <span class="pull-right text-muted small">12 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> Message Sent
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-tasks fa-fw"></i> New Task
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Alerts</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-alerts -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

        </nav>
        <!-- /.navbar-static-top -->

        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
			
<!--			<div><img src="images/Biztime_Logo.png" width="250" height="60"></div>-->
			
               
                <ul class="nav" id="side-menu">
                <li>
                        <a href="indexnew.html"><i class="fa fa-dashboard fa-fw"></i>Home</a>
                    </li>
                    
					<li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Masters<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="ad_department.html">Department</a>
                            </li>
                            <li>
                                <a href="ad_course.html">Course</a>
                            </li>
							 <li>
                                <a href="ad_subject.html">Subject</a>
                            </li>
							 <li>
                                <a href="ad_fees.html">Fees</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
					
					<li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Admission<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                             
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>CET Admission<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                           
							
							<li>
                                <a href="addCetapplicant.html">Registration Form</a>
                            </li>
                            	<li>
                                <a href="CetStudentList.html">CET Details</a>
                            </li>
                            	<li>
                                <a href="addDisplay.html">CET Display</a>
                            </li>
                            
                         </ul>   
                         </li>
							 <li>
                                  <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Management Admission<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                           
							
							<li>
                               <a href="applicantList.html">Shortlist Candidate</a>
                            </li>
                            	<li>
                               <a href="applicantInterviewList.html">Applicant Interview Details</a>
                            </li>
                            	<li>
                                 <a href="applicantFinalList.html">Final Applicant List</a>
                            </li>
                         
							
                            <li>
                                <a href="addapplicant.html">Online Application Form</a>
                            </li>
                        </ul>
                        </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
					
					<li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Employee Profile<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="empidcreation.html">Employee_ID creation</a>
                            </li>
                            <li>
                                <a href="persoINFo.html">Personal Details</a>
                            </li>
							 <li>
                                <a href="eduINFo.html">Education Details</a>
                            </li>
							 <li>
                                <a href="desigINFo.html" >Designation Details</a>
                            </li>
                            <li>
                            <a href="workexpINFo.html" >Work Experience details</a>
                            </li>
                            <li>
                            <a href="acntINFo.html" >Accounts details</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
					
                       
                        <!-- /.nav-second-level -->
                   


                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> UI Elements<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="panels-wells.html">Panels and Wells</a>
                            </li>
                            <li>
                                <a href="buttons.html">Buttons</a>
                            </li>
                            <li>
                                <a href="notifications.html">Notifications</a>
                            </li>
                            <li>
                                <a href="typography.html">Typography</a>
                            </li>
                            <li>
                                <a href="grid.html">Grid</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Second Level Item</a>
                            </li>
                            <li>
                                <a href="#">Second Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                </ul>
                                <!-- /.nav-third-level -->
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                                    </ul>
                <!-- /#side-menu -->
            </div>
            <!-- /.sidebar-collapse -->
        </nav>
        <!-- /.navbar-static-side -->

<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Edit Employee Personal Details</h1>
                </div>
             <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
							<!--
							<div class="alert alert-success">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">Alert Link</a>.
                            </div>
                        	-->
							<div class="panel-heading">
                            	<!--Basic Form Elements-->
                        	</div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                              
                                
<c:url var="empinfo" value="updateemployee.html"/>
<form:form id="emp_employeeedit" modelAttribute="employees" commandName="employees" method="get" action="${empinfo}">

<div class="form-group" hidden>
                                            <label>ID:</label><span class="style1">*</span>
                                            <form:input path="id"  value="${employees.id}"/>    
                                        </div>
<div class="form-group">
                                            <label>Employee ID:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="emp_ID" readonly = "true" value="${employees.emp_ID}"/>    
                                        </div>
                
                <div class="form-group">
                                            <label>First Name:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="first_name" readonly = "true" value="${employees.first_name}" />    
                                        </div>
<div class="form-group">
                                            <label>Middle Name:</label><span class="style1"></span>
                                            <form:input class="form-control" path="middle_name" readonly = "true" value="${employees.middle_name}"/>    
                                        </div>
                                        <div class="form-group">
                                            <label>Last Name:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="last_name" value="${employees.last_name}"/>    
                                        </div>
                                        
                                        <div class="form-group">
                                        <label class="block">Gender:</label><span class="style1">*</span><span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span>
										<input type="radio" name="gender" id="man" value="Male" /> <label for="man">Male</label>
										<input type="radio" name="gender" id="woman" value="Female" /> <label for="woman">Female</label>
                                       </div>
<div class="form-group">
                                            <label>Address Line1:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="address_line1" value="${employees.address_line1}"/>    
                                        </div>
                                        <div class="form-group">
                                            <label>Address Line2:</label><span class="style1"></span>
                                            <form:input class="form-control" path="address_line2"  value="${employees.address_line2}"/>    
                                        </div>
                                        <div class="form-group">
                                            <label>City:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="city" value="${employees.city}"/>    
                                        </div>

<div class="form-group">
                                            <label>Pincode:</label><span class="style1">*</span>
                                            <form:input  class="form-control" path="pincode" value="${employees.pincode}"/>    
                                        </div>
              <div class="form-group">
  <label>Country:</label><span class="style1">*</span>                                 
<select class="form-control" onchange="print_state('state',this.selectedIndex);" id="country" name ="country">
<option >Select Country</option>
</select>
 </div>
 	<script language="javascript">print_country("country");</script> 
   <div class="form-group">
                                            <div class="form-group">
  <label>State:</label><span class="style1">*</span>                                   
<select class="form-control" name ="state" id ="state">
<option >Select State</option>
</select>
         </div>                            

<div class="form-group">
                                            <label>EmailID:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="email_ID"  value="${employees.email_ID}"/>    
                                        </div>
                                        <div class="form-group">
                                            <label>Phone Number:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="phone_number" value="${employees.phone_number}"/>   
                                        </div>
                                        
                                         <div class="form-group">
                                            <label>Date of Birth:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="dob" value="${employees.dob}"/>    
                                        </div>
<div class="form-group">
                                            <label>Blood Group:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="blood_group"  value="${employees.blood_group}"/>    
                                        </div>
                                         <div class="form-group">
                                            <label>Marital Status:</label>
                                            <select class="form-control" name="marital_status">
                                                 <option>-Select one option-</option>
                                                  <option>Married</option>
                                                   <option>Single</option>
                                                 </select></div>  
                                        
                                         <div class="form-group">
                                            <label>Caste:</label>
                                            <select class="form-control" name="caste">
                                                 <option>-Select one option-</option>
                                                  <option>OBC</option>
                                                   <option>S/C</option>
                                                   <option>S/T</option>
                                                   <option>General</option>
                                                 </select>   
                                        </div>
                                         <div class="form-group">
                                            <label>Nationality:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="nationality" value="${employees.nationality}"/>    
                                        </div>
                                         <div class="form-group">
                                            <label>Govt ID_Number:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="id_number" value="${employees.id_number}"/>    
                                        </div>
 <div class="form-group">
                                            <label>Pan_Card_Number:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="pan_card_number"  value="${employees.pan_card_number}"/>    
                                        </div> 
                                        <div class="form-group">
                                            <label>Photo:</label><span class="style1">*</span>
                                           
              						<input class="form-control"type="file" name="photo"/>                    
				  
                                        </div>
                                        <div class="form-group">
                                            <label>Parent Emp ID:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="parent_emp_id" value="${employees.parent_emp_id}"/>    
                                        </div>
                                        <div class="form-group">
                                            <label>User ID:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="user_ID"  value="${employees.user_ID}"/>    
                                        </div>
                                        <div class="form-group">
                                            <label>Password:</label><span class="style1">*</span>
                                            <form:input class="form-control" path="password" value="${employees.password}"/>    
                                        </div>






<input type="submit" value="Update">
</form:form>
<br>

<br>

<br>

<br>

<a href="persoINFo.html" >back to employee details </a><br>

<br>





 </div>
                         <!-- /.col-lg-6 (nested) -->
                              </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

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
