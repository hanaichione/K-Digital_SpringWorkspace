package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService {
	@Resource
	DeptDAO dao;
	
	public List<String> getList(){
		return dao.getList();
	}

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

}
