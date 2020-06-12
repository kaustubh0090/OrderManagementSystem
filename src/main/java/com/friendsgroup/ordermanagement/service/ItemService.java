package com.friendsgroup.ordermanagement.service;

import java.util.List;

import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.model.request.ItemRequest;
import com.friendsgroup.ordermanagement.model.response.ItemRest;

public interface ItemService {

	public void save(ItemRequest item);

	public List<ItemEntity> allItems();

	

}
