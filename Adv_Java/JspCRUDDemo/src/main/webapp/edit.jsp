<%@page import="com.app.dao.EmployeeDAO"%>
<%@page import="com.app.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    Employee e = EmployeeDAO.getEmployeeById(id);
%>
<form action="updateEmployee.jsp" method="post">
<table border="1">
<tr>
<input type="hidden" name="id" value="<%=e.getId() %>" hidden="hidden">
</tr>
<tr>
<td>Enter FirstName: </td>
<td><input type="text" name="firstName" value="<%=e.getFirstName() %>"></td>
</tr>
<tr>
<td>Enter Password: </td>
<td><input type="password" name="password" value="<%=e.getPassword() %>"></td>
</tr>
<tr>
<td>Enter Email: </td>
<td><input type="email" name="email" value="<%=e.getEmail()%>"></td>
</tr>
<tr>
<td>Select Gender: </td>
<td>
<%
if(e.getGender().equals("male"))
{
%>
Male <input type="radio" name="gender" value="male" checked="checked">

Female <input type="radio" name="gender" value="female">
<%
}
%>

<%
if(e.getGender().equals("female"))
{
%>
Male <input type="radio" name="gender" value="male" >

Female <input type="radio" name="gender" value="female" checked="checked">
<%
}
%>
</td>
</tr>
<tr>
<td>Select Age Group: </td>
<td>
<select name="age">
<!-- <option value="select" selected="selected">select</option> -->
<% 
if(e.getAge().equals("21-25"))
{
%>
<option selected="selected" value="21-25">21-25</option>
<%
}
else
{
%>
<option value="21-25">21-25</option>
<%
}
%>
<% 
if(e.getAge().equals("26-30"))
{
%>
<option selected="selected" value="26-30">26-30</option>
<%
}
else
{
%>
<option value="26-30">26-30</option>
<%
}
%>

</select>
</td>
</tr>
<tr>
<td><input type="checkbox" name="terms"></td>
<td>Agree Terms and Conditions!!</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>