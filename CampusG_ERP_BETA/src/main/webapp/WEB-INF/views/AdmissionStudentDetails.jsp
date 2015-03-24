<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>campus_G</title>

<!-- Core CSS - Include with every page -->

<!-- Core CSS - Include with every page -->
<link href="<c:url value="/resources/css/bootstrap.css"/>"
	rel="stylesheet">

<link
	href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/sb-admin.css"/>"
	rel="stylesheet">

<script src="<c:url value="/resources/js/validate/countries.js" />"></script>
<link href="<c:url value="/resources/css/jquery-ui.css"/>" rel="stylesheet">

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
                <a class="navbar-brand1" href="index.html"><!--SB Admin v2.0--><img src="images/Biztime_Logo.png" width="250" height="60"></a>
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
                    <li  class="active">
                        <a href="#"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Administration<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Flot Charts</a>
                            </li>
                            <li>
                                <a href="#">Morris.js Charts</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
					
					<li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Academics <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Flot Charts</a>
                            </li>
                            <li>
                                <a href="#">Morris.js Charts</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                   
                   
				   
				    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> Data and Exports <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Panels and Wells</a>
                            </li>
                            <li>
                                <a href="#">Buttons</a>
                            </li>
                            <li>
                                <a href="#">Notifications</a>
                            </li>
                            <li>
                                <a href="#">Typography</a>
                            </li>
                            <li>
                                <a href="#">Grid</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    
					
					
					<li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Collaborations <span class="fa arrow"></span></a>
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
                    </li>
					


					<li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Collaborations_1 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Second Level Item</a>
                            </li>
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
                                        <a href="#">Fourth Level Item<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="#">Fourth Level Item</a>
                                    		</li>
                                    		<li>
                                        		<a href="#">Fourth Level Item</a>
                                    		</li>
                                    		<li>
                                        		<a href="#">Fourth Level Item</a>
                                    		</li>
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
                                </ul>
                                <!-- /.nav-third-level -->
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>

					
					
					
					<li>
                    <!--<li class="active">-->
                        <a href="#"><i class="fa fa-files-o fa-fw"></i> Extra <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Blank Page</a>
                            </li>
                            <li>
                                <a href="#">Login Page</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                </ul>
                <!-- /#side-menu -->
            </div>
            <!-- /.sidebar-collapse -->
        </nav>
        <!-- /.navbar-static-side -->


