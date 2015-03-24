<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>Login Page</title>
<style>

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
#msg {
	margin-bottom: 20px;
	color: #a94442;
	background-color: #f2dede;
}
</style>
</head>
<body>

	<h1>CampusG-ERP</h1>

	<div id="login-box">

		<h3>Login with Username and Password</h3>


		<form method="post" action="login_action2">

			<table>
				<tr>
					<td>User:</td>
					<td><input type='text' name='user_name' autofocus="autofocus"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='text' name='password' /></td>
				</tr> 
				<div id="msg">${msg}</div>
				
				<tr>
					<td colspan='2'><input name="submit" type="submit"
						value="submit" /></td>
				</tr>
				
			</table>

			
		</form>
	</div>

</body>
</html>