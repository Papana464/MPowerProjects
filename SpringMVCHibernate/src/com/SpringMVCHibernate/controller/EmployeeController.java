package com.SpringMVCHibernate.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringMVCHibernate.dao.EmployeeDAO;
import com.SpringMVCHibernate.pojo.Employee;

public class EmployeeController {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Shi-Config.xml");
		EmployeeDAO empDAO =context.getBean(EmployeeDAO.class);
		
		
		Employee emp = new Employee();
		
		emp.setFirstName("vishnu vardhan Reddy");
		emp.setLastName("Papana");
		emp.setMobileNo("9705014314");
		emp.setEmailId("vishnu.464@gmail.com");
		//empDAO.addEmployees(emp);
		//empDAO.getEmployeesById(emp, 2);
		
		//empDAO.deleteEmployee(emp);
		List<Employee> li = empDAO.getAllEmployees(emp);
//		for(Employee l1:li) {
//			System.out.println(l1.getEmailId());
//		}
		Iterator<Employee> itr = li.iterator();
		while(itr.hasNext()){
			Employee obj = itr.next();
			System.out.println(obj.getFirstName()+" "+obj.getEmailId());
		}
	}
}