<!--Start of Main page-->

        <div id="page-wrapper">
        <form role="" id="admissionstudentdetails" method="post" action="">
            <div class="row">             
              <div class="col-lg-12">
                   
                     <h4 class="page-header">Admission | <span class="style2"> Candidate Details</span></h4>
              </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-6">
                  		<h6><a href="">Home</a> > <b>Student Admission</b></h6>
                  
           	  	</div><!--col 6 -->
			 </div><!--row -->
                   <br />
             <div class="row">
                <div class="col-lg-12"> 
                                
					<div class="form-group">                             
						<label>Fields Marked with <span class="style1">*</span> must be filled</label>
					</div>

				</div><!--col-12 -->
			</div><!--col row -->

             <div class="row">
		         <div class="col-lg-12">
				 	
					
					<ul class="nav nav-tabs">
                                <li class="active"><a href="#Personal" data-toggle="tab">Personal</a></li>
                                <li><a href="#Contact" data-toggle="tab">Contact</a></li>
								<li><a href="#Parent" data-toggle="tab">Parent</a></li>
                                <li><a href="#Educational" data-toggle="tab">Educational</a></li>

                    </ul>
					
					<!-- Tab panes -->
                            <div class="tab-content">
                                <div class="tab-pane fade in active" id="Personal">
								<br/>
								
								<div class="row">
							        
									 <div class="col-lg-5">
										 <div class="form-group">
                    	                        <label class="label1">Full Name</label><span class="style1">*</span>
                	                            <input type="text" class="form-control" name="FirstName" placeholder="First Name">  
		    	                        </div>
									 </div><!--Col-5  -->
									 
									 <div class="col-lg-33">
										 <div class="form-group">
                	                            <input type="text" class="form-control" name="MiddleName" placeholder="Middle Name">  
		    	                        </div>
									 </div><!--Col-3 -->
									 
									 <div class="col-lg-33">
										 <div class="form-group">
                	                            <input type="text" class="form-control" name="LastName" placeholder="Last Name">  
		    	                        </div>
									 </div><!--Col-3 -->
									 									 
								</div><!--row -->
								
							<div class="row">
								<div class="col-lg-5">
										<div class="form-group">
                                            <label class="label1">Date of Birth</label><span class="style1">*</span>
                                            <input type="date" class="form-control" name="DateOFBirth">  
										</div>
										
										<div class="form-group">
                                            	<label class="label1">Gender</label><span class="style1">*</span>
											<div class="form-control-gender">&nbsp;
	                                        	 <label1 for="male">Male</label1> <input type="radio"   name="Gender" id="man" value="Male" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		      								 	<label1 for="female">Female</label1>	<input type="radio"   name="Gender" id="woman" value="Female" />
                                        	</div>
                                        </div>	
                                        							
										 <div class="form-group">
                                            <label class="label1">Blood Group</label>
                                            <select class="form-control" name="BloodGroup">
												<option>  Select Blood Group   </option>
												<option>Unknown</option>
												<option>A</option>
												<option>B</option>
												<option>O +ve</option>
												<option>O -ve</option>
											</select>  
                                        </div>
                                        
                                          <div class="form-group">
                                            <label class="label1">Birth Place</label>
                                            <span class="style1"></span>
											<input type="text" class="form-control" name="BirthPlace" placeholder="Enter your birth place">  
                                        </div>
                                          <div class="form-group">
                                            <label class="label1">Nationality </label>
                                            <span class="style1">*</span>
											<input type="text" class="form-control" name="Nationality" placeholder="Enter your nationality">
                                        </div>
                                          <div class="form-group">
                                            <label class="label1">Mother Tounge</label>
                                            <span class="style1"></span>
											<input type="text" class="form-control" name="" placeholder="Enter your mother tounge" >  
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="label1">Category</label><span class="style1"></span>
                                           <select class="form-control" name="">
												<option> select </option>
										  </select> 
                                        </div>
                                        
                                           <div class="form-group">
                                            <label class="label1">Religion</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="" placeholder="Enter your  religion">  
                                        </div>
                                       <div class="form-group">
                                            <label class="label1">Caste</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="caste" placeholder="Enter your  caste">  
                            		</div>  

									<div class="form-group">
                                            <label class="label1">Extra Curricular</label>
                                            <textarea class="form-control" rows="5" placeholder="Enter your extra curricular activities"></textarea>
                                    </div>
							<br><br><br><br>
									<div class="form-group">
                                            <label class="label1">Upload Photo</label>
                                            <input type="file" name="UploadPhoto">
                                    </div>
									<hr>
						
									<button type="submit" class="btn btn-primary">SaveAndProceed</button>
									
									

							   </div><!--Col-5  -->
							</div><!--row -->										
						</div><!-- tab-pane-->
    
	
	                            <div class="tab-pane fade" id="Contact">
								<br/>
									<div class="row">
										<div class="col-lg-5">
											
											<div class="form-group">
				                               <label class="label1"><b>Present Contact Address</b></label><span class="style1"></span>                               
											 </div>
			                               <div class="form-group">
            	                                <label class="label1">Address Line1</label><span class="style1">*</span>
                	                            <input class="form-control" name="PresentAddressLine1" id="PresentAddressLine1" placeholder="Present address line1">    
                    		    	        </div>
                            	            <div class="form-group">
                                    	        <label class="label1">Address Line2</label><span class="style1"></span>
                                        	    <input class="form-control" name="PresentAddressLine2" id="PresentAddressLine2" placeholder="Present address line2">    
	                                        </div>
    	                                    <div class="form-group">
        	                                    <label class="label1">City</label><span class="style1">*</span>
            	                                <input class="form-control" name="PresentCity" id="PresentCity" placeholder="Present address city">    
                	                        </div>
                    			           <div class="form-group">
                                	            <label class="label1">Pincode</label><span class="style1">*</span>
                                    	        <input class="form-control" name="PresentPincode" id="PresentPincode" placeholder="Present address pincode">    
			                               </div>
            							                 <div class="form-group">
                                            <label class="label1">Country</label><span class="style1">*</span>
                                          <select class="form-control" onChange="print_state('PresentState',this.selectedIndex);" id="PresentCountry" name ="PresentCountry">
