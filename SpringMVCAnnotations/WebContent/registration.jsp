
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
<link rel="stylesheet" href="main.css">
</head>
<body>
		<div class="login-page">
		    <div class="form">
			    <form:form  class="register-form" modelAttribute="loginForm" action="userData.abc" method="post">
			      <input type="text" placeholder="name" name="userName"/>
			      <input type="password" placeholder="password" name="password"/>
			      <input type="password" placeholder="confirm password" name="confirmPassword"/>
			      <input type="tel" placeholder="phoneNumber" name="phoneNumber"/>	
			      <input type="tel" placeholder="emergencyContact" name="emergencyContact"/>
			      <input type="email" placeholder="email" name="email"/>
			      <button>create</button>
			      <p class="message">Already registered? <a href="xyz.abc">Sign In</a></p>
			      <c:if test="${not empty missing}">
			      <span style="color:red">${missing}</span>
			      </c:if>
			      <c:if test="${not empty created}">
			      <span style="color:red">${created}</span>
			      </c:if>
			    </form:form>
		  	</div>
		</div>
</body>
</html>