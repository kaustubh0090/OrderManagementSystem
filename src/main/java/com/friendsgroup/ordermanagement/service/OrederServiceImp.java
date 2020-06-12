package com.friendsgroup.ordermanagement.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsgroup.ordermanagement.dto.OrderDto;
import com.friendsgroup.ordermanagement.dto.Utils;
import com.friendsgroup.ordermanagement.entity.CustomerEntity;
import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.entity.OrderEntity;
import com.friendsgroup.ordermanagement.entity.OrderItemMapEntity;
import com.friendsgroup.ordermanagement.model.request.OrderRequest;
import com.friendsgroup.ordermanagement.model.response.OrderResponse;
import com.friendsgroup.ordermanagement.repository.OrderItemMapRepository;
import com.friendsgroup.ordermanagement.repository.OrderRepository;

import ch.qos.logback.classic.pattern.Util;

@Service
public class OrederServiceImp implements OrderService {

	@Autowired
	OrderRepository orderrepository;

	@Autowired
	OrderItemMapRepository orderitem;

	@Autowired
	Utils util;

	@Override
	public OrderDto createOrder(OrderDto orderdto) {

		ItemEntity item = new ItemEntity();
		OrderEntity orderentity = new OrderEntity();
		OrderItemMapEntity orderItemMapEntity = new OrderItemMapEntity();

		orderentity.setOrderNo(util.generateOrderNo(30));

		BeanUtils.copyProperties(orderdto, orderentity);

		OrderEntity storedOrderEntity = orderrepository.save(orderentity);

		OrderDto returnvalue = new OrderDto();
		BeanUtils.copyProperties(storedOrderEntity, returnvalue);

		return returnvalue;
	}

}
