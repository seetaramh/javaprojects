package com.jdp.creational.builderpattern;

public class CoachNotification extends PersonalNotification {

	@Override
	public void sendNotification(BookingContext b) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("SMS notification was sent to coach of "+b.getName());
		System.out.println("Email notification was sent to coach of "+b.getName());
		System.out.println("------------------------------------------------------------------");

	}

}
