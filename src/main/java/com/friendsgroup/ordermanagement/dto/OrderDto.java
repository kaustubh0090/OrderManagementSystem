package com.friendsgroup.ordermanagement.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class OrderDto implements Serializable {

	private static final long serialVersionUID = 925867130852579209L;

	private long orderid;

	private String OrderNo;

	private long customerid;

	private long totalamt;

	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	public String getOrderNo() {
		return OrderNo;
	}

	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}

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

}
