<!DOCTYPE html>
<%@page import="java.util.List"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="main.css">

</head>
<body>
	<div class="login-page" >
		<div class="form" >
			<form class="register-form"  action="userList.abc" method="post">
				<button >Users List</button>
				<p>
					<button ><a  href="login.jsp">LogOut</a></button>
				</p><br/>
				<% if(request.getAttribute("user_list")!=null) {%>
				<style>
					.form button{
					width:50%;
					}
					.login-page{
						width:600px;
					}
					.form{
						max-width: 600px;
					  margin: 0 auto 600px;
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
					</tr>
					<% List<Object> user = (List<Object>)request.getAttribute("user_list");  %>
					<% for(int i=0;i<user.size();i+=5){%>
					<tr>
						<td><%= user.get(i) %></td>
						<td><%= user.get(i+1) %></td>
						<td><%= user.get(i+2) %></td>
						<td><%= user.get(i+3) %></td>
						<td><%= user.get(i+4) %></td>
					</tr>
					
					<%} %>
				</table>
				<%} %>
			</form>
		</div>
	</div>
</body>
</html>