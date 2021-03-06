package com.friendsgroup.ordermanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "item")
public class ItemEntity implements Serializable {

	private static final long serialVersionUID = 4627494388903011325L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemid;

	@Column(nullable = false)
	private String itemname;

	@Column(nullable = false)
	private Long itemprice;

	@Column(nullable = false)
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
