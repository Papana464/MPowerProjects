<!DOCTYPE html>
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
			      <%if(request.getAttribute("msg1")!=null){ %>
			   <span style="color:red"><%=request.getAttribute("msg1") %></span> <%} %>
			      <%if(request.getAttribute("msg")!=null){ %>
			   <span style="color:red"><%=request.getAttribute("msg") %></span> <%} %>
			      <p class="message">Not registered? <a href="home.abc">Create an account</a><br><a href="retrivePwd.abc">Forgot password</a></p>
			    </form>
		  	</div>
		</div>
	</body>
</html>