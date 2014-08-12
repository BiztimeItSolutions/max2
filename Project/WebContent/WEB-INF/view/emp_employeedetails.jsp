<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" bgcolor="black" width="600px">
<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<td>Id</td>
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
<c:forEach items="${employees}" var="employee">
<tr style="background-color:white;color: black;text-align: center;" height="30px" >
<td><c:out value="${employee.id}"/></td>
<td><c:out value="${employee.emp_ID}"/></td>
<td><c:out value="${employee.first_name}"/></td>
<td><c:out value="${employee.middle_name}"/></td>
<td><c:out value="${employee.last_name}"/></td>
<td><c:out value="${employee.gender}"/></td>
<td><c:out value="${employee.address_line1}"/></td>
<td><c:out value="${employee.address_line2}"/></td>
<td><c:out value="${employee.city}"/></td>
<td><c:out value="${employee.state}"/></td>
<td><c:out value="${employee.country}"/></td>
<td><c:out value="${employee.pincode}"/></td>
<td><c:out value="${employee.email_ID}"/></td>
<td><c:out value="${employee.phone_number}"/></td>
<td><c:out value="${employee.dob}"/></td>
<td><c:out value="${employee.blood_group}"/></td>
<td><c:out value="${employee.marital_status}"/></td>
<td><c:out value="${employee.caste}"/></td>
<td><c:out value="${employee.nationality}"/></td>
<td><c:out value="${employee.id_number}"/></td>
<td><c:out value="${employee.pan_card_number}"/></td>
<td><c:out value="${employee.photo}"/></td>
<td><c:out value="${employee.parent_emp_id}"/></td>
<td><c:out value="${employee.user_ID}"/></td>
<td><c:out value="${employee.password}"/></td>
<td align="center">
<a href="editemployee.html?id=${employee.id}">Edit</a> | 
<a href="deleteemployee.html?id=${employee.id}">Delete</a></td>
</c:forEach>
</table>
<a href="employeeinformation.html" >back to personal informations page</a><br>
</body>
</html>