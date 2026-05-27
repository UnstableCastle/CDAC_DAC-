<%@page import="com.app.dao.StudentDao"%>
<%@page import="com.app.bean.Student"%>

<%
String msg = "";

if(request.getParameter("prn") != null){

	String prn = request.getParameter("prn");

	String fname = request.getParameter("fname");

	Student s = StudentDao.login(prn, fname);

	if(s != null){

		session.setAttribute("student", s);

		response.sendRedirect("dashboard.jsp");
	}
	else{

		msg = "Invalid Login";
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body class="bg-light">

	<div class="container mt-5">

		<div class="card shadow p-4">

			<h2 class="text-center text-primary mb-4">Student Login</h2>

			<form method="post">

				<div class="mb-3">

					<label class="form-label">PRN</label> <input type="text" name="prn"
						class="form-control" required>

				</div>

				<div class="mb-3">

					<label class="form-label">First Name</label> <input type="text"
						name="fname" class="form-control" required>

				</div>

				<button class="btn btn-primary w-100">Login</button>

			</form>

			<h5 class="text-center text-danger mt-3">
				<%= msg %>
			</h5>

		</div>

	</div>

</body>
</html>