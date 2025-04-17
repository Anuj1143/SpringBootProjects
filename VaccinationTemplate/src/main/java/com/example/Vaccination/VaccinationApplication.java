package com.example.Vaccination;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {
    	
    	
    	
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Scanner sc=new Scanner(System.in);
    	boolean continueBooking=true;
    	while(continueBooking) {
    		System.out.println("Welcome to the Vaccination Application");
    		System.out.println("Please choose your vaccination preference \n 1 Covid \n2 Polio \n3 Typhoid");
    		int choiceVaccine=sc.nextInt();
    		String vaccineChoice="";
    		switch(choiceVaccine) {
    		case 1:
    			vaccineChoice="Covid";
    			break;
    		case 2:
    			vaccineChoice="Polio";
    			break;
    		case 3:
    			vaccineChoice="Typhoid";
    			break;
    			
    		}
    		
    		System.out.println("Whome you want to Vaccinate \n1 Father \n2 Mother \n3 Self \n4 Spouse \n5 Exit ");
    		
    		int choiceWhome=sc.nextInt();
    		String whomeChoiceWithVac="";
    		String nameOfPetients="";
    		
    		switch(choiceWhome) {
    		case 1:
    			nameOfPetients="Father";
    			if(vaccineChoice.equals("covid")) whomeChoiceWithVac="fatherCovid";
    			else if(vaccineChoice.equals("polio")) whomeChoiceWithVac="fatherPolio";
    			else if(vaccineChoice.equals("typhoid")) whomeChoiceWithVac="fatherTyphoid";
    			break;
    		case 2:
    			nameOfPetients="Mother";
    			if(vaccineChoice.equals("covid")) whomeChoiceWithVac="motherCovid";
    			else if(vaccineChoice.equals("polio")) whomeChoiceWithVac="motherPolio";
    			else if(vaccineChoice.equals("typhoid")) whomeChoiceWithVac="motherTyphoid";
    			break;
    		case 3:
    			
    			nameOfPetients="Self";
    			if(vaccineChoice.equals("covid")) whomeChoiceWithVac="selfCovid";
    			else if(vaccineChoice.equals("polio")) whomeChoiceWithVac="selfPolio";
    			else if(vaccineChoice.equals("typhoid"))whomeChoiceWithVac="selfTyphoid";
    			break;
    		case 4:
    			nameOfPetients="Spouse";
    			if(vaccineChoice.equals("covid")) whomeChoiceWithVac="spouseCovid";
    			else if(vaccineChoice.equals("polio")) whomeChoiceWithVac="spousePolio";
    			else if(vaccineChoice.equals("typhoid")) whomeChoiceWithVac="spouseTyphoid";
    			break;
    		case 5:
    			
    			break;
    		}
    		User user= context.getBean(whomeChoiceWithVac, User.class);
    		if(user.IsVaccinated()) {
    			System.out.println("User is Already Vaccinated");
    			
    		}
    		else {
    			System.out.println("Please enter "+nameOfPetients+"details");
    			System.out.println("Name:");
    			sc.nextLine();
    			String nameDetails=sc.nextLine();
    			System.out.println("Age:");
    			int ageDetails=sc.nextInt();
    			sc.nextLine();
    			System.out.println("Appointment date DD:MM:YYYY");
    			String dateDetails=sc.nextLine();
    			System.out.println("Appointment Time (HH:MM AM/PM)");
    			String timeDetails=sc.nextLine();
    			System.out.println("LocationDetails");
    			String locationDetails=sc.nextLine();
    			
    			
    		
    		TimeAndLocation timeAndLocation=context.getBean("timeAndLocation",TimeAndLocation.class);
    		timeAndLocation.setDetails(timeDetails,  locationDetails, dateDetails);
    		user.setUserDetails(nameDetails, ageDetails, timeAndLocation);
    		user.setAppointment();
    		
    		}
    			System.out.println("Do you want to register for someone else \n1 Yes \n2 No");
    			int restartChoice= sc.nextInt();
    			continueBooking=(restartChoice==1);
    		
    		
    	}

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */

    }
}