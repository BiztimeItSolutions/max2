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

        <!-- <nav class="navbar-default navbar-static-side" role="navigation">
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

                    </li>   /input-group
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
                        /.nav-second-level
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
                        /.nav-second-level
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
                        /.nav-second-level
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
                                /.nav-third-level
                            </li>
                        </ul>
                        /.nav-second-level
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
										/.nav-fourth-level										
                                    </li>
                                </ul>
                                /.nav-third-level
                            </li>
                        </ul>
                        /.nav-second-level
                    </li>

					
					
					
					<li>
                    <li class="active">
                        <a href="#"><i class="fa fa-files-o fa-fw"></i> Extra <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Blank Page</a>
                            </li>
                            <li>
                                <a href="#">Login Page</a>
                            </li>
                        </ul>
                        /.nav-second-level
                    </li>
                </ul>
                /#side-menu
            </div>
            /.sidebar-collapse
        </nav>
        /.navbar-static-side -->
<!--Start of Main page-->
<div id="page-wrapper1">
		<div class="row">
			<div class="col-lg-12">

				<h4 class="page-header">
					Admission | <span class="style2"> Candidate Details</span>
				</h4>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-6">
				<h6>
					<a href="">Home</a> > <b>Student Admission</b>
				</h6>

			</div>
			<!--col 6 -->
		</div>
		<!--row -->
		<br />
		<div class="row">
			<div class="col-lg-12">

				<div class="form-group">
					<label>Fields Marked with <span class="style1">*</span>
						must be filled
					</label>
				</div>
<div>
<p>  <span class="text-muted">Student ID:</span>       <b class="text-info">${c.candidate_id}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Course Level:</span>     <b class="text-info">${c.course_level}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
  	 <span class="text-muted">Program Name:</span>     <b class="text-info">${c.program}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Department Name:</span>  <b class="text-info">${c.department}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Course Opted:</span>     <b class="text-info">${c.course_name}</b></p>

</div>
<br/>

			</div>
			<!--col-12 -->
		</div>
		<!--col row -->

		<div class="row">
			<div class="col-lg-12">

				<ul class="nav nav-tabs">

					<c:choose>
						<c:when test="${ShowForm eq 'Personal'}">
							<li class="active"><a href="#Personal" data-toggle="tab">Personal</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="#Personal" data-toggle="tab">Personal</a></li>
						</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${ShowForm eq 'Contact'}">
							<li class="active"><a href="#Contact" data-toggle="tab">Contact</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="#Contact" data-toggle="tab">Contact</a></li>
						</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${ShowForm eq 'Parent'}">
							<li class="active"><a href="#Parent" data-toggle="tab">Parent</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="#Parent" data-toggle="tab">Parent</a></li>
						</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${ShowForm eq 'Educational'}">
							<li class="active"><a href="#Educational" data-toggle="tab">Educational</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="#Educational" data-toggle="tab">Educational</a></li>
						</c:otherwise>
					</c:choose>
					
					<c:choose>
						<c:when test="${ShowForm eq 'Status'}">
							<li class="active"><a href="#Status" data-toggle="tab">Status</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="#Status" data-toggle="tab">Status</a></li>
						</c:otherwise>
					</c:choose>

				</ul>

				<!-- Tab panes -->

				<div class="tab-content">


					<c:choose>
						<c:when test="${ShowForm eq 'Personal'}">
							<div class="tab-pane fade in active" id="Personal">
						</c:when>
						<c:otherwise>
							<div class="tab-pane fade" id="Personal">
						</c:otherwise>
					</c:choose>
