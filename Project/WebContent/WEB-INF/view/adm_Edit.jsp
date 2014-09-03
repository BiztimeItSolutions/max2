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
<td>Applicant Id</td>
<td>First Name</td>
<td>Last Name</td>
 <th>Tenth Percentage</th>
<th>Tenth YOP</th>
<th>Tenth School</th>
<th>Twelth Percentage</th>
<th>Twelth YOP</th>
<th>Twelth School</th>
<th>Gender</th>
<th>Area Of Interest</th>
<th>Address</th>
<th>City</th>
<th>state</th>
<th>country</th>
<th>pincode</th>
<th>Mobile_No</th>
<th>Email_ID</th>
 <th>mail(pick any value "sent/failed")</th>
	                          
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
<form:input path="tenth_Percentage" value="${applicants.tenth_Percentage}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="tenth_YOP" value="${applicants.tenth_YOP}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="tenth_School" value="${applicants.tenth_School}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="twelth_Percentage" value="${applicants.twelth_Percentage}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="twelth_YOP" value="${applicants.twelth_YOP}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="twelth_School" value="${applicants.twelth_School}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="gender"  value="${applicants.gender}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="department" value="${applicants.department}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="address" value="${applicants.address}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="city" value="${applicants.city}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="state" value="${applicants.state}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="country" value="${applicants.country}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="pincode" value="${applicants.pincode}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="mobile_No" value="${applicants.mobile_No}" size="25" maxlength="50" /> 
</td>
<td>
<form:input path="email_ID" value="${applicants.email_ID}" size="25" maxlength="50" /> 
</td>

<td>
<form:input path="mail" placeholder="sent" value="${applicants.mail}" size="25" maxlength="50" /> 
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