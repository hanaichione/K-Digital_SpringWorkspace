package com.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDAO;
import com.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;

	public void memberAdd(MemberDTO m) throws Exception{
		dao.memberAdd(m);
	}

	public MemberDTO login(Map<String, String> map) throws Exception{
		return dao.login(map);
	}

	public MemberDTO myPage(String userid) throws Exception{
		return dao.myPage(userid);
	}

	public int memberUpdate(MemberDTO m) throws Exception{
		return dao.memberUpdate(m);
	}
}