<br/>
					<form:form method="POST" commandName="StudentForm" id="admissionpersonaldetails"
						action="${pageContext.request.contextPath}/updatestudent">
						<div class="row">
						<!-- View of candidate personal -->
						
						stud<form:input path="studentid" name="candidateid" type="text" value="${p.studentid}"/>
						
						candi<form:input path="candidateid" name="candidateid" type="text" value="${p.candidateid}"/>

							<div class="col-lg-5">
								<div class="form-group">
									<label class="label1">Full Name</label><span class="style1">*</span>
									<form:input path="firstname" name="firstname" value="${p.firstname}" type="text" class="form-control" placeholder="First Name" />
									  
								</div>
							</div>
							<!--Col-5  -->

							<div class="col-lg-33">
										 <div class="form-group">
                	                     <form:input path="middlename" value="${p.middlename}" type="text" class="form-control" placeholder="Middle Name"/>  
		    	                        </div>
									 </div><!--Col-3 -->
									
							<div class="col-lg-33">
								<div class="form-group">
									<form:input path="lastname" name="lastname" value="${p.lastname}" type="text" class="form-control"
										placeholder="Last Name" />
								</div>
							</div>
							<!--Col-3 -->

						</div>
						<div class="row">
							<div class="col-lg-5">
								<div class="form-group">
									<label class="label1">Date of Birth</label><span class="style1">*</span>
								   
								   <form:input path="dateofbirth" value="${p.dateofbirth}" name="dateofbirth" type="text" class="form-control" id="datepicker" placeholder="Select Date of birth"/>
								</div>

								<div class="form-group">
									<label class="label1">Gender</label><span class="style1">*</span>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									
							<div class="form-control-gender">&nbsp;
									
									<c:set var="gender" value="${p.gender}"/>
									
									<label1 for="male">Male</label1>
									 <input type="radio" name="gender" 
            							value="Male" <c:if test="${gender=='Male'}">checked</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<label1 for="female">Female</label1>
									 <input type="radio" name="gender" 
            							value="Female" <c:if test="${gender=='Female'}">checked</c:if>>
            			    </div>
									
									
									
								<%-- 	<div class="form-control-gender">&nbsp;
	                                        <label1 for="male">Male</label1>     
	                                        	<form:radiobutton path="gender" value="Male" 
	                                        	<c:if test="${gender=='Male'}">checked</c:if>/>   <!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -->
		      								 	
		      								<label1 for="female">Female</label1> 
		      								 	<form:radiobutton path="gender" value="Female"
		      								 	<c:if test="${gender=='Female'}">checked</c:if>/>
                                   </div> --%>
								</div>

								<div class="form-group">
									<label class="label1">Blood Group</label>
									
									<form:select path="bloodgroup" class="form-control">
												<form:option value="None" label="--Select Blood Group--"/>
												<form:option value="A-" label="A-"/>
												<form:option value="A+" label="A+"/>
												<form:option value="B-" label="B-"/>
												<form:option value="B+" label="B+"/>
												<form:option value="O-" label="O-"/>
												<form:option value="O+" label="O+"/>
												<form:option value="AB+" label="AB+"/>
												<form:option value="AB-" label="AB-"/>
												
									</form:select>
								</div>

								<div class="form-group">
									<label class="label1">Birth Place</label> <span class="style1"></span>
									<form:input path="birthplace" value="${p.birthplace}" type="text" class="form-control"
										placeholder="Enter your birth place" />
								</div>
								<div class="form-group">
									<label class="label1">Nationality </label> <span class="style1">*</span>
									<form:input path="nationality" value="${p.nationality}" type="text" class="form-control"
										name="nationality" placeholder="Enter your nationality" />
								</div>
								<div class="form-group">
									<label class="label1">Mother Tounge</label> <span
										class="style1"></span>
									<form:input path="mothertongue" type="text" value="${p.mothertongue}"
										class="form-control" placeholder="Enter your mother tounge" />
								</div>

								<div class="form-group">
									<label class="label1">Category</label><span class="style1"></span>
								
									<form:select path="category" class="form-control">
												<form:option value="None" label="--Select Category--"/>
												<form:option value="SC" label="SC"/>
												<form:option value="ST" label="ST"/>
												<form:option value="OBC" label="OBC"/>
									</form:select>
								</div>

								<div class="form-group">
									<label class="label1">Religion</label><span class="style1"></span>
									<form:input path="religion" type="text" class="form-control" value="${p.religion}"
										name="" placeholder="Enter your  religion" />
								</div>
								<div class="form-group">
									<label class="label1">Caste</label><span class="style1"></span>
									<form:input path="caste" type="text" class="form-control" value="${p.caste}"
										name="caste" placeholder="Enter your  caste" />
								</div>

								<div class="form-group">
									<label class="label1">Extra Curricular</label>
									
									<form:textarea path="extracurricular" class="form-control" value="${p.extracurricular}"
										rows="5" placeholder="Enter your extra curricular activities" />
									</textarea>
								</div>
								<br><br><br><br>
									<div class="form-group">
                                            <label class="label1">Upload Photo</label>
                                            <form:input path="photo" type="file" name="UploadPhoto"/>
                                    </div>
						
								<hr>

							
								<input type="submit" class="btn btn-primary" value="Save & Proceed">
								
							</div>
					</form:form>
				</div>
			</div>

			<c:choose>
				<c:when test="${ShowForm eq 'Contact'}">
					<div class="tab-pane fade in active" id="Contact">
				</c:when>
				<c:otherwise>
					<div class="tab-pane fade" id="Contact">
				</c:otherwise>
			</c:choose>
