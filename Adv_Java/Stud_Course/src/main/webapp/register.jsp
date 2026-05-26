<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.app.dao.StudentDao"%>
<%@page import="com.app.bean.Student"%>

<%
String msg = "";

if (request.getMethod().equalsIgnoreCase("POST")) {

	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	int age = Integer.parseInt(request.getParameter("age"));
	String course = request.getParameter("course");

	Student s = new Student();

	s.setFirstName(fname);
	s.setLaststName(lname);
	s.setAge(age);
	s.setCourse(course);

	int status = StudentDao.save(s);

	if (status > 0) {

		msg = "Registration Successful";
	} else {

		msg = "Registration Failed";
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

	<h1>Student Registration</h1>

	<form method="post">

		First Name : <input type="text" name="fname" required> <br>
		<br> Last Name : <input type="text" name="lname" required>

		<br>
		<br> Age : <input type="number" name="age" required> <br>
		<br> Course : <select name="course">

			<option>Java</option>
			<option>C</option>
			<option>Web Development</option>

		</select> <br>
		<br> <input type="submit" value="Register">

	</form>

	<h3><%=msg%></h3>

	<a href="login.jsp">Login</a>

</body>
</html>