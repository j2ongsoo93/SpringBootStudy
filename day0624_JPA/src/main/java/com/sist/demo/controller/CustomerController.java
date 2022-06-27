package com.sist.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sist.demo.service.CustomerService;
import com.sist.demo.vo.Customer;

import lombok.Setter;

@Controller
@Setter
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/listCustomer")
	public void list(Model model) {
		model.addAttribute("list", cs.listCustomer());
	}
	@GetMapping("/insertCustomer")
	public void insert(Model model) {
	}
	
	@PostMapping("/saveCustomer")
	public String save(Customer c) {
		cs.saveCustomer(c);
		return "redirect:/listCustomer";
	}
	@GetMapping("/updateCustomer/{custid}")
	public ModelAndView update(@PathVariable int custid) {
		ModelAndView mav = new ModelAndView("updateCustomer");
		mav.addObject("c", cs.detailCustomer(custid));
		return mav;
	}
	@GetMapping("/deleteCustomer/{custid}")
	public String delete(@PathVariable int custid) {
		cs.deleteCustomer(custid);
		return "redirect:/listCustomer";
	}
	@GetMapping("/detailCustomer/{custid}")
	public ModelAndView detail(@PathVariable int custid) {
		ModelAndView mav = new ModelAndView("detailCustomer");
		mav.addObject("c", cs.detailCustomer(custid));
		return mav;
	}
}
