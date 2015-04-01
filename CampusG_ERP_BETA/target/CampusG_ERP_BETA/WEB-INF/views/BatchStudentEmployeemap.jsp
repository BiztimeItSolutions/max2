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
		  <h4>Enter Course Details</b></h4>
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
     <form:form method="POST" commandName="map" id="validate"
						action="${pageContext.request.contextPath}/saveMapDetails">
	  			
			    
			
                <div class="form-group">
                 <label class="label1">Batch Name :  </label><span class="style1">*</span>
                 
              <form:select path="batchId" class="form-control" name="batchId" id="batchId" value="batchId">
							    
							      <form:option value="" label="Select Program "/>
                            </form:select> 
               </div>
              
               
               <div class="form-group">
                 <label class="label1">Subject Name :  </label><span class="style1">*</span>
                 
              <form:select path="subjectId" class="form-control" name="subjectId" id="subjectId">
							    
							      <form:option value="" label="Select Program "/>
                            </form:select> 
               </div>
               
               <div class="form-group">
                 <label class="label1">Employee Name :  </label><span class="style1">*</span>
                 
              <form:select path="employeeId" class="form-control" name="employeeId" id="employeeId">
							    
							      <form:option value="" label="Select Program "/>
                            </form:select> 
               </div>
               
                <div>
			    <button type="submit" class="btn btn-primary"> Submit</button>
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
		src="<c:url value="/resources/js/moduleData.js" />"></script> 
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


