<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="reg" value="updateApplicant.html"/>
<form:form id="Edit" modelAttribute="applicant" commandName="applicant" method="get" action="${reg}">

<table border="1" bgcolor="black" width="600px">
<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<!--  <td>Applicant Id</td> -->
<td>Applicant Id</td>
<td>First Name</td>
<td>Last Name</td>
<td>gender</td>
<td>Department</td>

</tr>

<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<td>
<form:input path="applicant_ID"  value="${applicants.applicant_ID}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="first_Name"  value="${applicants.first_Name}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="last_Name" value="${applicants.last_Name}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="gender"  value="${applicants.gender}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="department" value="${applicants.department}" size="25" maxlength="50" /> 
</td>

</tr>

</table>
<input type="submit" value="Submit">
</form:form>
<br>

<br>

<br>

<br>

<a href="applicantList.html" >back to shortlist candidate </a><br>

<br>
</body>
</html>