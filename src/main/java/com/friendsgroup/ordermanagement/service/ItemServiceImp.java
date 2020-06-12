package com.friendsgroup.ordermanagement.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.model.request.ItemRequest;
import com.friendsgroup.ordermanagement.model.response.ItemRest;
import com.friendsgroup.ordermanagement.repository.ItemRepository;

@Service
public class ItemServiceImp implements ItemService {

	@Autowired
	ItemRepository itemrepository;

	@Override
	public void save(ItemRequest item) {

		ItemEntity entity = new ItemEntity();
		ItemRequest itemrequest = new ItemRequest();
		BeanUtils.copyProperties(item, entity);

		itemrepository.save(entity);

	}

	@Override
	public List<ItemEntity> allItems() {

		return (List<ItemEntity>) itemrepository.findAll();
	}

}
