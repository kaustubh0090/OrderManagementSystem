package com.friendsgroup.ordermanagement.service;

import com.friendsgroup.ordermanagement.dto.OrderDto;
import com.friendsgroup.ordermanagement.model.request.OrderRequest;
import com.friendsgroup.ordermanagement.model.response.OrderResponse;

public interface OrderService {

	OrderDto createOrder(OrderDto orderdto);

	OrderDto updateorder(Long orderid,OrderDto orderdto);

}
