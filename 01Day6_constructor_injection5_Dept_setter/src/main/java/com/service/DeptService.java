package com.service;

import java.util.Arrays;
import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao;
	
	public DeptService() {
		System.out.println("기본생성자 호출됨");
	}
	
	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	public DeptService(DeptDAO dao) {
		this.dao = dao;
		System.out.println("SERVICE 호출됨");
	}
	public List<String> getList(){
		return dao.getList();
	}
}
