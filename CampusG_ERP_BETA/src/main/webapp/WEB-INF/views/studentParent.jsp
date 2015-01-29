<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>

</head>

<body>

<form:form method="POST" commandName="studentParent" action="${pageContext.request.contextPath}/studentParent">


<table>
<tr>
<td>ParentName : </td>
<td><form:input path="parentname" /></td>
</tr>
<tr>
<td>FatherName : </td>
<td><form:input path="fathername" /></td>
</tr>
<tr>
<tr>
<td>MotherName : </td>
<td><form:input path="mothername" /></td>
</tr>
<tr>
<td>ParentOccupation : </td>
<td><form:input path="parentoccupation" /></td>
</tr>
<tr>
<tr>
<td>AnnualIncome : </td>
<td><form:input path="annualincome" /></td>
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