<br/>			
				<form:form method="POST" commandName="StudentContact" id="admissioncontactdetails"
					action="${pageContext.request.contextPath}/update_studentContact">
			<div class="row">
			
			Cantact<form:input path="studentcontactid" name="candidateid" type="text" value="${cc.studentcontactid}"/>
			
			Candi<form:input path="candidateid" name="candidateid" type="text" value="${cc.candidateid}"/>
			
					<div class="col-lg-5">
						<div class="form-group">
							<label class="label1"><b>Present Contact Address</b></label><span
								class="style1"></span>
						</div>
						<div class="form-group">
							<label class="label1">Address Line1</label><span class="style1">*</span>
							<form:input path="presentaddressline1" class="form-control" value="${cc.presentaddressline1}"
								name="presentaddressline1" placeholder="Present address line1"/>
						</div>
						<div class="form-group">
							<label class="label1">Address Line2</label><span class="style1"></span>
							<form:input path="presentaddressline2" class="form-control" value="${cc.presentaddressline2}"
								name="presentaddressline2" placeholder="Present address line2"/>
						</div>
						<div class="form-group">
							<label class="label1">City</label><span class="style1">*</span> 
							<form:input path="presentaddresscity" class="form-control" value="${cc.presentaddresscity}" name="presentaddresscity" placeholder="Present address city"/>
						</div>
						<div class="form-group">
							<label class="label1">Pincode</label><span class="style1">*</span>
							<form:input path="presentaddresspincode" class="form-control" value="${cc.presentaddresspincode}"
								name="presentaddresspincode" placeholder="Present address pincode"/>
						</div>
						<div class="form-group">
							<label class="label1">Country</label><span class="style1">*</span>
							<form:select path="presentaddresscountry" class="form-control"
								onChange="print_state('presentaddressstate',this.selectedIndex);"
								name="presentaddresscountry">
								<!-- <option>Select Country</option> -->
							</form:select>
						</div>
						<div class="form-group">
							<label class="label1">State</label><span class="style1">*</span>
							<form:select path="presentaddressstate" class="form-control" name="presentaddressstate">
								<!-- <option>Select State</option> -->
							</form:select>
						</div>

						<script language="javascript">
							print_country("presentaddresscountry");
						</script>

						<hr>
					</div>
					<!-- Col 5-->

					<div class="col-lg-5">

						<div class="form-group">
							<label class="label1"><b>Permanent Contact Address</b></label><span
								class="style1"></span>
						</div>
						
						
						
						
						<div class="form-group">
							<label class="label1">Address Line1</label><span class="style1">*</span>
							<form:input path="permanentaddressline1" class="form-control" value="${cc.permanentaddressline1}"
								name="permanentaddressline1" placeholder="Permanent address line1"/>
						</div>
						<div class="form-group">
							<label class="label1">Address Line2</label><span class="style1"></span>
							<form:input path="permanentaddressline2" class="form-control" value="${cc.permanentaddressline2}"
								id="PermanentAddressLine2" placeholder="Permanent address line2"/>
						</div>
						<div class="form-group">
							<label class="label1">City</label><span class="style1">*</span> 
							<form:input path="permanentaddresscity" class="form-control" name="permanentaddresscity" value="${cc.permanentaddresscity}"
								placeholder="Permanent address city"/>
						</div>
						<div class="form-group">
							<label class="label1">Pincode</label><span class="style1">*</span>
							<form:input path="permanentaddresspincode" class="form-control" value="${cc.permanentaddresspincode}"
								name="permanentaddresspincode" placeholder="Permanent address pincode"/>
						</div>
						<div class="form-group">
							<label class="label1">Country</label><span class="style1">*</span>
							<form:select path="permanentaddresscountry" class="form-control"
								onChange="print_state('permanentaddressstate',this.selectedIndex);"
								name="permanentaddresscountry">
								<!-- <option>Select Country</option> -->
							</form:select>
						</div>
						<div class="form-group">
							<label class="label1">State</label><span class="style1">*</span>
							<form:select path="permanentaddressstate" class="form-control" name="permanentaddressstate">
								<!-- <option>Select State</option> -->
							</form:select>
						</div>

						<script language="javascript">
							print_country("permanentaddresscountry");
						</script>
						<hr>
					</div>
					<!--col 5 -->
			</div>
			<!--row-->


			<div class="row">
				<div class="col-lg-5">
					<div class="form-group">
						<label class="label1"><b>Emergency Contact Address</b></label><span
							class="style1"></span>
					</div>
					<div class="form-group">
						<label class="label1">Address Line1</label><span class="style1">*</span>
						<form:input path="emergencyaddressline1" name="emergencyaddressline1" value="${cc.emergencyaddressline1}" 
						class="form-control" placeholder="Emergency address line1"/>
					</div>
					<div class="form-group">
						<label class="label1">Address Line2</label><span class="style1"></span>
						<form:input path="emergencyaddressline2" class="form-control" value="${cc.emergencyaddressline2}"
							id="EmergencyAddressLine2" placeholder="Emergency address line2"/>
					</div>
					<div class="form-group">
						<label class="label1">City</label><span class="style1">*</span> 
						<form:input path="emergencyaddresscity" class="form-control" value="${cc.emergencyaddresscity}"
						name="emergencyaddresscity"	placeholder="Emergency address city"/> 
					</div>
					<div class="form-group">
						<label class="label1">Pincode</label><span class="style1">*</span>
						<form:input path="emergencyaddresspincode" class="form-control" value="${cc.emergencyaddresspincode}"
							name="emergencyaddresspincode" placeholder="Emergency address  pincode"/>
					</div>
					<div class="form-group">
						<label class="label1">Country</label><span class="style1">*</span>
						<form:select path="emergencyaddresscountry" class="form-control"
							onChange="print_state('emergencyaddressstate',this.selectedIndex);"
							name="emergencyaddresscountry">
							<!-- <option>Select Country</option> -->
						</form:select>
					</div>
					<div class="form-group">
						<label class="label1">State</label><span class="style1">*</span> 
						<form:select path="emergencyaddressstate" class="form-control" name="emergencyaddressstate">
							<!-- <option>Select State</option> -->
						</form:select>
					</div>

					<script language="javascript">print_country("emergencyaddresscountry");
					</script>
					<hr>
				</div>
				<!--col 5-->

				<div class="col-lg-5">

					<div class="form-group">
						<label class="label1"><b>Comman Details</b></label><span
							class="style1"></span>
					</div>

					<div class="form-group">
						<label class="label1">Land Phone</label><span class="style1"></span>
						<form:input path="phone" type="text" class="form-control" name="phone" vlaue="${cc.phone}"
							placeholder="Enter your land line number"/>
					</div>
					<div class="form-group">
						<label class="label1">Mobile</label><span class="style1">*</span>
						<form:input path="mobile" type="text" class="form-control" name="mobile" value="${cc.mobile}"
							placeholder="Enter your mobile number"/>
					</div>
					<div class="form-group">
						<label class="label1">Email</label><span class="style1">*</span> 
						<form:input path="email" type="text" class="form-control" name="email" value="${cc.email}"
							placeholder="Enter your email"/>
					</div>

					<hr>

				</div>
				<!--Col-5 -->
			</div>
			<!--row-->

			<input type="submit" class="btn btn-primary" value="Save & Proceed">
			
			</form:form>
		</div>
  
		<c:choose>
			<c:when test="${ShowForm eq 'Parent'}">
				<div class="tab-pane fade in active" id="Parent">
			</c:when>
			<c:otherwise>
				<div class="tab-pane fade" id="Parent">
			</c:otherwise>
		</c:choose>
		