<option >Select Country</option>
</select>
  </div>
   <div class="form-group">
                                            <label class="label1">State</label><span class="style1">*</span>
                                           <select class="form-control" name ="PresentState" id ="PresentState">
<option >Select State</option>
</select>
</div>
  
		<script language="javascript">print_country("PresentCountry");</script> 

   											<hr>
									   </div><!-- Col 5-->

										<div class="col-lg-5">
   
 			                              <div class="form-group">
            			                   		<label class="label1"><b>Permanent Contact Address</b></label><span class="style1"></span>   
										   </div>
                        			       <div class="form-group">
                                    	        <label class="label1">Address Line1</label><span class="style1">*</span>
                                        	    <input class="form-control" name="PermanentAddressLine1" id="PermanentAddressLine1" placeholder="Permanent address line1">    
		                                 </div>
        	                             <div class="form-group">
            	                                <label class="label1">Address Line2</label><span class="style1"></span>
                	                            <input class="form-control" name="PermanentAddressLine2" id="PermanentAddressLine2" placeholder="Permanent address line2">    
                                        </div>
                                        <div class="form-group">
                                            <label class="label1">City</label><span class="style1">*</span>
                                            <input class="form-control" name="PermanentCity" id="PermanentCity" placeholder="Permanent address city">    
                                        </div>
                    		           <div class="form-group">
                                            <label class="label1">Pincode</label><span class="style1">*</span>
                                            <input class="form-control" name="PermanentPincode" id="PermanentPincode" placeholder="Permanent address pincode">    
                            		     </div>
							              <div class="form-group">
                            	                <label class="label1">Country</label><span class="style1">*</span>
                                	          <select class="form-control" onChange="print_state('PermanentState',this.selectedIndex);" id="PermanentCountry" name ="PermanentCountry">
												<option >Select Country</option>
												</select>
										  </div>
										   <div class="form-group">
                                        	    <label class="label1">State</label><span class="style1">*</span>
	                                           <select class="form-control" name ="PermanentState" id ="PermanentState">
													<option >Select State</option>
											   </select>
										  </div>
  
											<script language="javascript">print_country("PermanentCountry");</script> 
                               		<hr>
									</div><!--col 5 -->
								</div><!--row-->
								
								
								<div class="row">
									<div class="col-lg-5">
										      <div class="form-group">
            			                   		<label class="label1"><b>Emergency Contact Address</b></label><span class="style1"></span>   
										   </div>
                        			       <div class="form-group">
                                    	        <label class="label1">Address Line1</label><span class="style1">*</span>
                                        	    <input class="form-control" name="EmergencyAddressLine1" id="EmergencyAddressLine1" placeholder="Emergency address line1">    
		                                 </div>
        	                             <div class="form-group">
            	                                <label class="label1">Address Line2</label><span class="style1"></span>
                	                            <input class="form-control" name="EmergencyAddressLine2" id="EmergencyAddressLine2" placeholder="Emergency address line2">    
                                        </div>
                                        <div class="form-group">
                                            <label class="label1">City</label><span class="style1">*</span>
                                            <input class="form-control" name="EmergencyCity" id="EmergencyCity" placeholder="Emergency address city">    
                                        </div>
                    		           <div class="form-group">
                                            <label class="label1">Pincode</label><span class="style1">*</span>
                                            <input class="form-control" name="EmergencyPincode" id="EmergencyPincode" placeholder="Emergency address  pincode">    
                            		     </div>
							              <div class="form-group">
                            	                <label class="label1">Country</label><span class="style1">*</span>
                                	          <select class="form-control" onChange="print_state('EmergencyState',this.selectedIndex);" id="EmergencyCountry" name ="EmergencyCountry">
												<option >Select Country</option>
												</select>
										  </div>
										   <div class="form-group">
                                        	    <label class="label1">State</label><span class="style1">*</span>
	                                           <select class="form-control" name ="EmergencyState" id ="EmergencyState">
													<option >Select State</option>
											   </select>
										  </div>
  
											<script language="javascript">print_country("EmergencyCountry");</script> 
                               		<hr>
									</div><!--col 5-->
								
									<div class="col-lg-5">
									
									  <div class="form-group">
            			                   		<label class="label1"><b>Comman Details</b></label><span class="style1"></span>   
										   </div>
									
                               		     <div class="form-group">
                                    	        <label class="label1">Land Phone</label><span class="style1"></span>
                                        	    <input type="text" class="form-control" name="" placeholder="Enter your land line number">  
                                       	 </div>
                                         <div class="form-group">
                                            <label class="label1">Mobile</label><span class="style1">*</span>
                                            <input type="text" class="form-control" name="Mobile" placeholder="Enter your mobile number">  
                                        </div>
                                         <div class="form-group">
                                            <label class="label1">Email</label><span class="style1">*</span>
                                            <input type="text" class="form-control" name="Email" placeholder="Enter your email">  
                                        </div> 
										<hr>

										</div><!--Col-5 -->
									</div><!--row-->

									<button type="submit" class="btn btn-primary">SaveAndProceed</button>
     
	                                 </div>
	
	
								<div class="tab-pane fade" id="Parent">
								<br/>
									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Guardian Information</label><span class="style1"></span>
                	                            <input class="form-control" name="GuardianFirstName" id="GuardianFirstName" placeholder="First name">    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="GuardianMiddleName" id="GuardianMiddleName" placeholder="Middle name">    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="GuardianLastName" id="GuardianLastName" placeholder="Last name">    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="Relation" id="Relation" placeholder="Relation">    
                    		    	        </div>
										</div><!--col-lg-33-->
									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input class="form-control" name="FatherFirstName" id="FatherFirstName" placeholder="Profession">    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherrMiddleName" id="FatherMiddleName" placeholder="Tel(Res)">    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherlastName" id="FatherLastName" placeholder="Tel(Off)">    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input class="form-control" name="FatherFirstName" id="FatherFirstName" placeholder="Mobile">    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherrMiddleName" id="FatherMiddleName" placeholder="Email">    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->
									
									
									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Father Information</label><span class="style1"></span>
                	                            <input class="form-control" name="GuardianFirstName" id="GuardianFirstName" placeholder="First name">    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="GuardianMiddleName" id="GuardianMiddleName" placeholder="Middle name">    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="GuardianLastName" id="GuardianLastName" placeholder="Last name">    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input class="form-control" name="FatherFirstName" id="FatherFirstName" placeholder="Profession">    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherrMiddleName" id="FatherMiddleName" placeholder="Tel(Res)">    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherlastName" id="FatherLastName" placeholder="Tel(Off)">    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input class="form-control" name="FatherFirstName" id="FatherFirstName" placeholder="Mobile">    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherrMiddleName" id="FatherMiddleName" placeholder="Email">    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->


									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Mother Information</label><span class="style1"></span>
                	                            <input class="form-control" name="GuardianFirstName" id="GuardianFirstName" placeholder="First name">    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="GuardianMiddleName" id="GuardianMiddleName" placeholder="Middle name">    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="GuardianLastName" id="GuardianLastName" placeholder="Last name">    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input class="form-control" name="FatherFirstName" id="FatherFirstName" placeholder="Profession">    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherrMiddleName" id="FatherMiddleName" placeholder="Tel(Res)">    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherlastName" id="FatherLastName" placeholder="Tel(Off)">    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input class="form-control" name="FatherFirstName" id="FatherFirstName" placeholder="Mobile">    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input class="form-control" name="FatherrMiddleName" id="FatherMiddleName" placeholder="Email">    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->



									  

									  <button type="submit" class="btn btn-primary" href="#Educational" data-toggle="tab">Save & Proceed</button>
									  <!--<a href="#Educational" data-toggle="tab">Educational</a>-->
                                </div>
								
								
                              <div class="tab-pane fade" id="Educational">
								<br/>
									<div class="row">
										<div class="col-lg-5">
											  <div class="form-group">
                                            <label class="label1">College/School</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="last_college" placeholder="College/School Last Studied">  
                                		 </div>
		                                <div class="form-group">
                                            <label class="label1">Date of Entering</label><span class="style1"></span>
                                            <input type="date" class="form-control" name="">  
         		                        </div>
                                        <div class="form-group">
                                            <label class="label1">Date of Leaving</label><span class="style1"></span>
                                            <input type="date" class="form-control" name="">  
                                        </div>
                                        <div class="form-group">
                                            <label class="label1">Board/University</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="" placeholder="Board/University Last Studied">  
                                        </div>
                                        <div class="form-group">
                                            <label class="label1">Date of Entering</label><span class="style1"></span>
                                            <input type="date" class="form-control" name="">  
                                        </div>
                                        <div class="form-group">
                                            <label class="label1">Date of Leaving</label><span class="style1"></span>
                                            <input type="date" class="form-control" name="">  
                                        </div>                                        
                		               <div class="form-group">
                                            <label class="label1">Qualifying Examination Passed</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="" placeholder="Details of Exam">  
	                                   </div>
									    <div class="form-group">
                                            <label class="label1">Attempts</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="Attempts" placeholder="Number of attempts to pass">  
	                                   </div>
									   <div class="form-group">
                                            <label class="label1">Year</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="" placeholder="Enter the year of passing">  
	                                   </div>
									   <div class="form-group">
                                            <label class="label1">Registrer Number</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="" placeholder="Enter Register Number">  
	                                   </div>
									   
									   </div><!-- Col 5-->
									  </div><!--row-->
									  
 									<div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">Optional Subjects</label><span class="style1"></span>
   		                                        <input type="text" class="form-control" value="PHYSICS" name="" placeholder="" disabled>   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   <div class="col-lg-11">
										   <input type="text" class="form-control-marks" name="" placeholder="Avg Marks">   
									   </div>  
									 </div><!--row-->
									 
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>											 	
   		                                        <input type="text" class="form-control" value="MATHEMATICS" name="" placeholder="" disabled>   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   <div class="col-lg-11">
										   <input type="text" class="form-control-marks" name="" placeholder="Avg Marks">   
									   </div>  
									 </div><!--row-->
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>
   		                                        <select class="form-control" name ="emergency_state" id ="emergency_state">
													<option>CHEMISTRY</option>
													<option>BIO-TECHNOLOGY</option>
													<option>COMPUTER SCIENCE</option>
													<option>ELECTRONICS</option>
													<option>BIOLOGY</option>
											   </select>
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									  
									   <div class="col-lg-11">
										   <input type="text" class="form-control-marks" name="" placeholder="Avg Marks">   
									   </div>  
									 </div><!--row-->
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>
   		                                        <input type="text" class="form-control" value="AVG PERCENTAGE" name="" placeholder="" disabled>   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   
									   <div class="col-lg-11">
										   <input type="text" class="form-control-marks" name="" placeholder="">   
									   </div>  
									 </div><!--row-->
									 
									 
			 <div class="row">
                <div class="col-lg-12">
