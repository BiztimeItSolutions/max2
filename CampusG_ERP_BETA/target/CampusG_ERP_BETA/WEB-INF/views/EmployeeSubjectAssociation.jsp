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
					Employee's subject | <span class="style2"> Associate</span>
				</h4>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		
		<div class="row">
			<div class="col-lg-6">
				<h6>
			        Home > Employee Management > <b>Employee Subject Association</b>
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
</div></div>
<br/>
<div class="row">
<form:form method="POST" commandName="emp" id="saveEmployeeSubject"
						action="${pageContext.request.contextPath}/saveEmployeeSubjectAssociation">
						
					<div class="col-lg-5">
					
                         <div class="form-group">
                              <label class="label1">Batch: </label><span class="style1"></span>
						             <form:select path="batchName" class="form-control" name="" id="batchName">
							              <form:option value="none" label="Select Batch"/>
                                     </form:select>
                        </div>
                         
                         <div class="form-group">
                              <label class="label1">Semester: </label><span class="style1"></span>
						             <form:select path="semesterName" class="form-control" name="" id="semesterName">
							              <form:option value="none" label="Select Semester"/>
                                     </form:select>
                        </div>
                        
                        <div class="form-group">
                              <label class="label1">Subject: </label><span class="style1"></span>
						             <form:select path="subjectName" class="form-control" name="" id="subjectName">
							              <form:option value="none" label="Select Subject"/>
                                     </form:select>
                        </div> 
                        
                         <div class="form-group">
                              <label class="label1">Department: </label><span class="style1"></span>
						             <form:select path="departmentName" class="form-control" name="" id="departmentName">
							              <form:option value="none" label="Select Department"/>
                                     </form:select>
                        </div>
                       
              
                 <div id="mydiv" class="table-responsive">
					 <table class="table table-striped table-bordered table-hover"
								id="dataTables-example">
								<thead>
									<tr>
										<th>Employee Id</th>
										<th>Employee Name</th>
										<th>Assign</th>
									</tr>
								</thead>
								<tbody>
									<tr class="odd gradeX">
										<td></td>
										
									</tr>
									<tr class="even gradeX">
										<td></td>
									</tr>
									
									
										
									

								</tbody>
							</table>
			    </div> 
								<br/>
					
             
					</div>
					
                     <form:input path="employeeId" type="hidden" id="employeeId"/> 
                        
					</form:form>
				</div>

</div>
<!--End of Main page-->


<!-- Core Scripts - Include with every page -->
	<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>
	<script src ="<c:url value="/resources/js/jquery-ui.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>
	
	
	<script src="<c:url value="/resources/js/employeeSubjectAssociation.js" />"></script>
	
 

</body>

</html>


