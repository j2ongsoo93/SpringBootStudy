package com.sist.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.demo.dao.View_ListOrdersDAO;
import com.sist.demo.vo.View_ListOrders;

import lombok.Setter;

@Service
@Setter
public class View_ListOrdersService {
	@Autowired
	private View_ListOrdersDAO dao;
	
	public List<View_ListOrders> findAll(){
		return dao.findAll();
	}
}








