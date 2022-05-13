package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.GoodsDAO_Interface;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

@Service
public class GoodsService {
	@Autowired
	GoodsDAO_Interface dao;

	public List<GoodsDTO> goodsList(String gCategory) throws Exception{
		return dao.goodsList(gCategory);
	}

	public GoodsDTO goodsRetrieve(String gCode) throws Exception{
		return dao.goodsRetrieve(gCode);
	}

	public int cartAdd(CartDTO dto) throws Exception{
		return dao.cartAdd(dto)	;
	}

	public List<CartDTO> cartList(String userid) throws Exception{
		return dao.cartList(userid);
	}

	public void cartUpdate(Map<String, String> map) throws Exception{
		dao.cartUpdate(map);
	}

	public int cartDelete(int num) throws Exception{
		return dao.cartDelete(num);
	}

	public void cartAllDel(ArrayList<String> list) throws Exception{
		// TODO Auto-generated method stub
		dao.cartAllDel(list);
	}

	public CartDTO cartbyNum(String num) throws Exception{
		return dao.cartbyNum(num);
	}

	@Transactional
	public void orderDone(OrderDTO oDTO, int orderNum) throws Exception{
		dao.orderDone(oDTO);	
		dao.cartDelete(orderNum);	// 카트에서 삭제
		// 두 가지를 tx처리, root-context.xml에 tx-Manager 등록 필요
	}

}
