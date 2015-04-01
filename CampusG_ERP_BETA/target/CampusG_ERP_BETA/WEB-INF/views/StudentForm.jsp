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
<p>  <span class="text-muted">Student ID:</span>       <b class="text-info">${i}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Course Level:</span>     <b class="text-info">${c}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
  	 <span class="text-muted">Program Name:</span>     <b class="text-info">${p}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Department Name:</span>  <b class="text-info">${d}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Course Opted:</span>     <b class="text-info">${e}</b></p>

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
						action="${pageContext.request.contextPath}/student">
						<div class="row">
						
						<form:input path="candidateid" name="candidateid" type="text" value="${i}"/>

							<div class="col-lg-5">
								<div class="form-group">
									<label class="label1">Full Name</label><span class="style1">*</span>
									<form:input path="firstname" name="firstname" type="text" class="form-control" placeholder="First Name" />
									<%-- <form:input path="firstname" />   --%>
								</div>
							</div>
							<!--Col-5  -->

							<div class="col-lg-33">
										 <div class="form-group">
                	                     <form:input path="middlename" type="text" class="form-control" placeholder="Middle Name"/>  
		    	                        </div>
									 </div><!--Col-3 -->
									
							<div class="col-lg-33">
								<div class="form-group">
									<form:input path="lastname" name="lastname" type="text" class="form-control"
										placeholder="Last Name" />
								</div>
							</div>
							<!--Col-3 -->

						</div>
						<div class="row">
							<div class="col-lg-5">
								<div class="form-group">
									<label class="label1">Date of Birth</label><span class="style1">*</span>
								   
								   <form:input path="dateofbirth" name="dateofbirth" type="text" class="form-control" id="datepicker" placeholder="Select Date of birth"/>
								</div>

								<div class="form-group">
									<label class="label1">Gender</label><span class="style1">*</span>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									<div class="form-control-gender">&nbsp;
	                                        <label1 for="male">Male</label1>     
	                                        	<form:radiobutton path="gender" name="gender" value="Male" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		      								 	
		      								<label1 for="female">Female</label1> 
		      								 	<form:radiobutton path="gender" name="gender" value="Female" />
                                   </div>
								</div>

								<div class="form-group">
									<label class="label1">Blood Group</label>
								<%-- 	<form:input path="bloodgroup" type="text" class="form-control" /> --%>
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
									<form:input path="birthplace" type="text" class="form-control"
										placeholder="Enter your birth place" />
								</div>
								<div class="form-group">
									<label class="label1">Nationality </label> <span class="style1">*</span>
									<form:input path="nationality" type="text" class="form-control"
										name="nationality" placeholder="Enter your nationality" />
								</div>
								<div class="form-group">
									<label class="label1">Mother Tounge</label> <span
										class="style1"></span>
									<form:input path="mothertongue" type="text"
										class="form-control" placeholder="Enter your mother tounge" />
								</div>

								<div class="form-group">
									<label class="label1">Category</label><span class="style1"></span>
									<%-- <form:input path="category" type="text" class="form-control" /> --%>
									<form:select path="category" class="form-control">
												<form:option value="None" label="--Select Category--"/>
												<form:option value="SC" label="SC"/>
												<form:option value="ST" label="ST"/>
												<form:option value="OBC" label="OBC"/>
									</form:select>
								</div>

								<div class="form-group">
									<label class="label1">Religion</label><span class="style1"></span>
									<form:input path="religion" type="text" class="form-control"
										name="" placeholder="Enter your  religion" />
								</div>
								<div class="form-group">
									<label class="label1">Caste</label><span class="style1"></span>
									<form:input path="caste" type="text" class="form-control"
										name="caste" placeholder="Enter your  caste" />
								</div>

								<div class="form-group">
									<label class="label1">Extra Curricular</label>
									<%-- <form:input path="extracurricular" type="text" class="form-control" /> --%>
									<form:textarea path="extracurricular" class="form-control"
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
					action="${pageContext.request.contextPath}/studentContact">
			<div class="row">
			
			<form:input path="candidateid" name="candidateid" type="text" value="${i}"/>
			
					<div class="col-lg-5">
						<div class="form-group">
							<label class="label1"><b>Present Contact Address</b></label><span
								class="style1"></span>
						</div>
						<div class="form-group">
							<label class="label1">Address Line1</label><span class="style1">*</span>
							<form:input path="presentaddressline1" class="form-control" 
								name="presentaddressline1" placeholder="Present address line1"/>
						</div>
						<div class="form-group">
							<label class="label1">Address Line2</label><span class="style1"></span>
							<form:input path="presentaddressline2" class="form-control"
								name="presentaddressline2" placeholder="Present address line2"/>
						</div>
						<div class="form-group">
							<label class="label1">City</label><span class="style1">*</span> 
							<form:input path="presentaddresscity" class="form-control" name="presentaddresscity" placeholder="Present address city"/>
						</div>
						<div class="form-group">
							<label class="label1">Pincode</label><span class="style1">*</span>
							<form:input path="presentaddresspincode" class="form-control"
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
							<form:input path="permanentaddressline1" class="form-control"
								name="permanentaddressline1" placeholder="Permanent address line1"/>
						</div>
						<div class="form-group">
							<label class="label1">Address Line2</label><span class="style1"></span>
							<form:input path="permanentaddressline2" class="form-control"
								id="PermanentAddressLine2" placeholder="Permanent address line2"/>
						</div>
						<div class="form-group">
							<label class="label1">City</label><span class="style1">*</span> 
							<form:input path="permanentaddresscity" class="form-control" name="permanentaddresscity"
								placeholder="Permanent address city"/>
						</div>
						<div class="form-group">
							<label class="label1">Pincode</label><span class="style1">*</span>
							<form:input path="permanentaddresspincode" class="form-control"
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
						<form:input path="emergencyaddressline1" name="emergencyaddressline1" class="form-control"
							 placeholder="Emergency address line1"/>
					</div>
					<div class="form-group">
						<label class="label1">Address Line2</label><span class="style1"></span>
						<form:input path="emergencyaddressline2" class="form-control"
							id="EmergencyAddressLine2" placeholder="Emergency address line2"/>
					</div>
					<div class="form-group">
						<label class="label1">City</label><span class="style1">*</span> 
						<form:input path="emergencyaddresscity" class="form-control" name="emergencyaddresscity"
							placeholder="Emergency address city"/>
					</div>
					<div class="form-group">
						<label class="label1">Pincode</label><span class="style1">*</span>
						<form:input path="emergencyaddresspincode" class="form-control"
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
						<form:input path="phone" type="text" class="form-control" name=""
							placeholder="Enter your land line number"/>
					</div>
					<div class="form-group">
						<label class="label1">Mobile</label><span class="style1">*</span>
						<form:input path="mobile" type="text" class="form-control" name="mobile"
							placeholder="Enter your mobile number"/>
					</div>
					<div class="form-group">
						<label class="label1">Email</label><span class="style1">*</span> 
						<form:input path="email" type="text" class="form-control" name="email"
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
				action="${pageContext.request.contextPath}/studentParent">
			<div class="row">
			
			<form:input path="candidateid" name="candidateid" type="text" value="${i}"/>
					<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Guardian Information</label><span class="style1"></span>
                	                            <form:input path="guardianfirstname" class="form-control" name="guardianfirstname" placeholder="First name"/>    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardianmiddlename" class="form-control" id="guardian_middle_name" placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardianlastname" class="form-control" name="guardianlastname" placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardinrelation" class="form-control" name="guardinrelation" placeholder="Relation"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="guardinoccupation" class="form-control" id="guardian_occupation" placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardintelres" class="form-control" id="guardian_phone_residence" placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardinteloff" class="form-control" id="guardian_phone_office" placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="guardinmobile" class="form-control" id="guardian_mobile" placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardinemail" class="form-control" id="guardian_email" placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="guardinanualincome" class="form-control" id="guardian_annual_salary" placeholder="Anual Income"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->
									
									
									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Father Information</label><span class="style1"></span>
                	                            <form:input path="fatherfirstname" class="form-control"  name="fatherfirstname" placeholder="First name" />    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fathermiddlename" class="form-control" id="father_middle_name" placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fatherlastname" class="form-control" name="fatherlastname" placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="fatheroccupation" class="form-control" id="father_occupation" placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fathertelres" class="form-control" id="father_phone_residence" placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fatherteloff" class="form-control" name="father_phone_office" id="father_phone_office" placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="fathermobile" class="form-control" id="father_mobile" placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fatheremail" class="form-control" name="father_email" id="father_email" placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
																				<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="fatheranualincome" class="form-control" name="father_annual_salary" id="father_annual_salary" placeholder="Anual Income"/>    
                    		    	        </div>
										</div><!--col-lg-33-->


									</div><!--row-->


									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Mother Information</label><span class="style1"></span>
                	                            <form:input path="motherfirstname" class="form-control" name="motherfirstname" placeholder="First name"/>    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="mothermiddlename" class="form-control" name="mother_middle_name" id="mother_middle_name" placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="motherlastname" class="form-control" name="motherlastname" placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="motheroccupation" class="form-control" name="mother_occupation" id="mother_occupation" placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="mothertelres" class="form-control" name="mother_phone_residence" id="mother_phone_residence" placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="motherteloff" class="form-control" name="mother_phone_office" id="mother_phone_office" placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <form:input path="mothermobile" class="form-control" name="mother_mobile" id="mother_mobile" placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="motheremail" class="form-control" name="mother_email" id="mother_email" placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <form:input path="motheranualincome" class="form-control" name="mother_annual_salary" id="mother_annual_salary" placeholder="Anual Income"/>    
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
			action="${pageContext.request.contextPath}/studentEducation">
		<div class="row">
		
		<form:input path="candidateid" name="candidateid" type="text" value="${i}"/>
			<div class="col-lg-5">
				<div class="form-group">
					<label class="label1">College/School</label><span class="style1"></span>
					<form:input path="collegename" type="text" class="form-control" name="last_college"
						placeholder="College/School Last Studied"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Entering</label><span class="style1"></span>
					<form:input path="dateofentry" type="text" class="form-control" id="datepickere"
					 placeholder="Select Date of entry"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Leaving</label><span class="style1"></span>
					<form:input path="dateofleaving" type="text" class="form-control" id="datepickerl"
					placeholder="Select Date of leaving"/>
				</div>
				<div class="form-group">
					<label class="label1">Board/University</label><span class="style1"></span>
					<form:input path="university" type="text" class="form-control" name=""
						placeholder="Board/University Last Studied"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Entering</label><span class="style1"></span>
					<form:input path="dateofentryuniversity" type="text" class="form-control" id="datepickeree"
					placeholder="Select Date of entry"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Leaving</label><span class="style1"></span>
					<form:input path="dateofleavinguniversity" type="text" class="form-control" id="datepickerll"
					placeholder="Select Date of leaving"/>
				</div>
				<div class="form-group">
					<label class="label1">Qualifying Examination Passed</label><span
						class="style1"></span> 
						<form:input path="qualifyingexamination" type="text" class="form-control"
						name="" placeholder="Details of Exam"/>
				</div>
				<div class="form-group">
					<label class="label1">Attempts</label><span class="style1"></span>
					<form:input path="numberofattempts" type="text" class="form-control" name="Attempts"
						placeholder="Number of attempts to pass"/>
				</div>
				<div class="form-group">
					<label class="label1">Year</label><span class="style1"></span> 
					<form:input path="yop" type="text" class="form-control" name=""
						placeholder="Enter the year of passing"/>
				</div>
				<div class="form-group">
					<label class="label1">Registrer Number</label><span class="style1"></span>
					<form:input path="registernumber" type="text" class="form-control" name=""
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
										   <form:input path="optionalsubjectphysicsavgmarks" type="text" class="form-control-marks" 
										   id="optional_subject_physics_avg_marks" placeholder="Avg Marks"/>   
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
										   <form:input path="optionalsubjectmathsavgmarks" type="text" class="form-control-marks" 
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
										   <form:input path="optionalsubjectoptavgmarks" type="text" class="form-control-marks" 
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
										   <form:input path="avgpercentage" type="text" class="form-control-marks" 
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

			<div class="form-group">
				<input type="checkbox" class="form-control-checkbox" name="option-5"
					id="option-5"> <label for="option-1" class="label1">I
					agreed the</label><span class="style1"></span> <span
					style="font: normal 14px agency, arial; color: blue; text-decoration: underline; cursor: pointer;"
					data-toggle="modal" data-target="#myModal1">Terms &
					Conditions</span>
				<!-- Modal -->
				<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">INSTRUCTIONS TO
									THE CANDIDATES SEEKING ADMISSION</h4>
							</div>
							<div class="modal-body">
								1.The application form should be correctly filled. Enclose 4
								Colour PP size Photographs and send to the Principal,<br>H.K.B.K.
								College of Engineering,Bangalore,Karnataka,India,with a Crossed
								demand Draft for Rs.500/-<br>(Rupees Five Hundred Only)
								Drawn in favour of H.K.B.K. College of Engineering,Bangalore,
								towards<br>Registration fee of application and with
								documents securely fastened to the application,so as to reach
								him on or <br> before the due date. The registration fee is
								not refundable.<br>2. a) MINIMUM QUALIFICATION: Two years
								Pre University Examination of the Karnataka Pre University
								Education Board or any other equivalent examination with a
								minimum of 45 percent marks on the aggregate on<br>the
								science group i.e., Physics, Mathematics and
								Chemistry/Biology/Bio-Technology/Electronics/Computer Science
								int the Final Examination, with Engish as one of the Subject of
								study.<br> <br> b) As per Government norms,the above
								qualified student should have taken CET/KRLMPCA - CET or any<br>
								other Entrance Test approved by the Government of Karnataka.<br>3.
								Students from other University / Board should produce the
								ELIGIBILTY CERTIFICATE from REGISTRAR,<br>V.T.U.,Belgaum
								along with the application.<br> <br>4. Students coming
								from other Universities should also produce Migration
								Certificate at the time of adission.<br> <br>5.
								Applications with incomplete information are liable to be
								rejected.<br> <br>6. Application received after the
								due date will not be entertained.<br> <br>7. Only
								attested copies of the required certificated are to be enclosed
								with the application and the Original Certificates should be
								produced at the time of Selection/Admission.<br> <br>8.
								Candidates called for interview,should appear before the
								selection committee,at their own cost.<br> <br>9.
								Candidates selected for admission would be intimated by ordinary
								post.<br> <br>10. The Management reserves the right to
								cancel the admission of a candidate at any stage, if and when is
								detected that admission is against the rules.<br> <br>
								<br> <br>Note: i)The branch once allotted will not be
								changed later.<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ii)
								All admissions are subject to final approval of the Visvesvaraya
								Technological University(VTU)<br>Belgaum and the Institute
								shall not be responsible for any loss to the candidate if the
								admission is not <br>approved by the University.<br> <br>
								<br>Principal<br>H.K.B.K. College of Engineering

							</div>
							<div class="modal-footer">
		
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>

							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal -->

			</div>
		</div>


	</div>
	<!-- /.col-lg-12 -->
	<hr>
	<!-- <input type="submit" class="btn btn-primary" value="SaveAndProceed"> -->
	<input type="submit" value="SaveAndProceed " class="btn btn-primary" disabled>
	</form:form>
	</div>
	</div>


	</div>
	</div>
	</div>
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


<%-- <script src="<c:url value="/resources/js/validate/jquery.validate.js"/>"></script>
<script src="<c:url value="/resources/js/validate/admissionpersonal.js"/>"></script>
<script src="<c:url value="/resources/js/validate/admissioncontact.js"/>"></script>
<script src="<c:url value="/resources/js/validate/admissionparent.js"/>"></script>
 --%>

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


