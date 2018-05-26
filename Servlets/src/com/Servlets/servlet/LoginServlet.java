package com.Servlets.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	
	
	public void init(ServletConfig config) {
		System.out.println("Hello this is from init method in login servlet.");
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		JdbcDemo obj=new JdbcDemo();
		try {
			if(password.equals(obj.checkUser(userName))) {
				System.out.println("password verified!!");
				RequestDispatcher rd= req.getRequestDispatcher("/userData.jsp");
				rd.forward(req, res);
			}else {
				RequestDispatcher rd= req.getRequestDispatcher("/index.jsp");
				rd.forward(req, res);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}	
	}
	
	
}

