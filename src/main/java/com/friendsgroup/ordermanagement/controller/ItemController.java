package com.friendsgroup.ordermanagement.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendsgroup.ordermanagement.dto.CustomerDto;
import com.friendsgroup.ordermanagement.dto.ItemDto;
import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.model.request.ItemRequest;
import com.friendsgroup.ordermanagement.model.response.ItemRest;
import com.friendsgroup.ordermanagement.service.ItemService;

@RestController
@RequestMapping("item")
public class ItemController {

	@Autowired
	ItemService itemservice;

	@PostMapping
	public ItemEntity insertItem(@RequestBody ItemRequest item) {

		ItemEntity itementity = new ItemEntity();

		BeanUtils.copyProperties(item, itementity);

		itemservice.save(item);
		return itementity;

	}

}
