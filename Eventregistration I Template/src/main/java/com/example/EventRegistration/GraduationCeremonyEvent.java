package com.example.EventRegistration;

import java.util.ArrayList;
import java.util.List;

public class GraduationCeremonyEvent implements CollegeEvent{
	
	
	private String name="Graduation Ceremony";
	public String getName() {
		return this.name;
	}

	private String address;
	public void setAddress(String address) {
		this.address = address;
	}

	private String time;
	public void setTime(String time) {
		this.time = time;
	}

	private String date;
	public void setDate(String date) {
		this.date = date;
	}

	private int count=0;
	
	
	Attendee attendee;
	List<Attendee> eventAttendees;
	
	public GraduationCeremonyEvent() {
		this.eventAttendees=new ArrayList<Attendee>();
	}
	
	@Override
	public void registerStudent(Attendee user) {
		count++;
		this.eventAttendees.add(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Attendee> getAllAttendees() {
		// TODO Auto-generated method stub
		return this.eventAttendees;
	}

	@Override
	public void printEventDetails() {
		// TODO Auto-generated method stub
		System.out.println("The Graduation Ceremony details are follows "+"\n vanue: Auditorium \n time :10AM \n Date: 17 May 2025");
		
	}

	@Override
	public int getAttendeeCount() {
		// TODO Auto-generated method stub
		return this.count;
	}

	@Override
	public void setAttendee(Attendee attendee) {
		// TODO Auto-generated method stub
		eventAttendees.add(attendee);
		
	}

    /*
    1. Create the following attributes:
        a. name (initialize it as "Graduation Ceremony".
        b. address (String)
        c. time (String)
        d. date (String)
        e. count (int) (initially 0)
        f. eventAttendees (List of Attendee)
        NOTE: Initialize the address, time and date attributes with some values.
    2. Inject Attendee with attribute name "attendee" with setter injection.
    3. Make this class an implementation of CollegeEvent interface and override the interface methods.
    */

}
