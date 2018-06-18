<!DOCTYPE html >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Retrive Password</title>
	<link rel="stylesheet" href="main.css">
	</head>
<body>
	<div class="login-page">
		<div class="form">
			<form class="login-form" action="retrive.abc" method="post">
				<input type="text" placeholder="userName" name="userName">
				<input type="text" placeholder="email" name="email">
				<button>Submit</button>
				<a href="xyz.abc">Home</a>
				<c:if test="${not empty msg2}">
			      <span style="color:red">${msg2}</span>
			      </c:if>
				<c:if test="${not empty msg3}">
			      <span style="color:red">${msg3}</span>
			      </c:if>
			</form>
		</div>
	</div>
</body>
</html>