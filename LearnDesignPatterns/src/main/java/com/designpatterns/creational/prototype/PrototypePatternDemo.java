package com.designpatterns.creational.prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) {

		CarDeliveryHandler cardelivery = new CarDeliveryHandler();
		CustomerHandler customerHandler = new CustomerHandler();
		CarCache.loadCache();
		String custId = "pr123";
	    String carModel = "BALENO";
		Customer cs = customerHandler.getCustomer(custId);
		System.out.println("---------------------------------------------");
		System.out.println("Car delivered for the customer:");
		System.out.println("Name: "+cs.getFirstName()+"  "+cs.getLastName());
		System.out.println("Car Model: Maruti Baleno");
		cardelivery.addDeliveredCar(customerHandler.getCustomer(custId), (Car)CarCache.getCar(carModel).clone());
		
	}

}
