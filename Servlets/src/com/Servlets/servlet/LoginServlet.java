package com.Servlets.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;





public class LoginServlet extends GenericServlet {
	
	public void init(ServletConfig config) {
		System.out.println("Hello this is from init method.");
		
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println("Hello this is from service method.  "+ userName + password);
		
	}
	public static void main(String[] args) throws SQLException {
		test.JdbcDemo.selectUser();
	}
	
}
