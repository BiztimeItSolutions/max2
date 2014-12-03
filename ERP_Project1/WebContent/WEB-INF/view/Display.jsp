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
<select>
 <option value="UG">
 <form:form id="Edit" modelAttribute="student"
								commandName="student" method="get" action="${reg}">  <table class="table table-striped table-bordered table-hover" id="dataTables-example">          	
                         <thead>
                         <tr>
			                       <td>Applicant Id</td>
			                       <td>Graduation</td>
			                       </tr>
			                       <tr>
			                       <td><form:input path="id"
												value="${studentsapplicants.id}" size="25" maxlength="50" />
										</td>
										<td><form:input path="id"
												value="${studentsapplicants.graduation}" size="25" maxlength="50" />
										</td>
										 <a href="display.html?id=${dispaly.id}">Select</a></td>
			                       </tr>
			                       </thead>
			                       </table>
			                       </form:form>
									
										
 <option value="PG"><a href="display.html?graduation=${display.graduation}"></a></option>
</select>
 
 
  
 </select>
</body>
</html>