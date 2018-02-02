package com.pramod.shehe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Retrivedb {
	public static void main(String args[]){
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
		
		Statement stat = con.createStatement();
		String sql = "SELECT id, fname, lname, email FROM student";
	    ResultSet rs = stat.executeQuery(sql);
	    while(rs.next()){
	         int id  = rs.getInt("id");
	         String first = rs.getString("fname");
	         String last = rs.getString("lname");
	         String email = rs.getString("email");
	         
	         System.out.println("  id :"+"  FirstName: "+"  LastName: "+"  EmailId: ");
	         System.out.println("  "+id+"   "+first+"       "+last+"      "+email);
	         
	    }
	    con.close();
		
		}catch(ClassNotFoundException e){
			e.getStackTrace();
		}catch(SQLException e){
			e.getStackTrace();
		}
		}

}
