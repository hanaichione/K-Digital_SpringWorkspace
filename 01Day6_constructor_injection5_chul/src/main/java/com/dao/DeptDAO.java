package com.dao;

import java.util.Arrays;
import java.util.List;

public class DeptDAO {
	public List<String> getList(){
		List<String> list = 
				Arrays.asList("A", "B", "C");
		return list;
	}
}
