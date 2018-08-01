package com.designpatterns.creational.builder;

import java.util.ArrayList;

public class Notification {

	private ArrayList<PersonalNotification> pnList;
	private BookingContext b;



	public Notification(BookingContext b) {
		this.b = b;
		pnList = new ArrayList<PersonalNotification>();
	}



	/**
	 * @return the pnList
	 */
	public ArrayList<PersonalNotification> getPnList() {
		return pnList;
	}



	/**
	 * @param pnList the pnList to set
	 */
	public void setPnList(ArrayList<PersonalNotification> pnList) {
		this.pnList = pnList;
	}



	public void Notify() {

		for(PersonalNotification m: this.pnList)
			m.sendNotification(this.b);

	}

}
