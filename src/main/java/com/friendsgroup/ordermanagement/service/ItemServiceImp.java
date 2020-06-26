package com.friendsgroup.ordermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.model.request.ItemRequest;
import com.friendsgroup.ordermanagement.model.response.ItemResponse;
import com.friendsgroup.ordermanagement.repository.ItemRepository;

@Service
public class ItemServiceImp implements ItemService {

	@Autowired
	ItemRepository itemrepository;

	@Override
	public ItemRequest createitem(ItemRequest item) {

		ItemEntity entity = new ItemEntity();
		BeanUtils.copyProperties(item, entity);
		ItemEntity storeditem = itemrepository.save(entity);

		ItemRequest returnvalue = new ItemRequest();
		BeanUtils.copyProperties(storeditem, returnvalue);

		return returnvalue;

	}

	@Override
	public List<ItemEntity> allItems() {

		return (List<ItemEntity>) itemrepository.findAll();
	}

	@Override
	public ItemRequest updateitem(Long itemid, ItemRequest itemrequest) {

		ItemEntity itementity = itemrepository.findByItemid(itemid);

		BeanUtils.copyProperties(itemrequest, itementity);

		if (itementity == null)

			throw new RuntimeException("user not found");

		ItemEntity updateditem = itemrepository.save(itementity);

		ItemRequest returnvalue = new ItemRequest();
		BeanUtils.copyProperties(updateditem, returnvalue);

		return returnvalue;
	}

}
