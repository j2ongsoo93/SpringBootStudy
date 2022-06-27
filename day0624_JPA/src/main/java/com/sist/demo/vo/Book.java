package com.sist.demo.vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="book")
@Data
public class Book {
	@Id
	private int bookid;
	
	private String bookname;
	private String publisher;
	private int price;
	
	@OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
	private List<Orders> orders;
}
 