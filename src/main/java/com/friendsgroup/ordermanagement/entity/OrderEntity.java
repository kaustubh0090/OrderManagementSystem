package com.friendsgroup.ordermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity

public class OrderEntity {

	@Id
	@GeneratedValue
	private Long orderid;

	@Column
	private String orderNo;

	@Column
	private Long customerid;

	@Column
	private Long totalamt;

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public Long getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(Long totalamt) {
		this.totalamt = totalamt;
	}

}
