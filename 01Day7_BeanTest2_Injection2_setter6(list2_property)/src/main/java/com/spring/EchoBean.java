package com.spring;

import java.util.List;

public class EchoBean {
	List valueList;
	AnotherBean anotherBean;

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(List valueList, AnotherBean bean) {
		super();
		this.valueList = valueList;
		this.anotherBean = bean;
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


}
