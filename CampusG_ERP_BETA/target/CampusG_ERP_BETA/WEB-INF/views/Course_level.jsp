<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>

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

</head>


<body>
<!--Start of Main page-->
<div id="page-wrapper1">
	
		<div class="row">             
              <div class="col-lg-12">
                   
                     <h4 class="page-header">Course Level</h4>
              </div>
                <!-- /.col-lg-12 -->
         </div>
         <!-- /.row -->
		 <br />
		  <form:form method="POST" commandName="Course_l" id=""
						action="${pageContext.request.contextPath}/save_candidate_basic">
		 
<%-- 		 <form method="post" action="student2"> --%>
		 
		 <div class="row">
                <div class="col-lg-5">
                
                <%--  <div class="form-group">
                    <label class="label1">ID: </label><span class="style1"></span>
						<form:input  path="Student_Basic_id" class="form-control" id="Student_Basic_id"/>
                  </div> --%>
                  
				  <div class="form-group">
                    <label class="label1">Course Level: </label><span class="style1"></span>
						<form:select class="form-control" path="course_level" id="course_level">
							<form:option value="none" label="Select Course Level"/>
						</form:select>
                  </div>
				  
				  <div class="form-group">
                    <label class="label1">Program: </label><span class="style1"></span>
						<form:select path="program" class="form-control" name="program" id="program">
							<form:option value="none" label="Select Program"/>
                        </form:select>
                  </div>
				  <div class="form-group">
                    <label class="label1">Department: </label><span class="style1"></span>
						<form:select path="department" class="form-control" name="department" id="department">
							<form:option value="none" label="Select Department"/>
                        </form:select>
                  </div>

				  <div class="form-group">
                    <label class="label1">Course Name: </label><span class="style1"></span>
						<form:select path="course_name" class="form-control" name="course_name" id="course_name">
							<form:option value="none" label="Select Course"/>                       
					   </form:select>
						
                  </div>
                  
                  
                 
				  <div class="form-group">
                    <label class="label1">Quota: </label><span class="style1"></span>
						<form:select class="form-control" path="quota" id="quota">
							<form:option value="none" label="Select Quota"/>
						</form:select>
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
					
				   
                	     <br>

					<button type="submit" class="btn btn-primary">Apply Online</button>
				</div>
                <!-- /.col-lg-5 -->
         </div>
         <!-- /.row -->
         </form:form>

			
	
	
	
	
	</form>
</div>
<!--End of Main page-->

   <!-- Core Scripts - Include with every page -->
	<%-- <script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script> --%>
	<script src="<c:url value="/resources/js/jquery-1.10.2.js" />"></script>
	
	
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>
	
	<script src="<c:url value="/resources/js/course_level.js" />">jquery-1.10.2.js</script>
	<script src="<c:url value="/resources/js/quota.js" />"></script>
	

</body>

</html>