<p><b>Institutions at which the applicatn studied during the last five years(Reasons of break in continuity may be stated in the remarks column commencing from VIII Standard to XII Standart</b></p>				
                      
				  
<table id="options-table" class="table table-striped table-bordered table-hover">					
			<tr>
				<td>Year</td>
		<td>Institution</td>
		<td>Class</td>
		<td>Remarks</td>
				<td>Add/Delete</td>
			</tr>
			<tr>
			<td><input type="text"   name="input_box_one[]" class="form-control"/></td>
			<td><input type="text"   name="input_box_one[]" class="form-control"/></td>
				<td><input type="text"   name="input_box_one[]" class="form-control"/></td>
				<td><input type="text" 	 name="input_box_two[]" class="form-control"/></td>                        
				<td><input type="button" class='del' value='Delete' /></td>
			</tr>                  
			<tr>
			<td><input type="text"   name="input_box_one[]" class="form-control"/></td>
			<td><input type="text"   name="input_box_one[]" class="form-control"/></td>
				<td><input type="text"   name="input_box_one[]" class="form-control"/></td>
				<td><input type="text"   name="input_box_two[]" class="form-control"/></td>
				<td><input type="button" class="add" value="Add More" /></td>
			</tr>
		</table>
		<br>
		
		<div class="form-group">
        <input type="checkbox" class="form-control-checkbox" name="option-5" id="option-5"> <label for="option-1" class="label1">I agreed the</label><span class="style1"></span>
        <span style="font:normal 14px agency, arial; color:blue; text-decoration:underline; cursor:pointer;" data-toggle="modal" data-target="#myModal1">Terms & Conditions</span>									        <!-- Modal -->
                            <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="myModalLabel">INSTRUCTIONS TO THE CANDIDATES SEEKING ADMISSION</h4>
                                        </div>
                                        <div class="modal-body">
                                            1.The application form should be correctly filled. Enclose 4 Colour PP size Photographs and send to the Principal,<br>H.K.B.K. College of Engineering,Bangalore,Karnataka,India,with a Crossed demand Draft for Rs.500/-<br>(Rupees Five Hundred Only) Drawn in favour of H.K.B.K. College of Engineering,Bangalore, towards<br>Registration fee of application and with documents securely fastened to the application,so as to reach him on or <br>
                                            before the due date. The registration fee is not refundable.<br>2. a) MINIMUM QUALIFICATION: Two years Pre University Examination of the Karnataka Pre University Education Board or any other equivalent examination with a minimum of 45 percent marks on the aggregate on<br>the science group i.e., Physics, Mathematics and Chemistry/Biology/Bio-Technology/Electronics/Computer Science int the Final Examination, with Engish as one of the Subject of study.<br><br> b) As per Government norms,the above qualified student should have taken CET/KRLMPCA - CET or any<br>
                                            other Entrance Test approved by the Government of Karnataka.<br>3. Students from other University / Board should produce the ELIGIBILTY  CERTIFICATE from REGISTRAR,<br>V.T.U.,Belgaum along with the application.<br><br>4. Students coming from other Universities should also produce Migration Certificate at the time of adission.<br><br>5. Applications with incomplete information are liable to be rejected.<br><br>6. Application received after the due date will not be entertained.<br><br>7. Only attested copies of the required certificated are to be enclosed  
                                             with the application and the Original Certificates should be produced at the time of Selection/Admission.<br><br>8. Candidates called for interview,should appear before the selection committee,at their own cost.<br><br>9. Candidates selected for admission would be intimated by ordinary post.<br><br>10. The Management reserves the right to cancel the admission of a candidate at any stage, if and when is detected that admission is against the rules.<br><br><br><br>Note:  i)The branch once allotted will not be changed later.<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ii) All admissions are subject to final
                                             approval of the Visvesvaraya Technological University(VTU)<br>Belgaum and the Institute shall not be responsible for any loss to the candidate if the admission is not <br>approved by the University.<br><br><br>Principal<br>H.K.B.K. College of Engineering 
                                             
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                            
                                        </div>
                                    </div>
                                    <!-- /.modal-content -->
                                </div>
                                <!-- /.modal-dialog -->
                            </div>
 <!-- /.modal -->
	                         
	            </div>
					  </div> 
					  
					  
                </div><!-- /.col-lg-12 -->
				<hr>
				 <input type="submit" value="SaveAndProceed " class="btn btn-primary" disabled> 
			</div><!--row-->
									 
									 
									 

                                </div><!--Tab Education -->
                                
                            </div><!--Tab Main-->
				 
				</div><!--Col 12-->
			</div><!-- Col row-->

        </div>
        <!-- /#page-wrapper -->

