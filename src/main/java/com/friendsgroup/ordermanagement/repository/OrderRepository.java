package com.friendsgroup.ordermanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.friendsgroup.ordermanagement.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {

}
