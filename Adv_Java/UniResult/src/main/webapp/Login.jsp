<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Login</title>

<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body {
	background-color: #f4f6f9;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.form-container {
	background-color: #ffffff;
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
	width: 100%;
	max-width: 400px;
}

.form-container h2 {
	color: #2c3e50;
	margin-bottom: 20px;
	text-align: center;
	font-size: 24px;
}

table {
	width: 100%;
}

td {
	padding: 10px 0;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #cbd5e1;
	border-radius: 4px;
}

input[type="submit"] {
	width: 100%;
	background: #2563eb;
	color: white;
	border: none;
	padding: 12px;
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

	<div class="form-container">

		<h2>Login</h2>

		<span id="error"></span>

		<form action="login" method="post">

			<table>

				<tr>

					<td>User Name</td>

					<td><input type="text" name="txtUserName" required></td>

				</tr>

				<tr>

					<td>Password</td>

					<td><input type="password" name="txtPassword" required>

					</td>

				</tr>

				<tr>

					<td colspan="2"><input type="submit" value="Login"></td>

				</tr>

			</table>

		</form>

	</div>

	<script>
		const params = new URLSearchParams(window.location.search);

		if (params.get("error") === "1") {

			document.getElementById("error").innerHTML = "Invalid Username or Password";
		}
	</script>

</body>

</html>