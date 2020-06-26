package com.friendsgroup.ordermanagement.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsgroup.ordermanagement.dto.OrderDto;
import com.friendsgroup.ordermanagement.dto.Utils;
import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.entity.OrderEntity;
import com.friendsgroup.ordermanagement.entity.OrderItemMapEntity;
import com.friendsgroup.ordermanagement.model.request.OrderRequest;
import com.friendsgroup.ordermanagement.repository.OrderItemMapRepository;
import com.friendsgroup.ordermanagement.repository.OrderRepository;

@Service
public class OrderServiceImp implements OrderService {

	@Autowired
	OrderRepository orderrepository;

	@Autowired
	OrderItemMapRepository orderitem;

	@Autowired
	Utils util;

	@Override
	public OrderDto createOrder(OrderDto orderdto) {

		OrderRequest orderrequest=new OrderRequest();
		ItemEntity itementity=new ItemEntity();
		
		OrderEntity orderentity = new OrderEntity();
		orderentity.setOrderNo(util.generateOrderNo(30));

		BeanUtils.copyProperties(orderdto, orderentity);

		
		
		
		OrderEntity storedOrderEntity = orderrepository.save(orderentity);

		OrderItemMapEntity orderItemMapEntity = new OrderItemMapEntity();
		List<OrderItemMapEntity> listitem = orderdto.getListitem();

		if(orderItemMapEntity.getQuantity()>itementity.getItemquantity())
			throw new RuntimeException("thequantity is more than available quantity ");
		
		listitem.forEach(item -> {
			item.setOrderid(storedOrderEntity.getOrderid());
			
			
			
			
			orderitem.save(item);

		});

		OrderDto returnvalue = new OrderDto();
		BeanUtils.copyProperties(storedOrderEntity, returnvalue);

		return returnvalue;
	}

	@Override
	public OrderDto updateorder(Long orderid, OrderDto orderdto) {

		OrderEntity orderentity = new OrderEntity();
		//orderentity.setOrderNo(util.generateOrderNo(30));

		BeanUtils.copyProperties(orderdto, orderentity);

		OrderEntity storedOrderEntity = orderrepository.save(orderentity);

		//OrderItemMapEntity orderItemMapEntity = new OrderItemMapEntity();
		List<OrderItemMapEntity> listitem = orderdto.getListitem();

		listitem.forEach(item -> {
			item.setOrderid(storedOrderEntity.getOrderid());
			orderitem.save(item);

		});

		OrderDto returnvalue = new OrderDto();
		BeanUtils.copyProperties(storedOrderEntity, returnvalue);

		return returnvalue;
	}

}
