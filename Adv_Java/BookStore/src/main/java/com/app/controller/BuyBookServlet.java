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

/**
 * Servlet implementation class BuyBookServlet
 */
@WebServlet("/buyBook")
public class BuyBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));
        Book b = BookDAO.getBookById(id);
        int c = b.getShop().getCopies();
        if(c <= 0){

            pw.write("Book Out Of Stock");

            return;
        }
        b.getShop().setCopies(c-1);
        boolean updated = BookDAO.updateBook(b);

        if(updated){

            pw.write("Book Purchased Successfully!");

        }else{

            pw.write("Purchase Failed");
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
