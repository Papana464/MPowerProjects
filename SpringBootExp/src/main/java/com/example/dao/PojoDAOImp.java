package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.pojo.Pojo;

public class PojoDAOImp implements PojoDAO{
	
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	@Override
	public void save(Pojo p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
		
	}

	@Override
	public List<Pojo> list() {
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Pojo> userList = session.createQuery("from Pojo").list();
		session.close();
		return userList;
		
	}

}
