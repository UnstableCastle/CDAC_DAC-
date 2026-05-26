<%@page import="com.app.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="e" class="com.app.bean.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<%
int i = EmployeeDAO.save(e);
if(i==1)
	response.sendRedirect("viewEmployee.jsp");
else
	response.sendRedirect("error.jsp");
%>
</body>
</html>