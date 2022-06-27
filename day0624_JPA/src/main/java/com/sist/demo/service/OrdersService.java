package com.sist.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.demo.dao.OrdersDAO;
import com.sist.demo.vo.Orders;

import lombok.Setter;

@Service
@Setter
public class OrdersService {
	@Autowired
	private OrdersDAO dao;
	
	public int getNextNo() {
		return dao.getNextNO();
	}
	
	public void insert(Orders o) {
		dao.insert(o);
	}
	
	public List<Orders> findAll(){
		return dao.findAllByOrderByOrderid();
	}
	@SuppressWarnings("deprecation")
	public Orders detailOrders(int orderid) {
		return dao.getOne(orderid);
	}
}
