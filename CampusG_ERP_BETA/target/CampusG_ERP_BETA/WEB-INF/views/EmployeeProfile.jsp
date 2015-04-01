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
		<div style="float:right;width:20%;height:20%" id="messageDiv">
		<c:set var="success" value="${success}"/>
	<c:if test="${success>=1}">
		
				<div class="alert alert-success" id="successDiv">
					<button class="close" aria-hidden="true" data-dismiss="alert" type="button">×</button>
     				Data saved successfully!
     			</div>
     	
	</c:if>	
	<c:if test="${success ==0}">
				<div class="alert alert-danger">
				<button class="close" aria-hidden="true" data-dismiss="alert" type="button">×</button>
                  Data not saved. Please, try again with right information.
        	    </div>
	</c:if>	 
				</div>
	 <div class="row">
			
		  <div class="col-lg-12">

			   <h4 class="page-header">
					Admission | <span class="style2"> Employee Details</span>
			   </h4>
			   
		 </div><!-- /.col-lg-12 -->
			
	 </div><!-- /.row -->
		
	 <div class="row">
			
		  <div class="col-lg-6">
				
			   <h6><a href="">Home</a> > <b>Employee </b></h6>
					
		  </div><!--col 6 -->
			
	 </div><!-- row -->
	 
	 <div class="row">
		  
		  <div class="col-lg-12">

			  
				 <div class="col-lg-12">

			   <div class="form-group">	
					
					<label>Fields Marked with <span class="style1">*</span>
						must be filled
					
					</label>
			   </div><br/>

          </div><!--col-12 -->
			
	 </div><!--col row -->
		
	 <div class="row">
                
          <div class="col-lg-12">
                
               <form:form method="POST" commandName="employee" id="empaccount"
               action="${pageContext.request.contextPath}/saveEmployee">

                 <!-- Nav tabs -->
                           
                     <ul class="nav nav-tabs">
                                
                         <li class="active"><a href="#personal" data-toggle="tab">personal</a></li>
                         <li><a href="#contact" data-toggle="tab">Contact</a></li>
                         <li><a href="#experience" data-toggle="tab">Experience</a></li>
                         <li><a href="#education" data-toggle="tab">Education</a></li>
                         <li><a href="#account" data-toggle="tab">Account</a></li>
                     
                     </ul>

                 <!-- Tab panes -->
                      
                      <div class="tab-content">
                               
                           <div class="tab-pane fade in active" id="personal">
                                 <br/>
                                <div class="row">
                                    
                                      <div class="col-lg-5">
								           
								           <div class="form-group">
									            <label class="label1">Full Name</label><span class="style1">*</span>
									            <form:input path="firstName" name="firstName" type="text" class="form-control" placeholder="First Name" />
									       </div>
							          
							          </div><!--Col-5  -->
							

							          <div class="col-lg-33">
										 
										 <div class="form-group">
                	                          <form:input path="middleName" type="text" class="form-control" placeholder="Middle Name"/>  
		    	                         </div>
									 
									 </div><!--Col-3 -->
									
							          <div class="col-lg-33">
								           
								           <div class="form-group">
									            <form:input path="lastName" name="lastName" type="text" class="form-control"
										                    placeholder="Last Name" />
								           
								           </div>
							          
							          </div><!--Col-3 -->
							
                                </div><!-- row -->
						
						        <div class="row">
							
							         <div class="col-lg-5">
								
								          <div class="form-group">
									           <label class="label1">Date of Birth</label><span class="style1">*</span>
								               <form:input path="dateOfBirth" name="dateOfBirth" type="text" class="form-control" id="datepicker" placeholder="Select Date of birth"/>
								          </div>

								          <div class="form-group">
									           <label class="label1">Gender</label><span class="style1">*</span>
									                  <div class="form-control-gender">&nbsp;
	                                                       <label1 for="male">Male</label1>     
	                                                       <form:radiobutton path="gender" name="gender" value="Male" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		      								               <label1 for="female">Female</label1> 
		      								               <form:radiobutton path="gender" name="gender" value="Female" />
                                                      </div>
								          </div>

								          <div class="form-group">
									           <label class="label1">Blood Group</label>
								                      <form:select path="bloodGroup" class="form-control">
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
									 <label class="label1">Marital Status</label>
							                <form:select path="marital" class="form-control">
												<form:option value="None" label="--Select Marital Status--"/>
												<form:option value="Married" label="Married"/>
												<form:option value="Unmarried" label="Unmarried"/>
									        </form:select>
								</div>
								
								<div class="form-group">
									 <label class="label1">Nationality </label> <span class="style1">*</span>
									        <form:input path="nationality" type="text" class="form-control"
										                name="nationality" placeholder="Enter your nationality" />
								</div>
								  
								<div class="form-group">
									  
									  <label class="label1">Caste</label><span class="style1"></span>
									         <form:input path="caste" type="text" class="form-control"
										                 name="caste" placeholder="Enter your  caste" />
								</div>
								
								<div class="form-group">
									 <label class="label1">Government ID Number</label><span class="style1">*</span>
									        <form:input path="governmentId" type="text" class="form-control"
										                name="governmentId" placeholder="Enter your  ID" />
								</div>
								
								<div class="form-group">
									 <label class="label1">Pan Card Number</label><span class="style1"></span>
									        <form:input path="pancard" type="text" class="form-control"
										                name="pancard" placeholder="Enter your  ID" />
							    </div>

								<div class="form-group">
							         <label class="label1">Upload Photo</label>
							                <div class="form-control-gender">
                                                 <form:input path="photo" type="file" name="UploadPhoto"/>
                                            </div>
                                </div>
	                            <hr>
					    </div> <!-- col-lg-5 -->
               
                  </div> <!-- row -->
              
              </div> <!-- personal tab -->

                                
                 <div class="tab-pane fade" id="contact">
                <br/>
                      <div class="row">
					       
					       <div class="col-lg-5">
						        
						        <div class="form-group">
							         <label class="label1"><b>Present Contact Address</b></label><span
								            class="style1"></span>
						        </div>
						        
						        <div class="form-group">
							         
							         <label class="label1">Address Line1</label><span class="style1">*</span>
							                <form:input path="presentAddressLine1" class="form-control" 
								                        name="presentAddressLine1" placeholder="Present address line1"/>
						        </div>
						
						        <div class="form-group">
							         <label class="label1">Address Line2</label><span class="style1"></span>
							                <form:input path="presentAddressLine2" class="form-control"
								                        name="presentAddressLine2" placeholder="Present address line2"/>
						       </div>
						
						       <div class="form-group">
							        <label class="label1">City</label><span class="style1">*</span> 
							               <form:input path="presentAddressCity" class="form-control" name="presentAddressCity" placeholder="Present address city"/>
						       </div>
						       
						       <div class="form-group">
							        <label class="label1">Pincode</label><span class="style1">*</span>
							        <form:input path="presentAddressPincode" class="form-control"
								                name="presentAddressPincode" placeholder="Present address pincode"/>
						      </div>
						      
						      <div class="form-group">
							       <label class="label1">Country</label><span class="style1">*</span>
							              <form:select path="presentAddressCountry" class="form-control"
								                       onChange="print_state('presentAddressState',this.selectedIndex);"
								                       name="presentAddressCountry">
							              </form:select>
						      </div>
						      
						      <div class="form-group">
							       <label class="label1">State</label><span class="style1">*</span>
							       <form:select path="presentAddressState" class="form-control" name="presentAddressState">
							       </form:select>
						      </div>

						      <script language="javascript">print_country("presentAddressCountry");</script>
						      <hr>
					     
					     </div><!-- Col 5-->
					     
					     <div class="col-lg-5">

						      <div class="form-group">
							       <label class="label1"><b>Permanent Contact Address</b></label><span
								          class="style1"></span>
						      </div>
						
						      <div class="form-group">
							       <label class="label1">Address Line1</label><span class="style1">*</span>
							       <form:input path="permanentAddressLine1" class="form-control"
								               name="permanentAddressLine1" placeholder="Permanent address line1"/>
						      </div>
						
						      <div class="form-group">
							       <label class="label1">Address Line2</label><span class="style1"></span>
							       <form:input path="permanentAddressLine2" class="form-control"
								               id="permanentAddressLine2" placeholder="Permanent address line2"/>
						      </div>
						
						      <div class="form-group">
							       <label class="label1">City</label><span class="style1">*</span> 
							              <form:input path="permanentAddressCity" class="form-control" name="permanentAddressCity"
								               placeholder="Permanent address city"/>
						      </div>
						      
						      <div class="form-group">
							       <label class="label1">Pincode</label><span class="style1">*</span>
							              <form:input path="permanentAddressPincode" class="form-control"
								               name="permanentAddressPincode" placeholder="Permanent address pincode"/>
						      </div>
						
						      <div class="form-group">
							       <label class="label1">Country</label><span class="style1">*</span>
							              <form:select path="permanentAddressCountry" class="form-control"
								                onChange="print_state('permanentAddressState',this.selectedIndex);"
								                name="permanentAddressCountry">
							              </form:select>
						      </div>
						      
						      <div class="form-group">
							       <label class="label1">State</label><span class="style1">*</span>
							              <form:select path="permanentAddressState" class="form-control" name="permanentAddressState">
								   </form:select>
						      </div>

						      <script language="javascript">print_country("permanentAddressCountry");</script>
						      <hr>
					     
					    </div><!--col 5 -->
					
			      </div><!--row-->
			
                  <div class="row">
				       
				       <div class="col-lg-5">
					        
					        <div class="form-group">
						         <label class="label1"><b>Office Contact Address</b></label><span class="style1"></span>
					        </div>
					        
					        <div class="form-group">
						         <label class="label1">Office Phone1</label><span class="style1">*</span>
						                <form:input path="officePhone1" name="officePhone1" class="form-control"
							                        placeholder="Office Phone1"/>
					        </div>
					        
					        <div class="form-group">
						         <label class="label1">Office Phone2</label><span class="style1"></span>
						                <form:input path="officePhone2" name="officePhone2" class="form-control"
							                        placeholder="Office Phone2"/>
					        </div>
					        
					        <div class="form-group">
						         <label class="label1">Address Line1</label><span class="style1">*</span>
						         <form:input path="officeAddressLine1" name="officeAddressLine1" class="form-control"
							                 placeholder="office address line1"/>
					        </div>
					        
					        <div class="form-group">
						         <label class="label1">Address Line2</label><span class="style1"></span>
						                <form:input path="officeAddressLine2" class="form-control"
							                        id="officeAddressLine2" placeholder="Office address line2"/>
					        </div>
					
					        <div class="form-group">
						         <label class="label1">City</label><span class="style1">*</span> 
						                <form:input path="officeAddressCity" class="form-control" name="officeAddressCity"
							                        placeholder="Office address city"/>
					        </div>
					        
					        <div class="form-group">
						         <label class="label1">Pincode</label><span class="style1">*</span>
						                <form:input path="officeAddressPincode" class="form-control"
							                        name="officeAddressPincode" placeholder="Office address  pincode"/>
					        </div>
					        
					        <div class="form-group">
						         <label class="label1">Country</label><span class="style1">*</span>
						                <form:select path="officeAddressCountry" class="form-control"
							                  onChange="print_state('officeAddressState',this.selectedIndex);"
							                  name="officeAddressCountry">
						                </form:select>
					       </div>
					       
					       <div class="form-group">
						        <label class="label1">State</label><span class="style1">*</span> 
						               <form:select path="officeAddressState" class="form-control" name="officeAddressState">
						               </form:select>
					       </div>

					       <script language="javascript">print_country("officeAddressCountry");</script>
					       <hr>
				     </div><!--col 5-->
				     
				     <div class="col-lg-5">

					      <div class="form-group">
						       <label class="label1"><b>Comman Details</b></label><span class="style1"></span>
					      </div>

					      <div class="form-group">
						       <label class="label1">Land Phone</label><span class="style1"></span>
						              <form:input path="phone" type="text" class="form-control" name="phone"
							                      placeholder="Enter your land line number"/>
					      </div>
					      
						  <div class="form-group">
						       <label class="label1">Mobile </label><span class="style1"></span>
						              <form:input path="mobile" type="text" class="form-control" name="mobile"
							                      placeholder="Enter your Mobile number"/>
					      </div>
					
						  <div class="form-group">
						       <label class="label1">Email </label><span class="style1"></span>
						       <form:input path="email" type="text" class="form-control" name="email"
							               placeholder="Enter your valid mail id "/>
					      </div>
					      <hr>

				    </div><!--Col-5 -->
				
			  </div><!--row-->
			
		</div><!-- contact panel -->
                                   
        <div class="tab-pane fade" id="experience">
     	     <br/>
     	     <div class="row">		
				  
				  <div class="col-lg-5">	
			            
			            <div class="form-group">
            	             <label>Work Experience</label><span class="style1"></span>
                        </div><br/>
							                
			            <div class="form-group">
            	             <label class="label1">Previous Employee ID</label><span class="style1">*</span>
                	                <form:input path="previousEmployeeId" class="form-control" name="previousEmployeeId" placeholder="Employee ID"/>    
                        </div>
								
					    <div class="form-group">
            	             <label class="label1">Organization Name</label><span class="style1">*</span>
                	                <form:input path="organizationName" class="form-control" name="organizationName" placeholder="Organization Name"/>    
                        </div>
								
                        <div class="form-group">
            	             <label class="label1">Designation</label><span class="style1">*</span>
                	                <form:input path="previousDesignation" class="form-control" name="previousDesignation" placeholder="Designation"/>    
                        </div>
                    		    	       
                        <div class="form-group">
						     <label class="label1">Start Date</label><span class="style1">*</span>
								    <form:input path="startDate" name="startDate" type="text" class="form-control" id="datepickere" placeholder="Select Start Date"/>
					    </div>
									     
						<div class="form-group">
							 <label class="label1">End Date</label><span class="style1">*</span>
								    <form:input path="endDate" name="endDate" type="text" class="form-control" id="datepickerl" placeholder="Select End Date"/>
						</div>
						
						<div class="form-group">
            	             <label class="label1">University Name</label><span class="style1">*</span>
                	                <form:input path="university" class="form-control" name="university" placeholder="University Name"/>    
                        </div>
                    	
                    	<div class="form-group">
            	             <label class="label1">Years Of Experience</label><span class="style1">*</span>
                	                <form:input path="yearsOfExperience" class="form-control" name="yearsOfExperience" placeholder="Years Of Experience"/>    
                    	</div>
                    		    	        
                        <div class="form-group">
            	             <label >Employee Designation</label><span class="style1"></span>
                	    </div><br/>
                	                        
                	     <div class="form-group">
            	              <label class="label1">Designation</label><span class="style1">*</span>
                	                 <form:input path="designation" class="form-control" name="designation" placeholder="Designation"/>    
                    	 </div>
                         
                         <div class="form-group">
            	              <label class="label1">Department</label><span class="style1">*</span>
                	                 <form:input path="department" class="form-control" name="department" placeholder="Department"/>    
                         </div>
                         
                         <div class="form-group">
							  <label class="label1">Effective Date</label><span class="style1"></span>
								     <form:input path="effectiveDate" name="effectiveDate" type="text" class="form-control" id="datepickeree" placeholder="Select Effective Date"/>
						 </div>
						 
						 <div class="form-group">
							  <label class="label1">Date Of Join</label><span class="style1">*</span>
								     <form:input path="dateOfJoin" name="dateOfJoin" type="text" class="form-control" id="datepickerll" placeholder="Select Date Of Join"/>
						 </div>
                 
                 </div><!-- col-lg-5 -->
		  
		  </div><!--row-->
		 

   </div> <!-- experience panel -->
           
   <div class="tab-pane fade" id="education">
         <br/>
        <div class="row">
			 
			 <div class="col-lg-5">
				  
				  <div class="form-group">
					   <label class="label1">College/School</label><span class="style1"></span>
					          <form:input path="collegeName" type="text" class="form-control" name="collegeName"
						                  placeholder="College/School Last Studied"/>
				 </div>
			     
			     <div class="form-group">
					  <label class="label1">Degree Name</label><span class="style1"></span>
					  <form:input path="degreeName" type="text" class="form-control" name="degree"
						    placeholder="Degree Name"/>
				 </div>
				
				 <div class="form-group">
					  <label class="label1">Board/University</label><span class="style1"></span>
					         <form:input path="universityPassed" type="text" class="form-control" name=""
						                 placeholder="Board/University Last Studied"/>
				</div>
				
				<div class="form-group">
					 <label class="label1">Education Type</label><span class="style1"></span>
					        <form:input path="educationType" type="text" class="form-control"
					                    placeholder="Education Type"/>
				</div>
				
				<div class="form-group">
					 <label class="label1">Year Of Passing</label><span class="style1"></span>
					 <form:input path="yearOfPassing" type="text" class="form-control" 
					             placeholder="Year Of Passing"/>
			   </div>
				
			   <div class="form-group">
					<label class="label1">Percentage</label><span class="style1"></span> 
						   <form:input path="percentage" type="text" class="form-control"
						         name="percentage" placeholder="Percentage"/>
			   </div>
				
            </div><!-- Col 5-->
   
       </div><!--row-->
	   <hr>
	   	
	

  </div> <!-- panel education -->

	   <div class="tab-pane fade" id="account">
          <br/>
            <div class="row">
			     
			     <div class="col-lg-5">
				       <div class="form-group">
					       <label class="label">Salary Details</label>
					  </div>
					  <br/>
					  <div class="form-group">
					       <label class="label1">CTC</label><span class="style1">*</span>
					              <form:input path="ctc" type="text" class="form-control" name="ctc"
						                      placeholder="ctc"/>
				      </div>
				    <br/>
					   <div class="form-group">
					       <label class="label">Bank Details</label>
					  </div>
					  
					     <br/>
				      <div class="form-group">
					       <label class="label1">Account Number</label><span class="style1">*</span>
					              <form:input path="accountNumber" type="text" class="form-control" name="accountNumber"
						                      placeholder="Account Number"/>
				      </div>
				      
				      <div class="form-group">
					       <label class="label1">Account Type</label><span class="style1"></span>
					              <form:input path="accountType" type="text" class="form-control" name="accountType"
						placeholder="Account Type"/>
				      </div>
				      
					  <div class="form-group">
					       <label class="label1">Bank Name</label><span class="style1">*</span>
					       <form:input path="bankName" type="text" class="form-control" name="bankName"
						               placeholder="Bank Name"/>
				     </div>
				
				     <div class="form-group">
					      <label class="label1">Branch Name</label><span class="style1">*</span>
					      <form:input path="branchName" type="text" class="form-control" name="branchName"
					                   placeholder="Branch Name"/>
				     </div>
				
				     <div class="form-group">
					      <label class="label1">IFSC Code</label><span class="style1">*</span>
					      <form:input path="ifscCode" type="text" class="form-control" name="ifscCode"
					                  placeholder="IFSC Code"/>
				     </div>

			</div>
			<!-- Col 5-->
	</div>
	<!--row-->

    <hr>
	
	
	<input type="submit" value="Save" class="btn btn-primary">
  </div> <!-- panel education -->
