<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Spring MVC 5 CRUD Operation</h2>
	<h3>Customer Form</h3>
	<form:form action="saveCustomer" method="post"
		modelAttribute="customer">
		<table>
			<tr>
				<form:hidden path="id" />
			</tr>
			<tr>
				<td>Enter FirstName:</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter LastName:</td>
				<td><form:input path="lastName" /></td>
			</tr>

			<tr>
				<td>Enter Email-id:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button>Submit</form:button></td>
			</tr>

		</table>
	</form:form>
</body>
</html>