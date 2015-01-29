<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>

</head>

<body>


<%-- <form:form method="POST" commandName="student" action="${pageContext.request.contextPath}/student"> --%>
<form:form method="POST" commandName="student" action="student">


<table>
<tr>
<td>FirstName : </td>
<td><form:input path="fname" /></td>
</tr>
<tr>
<td>LastName : </td>
<td><form:input path="lname" /></td>
</tr>
<tr>
<tr>
<td>DateOfBirth : </td>
<td><form:input path="dateofbirth" /></td>
</tr>
<tr>
<td>Gender : </td>
<td><form:input path="gender" /></td>
</tr>
<tr>
<tr>
<td>Blood Group : </td>
<td><form:input path="bloodgroup" /></td>
</tr>
<tr>
<td>Birth Place : </td>
<td><form:input path="birthplace" /></td>
</tr>
<tr>
<tr> 

<td>Nationality * : </td>
<td><form:input path="nationality" /></td>
</tr>
<tr>
<td>Mother Tounge : </td>
<td><form:input path="mothertongue" /></td>
</tr>
<tr>
<tr>
<td>Category : </td>
<td><form:input path="category" /></td>
</tr>
<tr>
<td>Religion : </td>
<td><form:input path="religion" /></td>
</tr>
<tr>
<td>Caste : </td>
<td><form:input path="caste" /></td>
</tr>
<tr>
<td>Extra Curricular : </td>
<td><form:input path="extracurricular" /></td>
</tr>
<tr>

<tr>
<td colspan="3"><input type="submit" /></td>
</tr>
</tr>
</table>

</form:form>

</body>
</html>