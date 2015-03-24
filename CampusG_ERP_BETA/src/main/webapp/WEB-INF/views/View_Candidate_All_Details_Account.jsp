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

	
 <!-- Header--><%@ include file="Header.jsp" %>
 <!-- Left Menu --><%@ include file="LeftMenu.jsp" %> 

<div id="page-wrapper">
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
<p>  <span class="text-muted">Student ID:</span>       <b class="text-info">${p.candidate_id}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Course Level:</span>     <b class="text-info">${p.course_level}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
  	 <span class="text-muted">Program Name:</span>     <b class="text-info">${p.program}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Department Name:</span>  <b class="text-info">${p.department}</b>     &nbsp;&nbsp;&nbsp;&nbsp;
	 <span class="text-muted">Course Opted:</span>     <b class="text-info">${p.course_name}</b></p>

</div>
<br/>

			</div>
			<!--col-12 -->
		</div>
		<!--col row -->
		
		
		 <div class="row">
                <div class="col-lg-12">
                
                		
						<form method="post" action="Update_Candidate_office">
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#personal" data-toggle="tab">Personal</a></li>
                                <li><a href="#contact" data-toggle="tab">Contact</a></li>
                                <li><a href="#parent" data-toggle="tab">Parent</a></li>
                                <li><a href="#education" data-toggle="tab">Education</a></li>
                                <li><a href="#status" data-toggle="tab">Status</a></li>
                            </ul>

                            <!-- Tab panes -->
                            <div class="tab-content">
                               
                                <div class="tab-pane fade in active" id="personal">
                                    <br>
                                    
                                     <input type="hidden" name="candidate_id" value="${p.candidate_id}"/>
                                   
                               <div class="row">
                             	<div class="col-lg-5">
								<div class="form-group">
									<label class="label1">Full Name</label><span class="style1">*</span>
									<input name="firstname" value="${p.firstname}" type="text" class="form-control" placeholder="First Name">
									  
								</div>
							</div>
							<!--Col-5  -->

							<div class="col-lg-33">
										 <div class="form-group">
                	                     <input value="${p.middlename}" type="text" class="form-control" placeholder="Middle Name">  
		    	                        </div>
									 </div><!--Col-3 -->
									
							<div class="col-lg-33">
								<div class="form-group">
									<input name="lastname" value="${p.lastname}" type="text" class="form-control"
										placeholder="Last Name">
								</div>
							</div>
							<!--Col-3 -->

						</div>
						<div class="row">
							<div class="col-lg-5">
								<div class="form-group">
									<label class="label1">Date of Birth</label><span class="style1">*</span>
								   
								   <input value="${p.dateofbirth}" name="dateofbirth" type="text" class="form-control" id="datepicker" placeholder="Select Date of birth">
								</div>

								<div class="form-group">
									<label class="label1">Gender</label><span class="style1">*</span>
									<%-- <input path="gender" type="text" class="form-control" name="gender" /> --%>
									
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
	                                        	<radiobutton path="gender" value="Male" 
	                                        	<c:if test="${gender=='Male'}">checked</c:if>/>   <!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -->
		      								 	
		      								<label1 for="female">Female</label1> 
		      								 	<radiobutton path="gender" value="Female"
		      								 	<c:if test="${gender=='Female'}">checked</c:if>/>
                                   </div> --%>
								</div>

								<div class="form-group">
									<label class="label1">Blood Group</label>
									
									<select class="form-control">
												<option value="None" label="--Select Blood Group--"/>
												<option value="A-" label="A-"/>
												<option value="A+" label="A+"/>
												<option value="B-" label="B-"/>
												<option value="B+" label="B+"/>
												<option value="O-" label="O-"/>
												<option value="O+" label="O+"/>
												<option value="AB+" label="AB+"/>
												<option value="AB-" label="AB-"/>
												
									</select>
								</div>

								<div class="form-group">
									<label class="label1">Birth Place</label> <span class="style1"></span>
									<input value="${p.birthplace}" type="text" class="form-control"
										placeholder="Enter your birth place">
								</div>
								<div class="form-group">
									<label class="label1">Nationality </label> <span class="style1">*</span>
									<input value="${p.nationality}" type="text" class="form-control"
										name="nationality" placeholder="Enter your nationality">
								</div>
								<div class="form-group">
									<label class="label1">Mother Tounge</label> <span
										class="style1"></span>
									<input type="text" value="${p.mothertongue}"
										class="form-control" placeholder="Enter your mother tounge">
								</div>

								<div class="form-group">
									<label class="label1">Category</label><span class="style1"></span>
								
									<select class="form-control">
												<option value="None" label="--Select Category--"/>
												<option value="SC" label="SC"/>
												<option value="ST" label="ST"/>
												<option value="OBC" label="OBC"/>
									</select>
								</div>

								<div class="form-group">
									<label class="label1">Religion</label><span class="style1"></span>
									<input type="text" class="form-control" value="${p.religion}"
										name="" placeholder="Enter your  religion">
								</div>
								<div class="form-group">
									<label class="label1">Caste</label><span class="style1"></span>
									<input type="text" class="form-control" value="${p.caste}"
										name="caste" placeholder="Enter your  caste">
								</div>

								<%-- <div class="form-group">
									<label class="label1">Extra Curricular</label>
									
									<textarea class="form-control"> <%${p.extracurricular}%> </textarea>
								</div> --%>
								<br><br><br><br>
									<div class="form-group">
                                            <label class="label1">Upload Photo</label>
                                            <input type="file" name="UploadPhoto">
                                    </div>
	
							</div> <!-- col-lg-5 -->
                          </div> <!-- row -->
                         </div> <!-- personal tab -->

                                
                 <div class="tab-pane fade" id="contact">
                 <br>
          <div class="row">       
          <div class="col-lg-5">
						<div class="form-group">
							<label class="label1"><b>Present Contact Address</b></label><span
								class="style1"></span>
						</div>
						<div class="form-group">
							<label class="label1">Address Line1</label><span class="style1">*</span>
							<input class="form-control" value="${p.presentaddressline1}" type="text"
								name="presentaddressline1" placeholder="Present address line1">
						</div>
						<div class="form-group">
							<label class="label1">Address Line2</label><span class="style1"></span>
							<input class="form-control" value="${p.presentaddressline2}" type="text"
								name="presentaddressline2" placeholder="Present address line2">
						</div>
						<div class="form-group">
							<label class="label1">City</label><span class="style1">*</span> 
							<input type="text" class="form-control" value="${p.presentaddresscity}" name="presentaddresscity" placeholder="Present address city">
						</div>
						<div class="form-group">
							<label class="label1">Pincode</label><span class="style1">*</span>
							<input type="text" class="form-control" value="${p.presentaddresspincode}"
								name="presentaddresspincode" placeholder="Present address pincode">
						</div>
						<div class="form-group">
							<label class="label1">Country</label><span class="style1">*</span>
							<select class="form-control"
								onChange="print_state('presentaddressstate',this.selectedIndex);"
								name="presentaddresscountry">
								<!-- <option>Select Country</option> -->
							</select>
						</div>
						<div class="form-group">
							<label class="label1">State</label><span class="style1">*</span>
							<select class="form-control" name="presentaddressstate">
								<!-- <option>Select State</option> -->
							</select>
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
							<input type="text" class="form-control" value="${p.permanentaddressline1}"
								name="permanentaddressline1" placeholder="Permanent address line1"/>
						</div>
						<div class="form-group">
							<label class="label1">Address Line2</label><span class="style1"></span>
							<input type="text" class="form-control" value="${p.permanentaddressline2}"
								id="PermanentAddressLine2" placeholder="Permanent address line2"/>
						</div>
						<div class="form-group">
							<label class="label1">City</label><span class="style1">*</span> 
							<input type="text" class="form-control" name="permanentaddresscity" value="${p.permanentaddresscity}"
								placeholder="Permanent address city"/>
						</div>
						<div class="form-group">
							<label class="label1">Pincode</label><span class="style1">*</span>
							<input type="text" class="form-control" value="${p.permanentaddresspincode}"
								name="permanentaddresspincode" placeholder="Permanent address pincode"/>
						</div>
						<div class="form-group">
							<label class="label1">Country</label><span class="style1">*</span>
							<select class="form-control"
								onChange="print_state('permanentaddressstate',this.selectedIndex);"
								name="permanentaddresscountry">
								<!-- <option>Select Country</option> -->
							</select>
						</div>
						<div class="form-group">
							<label class="label1">State</label><span class="style1">*</span>
							<select class="form-control" name="permanentaddressstate">
								<!-- <option>Select State</option> -->
							</select>
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
						<input type="text" name="emergencyaddressline1" value="${p.emergencyaddressline1}" 
						class="form-control" placeholder="Emergency address line1"/>
					</div>
					<div class="form-group">
						<label class="label1">Address Line2</label><span class="style1"></span>
						<input type="text" class="form-control" value="${p.emergencyaddressline2}"
							id="EmergencyAddressLine2" placeholder="Emergency address line2"/>
					</div>
					<div class="form-group">
						<label class="label1">City</label><span class="style1">*</span> 
						<input type="text" class="form-control" value="${p.emergencyaddresscity}"
						name="emergencyaddresscity"	placeholder="Emergency address city"/> 
					</div>
					<div class="form-group">
						<label class="label1">Pincode</label><span class="style1">*</span>
						<input type="text" class="form-control" value="${p.emergencyaddresspincode}"
							name="emergencyaddresspincode" placeholder="Emergency address  pincode"/>
					</div>
					<div class="form-group">
						<label class="label1">Country</label><span class="style1">*</span>
						<select class="form-control"
							onChange="print_state('emergencyaddressstate',this.selectedIndex);"
							name="emergencyaddresscountry">
							<!-- <option>Select Country</option> -->
						</select>
					</div>
					<div class="form-group">
						<label class="label1">State</label><span class="style1">*</span> 
						<select  class="form-control" name="emergencyaddressstate">
							<!-- <option>Select State</option> -->
						</select>
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
						<input type="text" class="form-control" name="phone" value="${p.phone}"
							placeholder="Enter your land line number"/>
					</div>
					<div class="form-group">
						<label class="label1">Mobile</label><span class="style1">*</span>
						<input  type="text" class="form-control" name="mobile" value="${p.mobile}"
							placeholder="Enter your mobile number"/>
					</div>
					<div class="form-group">
						<label class="label1">Email</label><span class="style1">*</span> 
						<input type="text" class="form-control" name="email" value="${p.email}"
							placeholder="Enter your email"/>
					</div>
					
					<hr>

				</div>
				<!--Col-5 -->
			</div>
			<!--row-->
		</div> <!-- contact panel -->
                                   
         
         <div class="tab-pane fade" id="parent">
         <br>
           			<div class="row">
					 	<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Guardian Information</label><span class="style1"></span>
                	                            <input type="text" class="form-control" name="guardianfirstname" value="${p.guardianfirstname}" 
                	                            placeholder="First name"/>    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" id="guardian_middle_name" value="${p.guardianmiddlename}" 
                	                            placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" name="guardianlastname" value="${p.guardianlastname}" 
                	                            placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" name="guardinrelation" value="${p.guardinrelation}" 
                	                            placeholder="Relation"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input type="text" class="form-control" id="guardian_occupation" value="${p.guardinoccupation}"
                                        	     placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" id="guardian_phone_residence" value="${p.guardintelres}"
                	                             placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" id="guardian_phone_" value="${p.guardinteloff}" 
                	                            placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input type="text" class="form-control" id="guardian_mobile" value="${p.guardinmobile}"
                                        	     placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" id="guardian_email" value="${p.guardinemail}" 
                	                            placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.guardinanualincome}" 
                	                            id="guardian_annual_salary" placeholder="Anual Income"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->
									
									
									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Father Information</label><span class="style1"></span>
                	                            <input type="text" class="form-control" value="${p.fatherfirstname}"  
                	                            name="fatherfirstname" placeholder="First name" />    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.fathermiddlename}"
                	                             id="father_middle_name" placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.fatherlastname}" 
                	                            name="fatherlastname" placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input type="text" class="form-control" value="${p.fatheroccupation}" 
                                        	    id="father_occupation" placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.fathertelres}" 
                	                            id="father_phone_residence" placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.fatherteloff}" 
                	                            name="father_phone_office" id="father_phone_office" placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input type="text" class="form-control" value="${p.fathermobile}" 
                                        	    id="father_mobile" placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.fatheremail}" 
                	                            name="father_email" id="father_email" placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
																				<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.fatheranualincome}" 
                	                            name="father_annual_salary" id="father_annual_salary" placeholder="Anual Income"/>    
                    		    	        </div>
										</div><!--col-lg-33-->


									</div><!--row-->


									<div class="row">
										<div class="col-lg-5">	
			                               <div class="form-group">
            	                                <label class="label1">Mother Information</label><span class="style1"></span>
                	                            <input type="text" class="form-control" value="${p.motherfirstname}"
                	                             name="motherfirstname" placeholder="First name"/>    
                    		    	        </div>
										</div><!--col-lg-5-->
										
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.mothermiddlename}"
                	                             name="mother_middle_name" id="mother_middle_name" placeholder="Middle name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.motherlastname}" 
                	                            name="motherlastname" placeholder="Last name"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row -->
											
											
									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input type="text" class="form-control" value="${p.motheroccupation}" 
                                        	    name="mother_occupation" id="mother_occupation" placeholder="Profession"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.mothertelres}" 
                	                            name="mother_phone_residence" id="mother_phone_residence" placeholder="Tel(Res)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.motherteloff}" 
                	                            name="mother_phone_office" id="mother_phone_office" placeholder="Tel(Off)"/>    
                    		    	        </div>
										</div><!--col-lg-33-->

									</div><!--row-->

									<div class="row">		
										<div class="col-lg-5">
                            	            <div class="form-group">
                                    	        <label class="label1">.</label><span class="style1"></span>
                                        	    <input type="text" class="form-control" value="${p.mothermobile}" 
                                        	    name="mother_mobile" id="mother_mobile" placeholder="Mobile"/>    
	                                        </div>
										</div><!--lg-5-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.motheremail}" 
                	                            name="mother_email" id="mother_email" placeholder="Email"/>    
                    		    	        </div>
										</div><!--col-lg-33-->
										<div class="col-lg-33">	
			                               <div class="form-group">
                	                            <input type="text" class="form-control" value="${p.motheranualincome}" 
                	                            name="mother_annual_salary" id="mother_annual_salary" placeholder="Anual Income"/>    
                    		    	        </div>
										</div><!--col-lg-33-->


									</div><!--row-->
									

						</div> <!-- parent panel -->
           
           
           
           <div class="tab-pane fade" id="education">
             <br>
            <div class="row">
				<div class="col-lg-5">
				<div class="form-group">
					<label class="label1">College/School</label><span class="style1"></span>
					<input type="text" class="form-control" value="${p.collegename}"
					 name="last_college" placeholder="College/School Last Studied"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Entering</label><span class="style1"></span>
					<input type="text" class="form-control" id="datepickere" value="${p.dateofentry}"
					 placeholder="Select Date of entry"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Leaving</label><span class="style1"></span>
					<input type="text" class="form-control" id="datepickerl" value="${p.dateofleaving}"
					placeholder="Select Date of leaving"/>
				</div>
				<div class="form-group">
					<label class="label1">Board/University</label><span class="style1"></span>
					<input type="text" class="form-control" name="" value="${p.university}"
						placeholder="Board/University Last Studied"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Entering</label><span class="style1"></span>
					<input type="text" class="form-control" id="datepickeree" value="${p.dateofentryuniversity}"
					placeholder="Select Date of entry"/>
				</div>
				<div class="form-group">
					<label class="label1">Date of Leaving</label><span class="style1"></span>
					<input type="text" class="form-control" id="datepickerll" value="${p.dateofleavinguniversity}"
					placeholder="Select Date of leaving"/>
				</div>
				<div class="form-group">
					<label class="label1">Qualifying Examination Passed</label><span
						class="style1"></span> 
						<input type="text" class="form-control" value="${p.qualifyingexamination}"
						name="" placeholder="Details of Exam"/>
				</div>
				<div class="form-group">
					<label class="label1">Attempts</label><span class="style1"></span>
					<input type="text" class="form-control" name="Attempts" value="${p.numberofattempts}"
						placeholder="Number of attempts to pass"/>
				</div>
				<div class="form-group">
					<label class="label1">Year</label><span class="style1"></span> 
					<input type="text" class="form-control" name="" value="${p.yop}"
						placeholder="Enter the year of passing"/>
				</div>
				<div class="form-group">
					<label class="label1">Registrer Number</label><span class="style1"></span>
					<input type="text" class="form-control" name="" value="${p.registernumber}"
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
   		                                        <input type="text" class="form-control" value="PHYSICS"
   		                                        name="optional_subject_physics" />   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   <div class="col-lg-11">
										   <input type="text" value="${p.optionalsubjectphysicsavgmarks}" 
										   class="form-control-marks" id="optional_subject_physics_avg_marks" placeholder="Avg Marks"/>   
									   </div>  
									 </div><!--row-->
									 
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>											 	
   		                                        <input type="text" class="form-control" 
   		                                        value="MATHEMATICS" name="optional_subject_maths" placeholder=""/>   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   <div class="col-lg-11">
										   <input type="text" value="${p.optionalsubjectmathsavgmarks}" 
										   class="form-control-marks" 
										   id="optional_subject_maths_avg_marks" placeholder="Avg Marks"/>   
									   </div>  
									 </div><!--row-->
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>
   		                                        <select class="form-control">
													<option value="None" label="--SELECT SUBJECT--"/>
													<option value="CHEMISTRY" label="CHEMISTRY"/>
													<option value="BIO-TECHNOLOGY" label="BIO-TECHNOLOGY"/>
													<option value="ELECTRONICS" label="ELECTRONICS"/>
													<option value="BIOLOGY" label="BIOLOGY"/>
												</select>
   		                                        
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									  
									   <div class="col-lg-11">
										   <input type="text" value="${p.optionalsubjectoptavgmarks}" 
										   class="form-control-marks" 
										   id="optional_subject_opt_avg_marks" placeholder="Avg Marks"/>   
									   </div>  
									 </div><!--row-->
									 
									 <div class="row">
										<div class="col-lg-5">
											 <div class="form-group">
	                                            <label class="label1">.</label><span class="style1"></span>
   		                                        <input type="text" class="form-control" value="AVG PERCENTAGE" 
   		                                        placeholder=""/>   
	    	                                </div>
        							   </div><!-- Col 5-->	
									   
									   
									   <div class="col-lg-11">
										   <input type="text" value="${p.avgpercentage}" 
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
	
	</div><!-- /.col-lg-12 -->
	</div> <!-- row -->
	
	
	
	</div> <!-- panel education -->
	
