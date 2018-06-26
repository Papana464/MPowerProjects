package com.SpringMVCHibernate.dao;

import java.util.List;



import com.SpringMVCHibernate.pojo.Employee;

public interface EmployeeDAO {
	
	List<Employee> getAllEmployees(Employee e);
	void getEmployeesById(Employee e ,int i);
	void addEmployees(Employee e);
	void updateEmployee(Employee e);
	void deleteEmployee(Employee e) ;
	
}
