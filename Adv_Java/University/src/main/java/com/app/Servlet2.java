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

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String prn = request.getParameter("txtPRN");

        try {

            int sub1 = Integer.parseInt(request.getParameter("txtsub1"));
            int sub2 = Integer.parseInt(request.getParameter("txtsub2"));
            int sub3 = Integer.parseInt(request.getParameter("txtsub3"));
            int sub4 = Integer.parseInt(request.getParameter("txtsub4"));
            int sub5 = Integer.parseInt(request.getParameter("txtsub5"));

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db1",
                    "root",
                    "1234");

            String query = "UPDATE student SET sub1=?, sub2=?, sub3=?, sub4=?, sub5=? WHERE prn=?";

            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, sub1);
            pstmt.setInt(2, sub2);
            pstmt.setInt(3, sub3);
            pstmt.setInt(4, sub4);
            pstmt.setInt(5, sub5);
            pstmt.setString(6, prn);

            int res = pstmt.executeUpdate();

            if (res > 0) {

                int total = sub1 + sub2 + sub3 + sub4 + sub5;
                double percentage = total / 5.0;

                out.println("<h2>Marks Updated Successfully</h2>");
                out.println("<h3>Total Marks: " + total + "</h3>");
                out.println("<h3>Percentage: " + percentage + "%</h3>");

            } else {

                out.println("<h3>No student found with PRN: " + prn + "</h3>");

            }

            pstmt.close();
            con.close();

        } catch (NumberFormatException e) {

            out.println("<h3>Please enter valid numeric marks</h3>");

        } catch (ClassNotFoundException e) {

            out.println("<h3>MySQL Driver Not Found</h3>");

        } catch (SQLException e) {

            out.println("<h3>Database Error</h3>");
            e.printStackTrace();

        }
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
}