<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
if (session.getAttribute("student") == null) {

	response.sendRedirect("Login.jsp");

	return;
}
%>

<!DOCTYPE html>

<html>
<head>

<meta charset="UTF-8">

<title>Result</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: Arial, sans-serif;
}

body {
	min-height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(135deg, #667eea, #764ba2);
	padding: 20px;
}

.container {
	width: 500px;
	background: white;
	padding: 35px;
	border-radius: 18px;
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
	text-align: center;
}

h1 {
	color: #333;
	margin-bottom: 15px;
}

.session {
	background: #f4f4f4;
	padding: 10px;
	border-radius: 8px;
	margin-bottom: 25px;
	color: #555;
	word-break: break-all;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-bottom: 25px;
	overflow: hidden;
	border-radius: 10px;
}

table tr:nth-child(even) {
	background: #f8f9fc;
}

table tr:hover {
	background: #eef2ff;
	transition: 0.3s;
}

td {
	padding: 14px;
	border: 1px solid #ddd;
	font-size: 15px;
}

td:first-child {
	font-weight: bold;
	background: #667eea;
	color: white;
	width: 40%;
}

.result-highlight {
	font-weight: bold;
	color: #2d3748;
}

input[type="submit"] {
	width: 100%;
	padding: 12px;
	border: none;
	border-radius: 8px;
	background: #ff4b5c;
	color: white;
	font-size: 16px;
	font-weight: bold;
	cursor: pointer;
	transition: 0.3s;
}

input[type="submit"]:hover {
	background: #e63b4c;
	transform: scale(1.03);
}
</style>

</head>

<body>

	<div class="container">

		<h1>Student Result</h1>

		<div class="session">
			Session ID :
			<%=session.getId()%>
		</div>

		<table border="1" cellpadding="10">

			<tr>
				<td>PRN</td>
				<td class="result-highlight">${student.prn}</td>
			</tr>

			<tr>
				<td>Name</td>
				<td class="result-highlight">${student.name}</td>
			</tr>

			<tr>
				<td>Sub1</td>
				<td>${student.sub1}</td>
			</tr>

			<tr>
				<td>Sub2</td>
				<td>${student.sub2}</td>
			</tr>

			<tr>
				<td>Sub3</td>
				<td>${student.sub3}</td>
			</tr>

			<tr>
				<td>Sub4</td>
				<td>${student.sub4}</td>
			</tr>

			<tr>
				<td>Sub5</td>
				<td>${student.sub5}</td>
			</tr>

			<tr>
				<td>Total</td>
				<td class="result-highlight">${student.total}</td>
			</tr>

			<tr>
				<td>Percentage</td>
				<td class="result-highlight">${student.percentage}%</td>
			</tr>

			<tr>
				<td>Grade</td>
				<td class="result-highlight">${student.grade}</td>
			</tr>
			

		</table>

		<form action="logout" method="post">

			<input type="submit" value="Logout">

		</form>

	</div>

</body>
</html>