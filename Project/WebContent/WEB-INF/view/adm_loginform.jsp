<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>LoginPage</title>

</head>

<body>

<h3>Login Form</h3>


<c:url var="Registration" value="loginform.html"/>

<form id="OnlineApplicationForm" modelAttribute="loginForm" method="post" action="${Registration}">


<fieldset>
	
			<p>
				<label for="fname" class="block">User name:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input class="form-control" name="userName" ></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
				
			
				<label for="lname" class="block">password:</label>
				 <span class="style1">                                            *</span>
                                            
                                          <table width="1015">
                                              <tr>
                                               <td width="608">
                                                 <div class="form-group"><input class="form-control" type="password" name="userPassword" ></div>
                                                 
                                               </td>
                                               <td width="393"><label id="lbluser"></label></td>
                                               
                                             </tr>
                                          </table> 
			</p>
			</fieldset>
<input type="submit" value="submit">
</form>

</body>

</html>