package com.example.dao;

import java.util.List;

import com.example.pojo.Pojo;

public interface PojoDAO {
	
	public void save(Pojo p);
	
	public List<Pojo> list();
}
