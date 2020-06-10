package com.friendsgroup.ordermanagement.service;

import org.springframework.stereotype.Service;

import com.friendsgroup.ordermanagement.dto.CustomerDto;
import com.friendsgroup.ordermanagement.model.response.CustomerRest;


public interface CustomerService {

	CustomerDto createCustomer(CustomerDto customer);
	

	

	

}
