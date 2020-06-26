package com.friendsgroup.ordermanagement.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendsgroup.ordermanagement.dto.CustomerDto;
import com.friendsgroup.ordermanagement.model.request.CustomerDetailsRequest;
import com.friendsgroup.ordermanagement.model.response.CustomerRest;
import com.friendsgroup.ordermanagement.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping
	public CustomerRest createCustomer(@RequestBody CustomerDetailsRequest customerdetails) {

		CustomerRest returnvalue = new CustomerRest();

		CustomerDto dto = new CustomerDto();
		BeanUtils.copyProperties(customerdetails, dto);

	
		
		CustomerDto createcustomer = customerService.createCustomer(dto);
		BeanUtils.copyProperties(createcustomer, returnvalue);

		return returnvalue;

	}

}
