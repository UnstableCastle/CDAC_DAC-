<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%
response.setHeader(
"Cache-Control",
"no-cache,no-store,must-revalidate");

if(session.getAttribute("admin")==null){

    response.sendRedirect("Login.jsp");

    return;
}
%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Add Student</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial,sans-serif;
}

body{

    background:#f4f6f9;

    height:100vh;

    display:flex;
    justify-content:center;
    align-items:center;
}

.container{

    width:400px;

    background:white;

    padding:30px;

    border-radius:10px;

    box-shadow:0 4px 10px rgba(0,0,0,0.1);
}

h2{

    text-align:center;

    margin-bottom:20px;

    color:#333;
}

table{

    width:100%;
}

td{

    padding:10px;
}

input[type="text"],
input[type="password"]{

    width:100%;

    padding:10px;

    border:1px solid #cbd5e1;

    border-radius:4px;

    font-size:14px;
}

input[type="submit"],
input[type="button"]{

    width:100%;

    padding:12px;

    border:none;

    border-radius:5px;

    background:#2563eb;

    color:white;

    font-size:16px;

    cursor:pointer;
}

input[type="submit"]:hover,
input[type="button"]:hover{

    background:#1d4ed8;
}

#msg{

    display:block;

    text-align:center;

    margin-bottom:15px;

    font-weight:bold;
}

.logout-btn{

    margin-top:10px;
}

</style>

</head>

<body>

<div class="container">

<h2>Add Student</h2>

<span id="msg"></span>

<form action="addStudent"
method="post">

<table>

<tr>

<td>PRN</td>

<td>

<input type="text"
name="txtPRN"
required>

</td>

</tr>

<tr>

<td>Name</td>

<td>

<input type="text"
name="txtName"
required>

</td>

</tr>

<tr>

<td>Password</td>

<td>

<input type="password"
name="txtPassword"
required>

</td>

</tr>

<tr>

<td colspan="2">

<input type="submit"
value="Add Student">

</td>

</tr>

<tr>

<td colspan="2">

<input type="button"
value="Back to Marks Page"
onclick="window.location.href='studMark.jsp'">

</td>

</tr>

</table>

</form>

<form action="logout"
method="post"
class="logout-btn">

<input type="submit"
value="Logout">

</form>

</div>

<script>

const params =
new URLSearchParams(
window.location.search);

if(params.get("success")==="1"){

    document.getElementById("msg")
    .innerHTML =
    "Student Added Successfully";

    document.getElementById("msg")
    .style.color = "green";
}

if(params.get("error")==="1"){

    document.getElementById("msg")
    .innerHTML =
    "Student Already Exists";

    document.getElementById("msg")
    .style.color = "red";
}

</script>

</body>

</html>