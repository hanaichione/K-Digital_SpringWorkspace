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
public class GoodsDAO implements GoodsDAO_Interface {
	@Autowired
	SqlSessionTemplate template;

	@Override
	public List<GoodsDTO> goodsList(String gCategory) throws Exception {
		return template.selectList("goodsList", gCategory);
	}

	@Override
	public GoodsDTO goodsRetrieve(String gCode) throws Exception {
		return template.selectOne("goodsRetrieve", gCode);
	}

	@Override
	public int cartAdd(CartDTO dto) throws Exception {
		return template.insert("cartAdd", dto);
	}

	@Override
	public List<CartDTO> cartList(String userid) throws Exception {
		return template.selectList("cartList", userid);
	}

	@Override
	public void cartUpdate(Map<String, String> map) throws Exception {
		int n = template.update("cartUpdate", map);
		System.out.println(n);
	}

	@Override
	public int cartDelete(int num) throws Exception {
		return template.delete("cartDel", num);
	}

	@Override
	public void cartAllDel(ArrayList<String> list) throws Exception {
		template.delete("cartAllDel", list);
	}

	@Override
	public CartDTO cartbyNum(String num) throws Exception {
		return template.selectOne("cartbyNum", num);
	}

	@Override
	public void orderDone(OrderDTO oDTO) throws Exception {
		int n = template.insert("orderDone", oDTO);
		System.out.println(n);
	}
}
