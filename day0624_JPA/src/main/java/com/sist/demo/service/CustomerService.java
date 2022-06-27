package com.sist.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sist.demo.dao.CustomerDAO;
import com.sist.demo.vo.Customer;

import lombok.Setter;

@Service
@Setter
public class CustomerService {
	@Autowired
	private CustomerDAO dao;
	
	public java.util.List<Customer> listCustomer(){
		return dao.findAll();
	}
	public void saveCustomer(Customer c) {
		dao.save(c);
	}
	@SuppressWarnings("deprecation")
	public Customer detailCustomer(int custid) {
		return dao.getOne(custid);
	}
	public void deleteCustomer(int custid) {
		dao.deleteById(custid);
	}
}
