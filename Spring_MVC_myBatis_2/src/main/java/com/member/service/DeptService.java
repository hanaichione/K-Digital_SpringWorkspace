package com.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

@Service
public class DeptService {

	@Autowired
	DeptDAO dao;
	
	public List<String> list() {
		return dao.list();
	}

	public int add(DeptDTO dto) {
		return dao.add(dto);
	}

	public int update(DeptDTO dto) {
		return dao.update(dto);
	}
	
	public int del(int deptno) {
		return dao.del(deptno);
	}

}
