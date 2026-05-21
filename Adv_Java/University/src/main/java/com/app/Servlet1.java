package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet1() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String prn = request.getParameter("txtUserName");
		String pass = request.getParameter("txtPassword");

		if ("admin".equals(prn) && "admin".equals(pass)) {

			response.sendRedirect("studMark.html");

		} else {

			try {

				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "1234");

				String query = "SELECT * FROM student WHERE prn=? AND password=?";

				PreparedStatement pstmt = con.prepareStatement(query);

				pstmt.setString(1, prn);
				pstmt.setString(2, pass);

				ResultSet rs = pstmt.executeQuery();

				if (rs.next()) {

					String name = rs.getString("name");

					int sub1 = rs.getInt("sub1");
					int sub2 = rs.getInt("sub2");
					int sub3 = rs.getInt("sub3");
					int sub4 = rs.getInt("sub4");
					int sub5 = rs.getInt("sub5");

					int total = sub1 + sub2 + sub3 + sub4 + sub5;

					double percentage = total / 5.0;

					request.setAttribute("prn", prn);
					request.setAttribute("name", name);

					request.setAttribute("sub1", sub1);
					request.setAttribute("sub2", sub2);
					request.setAttribute("sub3", sub3);
					request.setAttribute("sub4", sub4);
					request.setAttribute("sub5", sub5);

					request.setAttribute("total", total);
					request.setAttribute("percentage", percentage);

					String grade;

					if (percentage >= 75) {
						grade = "Distinction";
					} else if (percentage >= 60) {
						grade = "First Class";
					} else if (percentage >= 40) {
						grade = "Pass";
					} else {
						grade = "Fail";
					}

					request.setAttribute("grade", grade);

					request.getRequestDispatcher("result.jsp").forward(request, response);

				} else {

					response.sendRedirect("Login.html?error=1");
				}

				rs.close();
				pstmt.close();
				con.close();

			} catch (ClassNotFoundException e) {

				out.println("<h3>Driver Not Found</h3>");
				e.printStackTrace();

			} catch (SQLException e) {

				out.println("<h3>Database Error</h3>");
				e.printStackTrace();

			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}
}