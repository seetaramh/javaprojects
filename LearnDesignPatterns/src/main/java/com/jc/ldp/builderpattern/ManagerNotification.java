package com.jc.ldp.builderpattern;

public class ManagerNotification extends PersonalNotification {

	@Override
	public void sendNotification(BookingContext b) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Email notification was sent to facility manager ");
		System.out.println("------------------------------------------------------------------");
	}

}
