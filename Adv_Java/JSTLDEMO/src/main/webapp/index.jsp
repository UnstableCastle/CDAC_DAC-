<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Time on server = <%=new Date() %></h2>
<hr>

<h2>

<%! int count=0; %>
<%count++; %>
<%="Visitor Count = " +count %>

</h2>
<hr>
<h2>67 Greater than 76 </h2>
<%=(67>76) %>
<hr>

</body>
</html>