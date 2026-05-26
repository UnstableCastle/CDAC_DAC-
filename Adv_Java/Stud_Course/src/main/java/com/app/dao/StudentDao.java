package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.bean.Student;

public class StudentDao {

	static Connection con = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	// DATABASE CONNECTION
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("Driver Found");

		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/db1",
				"root",
				"1234");

		System.out.println("Connection Established");

		return con;
	}

	// SAVE STUDENT
	public static int save(Student e) {

		int i = 0;

		try {

			con = getConnection();

			String sql = "insert into STUD_COURSE(firstName,laststName,age,course) values(?,?,?,?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, e.getFirstName());
			pstmt.setString(2, e.getLaststName());
			pstmt.setInt(3, e.getAge());
			pstmt.setString(4, e.getCourse());

			i = pstmt.executeUpdate();

			con.close();

		} catch (Exception e1) {

			e1.printStackTrace();
		}

		return i;
	}

	// LOGIN
	public static Student login(int id, String firstName) {

		Student s = null;

		try {

			con = getConnection();

			String sql = "select * from STUD_COURSE where id=? and firstName=?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, id);
			pstmt.setString(2, firstName);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				s = new Student();

				s.setId(rs.getInt("id"));
				s.setFirstName(rs.getString("firstName"));
				s.setLaststName(rs.getString("laststName"));
				s.setAge(rs.getInt("age"));
				s.setCourse(rs.getString("course"));
			}

			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return s;
	}
}