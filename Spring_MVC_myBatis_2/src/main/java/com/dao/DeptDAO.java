package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository
public class DeptDAO {
	@Autowired
	SqlSessionTemplate session;

	public List<String> list() {
		return session.selectList("DeptMapper.list");
	}

	public int add(DeptDTO dto) {
		return session.insert("DeptMapper.add", dto);
	}

	public int update(DeptDTO dto) {
		return session.update("DeptMapper.update", dto);
	}
	
	public int del(int deptno) {
		return session.delete("DeptMapper.del", deptno);
	}

}
