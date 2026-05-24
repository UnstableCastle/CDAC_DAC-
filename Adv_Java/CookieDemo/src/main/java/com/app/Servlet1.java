package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Servlet1() {
        super();
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get PrintWriter
        PrintWriter pw = response.getWriter();

        // Get parameter
        String data = request.getParameter("txtData");

        // Create Cookie
        Cookie cookie = new Cookie("txtData", data);

        // Cookie expiry time in seconds
        cookie.setMaxAge(30);

        // Add cookie to response
        response.addCookie(cookie);

        // HTML Form
        pw.write("<html><body><center>");

        pw.write("<form action='Servlet2' method='post'>");

        pw.write("Enter Last Name: ");
        pw.write("<input type='text' name='lastname'>");

        pw.write("<br><br>");

        pw.write("<input type='submit' value='Enter'>");

        pw.write("</form>");

        pw.write("</center></body></html>");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}