package com.app.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app.DAO.StudentDAO;
import com.app.model.Student;

/**
 * Servlet implementation class MarksController
 */
@WebServlet("/updateMarks")
public class MarksController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarksController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		 Student student = new Student();

	        student.setPrn(
	                request.getParameter("txtPRN"));

	        student.setSub1(Integer.parseInt(
	                request.getParameter("txtsub1")));

	        student.setSub2(Integer.parseInt(
	                request.getParameter("txtsub2")));

	        student.setSub3(Integer.parseInt(
	                request.getParameter("txtsub3")));

	        student.setSub4(Integer.parseInt(
	                request.getParameter("txtsub4")));

	        student.setSub5(Integer.parseInt(
	                request.getParameter("txtsub5")));

	        StudentDAO dao = new StudentDAO();

	        boolean status =
	                dao.updateMarks(student);

	        if (status) {

	            response.sendRedirect(
	                    "studMark.html?success=1");

	        } else {

	            response.sendRedirect(
	                    "studMark.html?error=1");
	        }
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
