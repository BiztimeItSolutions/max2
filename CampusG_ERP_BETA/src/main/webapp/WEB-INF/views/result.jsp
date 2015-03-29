<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Registration Successfully Completed </br></br>
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
				</div>

</body>
</html>