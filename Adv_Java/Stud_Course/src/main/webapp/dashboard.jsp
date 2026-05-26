<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.app.bean.Student"%>

<%
Student s = (Student) session.getAttribute("student");

if (s == null) {

	response.sendRedirect("login.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dash-board</title>
</head>
<body>

	<h1>
		Welcome
		<%=s.getFirstName()%></h1>

	<h2>
		Course :
		<%=s.getCourse()%>
	</h2>

	<h2>
		Age :
		<%=s.getAge()%>
	</h2>

	<h3>
		Session ID :
		<%=session.getId()%>
	</h3>

	<br>

	<a href="logout.jsp">Logout</a>

</body>
</html>