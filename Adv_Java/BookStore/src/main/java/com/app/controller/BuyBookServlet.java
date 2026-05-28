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

            pw.write(
                    "<html>" +
                    "<head>" +
                    "<link rel='stylesheet' " +
                    "href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css'>" +
                    "</head>" +

                    "<body class='bg-light'>" +

                    "<div class='container mt-5'>" +

                    "<div class='alert alert-danger text-center shadow p-4'>" +

                    "<h2>Book out of Stock!</h2>" +

                    "<br>" +

                    "<a href='viewBookServlet' class='btn btn-primary'>Back to Home</a>" +

                    "</div>" +
                    "</div>" +

                    "</body>" +
                    "</html>"
                );

            return;
        }
        b.getShop().setCopies(c-1);
        boolean updated = BookDAO.updateBook(b);
        if(updated){

            pw.write(
                "<html>" +
                "<head>" +
                "<link rel='stylesheet' " +
                "href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css'>" +
                "</head>" +

                "<body class='bg-light'>" +

                "<div class='container mt-5'>" +

                "<div class='alert alert-success text-center shadow p-4'>" +

                "<h2>Book Purchased Successfully!</h2>" +

                "<br>" +

                "<a href='viewBookServlet' class='btn btn-primary'>Back to Home</a>" +

                "</div>" +
                "</div>" +

                "</body>" +
                "</html>"
            );

        }else{

            pw.write(
                "<html>" +
                "<head>" +
                "<link rel='stylesheet' " +
                "href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css'>" +
                "</head>" +

                "<body class='bg-light'>" +

                "<div class='container mt-5'>" +

                "<div class='alert alert-danger text-center shadow p-4'>" +

                "<h2>Purchase Failed!</h2>" +

                "<br>" +

                "<a href='viewBookServlet' class='btn btn-dark'>Try Again</a>" +

                "</div>" +
                "</div>" +

                "</body>" +
                "</html>"
            );
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
