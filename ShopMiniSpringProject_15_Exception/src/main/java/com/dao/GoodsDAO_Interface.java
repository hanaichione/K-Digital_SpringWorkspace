package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

public interface GoodsDAO_Interface {

	List<GoodsDTO> goodsList(String gCategory) throws Exception;

	GoodsDTO goodsRetrieve(String gCode) throws Exception;

	int cartAdd(CartDTO dto) throws Exception;

	List<CartDTO> cartList(String userid) throws Exception;

	void cartUpdate(Map<String, String> map) throws Exception;

	int cartDelete(int num) throws Exception;

	void cartAllDel(ArrayList<String> list) throws Exception;

	CartDTO cartbyNum(String num) throws Exception;

	void orderDone(OrderDTO oDTO) throws Exception;

}