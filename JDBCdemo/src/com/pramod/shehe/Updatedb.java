package com.pramod.shehe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Updatedb {
	public static void main(String args[]){
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
		PreparedStatement stat = con.prepareStatement("update student set fname = ? where id=?");
		stat.setString(1, "Pramod");
		stat.setInt(2, 122);
		int i = stat.executeUpdate();
		
		con.close();
		System.out.println(i+" Row Updated");
		}catch(ClassNotFoundException e){
			e.getStackTrace();
		}catch(SQLException e){
			e.getStackTrace();
		}
	}

}
