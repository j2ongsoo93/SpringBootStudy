package com.sist.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sist.demo.vo.View_ListOrders;

public interface View_ListOrdersDAO extends JpaRepository<View_ListOrders, Integer> {
}
