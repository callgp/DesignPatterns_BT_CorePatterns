package com.gp.patterns.proxy;

import java.util.List;

public class CustomerImpl2 implements Customer {
	private int id;
	private List<Order> orders;
	
	
	CustomerImpl2(){
		this.id=123;
	}

	@Override
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Override
	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	/*//@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	//@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}*/

}
