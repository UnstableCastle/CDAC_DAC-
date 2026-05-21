package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/serv3", initParams = { @WebInitParam(name = "Driver", value = "com.mysql.cj.jdbc.Driver") })

public class Servlet3 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String prn = request.getParameter("txtPRN");
		String pass = request.getParameter("txtPassword");
		String name = request.getParameter("txtName");

		String driver = getServletConfig().getInitParameter("Driver");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "1234");

			String query = "insert into student(prn,name,password) values(?,?,?)";

			pstmt = con.prepareStatement(query);

			pstmt.setString(1, prn);
			pstmt.setString(2, name);
			pstmt.setString(3, pass);

			int res = pstmt.executeUpdate();

			if (res > 0) {

				response.sendRedirect("addStud.html?success=1");

			} else {

				response.sendRedirect("addStud.html?error=1");
			}

		} catch (SQLException e) {

			response.sendRedirect("addStud.html?error=1");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} finally {

			try {

				if (pstmt != null)
					pstmt.close();

				if (con != null)
					con.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}