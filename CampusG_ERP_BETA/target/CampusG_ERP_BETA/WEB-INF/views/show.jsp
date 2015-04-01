<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>View</h3>
<c:choose>
	<c:when test="${ShowForm eq 'first'}">
		From first condition :${a}
	</c:when>
	
	<c:when test="${ShowForm eq 'second'}">
		From Second condition :${b}
	</c:when>
	
	<c:otherwise>
		Nothing has to display...
	</c:otherwise>
	
</c:choose>
					

</body>
</html>