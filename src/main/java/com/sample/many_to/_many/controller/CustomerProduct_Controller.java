package com.sample.many_to._many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.many_to._many.entity.Customer;
import com.sample.many_to._many.service.CustomerProduct_Service;
@RestController
@RequestMapping("/manytomany")
public class CustomerProduct_Controller {
		@Autowired
		private CustomerProduct_Service customerProduct_Service;
		
		@PostMapping("/post")
		public Customer createCustomer(@RequestBody Customer request) {
			return customerProduct_Service.saveCustomer(request);
		}
		@GetMapping("/get")
		public List <Customer> getCustomer(){
			return customerProduct_Service.getCustomer();
		}
		
}
