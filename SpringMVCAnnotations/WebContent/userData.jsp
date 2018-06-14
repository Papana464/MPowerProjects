<!DOCTYPE html>
<%@page import="com.SpringMVCAnnotations.controllerForm.LoginForm"%>
<%@page import="java.util.List"%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="main.css">
<style >
	.form a{
		text-decoration: none;
		color: red;
	}
</style>
</head>
<body>
	<div class="login-page" >
		<div class="form" >
			<form class="register-form"  action="userList.abc" method="post">
			<% if(request.getAttribute("user_list")==null) {%>
				<button >Users List</button>
				<%} %>
				<% if(request.getAttribute("user_list")!=null) {%>
				<style>
				.form button{
					width:50%;
					}
					.login-page{
						width:700px;
					}
					.form{
						max-width: 700px;
					  margin: 0 auto 700px;
					}
					
				</style>
				<table style="width:100%" id="table">
				<caption ><b>Users List From DataBase</b></caption>
					<tr>
						<th>User ID</th>
						<th>User Name</th>
						<th>Phone No.</th>
						<th>Email</th>
						<th>Joining Date</th>
						<th>Joined</th>
					</tr>
					
					<% for(LoginForm user: (List<LoginForm>)request.getAttribute("user_list")){%>
					<tr>
						<td><%= user.getId() %></td>
						<td><%= user.getUserName() %></td>
						<td><%= user.getPhoneNumber() %></td>
						<td><%= user.getEmail() %></td>
						<td><%= user.getDate() %></td>
						<td><%= user.getDiffDate() %></td>
					</tr>
					
					<%} %>
				</table>
				<%} %>
				<p>
					<a  href="xyz.abc">LogOut</a>
					
				</p>
			</form>
		</div>
	</div>
</body>
</html>