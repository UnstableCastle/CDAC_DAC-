<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Shop</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background: linear-gradient(to right, #4e54c8, #8f94fb);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    font-family:Arial, sans-serif;
}

.home-card{
    width:400px;
    background:white;
    padding:40px;
    border-radius:15px;
    text-align:center;
    box-shadow:0 5px 15px rgba(0,0,0,0.2);
}

.home-card h1{
    margin-bottom:30px;
    color:#333;
    font-weight:bold;
}

.btn-custom{
    width:100%;
    margin-top:15px;
    padding:12px;
    border-radius:10px;
    font-size:18px;
}

</style>

</head>
<body>

<div class="home-card">

    <h1> Book Shop</h1>

    <a href="saveBook.jsp" 
       class="btn btn-success btn-custom">
       Add Book
    </a>

    <a href="viewBookServlet" 
       class="btn btn-primary btn-custom">
       View Books
    </a>

</div>

</body>
</html>