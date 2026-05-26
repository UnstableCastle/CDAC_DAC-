<%@page import="com.app.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.bean.Employee,java.util.*"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> list = EmployeeDAO.getAllEmployees();
pageContext.setAttribute("list", list);
%>
<table border="1">
<tr>
<th>ID</th>
<th>FirstName</th>
<th>Password</th>
<th>Email</th>
<th>Gender</th>
<th>Age</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var="e" items="${list}"> 
<tr>
<td>${e.id}</td>
<td>${e.firstName}</td>
<td>${e.password}</td>
<td>${e.email}</td>
<td>${e.gender}</td>
<td>${e.age}</td>
<td><a href="edit.jsp?id=${e.id}">Edit</a></td>
<td><a href="delete.jsp?id=${e.id}">Delete</a></td>
</tr>
</c:forEach>
</table>







</body>
</html>