<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>

</head>

<body>


<form:form method="POST" commandName="studentEducation" action="${pageContext.request.contextPath}/studentEducation">


<table>



<tr>
<td>College/School : </td>
<td><form:input path="collegeName" /></td>
</tr>
<tr>
<td>DateOfEntering : </td>
<td><form:input path="dateofEntering" /></td>
</tr>
<tr>
<tr>
<td>DateOfLeaving : </td>
<td><form:input path="dateofLeaving" /></td>
</tr>
<tr>
<td>Board : </td>
<td><form:input path="board" /></td>
</tr>
<tr>
<tr>
<td>QualifyingExamPassed : </td>
<td><form:input path="qualifyingexaminationpassed" /></td>
</tr>
<tr>
<td>NoOfAttempts : </td>
<td><form:input path="attempts" /></td>
</tr>
<tr>
<tr> 

<td>PassedYear * : </td>
<td><form:input path="year" /></td>
</tr>
<tr>
<td>RegisterNumber : </td>
<td><form:input path="registerNumber" /></td>
</tr>
<tr>
<td colspan="3"><input type="submit" /></td>
</tr>
</tr>
</table>

</form:form>

</body>
</html>