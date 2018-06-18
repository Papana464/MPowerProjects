<!DOCTYPE html>

<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
			<c:if test="${empty user_list}">
				<button >Users List</button>
				</c:if>
				<c:if test="${not empty user_list}">
				
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
					<c:forEach var="listValue" items="${user_list}">
					<tr>
						<td>${listValue.getId()}</td>
						<td>${listValue.getUserName()}</td>
						<td>${listValue.getPhoneNumber()}</td>
						<td>${listValue.getEmail()}</td>
						<td>${listValue.getDate()}</td>
						<td>${listValue.getDiffDate()}</td>
					</tr>
					</c:forEach>
					
				</table>
				
				</c:if>
				<p>
					<a  href="xyz.abc">LogOut</a>
					
				</p>
			</form>
			
		</div>
	</div>
</body>
</html>