package com.example.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.PojoDAO;
import com.example.pojo.Pojo;

public class SpringHibernateMain {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Config.xml");
		
		PojoDAO pojoDAO = context.getBean(PojoDAO.class);
		
		Pojo user = new Pojo();
		user.setUser_name("Panka45");
		user.setEmail("papana123.464@gmail.com");
		user.setPassword("qwerty");
		user.setConfirm_password("qwerty");
		user.setJoining_date("2018-06-18");
		user.setPhone_no("1234567890");
		user.setEmergency_contact("0987456123");
		
		pojoDAO.save(user);
		
		System.out.println("Pojo::"+user);
		
		List<Pojo> list = pojoDAO.list();
		
		for(Pojo p : list){
			System.out.println("Pojo List::"+p.getUser_name()+" "+p.getPhone_no()+" "+p.getEmail()+" "+p.getJoining_date());
		}
		//close resources
		context.close();	
	}


}
