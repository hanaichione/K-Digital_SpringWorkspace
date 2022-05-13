package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

@Repository
public class GoodsDAO {
	@Autowired
	SqlSessionTemplate template;

	public List<GoodsDTO> goodsList(String gCategory) {
		return template.selectList("goodsList", gCategory);
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		return template.selectOne("goodsRetrieve", gCode);
	}

	public int cartAdd(CartDTO dto) {
		return template.insert("cartAdd", dto);
	}

	public List<CartDTO> cartList(String userid) {
		return template.selectList("cartList", userid);
	}

	public void cartUpdate(Map<String, String> map) {
		int n = template.update("cartUpdate", map);
		System.out.println(n);
	}

	public int cartDelete(int num) {
		return template.delete("cartDel", num);
	}

	public void cartAllDel(ArrayList<String> list) {
		template.delete("cartAllDel", list);
	}

	public CartDTO cartbyNum(String num) {
		return template.selectOne("cartbyNum", num);
	}

	public void orderDone(OrderDTO oDTO) {
		int n = template.insert("orderDone", oDTO);
		System.out.println(n);
	}
}
