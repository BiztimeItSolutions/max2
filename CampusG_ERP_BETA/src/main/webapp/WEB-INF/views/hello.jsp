<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Done....
ID:${c.candidate_id} --%>
<%-- Wel come... <b>${u}</b> --%>

<br>
<br>
<%-- 
<c:choose>
	<c:when test="${ShowForm eq 'first'}">
		 <input type="submit" value="Submit disabled" style="display:none" >
	</c:when>
	
	<c:when test="${ShowForm eq 'second'}">
		 <input type="submit" value="Submit disabled">
	</c:when>
	
	<c:otherwise>
		<input type="submit" value="Submit Ative">
	</c:otherwise>
</c:choose> --%>


Wel Come:
<p>Name :<b>${name}</b></p>
<p>Password :<b>${password}</b></p>
<p>Privileges :<b>${privilege}</b></p>
<%-- 
<c:set var="dateParts" value="${privilege}"/>
<c:set var="priv" value="${fn:split(msg,',')}"/>
<c:forEach var="i">
 arrayofmsg[${i}]: ${arrayofmsg[i]}<br>
</c:forEach>

<c:set var="dateParts" value="${fn:split(dateString, ',')}" />
Value:${dateParts[0]}
<input type="text" name="day" value="${dateParts[0]}" />


<c:set var="msg" value="${privilege}"/>
<c:set var="arrayofmsg" value="${fn:split(msg,',')}"/>
<c:forEach var="i" begin="0" end="6">
 arrayofmsg[${i}]: ${arrayofmsg[i]}<br>
</c:forEach>

 --%>
 <c:set var="msg" value="${privilege}"/>
 <c:set var="modules" value="${fn:split(msg, ',')}" />
					<td><c:forEach items="${modules}" var="splitModule">
							<a href="${splitModule}">${splitModule}</a>
							<br />
						</c:forEach>
					</td>

</body>
</html>