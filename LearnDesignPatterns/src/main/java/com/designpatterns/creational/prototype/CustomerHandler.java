package com.designpatterns.creational.prototype;

import java.util.HashMap;

public class CustomerHandler {
	
	HashMap<String,Customer>customersMap;
	
	public CustomerHandler() {
		customersMap = new HashMap<String,Customer>();
		loadcustomers();
	}
	
	public void addCustomer(Customer customer) {
		this.customersMap.put(customer.getCustomerId(), customer);
	}
	
	public Customer getCustomer(String customerId) {
		return this.customersMap.get(customerId);
	}
	
	public HashMap<String,Customer> getAllCustomers(){
		return this.customersMap;
	}
	
	private void loadcustomers() {
		Customer pradeep = new Customer("pr123","Pradeep", "Rao");
		addCustomer(pradeep);
		Customer seetaram = new Customer("sh123","Seetaram", "Hegde");
		addCustomer(seetaram);
		Customer viru = new Customer("vp123","Virendra", "Patil");
		addCustomer(viru);
		Customer manu = new Customer("mg123","Manu", "George");
		addCustomer(manu);
		Customer raeez = new Customer("mr123","Mohammed", "Raeez");
		addCustomer(raeez);
		
	}
	

}
