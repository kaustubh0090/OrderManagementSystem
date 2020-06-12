package com.friendsgroup.ordermanagement.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendsgroup.ordermanagement.dto.OrderDto;
import com.friendsgroup.ordermanagement.model.request.OrderRequest;
import com.friendsgroup.ordermanagement.model.response.OrderResponse;
import com.friendsgroup.ordermanagement.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderService orderservice;

	@PostMapping
	public OrderResponse putOrder(@RequestBody OrderRequest orderreqest) {

		OrderResponse orderresponse = new OrderResponse();

		OrderDto orderdto = new OrderDto();
		BeanUtils.copyProperties(orderreqest, orderdto);

		OrderDto dtoorder = orderservice.createOrder(orderdto);
		BeanUtils.copyProperties(dtoorder, orderresponse);

		return orderresponse;
	}

}
