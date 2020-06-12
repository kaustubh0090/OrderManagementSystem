package com.friendsgroup.ordermanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "item")
public class ItemEntity implements Serializable {

	private static final long serialVersionUID = 4627494388903011325L;

	@Id
	@GeneratedValue
	private long itemid;

	@Column(nullable = false)
	private String itemname;

	@Column(nullable = false)
	private long itemprice;

	public long getItemid() {
		return itemid;
	}

	public void setItemid(long itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public long getItemprice() {
		return itemprice;
	}

	public void setItemprice(long itemprice) {
		this.itemprice = itemprice;
	}

}
