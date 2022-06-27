package com.sist.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sist.demo.dao.BookDAO;
import com.sist.demo.vo.Book;

import lombok.Setter;

@Service
@Setter
public class BookService {
	@Autowired
	private BookDAO dao;
	
	public java.util.List<Book> listBook(){
		return dao.findAll();
	}
	public void save(Book b) {
		dao.save(b);
	}
	@SuppressWarnings("deprecation")
	public Book getBook(int bookid) {
		return dao.getOne(bookid);
	}
	public void deleteBook(int bookid) {
		dao.deleteById(bookid);
	}
}