<br/>
			<form:form method="POST" commandName="StudentParent" id="admissionparentdetails"
				action="${pageContext.request.contextPath}/update_studentParent">
			<div class="row">
			
			<form:input path="studentparentid" name="candidateid" type="text" value="${cp.studentparentid}"/>
			
			<form:input path="candidateid" name="candidateid" type="text" value="${cp.candidateid}"/>
					<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Guardian Information</label><span class="style1"></span>
                	                            <form:input path="guardianfirstname" class="form-control" name="guardianfirstname" value="${cp.guardianfirstname}" 
                	                            placeholder="First name"/>    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardianmiddlename" class="form-control" id="guardian_middle_name" value="${cp.guardianmiddlename}" 
                	                            placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardianlastname" class="form-control" name="guardianlastname" value="${cp.guardianlastname}" 
                	                            placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardinrelation" class="form-control" name="guardinrelation" value="${cp.guardinrelation}" 
                	                            placeholder="Relation"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="guardinoccupation" class="form-control" id="guardian_occupation" value="${cp.guardinoccupation}"
                                        	     placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardintelres" class="form-control" id="guardian_phone_residence" value="${cp.guardintelres}"
                	                             placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardinteloff" class="form-control" id="guardian_phone_office" value="${cp.guardinteloff}" 
                	                            placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="guardinmobile" class="form-control" id="guardian_mobile" value="${cp.guardinmobile}"
                                        	     placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardinemail" class="form-control" id="guardian_email" value="${cp.guardinemail}" 
                	                            placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardinanualincome" class="form-control" value="${cp.guardinanualincome}" 
                	                            id="guardian_annual_salary" placeholder="Anual Income"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->
									
									
									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Father Information</label><span class="style1"></span>
                	                            <form:input path="fatherfirstname" class="form-control" value="${cp.fatherfirstname}"  
                	                            name="fatherfirstname" placeholder="First name" />    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fathermiddlename" class="form-control" value="${cp.fathermiddlename}"
                	                             id="father_middle_name" placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fatherlastname" class="form-control" value="${cp.fatherlastname}" 
                	                            name="fatherlastname" placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="fatheroccupation" class="form-control" value="${cp.fatheroccupation}" 
                                        	    id="father_occupation" placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fathertelres" class="form-control" value="${cp.fathertelres}" 
                	                            id="father_phone_residence" placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fatherteloff" class="form-control" value="${cp.fatherteloff}" 
                	                            name="father_phone_office" id="father_phone_office" placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="fathermobile" class="form-control" value="${cp.fathermobile}" 
                                        	    id="father_mobile" placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fatheremail" class="form-control" value="${cp.fatheremail}" 
                	                            name="father_email" id="father_email" placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
																				<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fatheranualincome" class="form-control" value="${cp.fatheranualincome}" 
                	                            name="father_annual_salary" id="father_annual_salary" placeholder="Anual Income"/>    
                    		    	        </div>
										</div><!--col-lg-33-->


									</div><!--row-->


									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Mother Information</label><span class="style1"></span>
                	                            <form:input path="motherfirstname" class="form-control" value="${cp.motherfirstname}"
                	                             name="motherfirstname" placeholder="First name"/>    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="mothermiddlename" class="form-control" value="${cp.mothermiddlename}"
                	                             name="mother_middle_name" id="mother_middle_name" placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="motherlastname" class="form-control" value="${cp.motherlastname}" 
                	                            name="motherlastname" placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="motheroccupation" class="form-control" value="${cp.motheroccupation}" 
                                        	    name="mother_occupation" id="mother_occupation" placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="mothertelres" class="form-control" value="${cp.mothertelres}" 
                	                            name="mother_phone_residence" id="mother_phone_residence" placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="motherteloff" class="form-control" value="${cp.motherteloff}" 
                	                            name="mother_phone_office" id="mother_phone_office" placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="mothermobile" class="form-control" value="${cp.mothermobile}" 
                                        	    name="mother_mobile" id="mother_mobile" placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="motheremail" class="form-control" value="${cp.motheremail}" 
                	                            name="mother_email" id="mother_email" placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="motheranualincome" class="form-control" value="${cp.motheranualincome}" 
                	                            name="mother_annual_salary" id="mother_annual_salary" placeholder="Anual Income"/>    
                    		    	        </div>
										</div><!--col-lg-33-->


									</div><!--row-->
									

		<input type="submit" class="btn btn-primary" value="Save & Proceed">
		</form:form>

	</div>

	<c:choose>
		<c:when test="${ShowForm eq 'Educational'}">
			<div class="tab-pane fade in active" id="Educational">
		</c:when>
		<c:otherwise>
			<div class="tab-pane fade" id="Educational">
		</c:otherwise>
	</c:choose>
