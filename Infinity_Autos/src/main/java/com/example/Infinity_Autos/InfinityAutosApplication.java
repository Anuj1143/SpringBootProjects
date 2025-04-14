package com.example.Infinity_Autos;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InfinityAutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfinityAutosApplication.class, args);
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter the car type(normal/sports/truck)");
		String CarType=sc.nextLine();
		Car car=null;
		if(CarType.equalsIgnoreCase("normal")) {
			car=(Car)context.getBean("normalCar");
			
		}
		else if(CarType.equalsIgnoreCase("sportscar")) {
			car=(Car)context.getBean("sportsCar");
		}
		else if(CarType.equalsIgnoreCase("truck")) {
			car=(Car)context.getBean("truck");
		}
		else {
			System.out.println("Invalid Choice");
			System.exit(0);
		}
		System.out.println("Enter owners name");
		String Owner=sc.nextLine();
		car.setOwnerName(Owner);
		System.out.println(car.getInfo());
		*/
		
		System.out.println("Please Enter your name");
		String name=sc.nextLine();
		System.out.println("Please select your car choice");
		System.out.println("1) Normal Car\n 2) Sport Car\n 3) Truck");
		int type=sc.nextInt();
		Car car=null;
		switch(type) {
		case 1:
		{
			System.out.println("Please Enter Tyre Type");
			System.out.println("1) Normal Tyee \n 2) Sprorts Tyre");
			int tyreType=sc.nextInt();
			switch(tyreType) {
			case 1:{
				car=(Car)context.getBean("normalCarNormalTyres");
				break;
			}
			case 2:{
				car=(Car)context.getBean("normalCarSportsTyres");
				break;
			}
			default:
				System.out.println("Invalid Choice");
			}
			
				
			//car=(Car)context.getBean("normalCar");
			//break;
		}
		case 2:{
				System.out.println("Please Enter Tyre Types");
				System.out.println("1) Normal Tyre \n2) Sports Tyres");
				int tyreType=sc.nextInt();
				switch(tyreType) {
				case 1:{
					car=(Car)context.getBean("sportsCarNormalTyres");
					break;
				}
				case 2:{
					car=(Car)context.getBean("sportsCarSportsTyres");
					break;
				}
				default:
					System.out.println("Invalid Choice");
				}
			
			
			//car=(Car)context.getBean("sportsCar");
			//break;
		}
		case 3:{
			car=(Car)context.getBean("truck");
			break;
		}
		default:
			System.out.println("Invalid Choice");
		
		}
		car.setOwnerName(name);
		System.out.println(car.getOwnerName()+ " Owns " +car.getInfo());
	}

}
