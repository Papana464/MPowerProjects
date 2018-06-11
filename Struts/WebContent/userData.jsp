<!DOCTYPE html>
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
				<table style="width:100%">
				<caption ><b>Users List From DataBase</b></caption>
					<tr>
						<th>User ID</th>
						<th>User Name</th>
						<th>Phone No.</th>
						<th>Email</th>
						<th>Joining Date</th>
						<th>Joined</th>
					</tr>
					<% List<Object> user = (List<Object>)request.getAttribute("user_list");  %>
					<% for(int i=0;i<user.size();i+=6){%>
					<tr>
						<td><%= user.get(i) %></td>
						<td><%= user.get(i+1) %></td>
						<td><%= user.get(i+2) %></td>
						<td><%= user.get(i+3) %></td>
						<td><%= user.get(i+4) %></td>
						<td><%= user.get(i+5) %></td>
					</tr>
					
					<%} %>
				</table>
				<%} %>
				<p>
					<a  href="hello.abc">LogOut</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>