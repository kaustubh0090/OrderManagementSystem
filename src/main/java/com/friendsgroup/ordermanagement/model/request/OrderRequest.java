package com.friendsgroup.ordermanagement.model.request;

import java.util.List;

import com.friendsgroup.ordermanagement.entity.ItemEntity;

public class OrderRequest {

	private long customerid;
	private long totalamt;
	private List<ItemEntity> itementity;

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public long getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(long totalamt) {
		this.totalamt = totalamt;
	}

	public List<ItemEntity> getItementity() {
		return itementity;
	}

	public void setItementity(List<ItemEntity> itementity) {
		this.itementity = itementity;
	}

}
