package com.gp.patterns.proxy;

public class Test {

	
	public static void main(String[] args){
		
		Customer customer=new CustomerProxyImpl();
		System.out.println("id ..."+customer.getId());
		System.out.println("customer is .."+customer.getOrders().size());
	}
}
