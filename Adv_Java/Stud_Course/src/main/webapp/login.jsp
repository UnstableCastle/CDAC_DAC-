<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.app.dao.StudentDao"%>
<%@page import="com.app.bean.Student"%>

<%
String msg = "";

if (request.getMethod().equalsIgnoreCase("POST")) {

	int id = Integer.parseInt(request.getParameter("id"));

	String fname = request.getParameter("fname");

	Student s = StudentDao.login(id, fname);

	if (s != null) {

		session.setAttribute("student", s);

		response.sendRedirect("dashboard.jsp");
	} else {

		msg = "Invalid Login";
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<h1>Student Login</h1>

	<form method="post">

		Student ID : <input type="number" name="id" required> <br>
		<br> First Name : <input type="text" name="fname" required>

		<br>
		<br> <input type="submit" value="Login">

	</form>

	<h3><%=msg%></h3>

	<a href="register.jsp">New Student Registration</a>

</body>
</html>