<br/>
	
		<form:form method="POST" commandName="StudentEducation"
			action="${pageContext.request.contextPath}/update_studentEducation">
		<div class="row">
		
		<form:input path="candidatepreviouseducationaldetailid" name="candidateid" 
		type="text" value="${e.candidatepreviouseducationaldetailid}"/>
		
		<form:input path="candidateid" name="candidateid" type="text" value="${e.candidateid}"/>
			
			<div class="col-lg-5">
				<div class="form-group">
					<label class="label1">College/School</label><span class="style1"></span>
					<form:input path="collegename" type="text" class="form-control" value="${e.collegename}"
					 name="last_college" placeholder="College/School Last Studied"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Entering</label><span class="style1"></span>
					<form:input path="dateofentry" type="text" class="form-control" id="datepickere" value="${e.dateofentry}"
					 placeholder="Select Date of entry"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Leaving</label><span class="style1"></span>
					<form:input path="dateofleaving" type="text" class="form-control" id="datepickerl" value="${e.dateofleaving}"
					placeholder="Select Date of leaving"/>
				</div>
				<div class="form-group">
					<label class="label1">Board/University</label><span class="style1"></span>
					<form:input path="university" type="text" class="form-control" name="" value="${e.university}"
						placeholder="Board/University Last Studied"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Entering</label><span class="style1"></span>
					<form:input path="dateofentryuniversity" type="text" class="form-control" id="datepickeree" value="${e.dateofentryuniversity}"
					placeholder="Select Date of entry"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Leaving</label><span class="style1"></span>
					<form:input path="dateofleavinguniversity" type="text" class="form-control" id="datepickerll" value="${e.dateofleavinguniversity}"
					placeholder="Select Date of leaving"/>
				</div>
				<div class="form-group">
					<label class="label1">Qualifying Examination Passed</label><span
						class="style1"></span> 
						<form:input path="qualifyingexamination" type="text" class="form-control" value="${e.qualifyingexamination}"
						name="" placeholder="Details of Exam"/>
				</div>
				<div class="form-group">
					<label class="label1">Attempts</label><span class="style1"></span>
					<form:input path="numberofattempts" type="text" class="form-control" name="Attempts" value="${e.numberofattempts}"
						placeholder="Number of attempts to pass"/>
				</div>
				<div class="form-group">
					<label class="label1">Year</label><span class="style1"></span> 
					<form:input path="yop" type="text" class="form-control" name="" value="${e.yop}"
						placeholder="Enter the year of passing"/>
				</div>
				<div class="form-group">
					<label class="label1">Registrer Number</label><span class="style1"></span>
					<form:input path="registernumber" type="text" class="form-control" name="" value="${e.registernumber}"
						placeholder="Enter Register Number"/>
				</div>

			</div>
			<!-- Col 5-->
	</div>
	<!--row-->

									<div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">Optional Subjects</label><span class="style1"></span>
   		                                        <form:input path="optionalsubjectphysics" type="text" class="form-control" value="PHYSICS"
   		                                        name="optional_subject_physics" />   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   <div class="col-lg-11">
										   <form:input path="optionalsubjectphysicsavgmarks" type="text" value="${e.optionalsubjectphysicsavgmarks}" 
										   class="form-control-marks" id="optional_subject_physics_avg_marks" placeholder="Avg Marks"/>   
									   </div>  
									 </div><!--row-->
									 
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>											 	
   		                                        <form:input path="optionalsubjectmaths" type="text" class="form-control" 
   		                                        value="MATHEMATICS" name="optional_subject_maths" placeholder=""/>   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   <div class="col-lg-11">
										   <form:input path="optionalsubjectmathsavgmarks" type="text" value="${e.optionalsubjectmathsavgmarks}" 
										   class="form-control-marks" 
										   id="optional_subject_maths_avg_marks" placeholder="Avg Marks"/>   
									   </div>  
									 </div><!--row-->
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>
   		                                        <form:select path="optionalsubjectopt" class="form-control">
													<form:option value="None" label="--SELECT SUBJECT--"/>
													<form:option value="CHEMISTRY" label="CHEMISTRY"/>
													<form:option value="BIO-TECHNOLOGY" label="BIO-TECHNOLOGY"/>
													<form:option value="ELECTRONICS" label="ELECTRONICS"/>
													<form:option value="BIOLOGY" label="BIOLOGY"/>
												</form:select>
   		                                        
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									  
									   <div class="col-lg-11">
										   <form:input path="optionalsubjectoptavgmarks" type="text" value="${e.optionalsubjectoptavgmarks}" 
										   class="form-control-marks" 
										   id="optional_subject_opt_avg_marks" placeholder="Avg Marks"/>   
									   </div>  
									 </div><!--row-->
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>
   		                                        <form:input path="" type="text" class="form-control" value="AVG PERCENTAGE" 
   		                                        placeholder=""/>   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   
									   <div class="col-lg-11">
										   <form:input path="avgpercentage" type="text" value="${e.avgpercentage}" 
										   class="form-control-marks" 
										   id="avg_percentage" placeholder="" onClick="calcutale()"/>   
									   </div>  
									 </div><!--row-->
									 
									 
	<div class="row">
		<div class="col-lg-12">
			<p>
				<b>Institutions at which the applicatn studied during the last
					five years(Reasons of break in continuity may be stated in the
					remarks column commencing from VIII Standard to XII Standart</b>
			</p>


			<table id="options-table"
				class="table table-striped table-bordered table-hover">
				<tr>
					<td>Year</td>
					<td>Institution</td>
					<td>Class</td>
					<td>Remarks</td>
					<td>Add/Delete</td>
				</tr>
				<tr>
					<td><input type="text" name="input_box_one[]"
						class="form-control" /></td>
					<td><input type="text" name="input_box_one[]"
						class="form-control" /></td>
					<td><input type="text" name="input_box_one[]"
						class="form-control" /></td>
					<td><input type="text" name="input_box_two[]"
						class="form-control" /></td>
					<td><input type="button" class='del' value='Delete' /></td>
				</tr>
				<tr>
					<td><input type="text" name="input_box_one[]"
						class="form-control" /></td>
					<td><input type="text" name="input_box_one[]"
						class="form-control" /></td>
					<td><input type="text" name="input_box_one[]"
						class="form-control" /></td>
					<td><input type="text" name="input_box_two[]"
						class="form-control" /></td>
					<td><input type="button" class="add" value="Add More" /></td>
				</tr>
			</table>
			<br>
		</div>
	</div>
	<!-- /.col-lg-12 -->
	<hr>
	<!-- <input type="submit" class="btn btn-primary" value="SaveAndProceed">//disabled -->
	<input type="submit" value="SaveAndProceed " class="btn btn-primary">
	</form:form>
	</div>
	
	
	<c:choose>
		<c:when test="${ShowForm eq 'Status'}">
			<div class="tab-pane fade in active" id="Status">
		</c:when>
		<c:otherwise>
			<div class="tab-pane fade" id="Status">
		</c:otherwise>
	</c:choose>
<br/>
	
		<form:form method="POST" commandName="StudentStatus"
			action="${pageContext.request.contextPath}/save_studentStatus">
	<div class="row">
	 <form:input path="candidateid" name="candidateid" type="text" value="${c.candidate_id}"/>
		<div class="col-lg-5">
			<div class="form-group">
				<label class="label1">Status</label><span class="style1"></span>
				<%-- <form:input path="status" type="text" class="form-control" /> --%>
				<form:select path="status" class="form-control">
					<form:option value="None" label="--Select Category--"/>
					<form:option value="Pending" label="PENDING"/>
					<form:option value="Accept" label="ACCEPT"/>
					<form:option value="Reject" label="REJECT"/>
				</form:select>
			</div>
		
			<div class="form-group">
				<label class="label1">Remarks</label><span class="style1">*</span>
				<form:textarea path="remarks" class="form-control"
				rows="8" placeholder="Enter Remarks" />
				</textarea>
			</div>
		</div>
	</div>
	<input type="submit" value="SaveAndProceed " class="btn btn-primary">
		</form:form>
	
	
	</div>


	</div>
	</div>
	</div>

 
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