</div><!--tab-content-->

</form:form>
	</div>	<!-- /.col-lg-12 -->
	</div>	<!-- /.row -->

<!-- end of main page -->

	</div>  <!-- page wrapper1 -->

	<!-- Core Scripts - Include with every page -->
	<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>
	<script src ="<c:url value="/resources/js/jquery-ui.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>

	<script
		src="<c:url value="/resources/js/validate/jquery.validate.js" />"></script>
	<script
		src="<c:url value="/resources/js/validate/employeeaccount.js" />"></script>
		
		<script
		src="<c:url value="/resources/js/validate/employeeexperience.js" />"></script>
		
		<script
		src="<c:url value="/resources/js/validate/employeecontact.js" />"></script>
		<script
		src="<c:url value="/resources/js/validate/employeegeneral.js" />"></script>

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
<script>


$(function() {
		alert("in tabs ready");
				var $tabs = $('#tabs').tabs();
		
				$(".tab-pane").each(function(i){
					alert("in each");
				
				  var totalSize = $(".tab-pane").size() - 1;
				  if (i != totalSize) {
				      next = i + 1;	  
			   		  $(this).append("<a href='#' class='btn btn-primary mover next-tab' rel='" + next + "'>Next Page &#187;</a>");
				  }
				  if (i != 0) { 
				      prev = i-1;
			   		  $(this).append("<a href='#' class='btn btn-primary mover prev-tab' rel='" + prev + "'>&#171; Prev Page</a>");
				  }
				
				});
				$('.next-tab, .prev-tab').click(function() { 
				
				 $tabs.tabs( "option", "active", $(this).attr("rel") );
			         
			    });
			    </script>

	
</body>

</html>


