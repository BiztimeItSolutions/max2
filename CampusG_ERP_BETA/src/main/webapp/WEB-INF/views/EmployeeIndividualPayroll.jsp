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

    
<!--Start of Main page-->


 <!-- Header--><%@ include file="Header.jsp" %>
 <!-- Left Menu --><%@ include file="LeftMenu.jsp" %> 

<div id="page-wrapper">

		<div class="row">
			<div class="col-lg-12">

				<h4 class="page-header">
					Employee Leave Management | <span class="style2"> Leave</span>
				</h4>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		
<div class="row">
	 <div class="col-lg-6">
		  <h6>Home > Employee Leave Management > <b>Apply Leave</b></h6>
	</div><!--col 6 -->
</div><!--row -->
	  <br />
<div class="row">
	 <div class="col-lg-12">
          <div class="form-group">
			   <label>Fields Marked with <span class="style1">*</span>must be filled
			   </label>
		  </div>
     </div>
</div>
<br/>
<div class="row">
     <form:form method="POST" commandName="employeeCommand" id=""
						action="${pageContext.request.contextPath}/saveEmployeeIndividualPayroll">
	  			
			    
			<div class="col-lg-5">
			
				    <div class="form-group">
                     <label class="label1">Department: </label><span class="style1"></span>
						    <form:select path="departmentmodel.departmentName" class="form-control" name="departmentName" id="departmentName">
							      <form:option value="none" label="Select Department"/>
                            </form:select>
                    </div>
				 
				   <div class="form-group">
                     <label class="label1">Employee ID: </label><span class="style1"></span>
						    <form:select path="employee.employeeId" class="form-control" name="employeeId" id="employeeId">
							      <form:option value="none" label="Select Employee ID"/>
                            </form:select>
                  </div>
                  
                   <div class="form-group">
                     <label class="label1">Employee Name: </label><span class="style1"></span>
						  
                                <form:input type="text" path="employee.firstName" readonly = "true" name="firstName" class="form-control"  />
				
                   </div> 
                   
                     <div class="form-group">
                     <label class="label1">Designation: </label><span class="style1"></span>
						  
                                <form:input type="text" path="employee.designation" readonly = "true" name="designation" class="form-control"  />
				
                   </div>
								  
				   <div class="form-group">
                     <label class="label1">Month: </label><span class="style1"></span>
						    <form:select path="collegeCalendar.month" class="form-control" name="month" id="month">
							      <form:option value="none" label="Select Leave Type"/>
                            </form:select>
                </div> 
								
				  
								
				 <div class="form-group">
					  <label class="label1">Total Days</label> <span class="style1"></span>
			<form:input type="text" path="collegeCalendar.totalDays" readonly = "true" name="totalDays" class="form-control"  />
				
				</div>
								
				
								
				<div class="form-group">
					 <label class="label1">Holidays</label> <span class="style1"></span>
						    <form:input path="collegeCalendar.holidays" name="holidays" readonly = "true" type="text" class="form-control"  />
				</div>
				
					<div class="form-group">
					 <label class="label1">Working Days</label> <span class="style1"></span>
						    <form:input path="collegeCalendar.workingDays" name="workingDays" readonly = "true" type="text" class="form-control"  />
				   </div>
				   
				   	<div class="form-group">
					 <label class="label1">Employee Working Days</label> <span class="style1"></span>
						    <form:input path="employeeAttendance.totalWorkingDays" name="totalWorkingDays" readonly = "true" type="text" class="form-control"  />
				   </div>
				   
				   <div class="form-group">
					 <label class="label1">Employee Absent Days</label> <span class="style1"></span>
						    <form:input path="employeeLeave.daysRequest" name="daysRequest"  readonly = "true" type="text" class="form-control"  />
				   </div>
				   
				   <div class="form-group">
					 <label class="label1">Employee payable Days</label> <span class="style1"></span>
						    <form:input path="" name="payableDays"  readonly = "true" type="text" class="form-control"  />
				   </div>
				
				
				
				
				<%-- <div class="form-group">
					 <form:input path="appliedDate" name="appliedDate" id="appliedDate" type="hidden" class="form-control"/>
				</div> --%>
				
				
			
              <button type="submit" class="btn btn-primary"> Submit</button>
			</div>
	</form:form>
	<div style="float:right;width:20%;height:20%" id="messageDiv">
		<c:set var="success" value="${success}"/>
	<c:if test="${success >= 1}">
		
				<div class="alert alert-success" id="successDiv">
					<button class="close" aria-hidden="true" data-dismiss="alert" type="button">×</button>
     				Data saved successfully!
     			</div>
     	
	</c:if>	
	<c:if test="${success==0}">
				<div class="alert alert-danger">
				<button class="close" aria-hidden="true" data-dismiss="alert" type="button">×</button>
                  Data not saved. Please, try again with right information.
        	    </div>
	</c:if>	
		
</div><!-- row -->

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
	
	      <!-- Dropdown values  -->
<script src="<c:url value="/resources/js/employeeindividualpayroll.js" />"></script> 
 






</body>

</html>


