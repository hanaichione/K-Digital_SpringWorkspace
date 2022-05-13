package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.GoodsDAO;
import com.dto.CartDTO;
import com.dto.GoodsDTO;

@Service
public class GoodsService {
	@Autowired
	GoodsDAO dao;

	public List<GoodsDTO> goodsList(String gCategory) {
		return dao.goodsList(gCategory);
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		return dao.goodsRetrieve(gCode);
	}

	public int cartAdd(CartDTO dto) {
		return dao.cartAdd(dto)	;
	}

	public List<CartDTO> cartList(String userid) {
		return dao.cartList(userid);
	}

	public void cartUpdate(Map<String, String> map) {
		dao.cartUpdate(map);
	}

}
