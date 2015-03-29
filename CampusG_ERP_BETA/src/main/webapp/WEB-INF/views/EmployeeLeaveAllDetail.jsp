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
     <form:form method="POST" commandName="employeeleave" id=""
						action="${pageContext.request.contextPath}/updateEmployeeLeave">
	  			
			    
			<div class="col-lg-5">
				 
				 <div class="form-group">
					  <label class="label1">Employee Leave ID</label> <span class="style1"></span>
							 <form:input type="text" path="employee_leave_id" readonly = "true" value="${l.employee_leave_id}" name="employee_leave_id"  class="form-control"  />
				 </div>
				 
				 <div class="form-group">
					  <label class="label1">Employee ID</label> <span class="style1"></span>
							 <form:input type="text" path="employeeId" readonly = "true" value="${l.employeeId}" name="employeeId"  class="form-control"  />
				 </div>
								  
				   <div class="form-group">
					  <label class="label1">Leave Name</label> <span class="style1"></span>
							 <form:input type="text" path="leaveName" readonly = "true" value="${l.leaveName}" name="leaveName"  class="form-control"  />
				 </div>		
				   <div class="form-group">
                     <label class="label1">Leave Code: </label><span class="style1"></span>
						  
                                <form:input type="text" path="leaveCode" readonly = "true" value="${l.leaveCode}" name="leaveCode" class="form-control"  />
				
                </div> 
								
				 <div class="form-group">
					  <label class="label1">Maximum Leave Count</label> <span class="style1"></span>
			<form:input type="text" path="leaveCount" readonly = "true" value="${l.leaveCount}" name="leaveCount" class="form-control"  />
				
				</div>
								
				<div class="form-group">
					 <label class="label1">Status</label> <span class="style1"></span>
						    <form:input path="status" name="status" readonly = "true" value="${l.status}" type="text" class="form-control"  />
				</div>
				
				<div class="form-group">
					 <label class="label1">start Date</label> <span class="style1"></span>
						    <form:input path="startDate" readonly = "true" name="startDate" value="${l.startDate}" type="text" class="form-control"  />
				</div>
				
				<div class="form-group">
					 <label class="label1">End Date</label> <span class="style1"></span>
						    <form:input path="endDate" readonly = "true" name="endDate"  value="${l.endDate}" type="text" class="form-control"  />
				</div>
				
				<div class="form-group">
					 <label class="label1">Days Request</label> <span class="style1"></span>
						    <form:input path="daysRequest" readonly = "true" value="${l.daysRequest}" name="daysRequest" type="text" class="form-control"  />
				</div>
				
				<div class="form-group">
					 <label class="label1">Applied Date</label> <span class="style1"></span>
						    <form:input path="appliedDate" readonly = "true" value="${l.appliedDate}" name="appliedDate" type="text" class="form-control"  />
				</div>
				
			    <div class="form-group">
		             <label class="label1">Leave Status</label><span class="style1"></span>
						    <div class="form-control-gender">&nbsp;
	                             <label class="label1">Approved</label>     
	                             <form:radiobutton path="leaveStatus" name="leaveStatus" id="approved"  value="Approved" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		      					 <label class="label1">Rejected</label>
		      					 <form:radiobutton path="leaveStatus" name="leaveStatus" id="rejected" value="Rejected" />
                            </div>
			    </div>
			    
			    <div class="form-group">
					  <form:input path="reason" id="reason" name="reason" type="text" class="form-control"  />
				</div>
			
			
              <button type="submit" class="btn btn-primary"> Submit</button>
			</div>
	</form:form>
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
	<script>
	
	$(document).ready(function () {
    $("#reason").hide();
    $("#rejected").click(function () {
        $("#reason").show();
    });
    $("#approved").click(function () {
        $("#reason").hide();
    });
});
	</script>

</body>

</html>


