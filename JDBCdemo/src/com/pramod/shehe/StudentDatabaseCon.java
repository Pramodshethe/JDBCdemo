package com.pramod.shehe;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class StudentDatabaseCon {
	public static void main(String args[]){
		
		Student st = new Student();
		st.setId(123);
		st.setFname("Praveen");
		st.setLname("Shethe");
		st.setEmail("praveen.shethe7@gmail.com");
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root",""); 
		Statement stat = con.createStatement();
		stat.executeUpdate("insert into student(id,fname,lname,email) values('"+st.getId()+"', '"+st.getFname()+"', '"+st.getLname()+"', '"+st.getEmail()+"')");
		System.out.println("Done");
		stat.close();
		con.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e ){
			e.printStackTrace();
		}
	}

}
