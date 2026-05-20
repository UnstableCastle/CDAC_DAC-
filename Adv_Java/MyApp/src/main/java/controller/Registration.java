package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Employee;
import DAO.EmployeeDAO;

@WebServlet("/serv2")
public class Registration extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String fname = request.getParameter("txtName");
        String pwd = request.getParameter("txtPassword");
        String email = request.getParameter("txtEmail");
        String gender = request.getParameter("gender");
        String ageParam = request.getParameter("age");

        int age = 0;

        if (ageParam != null && !ageParam.equals("select")) {

            age = Integer.parseInt(ageParam);
        }

        Employee e = new Employee();

        e.setFirstName(fname);
        e.setPassword(pwd);
        e.setEmail(email);
        e.setGender(gender);
        e.setAge(age);

        try {

            int status =
                    EmployeeDAO.employeeRegistration(e);

            if (status > 0) {

                response.sendRedirect("login.html");

            } else {

                response.sendRedirect("error.html");
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}