package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Employee;

public class EmployeeDAO {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306"
				+ "/db1", "root", "1234");
		System.out.println("Connection Established");
		return con;
	}
	
	public static int save(Employee e) throws ClassNotFoundException, SQLException
	{
		int i = 0;
		try {
		System.out.println("e = "+e);
		Connection con = getConnection();	
		PreparedStatement pstmt = con.prepareStatement("insert into employee(firstName,password,email,gender,age) values(?,?,?,?,?)");
		pstmt.setString(1, e.getFirstName());
		pstmt.setString(2, e.getPassword());
		pstmt.setString(3, e.getEmail());
		pstmt.setString(4, e.getGender());
		pstmt.setString(5, e.getAge());
		i = pstmt.executeUpdate();
		return i;
		}catch (Exception e1) {
			return i;
		}	
	}
	
	
	public static List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException
	{
		List<Employee> l = new ArrayList<Employee>();
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("select *from employee");
	 ResultSet rs=pstmt.executeQuery();
	 while(rs.next())
	 {
		 Employee e = new Employee();
		 e.setId(rs.getInt(1));
		 e.setFirstName(rs.getString(2));
		 e.setPassword(rs.getString(3));
		 e.setEmail(rs.getString(4));
		 e.setGender(rs.getString(5));
		 e.setAge(rs.getString(6));
		 l.add(e);
	 }
	 return l;
	}
	
	public static Employee getEmployeeById(int id) throws SQLException, ClassNotFoundException
	{
		Employee e = null;
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("select *from employee where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next())
		{
			e = new Employee();
			e.setId(rs.getInt(1));
			 e.setFirstName(rs.getString(2));
			 e.setPassword(rs.getString(3));
			 e.setEmail(rs.getString(4));
			 e.setGender(rs.getString(5));
			 e.setAge(rs.getString(6));
			 return e;
		}	
		return e;	
	}
	
	public static boolean update(Employee e) throws SQLException, ClassNotFoundException
	{
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("update employee set firstName=?,password=?,email=?,gender=?,age=? where id=?");
		pstmt.setString(1, e.getFirstName());
		pstmt.setString(2, e.getPassword());
		pstmt.setString(3, e.getEmail());
		pstmt.setString(4, e.getGender());
		pstmt.setString(5, e.getAge());
		pstmt.setInt(6, e.getId());
		int i = pstmt.executeUpdate();
		if(i==1)
		return true;
		else
			return false;
	}
	

}
