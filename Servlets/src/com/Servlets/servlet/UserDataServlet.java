package com.Servlets.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UserDataServlet extends HttpServlet {



	public void init(ServletConfig config) {
		System.out.println("Hello this is from init method in userdata servlet.");

	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		JdbcDemo obj=new JdbcDemo();
		String confirmPassword = req.getParameter("confirmPassword");
		String phoneNumber = req.getParameter("phoneNumber");
		String emergencyContact = req.getParameter("emergencyContact");
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date1 = new Date();
		String date = dateFormat.format(date1);
		String email = req.getParameter("email");
		if(userName==""||password==""||confirmPassword==""||phoneNumber==""||emergencyContact==""||email=="") {
			RequestDispatcher rd= req.getRequestDispatcher("/registration.jsp");
			rd.forward(req, res);
		}else {
		try {
			obj.insertUser(userName, password,confirmPassword, phoneNumber, emergencyContact, date, email);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		RequestDispatcher rd= req.getRequestDispatcher("/login.jsp");
		rd.forward(req, res);
		}
		
	}

}



