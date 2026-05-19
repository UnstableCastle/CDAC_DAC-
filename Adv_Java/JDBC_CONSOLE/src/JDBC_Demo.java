import java.sql.*;
import java.util.*;

public class JDBC_Demo {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        Scanner s = new Scanner(System.in);

        // Register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Found");

        // Establish Connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db1",
                "root",
                "1234");

        System.out.println("Connection Established");

        Statement stmt = con.createStatement();

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert Record");
            System.out.println("2. Display Records");
            System.out.println("3. Delete Record");
            System.out.println("4. Update Password");
            System.out.println("5. Exit");

            System.out.println("Enter Choice:");
            choice = s.nextInt();

            switch (choice) {

            // INSERT
            case 1:

                PreparedStatement pstmt = con.prepareStatement(
                        "insert into employee(fname,pwd,email,gender,age) values(?,?,?,?,?)");

                System.out.println("Enter Name");
                String name = s.next();

                System.out.println("Enter Password");
                String pwd = s.next();

                System.out.println("Enter Email");
                String email = s.next();

                System.out.println("Enter Gender");
                String gender = s.next();

                System.out.println("Enter Age");
                int age = s.nextInt();

                pstmt.setString(1, name);
                pstmt.setString(2, pwd);
                pstmt.setString(3, email);
                pstmt.setString(4, gender);
                pstmt.setInt(5, age);

                int i = pstmt.executeUpdate();

                if (i == 1) {
                    System.out.println("Record Inserted");
                } else {
                    System.out.println("Insert Failed");
                }

                pstmt.close();
                break;

            // DISPLAY
            case 2:

                ResultSet rs = stmt.executeQuery("select * from employee");

                System.out.println("\n------ Employee Records ------");

                while (rs.next()) {

                    System.out.println(
                            rs.getInt(1) + " " +
                            rs.getString(2) + " " +
                            rs.getString(3) + " " +
                            rs.getString(4) + " " +
                            rs.getString(5) + " " +
                            rs.getInt(6));
                }

                rs.close();
                break;

            // DELETE
            case 3:

                PreparedStatement pstmt1 = con.prepareStatement(
                        "delete from employee where id=?");

                System.out.println("Enter Id to Delete");
                int id = s.nextInt();

                pstmt1.setInt(1, id);

                int d = pstmt1.executeUpdate();

                if (d == 1) {
                    System.out.println("Record Deleted");
                } else {
                    System.out.println("Delete Failed");
                }

                pstmt1.close();
                break;

            // UPDATE
            case 4:

                PreparedStatement pstmt2 = con.prepareStatement(
                        "update employee set pwd=? where id=?");

                System.out.println("Enter Id to Update");
                int uid = s.nextInt();

                System.out.println("Enter New Password");
                String pass = s.next();

                pstmt2.setString(1, pass);
                pstmt2.setInt(2, uid);

                int u = pstmt2.executeUpdate();

                if (u == 1) {
                    System.out.println("Record Updated");
                } else {
                    System.out.println("Update Failed");
                }

                pstmt2.close();
                break;

            // EXIT
            case 5:
                System.out.println("Exiting Program...");
                break;

            default:
                System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        // Close resources
        stmt.close();
        con.close();
        s.close();
    }
}