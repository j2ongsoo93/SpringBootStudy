package com.sist.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sist.demo.vo.Book;

public interface BookDAO extends JpaRepository<Book, Integer> {

}
