package com.Struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.Struts.formbean.LoginForm;
import com.Struts.database.JdbcDemo;

public class LoginAction extends Action{
	public ActionForward execute(ActionMapping mappings,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
		LoginForm bean= (LoginForm)form;
		String name= bean.getUserName();
		String password =bean.getPassword();
		JdbcDemo obj = new JdbcDemo();
		if(name==""||password==""){
			request.setAttribute("msg1", "username or password is blank");
			return mappings.findForward("failure");
			}
		else {
				if (password.equals(obj.checkUser(name))){
				return mappings.findForward("success");
			}else {
				request.setAttribute("msg", "username or password is incorrect");
				return mappings.findForward("badCredential");
			}
			
	}
	}
}
