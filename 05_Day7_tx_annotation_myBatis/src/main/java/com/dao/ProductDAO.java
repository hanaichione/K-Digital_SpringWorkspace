package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductDAO {
	SqlSessionTemplate template;
	
	public SqlSessionTemplate getTemplate() {
		return template;
	}

	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}

	public List<ProductDTO> selectProduct() {
		return template.selectList("productList");
	}

	public List<OrderDTO> selectOrder() {
		return template.selectList("orderList");
	}

	public void addOrder(String pcode, int quantity) throws Exception {
		OrderDTO dto = new OrderDTO();
		dto.setPcode(pcode);
		dto.setQnantity(quantity);
		
		int n = template.insert("order.orderInsert", dto);
		System.out.println("order table insert = " + n);
		
		template.update("product.productU", dto);
	}
}
