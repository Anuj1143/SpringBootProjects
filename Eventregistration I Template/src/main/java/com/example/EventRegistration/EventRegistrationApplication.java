package com.example.EventRegistration;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		// Import scanner and take ClassPathXmlApplicationContext.

		System.out.println("Welcome to the Graduation Ceremony Registration Application");
		// Take the college event bean from the application context.
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome to Graduation Ceremony Registration Application");
		
		CollegeEvent event =context.getBean("event", CollegeEvent.class) ;
		// Print the event details.

		while (true) {
			System.out.println("Do you want to register for the ceremony\n1. Yes\n2. No");
			int input = scanner.nextInt();
			if (input == 1) {
				StudentAttendee studentAttendee=context.getBean("student", StudentAttendee.class);
				scanner.nextLine();
				System.out.println("Please Enter Your Name");
				String name=scanner.nextLine();
				System.out.println("Please enter your department");
				String department=scanner.nextLine();
				System.out.println("In which year did you pass out");
				int year=scanner.nextInt();
				studentAttendee.setAttendeeDetails(name, department, year);
				event.registerStudent(studentAttendee);
				studentAttendee.printRegistrationConfirmation();
				/*
				 1. Take attendee details from the console.
				 2. Get studentAttendee bean from context and set the attendee details
				 3. Register the attendee for the event.
				 4. Print the registration confirmation.
				 */

			} else if(input == 2) {
				
				
				break;
			} else {
				System.out.println("Invalid Choice");
				
			}
		}

		// Get the number of attendees and print along with the statement below
		System.out.println("No. of attendees registered are: "+ event.getAttendeeCount());
		System.out.println("The list of attendees are:");
		
		for(int i=0; i<event.getAttendeeCount(); i++) {
		Attendee attendee =event.getAllAttendees().get(i);
		System.out.println(attendee.getAttendeeName()+"Reference Id "+attendee.hashCode());
		// Print all the attendee names with their reference ids as given in the sample output..
		}
		context.close();
		scanner.close();
	}

}
