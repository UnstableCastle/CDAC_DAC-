package com.app.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.app.DAO.StudentDAO;
import com.app.model.Student;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		String prn = request.getParameter("txtUserName");

		String pass = request.getParameter("txtPassword");

		HttpSession session = request.getSession();

		if (prn.equals("admin") && pass.equals("admin")) {

			session.setAttribute("admin", "admin");

			response.sendRedirect("studMark.jsp");
		}

		else {

			StudentDAO dao = new StudentDAO();

			Student student = dao.login(prn, pass);

			if (student != null) {

				session.setAttribute("student", student);

				response.sendRedirect("checkResult.jsp");
			}

			else {

				response.sendRedirect("Login.jsp?error=1");

			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
