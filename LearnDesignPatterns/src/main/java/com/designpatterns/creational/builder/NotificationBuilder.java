package com.designpatterns.creational.builder;

import java.util.ArrayList;

public class NotificationBuilder {
	

	public Notification buildNotification(BookingContext bc) {
		
		Notification notification = null;
		
		BookingType bt;
		bt = bc.getType();
		
        switch(bt) {
        
        case INDIVIDUAL:
        	notification = buildIndividualBooking(bc);
        	break;
        case COACHING_SESSION:
        	notification = buildCoachSessionBooking(bc);
        	break;
        case LIFETIME_MEMBER_GROUP:
        	notification = buildLifetimeMemberGroupBooking(bc);
        	break;

        	
        }
        
        return notification;
		
	}
	
	private Notification buildIndividualBooking(BookingContext bc) {
		Notification n = new Notification(bc);
		ArrayList<PersonalNotification> mList = new ArrayList<PersonalNotification>();
		mList.add(new SecurityNotification());
		mList.add(new MemberNotification());
		n.setPnList(mList);
		return n;
	}
	
	private Notification buildCoachSessionBooking(BookingContext bc) {
		Notification n = new Notification(bc);
		ArrayList<PersonalNotification> mList = new ArrayList<PersonalNotification>();
		mList.add(new SecurityNotification());
		mList.add(new MemberNotification());
		mList.add(new CoachNotification());
		n.setPnList(mList);
		return n;
	}

	
	private Notification buildLifetimeMemberGroupBooking(BookingContext bc) {
		Notification n = new Notification(bc);
		ArrayList<PersonalNotification> mList = new ArrayList<PersonalNotification>();
		mList.add(new SecurityNotification());
		mList.add(new MemberNotification());
		mList.add(new CoachNotification());
		mList.add(new ManagerNotification());
		n.setPnList(mList);
		return n;
	}


}
