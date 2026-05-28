<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="com.app.entity.Book"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background-color:#f4f6f9;
}

.container-box{
    margin-top:50px;
}

.card{
    border:none;
    border-radius:15px;
    box-shadow:0 4px 12px rgba(0,0,0,0.1);
}

.table thead{
    background-color:#0d6efd;
    color:white;
}

.btn-buy{
    border-radius:20px;
    padding:5px 15px;
}

</style>

</head>

<body>

<div class="container container-box">

    <div class="card p-4">

        <h2 class="text-center mb-4">Book Store</h2>

        <div class="table-responsive">

            <table class="table table-hover text-center align-middle">

                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Author</th>
                        <th>Price</th>
                        <th>Copies</th>
                        <th>Action</th>
                    </tr>
                </thead>

                <tbody>

<%
@SuppressWarnings("unchecked")
List<Book> books = (List<Book>) request.getAttribute("books");

if (books != null && !books.isEmpty()) {

    for (Book b : books) {
%>

<tr>
    <td><%= b.getTitle() %></td>
    <td><%= b.getAuthor() %></td>
    <td> <%= b.getPrice() %></td>
    <td><%= b.getShop().getCopies() %></td>

    <td>
        <a href="buyBook?id=<%= b.getId() %>" 
           class="btn btn-primary btn-buy">
           Purchase
        </a>
    </td>
</tr>

<%
    }

} else {
%>

<tr>
    <td colspan="5" class="text-danger fw-bold">
        No books available
    </td>
</tr>

<%
}
%>

                </tbody>

            </table>

        </div>

    </div>

</div>

</body>
</html>