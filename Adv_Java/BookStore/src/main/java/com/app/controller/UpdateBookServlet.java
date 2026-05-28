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
 * Servlet implementation class UpdateBookServlet
 */
@WebServlet("/updateBookServlet")
public class UpdateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBookServlet() {
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

        String idStr = request.getParameter("id");

        int id = 0;

        if(idStr != null && !idStr.isEmpty()) {
            id = Integer.parseInt(idStr);
        }

        String title = request.getParameter("title");
        String author = request.getParameter("author");

        
        float price = Float.parseFloat(request.getParameter("price"));

        int copies = Integer.parseInt(request.getParameter("copies"));

        Book b = BookDAO.getBookById(id);

        if(b == null){

            pw.write("Book Not Found");

            return;
        }

        b.setTitle(title);
        b.setAuthor(author);
        b.setPrice(price);
        b.getShop().setCopies(copies);

        boolean updated = BookDAO.updateBook(b);

        if(updated){

            pw.write("<h2>Book Updated Successfully!</h2>");

            pw.write("<a href='" + request.getContextPath() + "/index.jsp'>Home</a>");

        }else{

            pw.write("Book Update Failed!");
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