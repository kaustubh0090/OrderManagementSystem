package com.friendsgroup.ordermanagement.model.response;

public class OrderResponse {

	private long customerid;
	private long orderNo;
	private long totalamt;

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	public long getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(long totalamt) {
		this.totalamt = totalamt;
	}

}
