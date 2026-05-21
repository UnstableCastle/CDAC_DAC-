
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>Student Result</title>

<style>

body{
    font-family:Arial;
    background:#f2f2f2;

    display:flex;
    justify-content:center;
    align-items:center;

    height:100vh;
}

.card{

    background:white;
    padding:30px;

    border-radius:10px;

    box-shadow:0 4px 10px rgba(0,0,0,0.3);
}

table{

    border-collapse:collapse;
}

td,th{

    border:1px solid black;
    padding:10px;
}

</style>

</head>

<body>

<div class="card">

<h2>Student Result</h2>

<table>

<tr>
    <th>PRN</th>
    <td><%= request.getAttribute("prn") %></td>
</tr>

<tr>
    <th>Name</th>
    <td><%= request.getAttribute("name") %></td>
</tr>

<tr>
    <th>Subject 1</th>
    <td><%= request.getAttribute("s1") %></td>
</tr>

<tr>
    <th>Subject 2</th>
    <td><%= request.getAttribute("s2") %></td>
</tr>

<tr>
    <th>Subject 3</th>
    <td><%= request.getAttribute("s3") %></td>
</tr>

<tr>
    <th>Subject 4</th>
    <td><%= request.getAttribute("s4") %></td>
</tr>

<tr>
    <th>Subject 5</th>
    <td><%= request.getAttribute("s5") %></td>
</tr>

<tr>
    <th>Total</th>
    <td><%= request.getAttribute("total") %></td>
</tr>

<tr>
    <th>Percentage</th>
    <td><%= request.getAttribute("percentage") %>%</td>
</tr>

</table>

</div>

</body>
</html>