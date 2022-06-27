package com.sist.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sist.demo.service.BookService;
import com.sist.demo.vo.Book;

import lombok.Setter;

@Controller
@Setter
public class BookController {
	@Autowired
	private BookService bs;
	
	@GetMapping("/listBook")
	public void list(Model model) {
		model.addAttribute("list", bs.listBook());
	}
	@GetMapping("/insertBook")
	public void insert(Model model) {
	}
	
	@PostMapping("/saveBook")
	public String save(Book b) {
		bs.save(b);
		return "redirect:/listBook";
	}
	@GetMapping("/updateBook/{bookid}")
	public ModelAndView update(@PathVariable int bookid) {
		ModelAndView mav = new ModelAndView("updateBook");
		mav.addObject("b", bs.getBook(bookid));
		return mav;
	}
	@GetMapping("/deleteBook/{bookid}")
	public String delete(@PathVariable int bookid) {
		bs.deleteBook(bookid);
		return "redirect:/listBook";
	}
	@GetMapping("/detailBook/{bookid}")
	public ModelAndView detail(@PathVariable int bookid) {
		ModelAndView mav = new ModelAndView("detailBook");
		mav.addObject("b", bs.getBook(bookid));
		return mav;
	}
}
