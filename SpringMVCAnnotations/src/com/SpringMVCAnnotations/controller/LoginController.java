package com.SpringMVCAnnotations.controller;

import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVCAnnotations.controllerForm.LoginForm;
import com.SpringMVCAnnotations.database.SpringDAO;


@Controller
public class LoginController {
	@Autowired
	SpringDAO obj ;
	
	

	@RequestMapping("/xyz.abc")
	public ModelAndView home() throws Exception {
		return new ModelAndView("login");
	}
	@RequestMapping("/abcd.abc")
	public ModelAndView regist() throws Exception {
		return new ModelAndView("registration");
	}
	@RequestMapping("/efg.abc")
	public ModelAndView retr() throws Exception {
		return new ModelAndView("retrive_password");
	}
	@RequestMapping("/login.abc")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		
		boolean userCheck = false ;
		if(name==""||password=="") {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject("msg", "username or password is blank");
			return mv;
		}
		else {
			
			if(userCheck==obj.checkUser(name)){
				ModelAndView mv = new ModelAndView("login");
				mv.addObject("msg", "username or password is incorrect");
				return mv;
			}
			else {
				if (password.equals(obj.password(name))){
					ModelAndView mv = new ModelAndView("userData");
					mv.addObject("userList","hello");
					return mv;
				}
				else {
					ModelAndView mv = new ModelAndView("login");
					mv.addObject("msg", "username or password is incorrect");
					return mv;
				}
			}
		}
		
	}
	@RequestMapping("/retrive.abc")
	public ModelAndView retrivePasswordMethod(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String name = req.getParameter("userName");	
		String email1 =  req.getParameter("email");
		
		String retrive_password=obj.retrivePassword(name,email1 );
		
		if (retrive_password==null) {
			ModelAndView mv = new ModelAndView("retrive_password");
			mv.addObject("msg2", "Incorrect data");
			return mv;
		}else  {
			ModelAndView mv = new ModelAndView("retrive_password");
			mv.addObject("msg3", retrive_password);
			return mv;
		}
		
	}
	
	@RequestMapping("/userData.abc")
	public ModelAndView registrationMethod(@Validated @ModelAttribute("loginForm") LoginForm form,HttpServletRequest req,HttpServletResponse res) throws Exception {
		
		
		String name=  form.getUserName();
		String password =form.getPassword();
		
		String confirmPassword =form.getConfirmPassword();
		String phoneNumber = form.getPhoneNumber();
		String emergencyContact = form.getEmergencyContact();
		Date date1 = new Date();
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		String email =form.getEmail();
		if(name==""||password==""||confirmPassword==""||phoneNumber==""||emergencyContact==""||email=="") {
			ModelAndView mv = new ModelAndView("registration");
			mv.addObject("missing", "Oops Empty Field");
			return mv;
		}else {
		try {
			obj.insertUser(name, password,confirmPassword, phoneNumber, emergencyContact, date2, email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("created", "Succesfully created");
		return mv ;
		}
	}
	
	
	@RequestMapping("/userList.abc")
	public ModelAndView getUserList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView("userData");
		mv.addObject("user_list", obj.getUserList());
		return mv;
	}
	@RequestMapping("/edit.abc")
	public ModelAndView edit() throws Exception {
		return new ModelAndView("edit");
	}
	

}
