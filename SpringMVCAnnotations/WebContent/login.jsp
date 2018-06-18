<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My_Server</title>
		<link rel="stylesheet" href="main.css">
	</head>
	<body>
		<div class="login-page">
		
		    <div class="form">
			    <form class="login-form" action="login.abc" method="post">
			      <input type="text" placeholder="userName" name="userName"/>
			      <input type="password" placeholder="password" name="password"/>
			      <button>login</button>
			      <c:if test="${not empty msg}">
			      <span style="color:red">${msg}</span>
			      </c:if>
			      <p class="message">Not registered? <a href="abcd.abc">Create an account</a><br><a href="efg.abc">Forgot password</a></p>
			    </form>
		  	</div>
		</div>
	</body>
</html>