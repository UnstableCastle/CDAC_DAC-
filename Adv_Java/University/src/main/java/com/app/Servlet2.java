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
import java.sql.SQLException;

@WebServlet("/serv2")
public class Servlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Servlet2() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String prn = request.getParameter("txtPRN");
        String sub1 = request.getParameter("txtsub1");
        String sub2 = request.getParameter("txtsub2");
        String sub3 = request.getParameter("txtsub3");
        String sub4 = request.getParameter("txtsub4");
        String sub5 = request.getParameter("txtsub5");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db1",
                    "root",
                    "1234");

            String query =
                    "UPDATE STUDENT SET SUB1=?, SUB2=?, SUB3=?, SUB4=?, SUB5=? WHERE PRN=?";

            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, Integer.parseInt(sub1));
            pstmt.setInt(2, Integer.parseInt(sub2));
            pstmt.setInt(3, Integer.parseInt(sub3));
            pstmt.setInt(4, Integer.parseInt(sub4));
            pstmt.setInt(5, Integer.parseInt(sub5));
            pstmt.setString(6, prn);

            int res = pstmt.executeUpdate();

            if (res > 0) {
                out.println("<h2>Marks Updated Successfully</h2>");
            } else {
                out.println("<h3>No record found for PRN: " + prn + "</h3>");
            }

            pstmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            out.println("Driver not found");
            e.printStackTrace();

        } catch (SQLException e) {
            out.println("Database Error");
            e.printStackTrace();

        } catch (NumberFormatException e) {
            out.println("Please enter valid numeric marks");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}