package com.designpatterns.creational.prototype;

import java.util.HashMap;

public class CarDeliveryHandler {
	
	private HashMap<String,Car> carDeliveryMap = new HashMap<String,Car>();
	
	public void addDeliveredCar(Customer customer, Car car) {
		this.carDeliveryMap.put(customer.getCustomerId(), car);
	}
	
	public HashMap<String,Car> getAllCarDeliveryDetails(){
		return this.carDeliveryMap;
	}

}
