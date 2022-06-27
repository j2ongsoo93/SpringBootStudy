package com.sist.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sist.demo.vo.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
