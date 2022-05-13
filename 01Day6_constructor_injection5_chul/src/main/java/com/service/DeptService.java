package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao;

	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
		System.out.println("service 호출됨");
		// TODO Auto-generated constructor stub
	}
	
	public List<String> getList(){
		return dao.getList();
	}
}
