package com.friendsgroup.ordermanagement.model.request;

import java.io.Serializable;

public class ItemRequest   {


	private String itemname;
	private Long itemprice;
	private Long itemquantity;

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Long getItemprice() {
		return itemprice;
	}

	public void setItemprice(Long itemprice) {
		this.itemprice = itemprice;
	}

	public Long getItemquantity() {
		return itemquantity;
	}

	public void setItemquantity(Long itemquantity) {
		this.itemquantity = itemquantity;
	}

}