<!--End of Main page-->
	<!-- Core Scripts - Include with every page -->
	<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>
	<script src ="<c:url value="/resources/js/jquery-ui.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>

	<script
		src="<c:url value="/resources/js/validate/jquery.validate.js" />"></script>
	<script
		src="<c:url value="/resources/js/validate/admissionstudent.js" />"></script>

 <script>
$(function() {
$( "#datepicker" ).datepicker({
changeMonth: true,
changeYear: true
});
});
</script>

<script>
$(function() {
$( "#datepickere" ).datepicker({
changeMonth: true,
changeYear: true
});
});
</script>

<script>
$(function() {
$( "#datepickerl" ).datepicker({
changeMonth: true,
changeYear: true
});
});
</script>

<script>
$(function() {
$( "#datepickeree" ).datepicker({
changeMonth: true,
changeYear: true
});
});
</script>

<script>
$(function() {
$( "#datepickerll" ).datepicker({
changeMonth: true,
changeYear: true
});
});
</script>



	<script type="text/javascript">
		$(document)
				.ready(
						function() {

							$('.del').live('click', function() {
								$(this).parent().parent().remove();
							});

							$('.add')
									.live(
											'click',
											function() {
												$(this).val('Delete');
												$(this).attr('class', 'del');
												var appendTxt = "<tr><td><input type='text' name='input_box_one[]' class='form-control'/></td> <td><input type='text' name='input_box_two[]' class='form-control'/></td> <td><input type='text' name='input_box_two[]' class='form-control'/></td> <td><input type='text' name='input_box_two[]' class='form-control'/></td> <td><input type='button' class='add' value='Add More' /></td></tr>";
												$("tr:last").after(appendTxt);
											});
						});
	</script>

<!-- 	Validation jquery plugin 
<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>-->

<script src="<c:url value="/resources/js/validate/jquery.validate.js"/>"></script>
<script src="<c:url value="/resources/js/validate/admissionpersonal.js"/>"></script>
<script src="<c:url value="/resources/js/validate/admissioncontact.js"/>"></script>
<script src="<c:url value="/resources/js/validate/admissionparent.js"/>"></script>


	<script>
		var checkboxes = $("input[type='checkbox']"), submitButt = $("input[type='submit']");

		checkboxes.click(function() {
			submitButt.attr("disabled", !checkboxes.is(":checked"));
		});
	</script>
	
	
	<!-- to Calculate avg percentage for marks entered in the education tab -->
	<script type="text/javascript">
	function calcutale() {
		var a = document.getElementById('optional_subject_physics_avg_marks').value;
		var b = document.getElementById('optional_subject_maths_avg_marks').value;
		var c = document.getElementById('optional_subject_opt_avg_marks').value;
		var d = (a*b*c)/3;
		//float var e = (d/3).toFixed(2);
		
		//var num = parseFloat(d/3).toFixed(2);
		
		document.getElementById("avg_percentage").value = d;
	}
</script>
</body>

</html>


