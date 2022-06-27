package com.sist.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sist.demo.vo.Orders;

public interface OrdersDAO extends JpaRepository<Orders, Integer> {
	@Query("select nvl(max(orderid),0)+1 from Orders")
	public int getNextNO();
	
	@Modifying
	@Query(value = "insert into Orders o(o.orderid, o.custid, o.bookid, o.saleprice, o.orderdate) "
			+ "values (:#{#o.orderid}, :#{#o.customer.custid}, :#{#o.book.bookid}, :#{#o.saleprice}, sysdate)", nativeQuery = true)
	@Transactional
	public void insert(@Param("o") Orders o);
	
	public List<Orders> findAllByOrderByOrderid(); 
}
