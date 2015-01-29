<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>

</head>

<body>


<form:form method="POST" commandName="studentContact" action="${pageContext.request.contextPath}/studentContact">

<table>
<h1>Present Contact Address</h1>
<tr>
<td>Address Line1* : </td>
<td><form:input path="addressline1" /></td>
</tr>
<tr>
<td>Address Line2 : </td>
<td><form:input path="addressline2" /></td>
</tr>
<tr>
<tr>
<td>City* : </td>
<td><form:input path="city" /></td>
</tr>
<tr>
<td>Pincode* : </td>
<td><form:input path="pincode" /></td>
</tr>
<tr>
<tr>
<td>Country* : </td>
<td><form:input path="country" /></td>
</tr>
<tr>
<td>State* : </td>
<td><form:input path="state" /></td>
</tr>
<tr>

 <h1>Permanent Contact Address</h1>
<tr>
<td>Address Line1* : </td>
<td><form:input path="permanentaddressline1" /></td>
</tr>
<tr>
<td>Address Line2 : </td>
<td><form:input path="permanentaddressline2" /></td>
</tr>
<tr>
<tr>
<td>City* : </td>
<td><form:input path="permanentcity" /></td>
</tr>
<tr>
<td>Pincode* : </td>
<td><form:input path="permanentpincode" /></td>
</tr>
<tr>
<tr>
<td>Country* : </td>
<td><form:input path="permanentcountry" /></td>
</tr>
<tr>
<td>State* : </td>
<td><form:input path="permanentstate" /></td>
</tr>
<tr>

<h1>Emergency Contact Address</h1>
<tr>
<td>Address Line1* : </td>
<td><form:input path="emergencyaddressline1" /></td>
</tr>
<tr>
<td>Address Line2 : </td>
<td><form:input path="emergencyaddressline2" /></td>
</tr>
<tr>
<tr>
<td>City* : </td>
<td><form:input path="emergencycity" /></td>
</tr>
<tr>
<td>Pincode* : </td>
<td><form:input path="emergencypincode" /></td>
</tr>
<tr>
<tr>
<td>Country* : </td>
<td><form:input path="emergencycountry" /></td>
</tr>
<tr>
<td>State* : </td>
<td><form:input path="emergencystate" /></td>
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