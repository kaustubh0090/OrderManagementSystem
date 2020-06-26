package com.friendsgroup.ordermanagement.service;

import java.util.List;

import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.model.request.ItemRequest;
import com.friendsgroup.ordermanagement.model.response.ItemResponse;

public interface ItemService {

	public ItemRequest createitem(ItemRequest item);

	public List<ItemEntity> allItems();

	public ItemRequest updateitem(Long itemid,ItemRequest itemrequest);

}
