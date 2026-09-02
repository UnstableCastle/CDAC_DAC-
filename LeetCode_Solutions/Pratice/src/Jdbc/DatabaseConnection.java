package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        
        // 1. The Connection String (URL, Username, Password)
        // Format: jdbc:mysql://hostname:port/databaseName
        String url = "jdbc:mysql://localhost:3306/console_bank";
        String user = "root";       // Change this to your MySQL username
        String password = "1234"; // Change this to your MySQL password

        // JDBC operations force you to handle SQLExceptions
        try {
            System.out.println("Attempting to connect to the database...");
            
            // 2. Open the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful!\n");

            // 3. Create the Statement vehicle
            Statement stmt = conn.createStatement();

            // 4. Write and Execute the SQL Query
            String sql = "SELECT first_name, last_name, city FROM Customers WHERE city = 'Pune'";
            ResultSet rs = stmt.executeQuery(sql);

            // 5. Process the Results
            // rs.next() moves the cursor row by row. It returns false when there is no more data.
            System.out.println("--- Pune Customers ---");
            while (rs.next()) {
                // Extract data by column name
                String fName = rs.getString("first_name");
                String lName = rs.getString("last_name");
                
                System.out.println("Name: " + fName + " " + lName);
            }

            // 6. Close the connection
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}