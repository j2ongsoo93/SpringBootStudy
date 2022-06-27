package com.sist.demo.vo;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "view_listorders")
public class View_ListOrders2 implements Serializable{
	@EmbeddedId
	private OrdersViewId id;
	
	private String orderdate;
	private int saleprice;
	private int price;
}




