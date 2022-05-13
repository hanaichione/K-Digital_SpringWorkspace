package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	GoodsService service;
	
	@RequestMapping(value="/goodsList")
	public ModelAndView goodsList(String gCategory) {
		if(gCategory == null) {
			gCategory = "top";
		}
		
		List<GoodsDTO> list = service.goodsList(gCategory);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/goodsRetrieve")
	@ModelAttribute("goodsRetrieve")	// 뷰페이지 미정 : goodsRetrieve.jsp로 연결
	public GoodsDTO goodsRetrieve(String gCode) {
		System.out.println(gCode);
		
		GoodsDTO dto = service.goodsRetrieve(gCode);
		System.out.println(dto);
		return dto;	
	}
	
	@RequestMapping(value="/loginCheck/cartAdd")
	public String cartAdd(CartDTO dto, HttpSession session) {
		MemberDTO mdto = (MemberDTO) session.getAttribute("login");
		dto.setUserid(mdto.getUserid());
		
		service.cartAdd(dto);
		
		session.setAttribute("cdto", dto);
		session.setAttribute("mesg", dto.getgCode());
		
		return "redirect:../goodsRetrieve?gCode="+dto.getgCode();
	}
}
