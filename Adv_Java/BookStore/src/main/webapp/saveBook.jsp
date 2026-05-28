<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>



<title>Add Book</title>

<style>

body{
    font-family: Arial;
    margin: 30px;
}

form{
    width: 400px;
}

input{
    width: 100%;
    padding: 10px;
    margin-top: 10px;
}

button{
    margin-top: 15px;
    padding: 10px 20px;
}

a{
    text-decoration: none;
}

</style>

</head>

<body>

<h2>Add New Book</h2>

<form action="saveBookServlet" method="post">

    <input type="text"
           name="title"
           placeholder="Enter Title"
           required>

    <input type="text"
           name="author"
           placeholder="Enter Author"
           required>

    <input type="number"
           step="0.01"
           name="price"
           placeholder="Enter Price"
           required>

    <input type="number"
           name="copies"
           placeholder="Available Copies"
           required>

    <button type="submit">

        Add Book

    </button>

</form>

<br>

<a href="updateBook.jsp">

    View All Books

</a>

</body>
</html>