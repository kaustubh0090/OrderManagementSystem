package com.friendsgroup.ordermanagement.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendsgroup.ordermanagement.dto.OrderDto;
import com.friendsgroup.ordermanagement.model.request.OrderRequest;
import com.friendsgroup.ordermanagement.model.response.OrderResponse;
import com.friendsgroup.ordermanagement.repository.OrderRepository;
import com.friendsgroup.ordermanagement.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderService orderservice;

	@PostMapping
	public OrderResponse putOrder(@RequestBody OrderDto orderdto) {

		OrderDto orderdtoserv = orderservice.createOrder(orderdto);
		OrderResponse orderresponse = new OrderResponse();
		BeanUtils.copyProperties(orderdtoserv, orderresponse);

		return orderresponse;
	}
	
	@PutMapping(path = "/{orderid}")
	public OrderResponse updateOrder(@PathVariable Long orderid,@RequestBody OrderDto orderdto) {

		OrderDto orderdtoserv = orderservice.updateorder(orderid,orderdto);
		OrderResponse orderresponse = new OrderResponse();
		BeanUtils.copyProperties(orderdtoserv, orderresponse);

		return orderresponse;
	}
	
	
	

}
