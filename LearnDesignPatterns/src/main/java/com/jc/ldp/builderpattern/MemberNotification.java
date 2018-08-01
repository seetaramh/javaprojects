package com.jc.ldp.builderpattern;

public class MemberNotification extends PersonalNotification {

	@Override
	public void sendNotification(BookingContext b) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("SMS notification was sent to individual member "+b.getName());
		System.out.println("Email notification was sent to individual member "+b.getName());
		System.out.println("------------------------------------------------------------------");

	}

}
