package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.GoodsDAO;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

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

	public int cartDelete(int num) {
		return dao.cartDelete(num);
	}

	public void cartAllDel(ArrayList<String> list) {
		// TODO Auto-generated method stub
		dao.cartAllDel(list);
	}

	public CartDTO cartbyNum(String num) {
		return dao.cartbyNum(num);
	}

	@Transactional
	public void orderDone(OrderDTO oDTO, int orderNum) {
		dao.orderDone(oDTO);	
		dao.cartDelete(orderNum);	// 카트에서 삭제
		// 두 가지를 tx처리, root-context.xml에 tx-Manager 등록 필요
	}

}
