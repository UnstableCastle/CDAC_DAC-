package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Employee;

public class EmployeeDAO {

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/db1",
                        "root",
                        "1234");

        return con;
    }

    public static int employeeRegistration(Employee c) {

        int i = 0;

        try {

            Connection con = getConnection();

            String query =
                    "insert into employee(firstName,password,email,gender,age) values(?,?,?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(
                    "insert into employee(fname,pwd,email,gender,age) values(?,?,?,?,?)");

         
            i = pstmt.executeUpdate();

            if (i == 1) {
                System.out.println("Record Inserted");
            } else {
                System.out.println("Insert Failed");
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return i;
    }
}