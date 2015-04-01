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

		<div style="float:right;width:20%;height:20%" id="messageDiv">
		<c:set var="success" value="${success}"/>
	<c:if test="${success >= 1}">

				<div class="alert alert-success" id="successDiv">
					<button class="close" aria-hidden="true" data-dismiss="alert" type="button"></button>
     				Data saved successfully!
     			</div>
     
	</c:if>
	<c:if test="${success==0}">
				<div class="alert alert-danger">
				<button class="close" aria-hidden="true" data-dismiss="alert" type="button"></button>
                  Data not saved as it already exists. Please, try again with right information.
        	    </div>
	</c:if>
</div>		
		
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
     <form:form method="POST" commandName="course" id="validate"
						action="${pageContext.request.contextPath}/saveCourseDetails">
	   <div class="row">			
			    
			<div class="col-lg-5">
				
                <div class="form-group">
                     <label class="label1">Course Name: </label><span class="style1">*</span>
                            <form:input type="text" path="courseName"  class="form-control" name="courseName"   /> 
                </div> 
                
                <div class="form-group">
                
                 <label class="label1">Program Name:  </label><span class="style1">*</span>
                 
              <form:select path="programNamefk" class="form-control" name="programNamefk" id="programNamefk">
							    
							      <form:option value="" label="Select Program "/>
                            </form:select> 
               </div>
                     
				 <div class="form-group">
                
                 <label class="label1">Course Code:  </label><span class="style1">*</span>
                 
                            <form:input type="text" path="code"  class="form-control" name="code"   /> 
                </div> 
                
                
                
                <div class="form-group">
                
                 <label class="label1"> Grading system:  </label><span class="style1">*</span>
                 
              <form:select path="grading" class="form-control" name="grading" id="">
							    
							       <form:option value="" label="Select Program "/>
							      <form:option value="GPA" label=" GPA"/>
							      <form:option value="CWA" label="CWA "/>
							      <form:option value="CCE" label="CCE"/>
							      
                            </form:select>  
               </div>
                 
               <div class="form-group">
                
                 <label class="label1"> Elective:  </label><span class="style1">*</span>
                 
              <form:select path="elective" class="form-control" name="elective" id="">
							    
							     <form:option value="" label="Select Program "/>
							      <form:option value="YES" label=" YES"/>
							      <form:option value="NO" label="NO "/>
							     
							      
                            </form:select>  
               </div>
                 
                     
                     	
					 
					 <div class="form-group">
                     <label hidden class="label1">Deleted: </label><span class="style1"></span>
                            <form:input type="hidden" path="deleted"  class="form-control" name="deleted" value="0"  /> 
                </div> 
                
           
					 <div class="form-group">
                     <label hidden class="label1">Version: </label><span class="style1"></span>
                            <form:input type="hidden" path="version"  class="form-control" name="version" value="0"  /> 
                </div> 
                
             
					 <div class="form-group">
                     <label hidden class="label1">Created By: </label><span class="style1"></span>
                            <form:input type="hidden" path="createdBy"  class="form-control" name="createdBy" value="1"  /> 
                </div> 
                
					 <div class="form-group">
                     <label hidden class="label1">Created On: </label><span class="style1"></span>
                            <form:input type="hidden" path="createdOn"  class="form-control" name="createdOn"  id="fname"  /> 
                </div> 
                
                
					 <div class="form-group">
                     <label hidden class="label1">Modified By: </label><span class="style1"></span>
                            <form:input type="hidden" path="modifiedBy"  class="form-control" name="modifiedBy" value="1"   /> 
                </div>
                
                
					 <div class="form-group">
                     <label hidden class="label1">Modified On: </label><span class="style1"></span>
                            <form:input type="hidden" path="modifiedOn"  class="form-control" name="modifiedOn" value="0"   /> 
                </div> 
                <div>
			    <button type="submit" class="btn btn-primary"> Submit</button>
			</div></div>
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


