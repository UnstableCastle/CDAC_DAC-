<%@ page import="com.app.entity.Book"%>

<%
Book b = (Book) request.getAttribute("book");

if (b != null) {
%>

<!DOCTYPE html>
<html>
<head>
<title>Update Book</title>
</head>
<body>

	<h2>Update Book</h2>

	<form action="updateBookData" method="post">

		<input type="hidden" name="id" value="<%=b.getId()%>">

		Title: <input type="text" name="title" value="<%=b.getTitle()%>">
		<br>
		<br> Author: <input type="text" name="author"
			value="<%=b.getAuthor()%>"> <br>
		<br> Price: <input type="text" name="price"
			value="<%=b.getPrice()%>"> <br>
		<br> Copies: <input type="text" name="copies"
			value="<%=b.getShop().getCopies()%>"> <br>
		<br>

		<button type="submit">Update Book</button>

	</form>

</body>
</html>

<%
} else {
%>

<h2>Book not found</h2>

<%
}
%>