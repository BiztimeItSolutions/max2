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
<c:url var="empinfo" value="updateemployee.html"/>
<form:form id="emp_employeeedit" modelAttribute="employees" commandName="employees" method="get" action="${empinfo}">

<table border="1" bgcolor="black" width="600px">
<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<!--  <td>Applicant Id</td> -->
<td>Emp Id</td>
<td>First Name</td>

<td>Lastname</td>
<td>Gender</td>
<td>address_line1</td>


</tr>

<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<td>
<form:input path="emp_ID"  value="${employees.emp_ID}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="first_name"  value="${employees.first_name}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="last_name" value="${employees.last_name}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="gender"  value="${employees.gender}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="address_line1" value="${employees.address_line1}" size="25" maxlength="50" /> 
</td>

</tr>

</table>
<input type="submit" value="Submit">
</form:form>
<br>

<br>

<br>

<br>

<a href="persoINFo.html" >back to employee details </a><br>

<br>





</table>
</body>
</html>