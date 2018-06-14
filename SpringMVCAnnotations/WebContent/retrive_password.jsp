<!DOCTYPE html >
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
				<%if(request.getAttribute("msg2")!=null){ %>
				<span style="color: red"><%=request.getAttribute("msg2") %></span>
				<%} %>
				<%if(request.getAttribute("msg3")!=null){ %>
				<span style="color: orange"><%=request.getAttribute("msg3") %></span>
				<%} %>
			</form>
		</div>
	</div>
</body>
</html>