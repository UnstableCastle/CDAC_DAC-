<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Result</title>

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
}

table {
	border-collapse: collapse;
	width: 400px;
}

td {
	border: 1px solid #ccc;
	padding: 10px;
}

h1 {
	text-align: center;
	margin-bottom: 20px;
}
</style>

</head>

<body>

	<div class="container">

		<h1>Student Result</h1>

		<table>

			<tr>
				<td>PRN</td>
				<td>${student.prn}</td>
			</tr>

			<tr>
				<td>Name</td>
				<td>${student.name}</td>
			</tr>

			<tr>
				<td>Subject 1</td>
				<td>${student.sub1}</td>
			</tr>

			<tr>
				<td>Subject 2</td>
				<td>${student.sub2}</td>
			</tr>

			<tr>
				<td>Subject 3</td>
				<td>${student.sub3}</td>
			</tr>

			<tr>
				<td>Subject 4</td>
				<td>${student.sub4}</td>
			</tr>

			<tr>
				<td>Subject 5</td>
				<td>${student.sub5}</td>
			</tr>

			<tr>
				<td>Total</td>
				<td>${student.total}</td>
			</tr>

			<tr>
				<td>Percentage</td>
				<td>${student.percentage}%</td>
			</tr>

			<tr>
				<td>Grade</td>
				<td>${student.grade}</td>
			</tr>

		</table>

	</div>

</body>
</html>