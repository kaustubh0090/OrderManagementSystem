package com.friendsgroup.ordermanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.friendsgroup.ordermanagement.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity,Long> {

	CustomerEntity findByEmail(String email);


	
	
}
