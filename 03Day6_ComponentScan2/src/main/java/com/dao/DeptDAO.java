package com.dao;

import org.springframework.stereotype.Repository;

import com.entry.DeptDTO;

@Repository("dao")
public class DeptDAO {
	public DeptDTO getInfo() {
		return new DeptDTO(100, "관리", "서울");
	}
}
