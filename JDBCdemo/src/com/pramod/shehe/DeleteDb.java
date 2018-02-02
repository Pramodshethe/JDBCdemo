package com.pramod.shehe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteDb {
	public static void main(String args[]){
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
		PreparedStatement stat = con.prepareStatement("delete from student where id=?");
		stat.setInt(1, 123);
		int i = stat.executeUpdate();
		con.close();
		System.out.println(i+" Row Deleted");
		
		}catch(ClassNotFoundException e){
			e.getStackTrace();
		}catch(SQLException e){
			e.getStackTrace();
		}
	}

}
