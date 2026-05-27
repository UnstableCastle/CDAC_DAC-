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
<title>Dashboard</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body class="bg-light">

	<div class="container mt-5">

		<div class="card shadow p-4 text-center">

			<h1 class="text-primary mb-4">
				Welcome
				<%=s.getFirstName()%>
			</h1>

			<h4 class="mb-4">
				Session ID :
				<%=session.getId()%>
			</h4>

			<h5 class="mb-4">

				PRN :
				<%=s.getPrn()%>

			</h5>
			<a href="viewDetails.jsp" class="btn btn-success mb-3"> View
				Details </a> <a href="selectCourse.jsp" class="btn btn-warning mb-3">
				Select Course </a> <a href="logout.jsp" class="btn btn-danger">
				Logout </a>

		</div>

	</div>

</body>
</html>