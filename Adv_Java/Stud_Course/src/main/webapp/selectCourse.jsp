<%@page import="com.app.bean.Student"%>
<%@page import="com.app.dao.StudentDao"%>

<%
Student s = (Student) session.getAttribute("student");

if (s == null) {

	response.sendRedirect("login.jsp");
	return;
}

String msg = "";

if (request.getParameter("course") != null) {

	String course = request.getParameter("course");

	int status = StudentDao.updateCourse(s.getId(), course);

	if (status > 0) {

		s.setCourse(course);

		session.setAttribute("student", s);

		msg = "Course Selected Successfully";
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select Course</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body class="bg-light">

	<div class="container mt-5">

		<div class="card shadow p-4">

			<h2 class="text-center text-warning mb-4">Select Course</h2>
			<h4 class="mb-4">Session ID :<%=session.getId()%></h4>
			<form method="post">

				<select name="course" class="form-select mb-3">

					<option>Java</option>
					<option>Python</option>
					<option>Web Development</option>
					<option>Data Science</option>

				</select>

				<button class="btn btn-warning w-100">Save Course</button>

			</form>

			<h5 class="text-center text-success mt-3">
				<%=msg%>
			</h5>

			<div class="text-center mt-3">

				<h5>
					Selected Course :
					<%=s.getCourse()%>
				</h5>

			</div>

			<a href="dashboard.jsp" class="btn btn-primary mt-3"> Back </a>

		</div>

	</div>

</body>
</html>