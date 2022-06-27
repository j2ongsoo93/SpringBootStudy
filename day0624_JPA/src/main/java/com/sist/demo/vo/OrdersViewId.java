package com.sist.demo.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersViewId implements Serializable{
	@Column(name="name")
	private String name;
	
	@Column(name="bookname")
	private String booknamme;
	
}
