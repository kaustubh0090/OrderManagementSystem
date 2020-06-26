package com.friendsgroup.ordermanagement.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.friendsgroup.ordermanagement.entity.ItemEntity;
import com.friendsgroup.ordermanagement.entity.OrderItemMapEntity;

public class OrderDto implements Serializable {

	private static final long serialVersionUID = 925867130852579209L;

	private Long orderid;

	private String OrderNo;

	private Long customerid;

	private Long totalamt;

	private List<OrderItemMapEntity> listitem;

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public String getOrderNo() {
		return OrderNo;
	}

	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
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

	public List<OrderItemMapEntity> getListitem() {
		return listitem;
	}

	public void setListitem(List<OrderItemMapEntity> listitem) {
		this.listitem = listitem;
	}

}
