package com.friendsgroup.ordermanagement.controller;

import java.util.List;

import org.apache.tomcat.util.http.fileupload.MultipartStream.ItemInputStream;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendsgroup.ordermanagement.dto.CustomerDto;
import com.friendsgroup.ordermanagement.dto.ItemDto;
import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.model.request.ItemRequest;
import com.friendsgroup.ordermanagement.model.response.ItemResponse;
import com.friendsgroup.ordermanagement.service.ItemService;

@RestController
@RequestMapping("item")
public class ItemController {

	@Autowired
	ItemService itemservice;

	@PostMapping
	public ItemResponse insertItem(@RequestBody ItemRequest item) {

		ItemResponse returnvalue = new ItemResponse();

		ItemRequest itemreq = itemservice.createitem(item);

		BeanUtils.copyProperties(itemreq, returnvalue);

		return returnvalue;

	}

	@GetMapping("/allitems")
	public List<ItemEntity> getAllItems() {

		return itemservice.allItems();
	}

	@PutMapping(path = "/{id}")
	public ItemResponse updateItemList(@PathVariable Long id, @RequestBody ItemRequest item) {

		ItemResponse returnvalue = new ItemResponse();

		ItemRequest itemreq = itemservice.updateitem(id, item);

		BeanUtils.copyProperties(itemreq, returnvalue);

		return returnvalue;
	}

}
