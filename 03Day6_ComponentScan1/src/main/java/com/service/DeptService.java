package com.service;

import org.springframework.stereotype.Component;

//@Component	// id지정이 없는 경우, 소문자 class이름이 id가 됨(deptService)
				// 소문자로 시작하는 클래스 이름에는 자동 부여가 안 됨
@Component("test")
public class DeptService {
	public String getService() {
		return "DeptService.getService() 호출됨";
	}
}
