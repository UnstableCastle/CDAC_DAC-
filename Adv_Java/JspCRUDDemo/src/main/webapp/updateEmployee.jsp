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
boolean ans = EmployeeDAO.update(e);
if(ans)
	response.sendRedirect("viewEmployee.jsp");
%>
</body>
</html>