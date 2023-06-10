package com.sample.many_to._many.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.many_to._many.entity.Customer;
import com.sample.many_to._many.repository.Customer_Repository;
import com.sample.many_to._many.repository.Product_Repository;

 @Service
public class CustomerProduct_Service {
	
	@Autowired
	private Customer_Repository customer_Repository;
	
	@Autowired
	private Product_Repository product_Repository;
	
	

	public CustomerProduct_Service(Customer_Repository customer_Repository, Product_Repository product_Repository) {
		super();
		this.customer_Repository = customer_Repository;
		this.product_Repository = product_Repository;
	}

	public Customer saveCustomer( Customer request) {
		return customer_Repository.save(request);
	}

	public List<Customer> getCustomer() {
		return customer_Repository.findAll();
	}
	
}
