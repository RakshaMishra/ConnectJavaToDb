package com.kodnest.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnest1";
		String username="root";
		String password="qwerty";
		String sql="select * from student where id=34";
		Scanner sc=new Scanner(System.in);
		
		Connection conn=DriverManager.getConnection(url,username,password);
	Statement stm=conn.createStatement();
	ResultSet rs=stm.executeQuery(sql);
		 while(rs.next())
		 {
			 System.out.println(rs.getString(2)+"-"+rs.getInt(1));
		 }
		 
		 
		
		
		 System.out.println("sucess");
		
	}

}
