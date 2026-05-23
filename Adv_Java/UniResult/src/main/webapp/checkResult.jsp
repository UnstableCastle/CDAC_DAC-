<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

if (session.getAttribute("student") == null) {

	response.sendRedirect("Login.jsp");

	return;
}
%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Check Result</title>

<style>
body {
	font-family: Arial;
	background: #f4f6f9;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	background: white;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
	width: 400px;
}

h2 {
	text-align: center;
	margin-bottom: 20px;
}

input[type="text"] {
	width: 100%;
	padding: 10px;
	margin-top: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

input[type="submit"] {
	width: 100%;
	padding: 12px;
	margin-top: 15px;
	border: none;
	background: #2563eb;
	color: white;
	border-radius: 5px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background: #1d4ed8;
}

#error {
	display: block;
	text-align: center;
	margin-bottom: 15px;
	font-weight: bold;
	color: red;
}
</style>

</head>

<body>

	<div class="container">

		<h2>Check Result</h2>

		<h4>

			Session ID :
			<%=session.getId()%>

		</h4>

		<span id="error"></span>

		<form action="checkResult" method="post">

			Enter PRN : <input type="text" name="txtUserName" required> <input
				type="submit" value="Check Result">

		</form>

		<form action="logout" method="post">

			<input type="submit" value="Logout">

		</form>

	</div>

	<script>
		const params = new URLSearchParams(window.location.search);

		if (params.get("error") === "1") {

			document.getElementById("error").innerHTML = "PRN Not Found";
		}
	</script>

</body>

</html>