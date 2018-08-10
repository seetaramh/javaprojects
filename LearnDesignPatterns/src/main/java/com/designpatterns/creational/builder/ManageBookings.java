package com.designpatterns.creational.builder;

public class ManageBookings {

	public static void main(String[] args) {
		BookingContext bc = new BookingContext("Seetaram", BookingType.COACHING_SESSION);

		NotificationBuilder nb = new NotificationBuilder();
		nb.buildNotification(bc).Notify();
	}
   
}
