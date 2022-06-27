package com.sist.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sist.demo.service.BookService;
import com.sist.demo.service.CustomerService;
import com.sist.demo.service.OrdersService;
import com.sist.demo.service.View_ListOrdersService;
import com.sist.demo.service.View_ListOrdersService2;
import com.sist.demo.vo.Orders;

import lombok.Setter;

@Controller
@Setter
public class OrdersController {
	@Autowired
	private BookService bs;
	@Autowired
	private CustomerService cs;
	@Autowired
	private OrdersService os;
	@Autowired
	private View_ListOrdersService vls;
	@Autowired
	private View_ListOrdersService2 vls2;

	
	@GetMapping("/listOrders")
	public void listOrders(Model model) {
		model.addAttribute("o", os.findAll());
	}
	
	@GetMapping("/listOrders_view")
	public void listOrders_vw(Model model) {
		model.addAttribute("list", vls.findAll());
	}
	@GetMapping("/listOrders_view2")
	public void listOrders_vw2(Model model) {
		model.addAttribute("list", vls2.findAll());
	}
	
	@GetMapping("/insertOrders")
	public void insert(Model model) {
		model.addAttribute("c_list", cs.listCustomer());
		model.addAttribute("b_list", bs.listBook());
		model.addAttribute("no", os.getNextNo());
	}
	
	@PostMapping("/insertOrders")
	@ResponseBody
	public String insertOK(Orders o) {
		os.insert(o);
		return "redirect:/listOrders";
	}
	
	@GetMapping("/updateOrders/{orderid}")
	public void updateOrders(@PathVariable int orderid, Model model) {
		model.addAttribute("o", os.detailOrders(orderid));
	}
	
	
}
