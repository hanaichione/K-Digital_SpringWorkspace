package com.spring;

import java.util.List;
import java.util.Map;

public class EchoBean {
	private List valueList;
	private AnotherBean anotherBean;
	
	// xml에서 받을 수 있도록
	public EchoBean(AnotherBean anotherBean) {
		System.out.println("EchoBean(AnotherBean) 생성자 호출됨");
		this.anotherBean = anotherBean;
	}
	
	public String sayEcho() {
		return "hello";
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(List valueList, AnotherBean anotherBean) {
		super();
		this.valueList = valueList;
		this.anotherBean = anotherBean;
	}

	public List getValueList() {
		return valueList;
	}

	public void setValueList(List valueList) {
		this.valueList = valueList;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

	@Override
	public String toString() {
		return "EchoBean [valueList=" + valueList + ", anotherBean=" + anotherBean + "]";
	}
	
	public void getInfo() {
		anotherBean.getInfo();
	}

}
