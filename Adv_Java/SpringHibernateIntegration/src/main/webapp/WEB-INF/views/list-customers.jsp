<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>
	<h2>CRM - Customer Relational Manager</h2>
	<hr />
	<input type="button" value="Add Customer"
		onclick="window.location.href = 'showForm'; return false;" />
	<br>
	<br>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="tempCustomer" items="${listCust}">
			<c:url var="updateLink" value="/customer/showFormForUpdate">
				<c:param name="customerId" value="${tempCustomer.id}" />
			</c:url>
			<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${tempCustomer.id}" />
			</c:url>
			<tr>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td><a href="${updateLink}">Update</a><td>
				<td><a href="${deleteLink}">Delete</a><td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>