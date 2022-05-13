package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entry.DeptDTO;

@Service
public class DeptService {
	@Resource
	DeptDAO dao;
	
	public DeptDTO getInfo() {
		return dao.getInfo();
	}
}
