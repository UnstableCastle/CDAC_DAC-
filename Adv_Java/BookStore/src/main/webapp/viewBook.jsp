<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="com.app.entity.Book"%>

<!DOCTYPE html>
<html>
<head>
<title>View Books</title>
</head>

<body>

<table border="1">

<tr>
    <th>Title</th>
    <th>Author</th>
    <th>Price</th>
    <th>Available Copies</th>
    <th>Action</th>
</tr>
<%
List<Book> books = (List<Book>) request.getAttribute("books");

if (books != null && !books.isEmpty()) {

    for (Book b : books) {
%>

<tr>
    <td><%= b.getTitle() %></td>
    <td><%= b.getAuthor() %></td>
    <td><%= b.getPrice() %></td>
    <td><%= b.getShop().getCopies() %></td>
    <td>
        <a href="buyBook?id=<%= b.getId() %>">Purchase</a>
    </td>
</tr>

<%
    }

} else {
%>
<tr>
    <td colspan="5">No books available </td>
</tr>
<%
}
%>

</table>

</body>
</html>