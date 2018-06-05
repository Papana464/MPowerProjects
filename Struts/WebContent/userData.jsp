<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="com.Struts.database.User"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="main.css">
</head>
<body>
	<div class="login-page" style="width: 100%">
		<div class="form" style="width: 100%">
			<form class="register-form" style="width: 100%" action="userList.abc" method="post">
				<button>Users List</button>
				<p class="message" >
					<a  href="login.jsp">LogOut</a>
				</p><br/>
				<% if(request.getAttribute("user_list")!=null) {%>
				<table style="width:100%">
				<caption>Users List From DataBase</caption>
					<tr>
					<th>User ID</th>
					<th>User Name</th>
					<th>Phone No.</th>
					<th>Email</th>
					<th>Joining Date</th>
					</tr>
					<% for(User us: (List<User>)request.getAttribute("user_list")) {%>

					<tr>
						<td><%= us.getUser_id() %></td>
						<td><%= us.getUser_name() %></td>
						<td><%= us.getPhone_no() %></td>
						<td><%= us.getEmail() %></td>
						<td><%= us.getJoining_date() %></td>
					
					</tr>
					
					<%} %>
				</table>
				<%} %>
			</form>
		</div>
	</div>
</body>
</html>