<div class="tab-pane fade in active" id="status">
<br>
<div class="row">
	
		<div class="col-lg-5">
			<div class="form-group">
				<label class="label1">Status</label><span class="style1"></span>
				<select class="form-control" name="office_status">
				<option>Select Category</option>
				<option>Pending</option>
				<option>Accept</option>
				<option>Reject</option>
				
					<option value="None" label="--Select Category--"/>
					<option value="Pending" label="PENDING"/>
					<option value="Accept" label="ACCEPT"/>
					<option value="Reject" label="REJECT"/>
				</select>
			</div>
		
			<div class="form-group">
				<label class="label1">Remarks</label><span class="style1">*</span>
				<textarea class="form-control" rows="8" cols="8" placeholder="Enter Remarks" 
				name="office_status_remarks">
				</textarea>
			</div>
		</div>
	</div><!-- row -->

<input type="submit" value="Save" class="btn btn-primary">	

</div> <!-- status tab -->
 </form>

</div> <!--tab-content-->
</div><!-- 12 -->
                                
</div><!-- roww -->

<!-- end of main page -->
	</div>	<!-- /.page wrapper -->
	





	<!-- Core Scripts - Include with every page -->
	<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>
	<script src ="<c:url value="/resources/js/jquery-ui.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>

	<script
		src="<c:url value="/resources/js/validate/jquery.validatp.js" />"></script>
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


<%-- <script src="<c:url value="/resources/js/validate/jquery.validatp.js"/>"></script>
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


