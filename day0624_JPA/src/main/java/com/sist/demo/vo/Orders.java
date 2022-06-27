package com.sist.demo.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="orders")
@Data
public class Orders {
	@Id
	private int orderid;
	
	@ManyToOne
	@JoinColumn(name = "custid", insertable = true, updatable = true)
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "bookid", insertable = true, updatable = true)
	private Book book;
	
	private int saleprice;
	private Date orderdate;
}
