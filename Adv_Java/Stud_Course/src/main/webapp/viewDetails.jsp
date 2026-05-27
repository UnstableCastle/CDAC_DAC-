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
<title>View Details</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body class="bg-light">

	<div class="container mt-5">

		<div class="card shadow p-4">

			<h2 class="text-center mb-4">Student Details</h2>

			<table class="table table-bordered">

				<tr>
					<th>PRN</th>
					<td><%=s.getPrn()%></td>
				</tr>

				<tr>
					<th>First Name</th>
					<td><%=s.getFirstName()%></td>
				</tr>

				<tr>
					<th>Last Name</th>
					<td><%=s.getLaststName()%></td>
				</tr>

				<tr>
					<th>Age</th>
					<td><%=s.getAge()%></td>
				</tr>

				<tr>
					<th>Course</th>
					<td><%=s.getCourse()%></td>
				</tr>

				<tr>
					<th>Session ID</th>
					<td><%=session.getId()%></td>
				</tr>

			</table>

			<a href="dashboard.jsp" class="btn btn-primary"> Back </a>

		</div>

	</div>

</body>
</html>
>
