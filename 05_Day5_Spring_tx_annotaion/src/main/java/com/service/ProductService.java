package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductService {
	ProductDAO dao;

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductService(ProductDAO dao) {
		super();
		this.dao = dao;
	}

	public List<ProductDTO> selectProduct() {
		return dao.selectProduct();
	}
	
	public List<OrderDTO> selectOrder(){
		return dao.selectOrder();
	}
	
	@Transactional	// tx처리, 필요함수 위에 붙임
	public void addOrder(String pcode, int quantity) throws Exception {
		// TODO Auto-generated method stub
		dao.addOrder(pcode, quantity);	// p01, 5
	}
	


}
