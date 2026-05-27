<%@page import="com.app.dao.StudentDao"%>
<%@page import="com.app.bean.Student"%>

<%
String msg = "";

if (request.getParameter("fname") != null) {

	Student s = new Student();

	s.setPrn(request.getParameter("prn"));
	s.setFirstName(request.getParameter("fname"));
	s.setLaststName(request.getParameter("lname"));
	s.setAge(Integer.parseInt(request.getParameter("age")));

	int status = StudentDao.save(s);

	msg = (status > 0) ? "Registration Successful" : "Registration Failed";
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body class="bg-light">

	<div class="container mt-5">

		<div class="card shadow p-4">

			<h2 class="text-center text-success mb-4">Student Registration</h2>

			<form method="post">

				<div class="mb-3">

					<label class="form-label">PRN</label> <input type="text" name="prn"
						class="form-control" required>

				</div>

				<div class="mb-3">

					<label class="form-label">First Name</label> <input type="text"
						name="fname" class="form-control" required>

				</div>

				<div class="mb-3">

					<label class="form-label">Last Name</label> <input type="text"
						name="lname" class="form-control" required>

				</div>

				<div class="mb-3">

					<label class="form-label">Age</label> <input type="number"
						name="age" class="form-control" required>

				</div>

				<button class="btn btn-success w-100">Register</button>

			</form>

			<h5 class="text-center text-primary mt-3">
				<%=msg%>
			</h5>

			<div class="text-center mt-3">

				<a href="login.jsp"> Already Registered? </a>

			</div>

		</div>

	</div>

</body>
</html>