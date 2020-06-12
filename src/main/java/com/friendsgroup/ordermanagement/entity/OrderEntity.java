package com.friendsgroup.ordermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderEntity {

	@Id
	@GeneratedValue
	private long orderid;

	@Column
	private String OrderNo;

	@Column
	private long customerid;

	@Column
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
