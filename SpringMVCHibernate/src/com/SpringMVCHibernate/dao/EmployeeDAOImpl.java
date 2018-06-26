package com.SpringMVCHibernate.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.SpringMVCHibernate.pojo.Employee;


public class EmployeeDAOImpl implements EmployeeDAO {
	
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}
	@Override
	public List<Employee> getAllEmployees(Employee e) {
		List<Employee> list=new ArrayList<Employee>();  
	    list=template.loadAll(Employee.class);  
	    return list; 
	}

	@Override
	public void getEmployeesById(Employee e,int i) {
		template.load(e, i);
	}

	@Override
	public void addEmployees(Employee e) {
		template.save(e);
	}

	@Override
	public void updateEmployee(Employee e) {
		template.update(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		template.delete(e);
		//bulkUpdate("delete from Employee where id="+i);

	}

}
