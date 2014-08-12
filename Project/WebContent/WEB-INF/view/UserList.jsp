<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="Registration" value="adduser.html"/>

<form id="UserList" modelAttribute="applicant" method="post" action="${Registration}">
	 <li>       
                        <a href="addapplicant.html"><i class="fa fa-dashboard fa-fw"></i>Anuvidhya</a>
                    </li>
                    
                    
                    	 <li>       
                        <a href="employeeinformation.html"><i class="fa fa-dashboard fa-fw"></i>Komel</a>
                    </li>
                    
                     
                    	 <li>       
                        <a href="Cetapplicant.html"><i class="fa fa-dashboard fa-fw"></i>Soumya</a>
                    </li>
</body>
</html>