<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="com.app.entity.Book"%>
<%@page import="com.app.dao.BookDAO"%>

<%
List<Book> books = BookDAO.getAllBooks();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Store</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	background: linear-gradient(to right, #4e54c8, #8f94fb);
	min-height: 100vh;
	font-family: Arial, sans-serif;
}

.main-container {
	margin-top: 50px;
}

.main-card {
	background: white;
	border-radius: 15px;
	padding: 30px;
	box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
}

.page-title {
	text-align: center;
	margin-bottom: 30px;
	font-weight: bold;
	color: #333;
}

.table thead {
	background-color: #0d6efd;
	color: white;
}

.form-control {
	border-radius: 10px;
}

.btn-custom {
	border-radius: 10px;
}

.btn-update,
.btn-delete{
    padding: 6px 14px;
    font-size: 14px;
    border-radius: 5px;
    color: white;
    border: none;
    text-decoration: none;
    display: inline-block;
    height: 38px;
    line-height: 24px;
}

.btn-update{
    background-color: #198754;
}

.btn-delete{
    background-color: #dc3545;
}
</style>

</head>

<body>

	<div class="container main-container">

		<div class="main-card">

			<h2 class="page-title">Book Store Management</h2>



			<form action="saveBookServlet" method="post">

				<div class="row g-3">

					<div class="col-md-3">
						<input type="text" name="title" class="form-control"
							placeholder="Enter Title" required>
					</div>

					<div class="col-md-3">
						<input type="text" name="author" class="form-control"
							placeholder="Enter Author" required>
					</div>

					<div class="col-md-2">
						<input type="number" step="0.01" name="price" class="form-control"
							placeholder="Price" required>
					</div>

					<div class="col-md-2">
						<input type="number" name="copies" class="form-control"
							placeholder="Copies" required>
					</div>

					<div class="col-md-2 d-grid">
						<button type="submit" class="btn btn-primary btn-custom">
							Add Book</button>
					</div>

				</div>

			</form>

			<hr class="my-4">



			<h4 class="mb-3">Existing Books</h4>

			<div class="table-responsive">

				<table
					class="table table-hover table-bordered text-center align-middle">

					<thead>
						<tr>
							<th>ID</th>
							<th>Title</th>
							<th>Author</th>
							<th>Price</th>
							<th>Copies</th>
							<th>Action</th>
						</tr>
					</thead>

					<tbody>

						<%
						if (books != null && !books.isEmpty()) {

							for (Book b : books) {
						%>

						<tr>

							<td><%=b.getId()%></td>

							<td><%=b.getTitle()%></td>

							<td><%=b.getAuthor()%></td>

							<td>Rs. <%=b.getPrice()%></td>

							<td><%=b.getShop() != null ? b.getShop().getCopies() : 0%></td>

							<td>

								<form action="<%=request.getContextPath()%>/updateBook.jsp"
									method="post" class="d-inline">

									<input type="hidden" name="id" value="<%=b.getId()%>">

									<input type="hidden" name="title" value="<%=b.getTitle()%>">

									<input type="hidden" name="author" value="<%=b.getAuthor()%>">

									<input type="hidden" name="price" value="<%=b.getPrice()%>">

									<input type="hidden" name="copies"
										value="<%=b.getShop() != null ? b.getShop().getCopies() : 0%>">

									<button type="submit" class="btn-update">Update</button>
									<a href="deleteBook?id=<%=b.getId()%>"
										class="btn btn-danger btn-sm"
										onclick="return confirm('Delete this book?')"> Delete </a>

								</form>


							</td>

						</tr>

						<%
						}

						} else {
						%>

						<tr>

							<td colspan="6" class="text-danger fw-bold">No books
								available in inventory.</td>

						</tr>

						<%
						}
						%>

					</tbody>

				</table>

			</div>

		</div>

	</div>

</body>
</html>