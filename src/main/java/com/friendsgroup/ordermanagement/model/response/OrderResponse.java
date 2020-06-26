package com.friendsgroup.ordermanagement.model.response;

public class OrderResponse {

	private Long customerid;
	private String orderNo;
	private Long totalamt;

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(Long totalamt) {
		this.totalamt = totalamt;
	}

}
