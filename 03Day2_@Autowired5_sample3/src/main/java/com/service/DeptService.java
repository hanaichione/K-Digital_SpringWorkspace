package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.dao.DeptDAO;

public class DeptService {
	
	@Value("${jdbc.driver}")
	String driver;
	@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.userid}")
	String username;
	@Value("${jdbc.passwd}")
	String password;
	
	@Resource
	DeptDAO dao;
	
	public List<String> getList(){
		return dao.getList();
	}

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DeptService [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ ", dao=" + dao + "]";
	}
	
}
