package com.sist.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sist.demo.vo.OrdersViewId;
import com.sist.demo.vo.View_ListOrders2;

public interface View_ListOrdersDAO2 extends JpaRepository<View_ListOrders2, OrdersViewId>{

}
