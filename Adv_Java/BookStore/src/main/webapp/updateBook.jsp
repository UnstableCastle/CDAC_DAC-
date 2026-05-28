<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String id = request.getParameter("id");
String title = request.getParameter("title");
String author = request.getParameter("author");
String price = request.getParameter("price");
String copies = request.getParameter("copies");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>

<style>
body {
	font-family: Arial, sans-serif;
	margin: 30px;
}

form {
	width: 400px;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

input {
	width: 100%;
	padding: 8px;
	margin-top: 10px;
	margin-bottom: 15px;
}

button {
	padding: 10px 15px;
	background-color: green;
	color: white;
	border: none;
	cursor: pointer;
	border-radius: 4px;
}

button:hover {
	background-color: darkgreen;
}
</style>

</head>
<body>

	<h2>Update Book</h2>

	<form action="updateBookServlet" method="post">

		<input type="hidden" name="id" value="<%=id%>">

		<label>Title</label> 
		<input type="text" name="title" value="<%=title%>" required>

		<label>Author</label> 
		<input type="text" name="author" value="<%=author%>" required>

		<label>Price</label> 
		<input type="number" step="0.01" name="price" value="<%=price%>" required>

		<label>Copies</label> 
		<input type="number" name="copies" value="<%=copies%>" required>

		<button type="submit">Update Book</button>

	</form>

</body>
</html>