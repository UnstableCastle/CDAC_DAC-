<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Result</title>
</head>
<body>

	<h1>Student Result</h1>

	<table border="1" cellpadding="10">

		<tr>
			<td>PRN</td>
			<td><%=request.getAttribute("prn")%></td>
		</tr>

		<tr>
			<td>Name</td>
			<td><%=request.getAttribute("name")%></td>
		</tr>

		<tr>
			<td>Subject 1</td>
			<td><%=request.getAttribute("sub1")%></td>
		</tr>

		<tr>
			<td>Subject 2</td>
			<td><%=request.getAttribute("sub2")%></td>
		</tr>

		<tr>
			<td>Subject 3</td>
			<td><%=request.getAttribute("sub3")%></td>
		</tr>

		<tr>
			<td>Subject 4</td>
			<td><%=request.getAttribute("sub4")%></td>
		</tr>

		<tr>
			<td>Subject 5</td>
			<td><%=request.getAttribute("sub5")%></td>
		</tr>

		<tr>
			<td>Total</td>
			<td><%=request.getAttribute("total")%></td>
		</tr>

		<tr>
			<td>Percentage</td>
			<td><%=request.getAttribute("percentage")%>%</td>
		</tr>

	</table>

</body>
</html>