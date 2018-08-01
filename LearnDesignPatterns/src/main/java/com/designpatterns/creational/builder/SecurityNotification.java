package com.designpatterns.creational.builder;

public class SecurityNotification extends PersonalNotification {

	@Override
	public void sendNotification(BookingContext b) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("SMS notification was sent to security");
		System.out.println("------------------------------------------------------------------");

	}

}
