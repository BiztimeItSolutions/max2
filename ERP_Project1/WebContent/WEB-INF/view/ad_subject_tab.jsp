<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form role="form" id="contactform" method="get" action="get_semester_values.html">

<%-- <c:url var="reg" value="get_semester_values.html"/>
<form:form id="editdtud" modelAttribute="subject" method="get" action="${reg}">
 --%>

<h2 style="background:#CCCCCC">Select course to see the subject details</h2>
<select name="course_name">
	<option>--Select Course Name--</option>
		<c:forEach items="${COURSE}" var="course">
			
			<option>${course.course_name}</option>

		</c:forEach>
</select><br><br>
<!-- <input type="text" name="course_name"/> -->

<input name="" type="submit"/>

</form>

</body>
</html>