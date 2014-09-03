<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Start Bootstrap - SB Admin Version 2.0 Demo</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">
 
    <!-- Page-Level Plugin CSS - Forms -->

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" media="all" href="jsDatePick_ltr.min.css" />
    <style type="text/css">
<!--
.style1 {color: #FF0000}
-->
    </style>
 
 <link rel="stylesheet"  type="text/css" href="new.css"/>
 
    
  <script type="text/javascript" src="jquery-1.11.js" ></script>
<script type="text/javascript" src="changepass.js"> </script>
<script src="jquery.min.js"></script>
<script type="text/javascript" src="jquery.validate.min.js"></script>
  <script type="text/javascript" src="jsDatePick.min.1.3.js"></script>
    
    
</head>

<body>

    <div id="wrapper">

        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><img src="WEB-INF/view/img/Biztime_Logo.png" width="200" height="50"></a>
            </div>
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
                        <li><a href="settings.html"><i class="fa fa-gear fa-fw"></i> Settings</a>
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
                <ul class="nav" id="side-menu">
                    <li class="sidebar-search">
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                        <!-- /input-group -->
                    </li>
      
                         
      <li>       
                        <a href="applicantList.html"><i class="fa fa-dashboard fa-fw"></i>Shortlist Candidate</a>
             </li>
             
             
             <li>       
                        <a href="applicantInterviewList.html"><i class="fa fa-dashboard fa-fw"></i>Applicant Interview Details</a>
             </li>
             
              <li>       
                        <a href="applicantFinalList.html"><i class="fa fa-dashboard fa-fw"></i>Final Applicant List</a>
             </li>
             
                   </ul>
                <!-- /#side-menu -->
            </div>
            <!-- /.sidebar-collapse -->
        </nav>
        <!-- /.navbar-static-side -->

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Applicant Details</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            
                        </div>
                        
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
         <c:url var="reg" value=""/>
<form id="Applicant_Details" modelAttribute="applicant" commandName="applicant" method="get" action="${reg}">                       
                             
		<fieldset>
	
			<p>
				<label for="fname" class="block">First name:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="first_Name"  value="${applicants.first_Name}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
				
			
				<label for="lname" class="block">Last name:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="last_Name"  value="${applicants.last_Name}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
			</p>
			<fieldset>
			<label for="fname" class="block">10th Details:</label>
			
			
			
			    <p>
				<label for="fname" class="block">Percentage:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="tenth_Percentage"  value="${applicants.tenth_Percentage}" ></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
                                          
				<label for="mname" class="block">Year of passing:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="tenth_YOP"  value="${applicants.tenth_YOP}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
				
				<label for="fname" class="block">School Name:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="tenth_School"  value="${applicants.tenth_School}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
			</p>

            
			</fieldset>
			<fieldset>
			<label for="fname" class="block">12th Details:</label>
			
			
			
			    <p>
				<label for="fname" class="block">Percentage:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="twelth_Percentage"  value="${applicants.twelth_Percentage}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
                                          
				<label for="mname" class="block">Year of passing:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="twelth_YOP"  value="${applicants.twelth_YOP}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
				
				<label for="fname" class="block">School Name:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="twelth_School"  value="${applicants.twelth_School}" ></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
			</p>

             
			</fieldset>
			 <p>
				<label class="block">Gender:</label></br></br>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="gender"  value="${applicants.gender}" ></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
			</p>

			<p>
				<label for="lname" class="block">Area Of Interest:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                               
                                                 <div class="form-group"><input path="department"  value="${applicants.department}" >
                                                 </div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
			</p>

			
			<p>
				<label class="block">Date Of Birth:</label>
				<span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="dob"  value="${applicants.dob}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
				

			</p>
			<p>
			<label for="fname" class="block">Address Line:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="address"  value="${applicants.address}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
                                          
				<label for="fname" class="block">City:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="city"  value="${applicants.city}" ></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
				
				<label for="mname" class="block">Pincode:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="pincode"  value="${applicants.pincode}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
				
				<p>
				<label for="lname" class="block">State:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                               
    
                                                <div class="form-group"><input path="state"  value="${applicants.state}">
                                                
   <!-- India -->                                             
  </div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
			</p>

			<p>
				<label for="fname" class="block">Country:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="country"  value="${applicants.country}">
                                                </div> 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
                                          <p>
                                          <p>
				<label for="fname" class="block">EmailID:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="email_ID"  value="${applicants.email_ID}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
                                          <p>
                                          
                                          <p>
				<label for="fname" class="block">Phone Number:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input path="\mobile_No"  value="${applicants.mobile_No}"></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 

			
			
			</p>
                            
            </form>                            
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

    <!-- Page-Level Plugin Scripts - Forms -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Forms - Use for reference -->

</body>

</html>

          
                   