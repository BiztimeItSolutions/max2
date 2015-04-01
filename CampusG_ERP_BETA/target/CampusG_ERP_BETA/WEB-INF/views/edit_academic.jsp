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
	
	<link href="<c:url value="/resources/css/sb-admin.cs"/>"
	rel="stylesheet">
	

<script src="<c:url value="/resources/js/validate/countries.js" />"></script>
<link href="<c:url value="/resources/css/jquery-ui.css"/>" rel="stylesheet">
</head>


<body>

  

      <!-- Header--><%@ include file="Header.jsp" %>
 <!-- Left Menu --><%@ include file="LeftMenu.jsp" %> 

<div id="page-wrapper">

		<div class="row">
			<div class="col-lg-12">

				
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		
<div class="row">
	 <div class="col-lg-6">
		  <h4>Edit  Details</b></h6>
	</div><!--col 6 -->
</div><!--row -->
	  <br />
<div class="row">
	 <div class="col-lg-12">
          <div class="form-group">
			   
		  </div>
     </div>
</div>
<br/>
<div class="row">
      <form:form method="POST" commandName="academic" id="validate"
						action="${pageContext.request.contextPath}/Update_Academic_view">

                        <div class="col-lg-5">
                             	
                             	
								<div class="form-group">
									<label class="label1">Year ID</label>
									<form:input path="academicyearId" name="academicyearId" value="${p.academicyearId}" type="text" class="form-control"  />
									  
								</div>
							
                             	
                             	
                             	
								<div class="form-group">
									<label class="label1">Blood Group</label>
									<form:input path="academicYear" name="academicYear" value="${p.academicYear}" type="text" class="form-control"  />
									  
								</div>
						
							
								<div hidden class="form-group">
									<label class="label1">Modified on</label>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									<form:input path="modifiedOn" value="${p.modifiedOn}" name="modifiedOn" type="hidden" class="form-control" id="fname" />
								</div>
						
					
						
								<div hidden class="form-group">
									<label class="label1">Created  on</label>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									<form:input path="createdOn" value="${p.createdOn}" name="createdOn" type="hidden" class="form-control"/>
								</div>
						
								<div hidden class="form-group">
									<label class="label1">Deleted</label>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									<form:input path="deleted" value="${p.deleted}" name="deleted" type="hidden" class="form-control" />
								</div>
							
								<div hidden class="form-group">
									<label class="label1">Created By</label>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									<form:input path="createdBy" value="${p.createdBy}" name="createdBy" type="hidden" class="form-control" />
								</div>
							
								<div hidden class="form-group">
									<label class="label1">Version</label>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									<form:input path="version" value="${p.version}" name="version" type="hidden" class="form-control" />
								</div>
						
							
						
								<div hidden class="form-group">
									<label class="label1">Modified By</label>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									<form:input path="modifiedBy" value="${p.modifiedBy}" name="modifiedBy" type="hidden" class="form-control" />
						</div>

<input type="submit" value="Save" class="btn btn-primary">	
     
			</div>
	</form:form>
</div><!-- row -->

</div>
<!--End of Main page-->

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
		src="<c:url value="/resources/js/validate/mastervalidate.js" />"></script>
	
	<script type="text/javascript">
	 var now = new Date();
      document.getElementById("fname").value=now.getFullYear()+'-'+0+(now.getMonth()+1)+'-'+0+now.getDate();
      </script>
	    
</body>

</html>


