package com.Struts.action;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.MappingDispatchAction;
import com.Struts.formbean.LoginForm;
import com.Struts.database.StrutsDAO;

public class LoginAction extends MappingDispatchAction{
	public ActionForward login(ActionMapping mappings,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
		DynaActionForm dynaForm = (DynaActionForm)form;
		String name = dynaForm.getString("userName").toString();	
		String password = dynaForm.getString("password").toString();
		
		StrutsDAO obj = new StrutsDAO();
		boolean userCheck = false ;
		if(name==""||password=="") {
			request.setAttribute("msg1", "username or password is blank");
			return mappings.findForward("failure");
		}
		else {

			if(userCheck==obj.checkUser(name)){
				request.setAttribute("msg", "username or password is incorrect");
				return mappings.findForward("username_failure");
			}
			else {
				if (password.equals(obj.password(name))){
					return mappings.findForward("success");
				}
				else {
					request.setAttribute("msg", "username or password is incorrect");
					return mappings.findForward("badCredential");
				}
			}
		}
	}
	public ActionForward retrivePasswordMethod(ActionMapping mappings,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
		DynaActionForm dynaForm = (DynaActionForm)form;
		String name = dynaForm.getString("userName").toString();	
		String email1 = dynaForm.getString("email").toString();
		
		StrutsDAO obj = new StrutsDAO();
		String retrive_password=obj.retrivePassword(name,email1 );
		
		if (retrive_password==null) {
			request.setAttribute("msg2", "Incorrect data");
			return mappings.findForward("incorrect_data");
		}else  {
			request.setAttribute("msg3", retrive_password);
			return mappings.findForward("congratulation");
		}
		
	}
	public ActionForward registrationMethod(ActionMapping mappings,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
		LoginForm bean= (LoginForm)form;
		String name= bean.getUserName();
		String password =bean.getPassword();
		StrutsDAO obj = new StrutsDAO();
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
	public ActionForward getUserList(ActionMapping mappings,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
		StrutsDAO obj =new StrutsDAO();
		request.setAttribute("user_list", obj.getUserList());
		return mappings.findForward("userList");
	}
}
