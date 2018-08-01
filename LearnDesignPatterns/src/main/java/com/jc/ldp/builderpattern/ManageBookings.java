package com.jc.ldp.builderpattern;

public class ManageBookings {

	public static void main(String[] args) {
		BookingContext bc = new BookingContext("Manoj", BookingType.LIFETIME_MEMBER_GROUP);

		NotificationBuilder nb = new NotificationBuilder();
		nb.buildNotification(bc).Notify();
	}
   
}
