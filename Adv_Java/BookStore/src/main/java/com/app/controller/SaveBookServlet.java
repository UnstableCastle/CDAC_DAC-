package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.BookDAO;
import com.app.entity.Book;
import com.app.entity.Shop;

/**
 * Servlet implementation class SaveBookServlet
 */
@WebServlet("/saveBookServlet")
public class SaveBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		String t = request.getParameter("title");
		String a = request.getParameter("author");

		String priceStr = request.getParameter("price");
		String copiesStr = request.getParameter("copies");

		if(priceStr == null || priceStr.isEmpty() ||
				   copiesStr == null || copiesStr.isEmpty()){

				    pw.write("Price or Copies cannot be empty");

				    request.getRequestDispatcher("/index.jsp").include(request, response);

				    return;
				}

		int p = Integer.parseInt(priceStr);
		int c = Integer.parseInt(copiesStr);

		Shop shop = new Shop(c);

		Book b = new Book(t, a, p, shop);

		boolean s = BookDAO.save(b);

		if (s) {

		    pw.write("Book Added!");

		    request.getRequestDispatcher("saveBook.jsp")
		           .include(request, response);

		} else {

		    pw.write("Book Not Added !!!");
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
