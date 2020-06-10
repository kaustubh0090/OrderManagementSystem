package com.friendsgroup.ordermanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.model.request.ItemRequest;

@Repository
public interface ItemRepository extends CrudRepository<ItemEntity, Long> {

}
