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
						action="${pageContext.request.contextPath}/saveEmployeeLeave">
	  			
			    
			<div class="col-lg-5">
				 
				 <div class="form-group">
					  <label class="label1">Employee ID</label> <span class="style1"></span>
							 <form:input type="text" path="employeeId" name="employeeId"  class="form-control"  />
				 </div>
								  
				   <div class="form-group">
                     <label class="label1">Leave Type: </label><span class="style1"></span>
						    <form:select path="leaveName" class="form-control" name="leaveName" id="leaveName">
							      <form:option value="none" label="Select Leave Type"/>
                            </form:select>
                </div> 
								
				   <div class="form-group">
                     <label class="label1">Leave Code: </label><span class="style1"></span>
						  
                                <form:input type="text" path="leaveCode" readonly = "true" name="leaveCode" class="form-control"  />
				
                </div> 
								
				 <div class="form-group">
					  <label class="label1">Maximum Leave Count</label> <span class="style1"></span>
			<form:input type="text" path="leaveCount" readonly = "true" name="leaveCount" class="form-control"  />
				
				</div>
								
				
								
				<div class="form-group">
					 <label class="label1">Status</label> <span class="style1"></span>
						    <form:input path="status" name="status" readonly = "true" type="text" class="form-control"  />
				</div>
				
				<div class="form-group">
					 <label class="label1">start Date</label> <span class="style1"></span>
						    <form:input path="startDate" name="startDate" id="fromdate" type="text" class="form-control"  />
				</div>
				
				<div class="form-group">
					 <label class="label1">End Date</label> <span class="style1"></span>
						    <form:input path="endDate" name="endDate"  id="todate" type="text" class="form-control"  />
				</div>
				
				<div class="form-group">
					 <label class="label1">Days Request</label> <span class="style1"></span>
						    <form:input path="daysRequest" id="daysRequest" readonly = "true" name="daysRequest" type="text" class="form-control"  />
				</div>
				
				<div class="form-group">
					 <form:input path="appliedDate" name="appliedDate" id="appliedDate" type="hidden" class="form-control"/>
				</div>
				
				<div class="form-group">
					 <form:input path="leaveStatus" name="leaveStatus" value="Applied" type="hidden" class="form-control"/>
				</div>
			
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
<script src="<c:url value="/resources/js/employeeleave.js" />"></script> 
 
          <!-- Date Picker and calculate days between two date -->
<script>
$('#fromdate').datepicker({
    dateFormat: 'yy-mm-dd',
    changeMonth: true,
    changeYear: true,
    yearRange: '1950:2020' 
});
$('#todate').datepicker({
    dateFormat: 'yy-mm-dd',
    changeMonth: true,
    changeYear: true,
    yearRange: '1950:2020' 
});
$('#fromdate').datepicker().bind("change", function () {
    var minValue = $(this).val();
    minValue = $.datepicker.parseDate("yy-mm-dd", minValue);
    $('#todate').datepicker("option", "minDate", minValue);
    calculate();
});
$('#todate').datepicker().bind("change", function () {
    var maxValue = $(this).val();
    maxValue = $.datepicker.parseDate("yy-mm-dd", maxValue);
    $('#fromdate').datepicker("option", "maxDate", maxValue);
    calculate();
});

function calculate() {
    var d1 = $('#fromdate').datepicker('getDate');
    var d2 = $('#todate').datepicker('getDate');
    var oneDay = 24*60*60*1000;
    var diff = 0;
    if (d1 && d2) {
  
      diff = Math.round(Math.abs((d2.getTime() - d1.getTime())/(oneDay)));
    }
    $('#daysRequest').val(diff);
    
}
</script>

<!-- system date -->
<script type="text/javascript">
	 var now = new Date();
      document.getElementById("appliedDate").value=now.getFullYear()+'-'+0+(now.getMonth()+1)+'-'+0+now.getDate();
</script>


</body>

</html>


