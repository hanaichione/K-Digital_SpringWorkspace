package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao;
	
	public List<String> getList(){
		return dao.getList();
	}

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
	}

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
		System.out.println("setDao() 함수 호출됨");
	}
	
	
}
