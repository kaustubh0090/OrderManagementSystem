package com.friendsgroup.ordermanagement.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsgroup.ordermanagement.dto.CustomerDto;
import com.friendsgroup.ordermanagement.entity.CustomerEntity;
import com.friendsgroup.ordermanagement.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public CustomerDto createCustomer(CustomerDto customer) {

		if (customerRepository.findByEmail(customer.getEmail()) != null) {

			throw new RuntimeException("user already exist");
		}

		CustomerEntity custentity = new CustomerEntity();
		BeanUtils.copyProperties(customer, custentity);
		CustomerEntity storedCustomer = customerRepository.save(custentity);

		CustomerDto returnvalue = new CustomerDto();
		BeanUtils.copyProperties(storedCustomer, returnvalue);

		return returnvalue;
	}

}
