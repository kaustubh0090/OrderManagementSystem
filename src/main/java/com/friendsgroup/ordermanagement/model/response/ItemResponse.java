package com.friendsgroup.ordermanagement.model.response;

public class ItemResponse {

	private Long itemid;
	private String itemname;
	private Long itemprice;
	private Long itemquantity;

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

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
