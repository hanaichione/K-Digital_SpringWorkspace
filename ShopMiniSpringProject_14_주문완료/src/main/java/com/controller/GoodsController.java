package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;
import com.service.GoodsService;
import com.service.MemberService;

@Controller
public class GoodsController {
	@Autowired
	GoodsService service;
	@Autowired
	MemberService mservice;
	
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
	
//	@RequestMapping("/loginCheck/CartList")
//	public String CartList(HttpSession session, RedirectAttributes attr) {
//		MemberDTO dto = (MemberDTO) session.getAttribute("login");
//		String userid = dto.getUserid();
//		
//		System.out.println("service 받기 전");
//		List<CartDTO> cartlist = service.cartList(userid);
//		System.out.println(cartlist);
//		System.out.println("service 받은 후");
//		
//		attr.addFlashAttribute("cartlist", cartlist);
//		System.out.println("attr.addAttribute 후");
//		
//		return "redirect:../cartList"; // servlet-content.xml에 등록
//	}
	@RequestMapping("/loginCheck/CartList")
	public String CartList(HttpSession session) {
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		
		List<CartDTO> cartlist = service.cartList(userid);
		
		session.setAttribute("cartlist", cartlist);
		
		return "redirect:../cartList"; // servlet-content.xml에 등록
	}
	
	@RequestMapping("/loginCheck/cartUpdate")
	@ResponseBody
	public void cartUpdate(@RequestParam Map<String, String> map) {
		System.out.println(map);
		service.cartUpdate(map);
	}
	
	@RequestMapping("/loginCheck/cartDelete")
	@ResponseBody
	public void cartDelete(int num) {
		System.out.println(num);
		int n = service.cartDelete(num);
		
	}
	
	@RequestMapping("/loginCheck/delAllCart")
	public String delAllCart(@RequestParam("check") ArrayList<String> list) {
//		public String delAllCart(@RequestParam("check") String[] check) {
//		public String delAllCart(String[] check) {
//		따로 list로 바꾸는 작업 해야 함

		service.cartAllDel(list);
		return "redirect:../loginCheck/CartList";
	}
	
	@RequestMapping("/loginCheck/orderConfirm")
	public String orderAllConfirm(String num, HttpSession session, RedirectAttributes xxx) {
		System.out.println(num);
		MemberDTO mDTO = (MemberDTO) session.getAttribute("login");
		String userid = mDTO.getUserid();
		mDTO = mservice.myPage(userid);
		
		CartDTO cDTO = service.cartbyNum(num);
		System.out.println(cDTO);
		
		xxx.addFlashAttribute("mDTO", mDTO);
		xxx.addFlashAttribute("cDTO", cDTO);
		
		return "redirect:../orderConfirm";
	}
	
	@RequestMapping("/loginCheck/orderDone")
	public String orderDone(int orderNum, OrderDTO oDTO, HttpSession session, RedirectAttributes xxx) {
		MemberDTO mDTO = (MemberDTO) session.getAttribute("login");
		oDTO.setUserid(mDTO.getUserid());
		System.out.println(orderNum + "\t" + oDTO);
		
		service.orderDone(oDTO, orderNum);
		xxx.addFlashAttribute("oDTO", oDTO);
		return "redirect:../orderDone";
	}
}
