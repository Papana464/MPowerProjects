package com.Servlets.servlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con =null;
	private DBConnection(){		
	}
	public static Connection getDBConnection(){
		try{
			if(con==null){
				String url="jdbc:mysql://localhost:3306/registration?verifyServerCertificate=false&useSSL=true";
				String uname="root";
				String pwd="dntlvplz";
				Class.forName("com.mysql.cj.jdbc.Driver");
				con= DriverManager.getConnection(url,uname,pwd);
			}		
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
