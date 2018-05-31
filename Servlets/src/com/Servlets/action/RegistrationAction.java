package com.Servlets.action;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.Servlets.formbean.LoginForm;
import com.Servlets.servlet.JdbcDemo;

public class RegistrationAction extends Action{
	public ActionForward execute(ActionMapping mappings,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
		LoginForm bean= (LoginForm)form;
		String name= bean.getUserName();
		String password =bean.getPassword();
		JdbcDemo obj = new JdbcDemo();
		String confirmPassword = bean.getConfirmPassword();
		String phoneNumber = bean.getPhoneNumber();
		String emergencyContact = bean.getEmergencyContact();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date1 = new Date();
		String date = dateFormat.format(date1);
		String email = bean.getEmail();
		if(name==""||password==""||confirmPassword==""||phoneNumber==""||emergencyContact==""||email=="") {
			return mappings.findForward("missingData");
		}else {
		try {
			obj.insertUser(name, password,confirmPassword, phoneNumber, emergencyContact, date, email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mappings.findForward("SuccessfullyCreated") ;
		}
		
		
	}
}