package com.sist.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.demo.dao.View_ListOrdersDAO2;
import com.sist.demo.vo.View_ListOrders2;

import lombok.Setter;

@Service
@Setter
public class View_ListOrdersService2 {
	@Autowired
	private View_ListOrdersDAO2 dao;
	
	public List<View_ListOrders2> findAll(){
		return dao.findAll();
	}
}








