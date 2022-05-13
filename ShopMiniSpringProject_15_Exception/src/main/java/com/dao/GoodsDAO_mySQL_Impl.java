package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

//@Repository
public class GoodsDAO_mySQL_Impl implements GoodsDAO_Interface{
	// SqlTemplate <= xml 주입
	
	@Override
	public List<GoodsDTO> goodsList(String gCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GoodsDTO goodsRetrieve(String gCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cartAdd(CartDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CartDTO> cartList(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cartUpdate(Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int cartDelete(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void cartAllDel(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CartDTO cartbyNum(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void orderDone(OrderDTO oDTO) {
		// TODO Auto-generated method stub
		
	}

}
