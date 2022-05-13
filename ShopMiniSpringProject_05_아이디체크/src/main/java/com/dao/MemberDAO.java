package com.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;

@Repository
public class MemberDAO {
	@Autowired
	SqlSessionTemplate template;

	public void memberAdd(MemberDTO m) {
		int n = template.insert("MemberMapper.memberAdd", m);
		if (n == 1) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
	}

	public MemberDTO login(Map<String, String> map) {
		return template.selectOne("MemberMapper.login", map);
	}

	public MemberDTO myPage(String userid) {
		return template.selectOne("MemberMapper.mypage", userid);
	}
}
