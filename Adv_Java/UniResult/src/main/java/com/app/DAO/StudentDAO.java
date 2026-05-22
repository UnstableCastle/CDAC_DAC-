package com.app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.app.model.Student;
import com.app.util.DBConnection;

public class StudentDAO {

	public Student login(String prn, String password) {

		Student student = null;

		try {

			Connection con = DBConnection.getConnection();

			String query = "SELECT * FROM student WHERE prn=? AND password=?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, prn);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				student = new Student();

				student.setPrn(rs.getString("prn"));
				student.setName(rs.getString("name"));

				student.setSub1(rs.getInt("sub1"));
				student.setSub2(rs.getInt("sub2"));
				student.setSub3(rs.getInt("sub3"));
				student.setSub4(rs.getInt("sub4"));
				student.setSub5(rs.getInt("sub5"));
			}

			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return student;
	}

	public boolean addStudent(Student student) {

		boolean status = false;

		try {

			Connection con = DBConnection.getConnection();

			String query = "INSERT INTO student(prn,name,password) VALUES(?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, student.getPrn());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getPassword());

			int res = pstmt.executeUpdate();

			if (res > 0) {

				status = true;
			}

			pstmt.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return status;
	}

	public boolean updateMarks(Student student) {

		boolean status = false;

		try {

			Connection con = DBConnection.getConnection();

			String query = "UPDATE student SET sub1=?,sub2=?,sub3=?,sub4=?,sub5=? WHERE prn=?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, student.getSub1());
			pstmt.setInt(2, student.getSub2());
			pstmt.setInt(3, student.getSub3());
			pstmt.setInt(4, student.getSub4());
			pstmt.setInt(5, student.getSub5());

			pstmt.setString(6, student.getPrn());

			int res = pstmt.executeUpdate();

			if (res > 0) {

				status = true;
			}

			pstmt.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return status;
	}

	public Student getStudentByPRN(String prn) {

		Student student = null;

		try {

			Connection con = DBConnection.getConnection();

			String query = "SELECT * FROM student WHERE prn=?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, prn);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				student = new Student();

				student.setPrn(rs.getString("prn"));

				student.setName(rs.getString("name"));

				student.setSub1(rs.getInt("sub1"));

				student.setSub2(rs.getInt("sub2"));

				student.setSub3(rs.getInt("sub3"));

				student.setSub4(rs.getInt("sub4"));

				student.setSub5(rs.getInt("sub5"));
			}

			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return student;
	}

}