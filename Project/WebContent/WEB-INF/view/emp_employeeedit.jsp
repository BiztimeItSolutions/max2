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
<td>id</td>
<td>Emp Id</td>
<td>First Name</td>
<td>Middle Name</td>
<td>Lastname</td>
<td>Gender</td>
<td>address_line1</td>
<td>address_line2</td>
<td>city</td>
<td>state</td>
<td>country</td>
<td>pincode</td>
<td>email_ID</td>
<td>phone_number</td>
<td>dob</td>
<td>blood_group</td>
<td>marital_status</td>
<td>caste</td>
<td>nationality</td>
<td>id_number</td>
<td>pan_card_number</td>
<td>photo</td>
<td>parent_emp_id</td>
<td>user_ID</td>
<td>password</td>

</tr>

<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<td>
<form:input path="id"  value="${employees.id}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="emp_ID"  value="${employees.emp_ID}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="first_name"  value="${employees.first_name}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="middle_name" value="${employees.middle_name}" size="25" maxlength="50" /> 
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
<td>
<form:input path="address_line2"  value="${employees.address_line2}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="city" value="${employees.city}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="state" value="${employees.state}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="country"  value="${employees.country}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="pincode" value="${employees.pincode}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="email_ID"  value="${employees.email_ID}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="phone_number" value="${employees.phone_number}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="dob" value="${employees.dob}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="blood_group"  value="${employees.blood_group}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="marital_status" value="${employees.marital_status}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="caste"  value="${employees.caste}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="nationality" value="${employees.nationality}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="id_number" value="${employees.id_number}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="pan_card_number"  value="${employees.pan_card_number}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="photo" value="${employees.photo}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="parent_emp_id" value="${employees.parent_emp_id}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="user_ID"  value="${employees.user_ID}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="password" value="${employees.password}" size="25" maxlength="50" /> 
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