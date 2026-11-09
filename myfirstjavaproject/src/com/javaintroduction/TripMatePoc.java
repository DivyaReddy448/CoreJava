package com.javaintroduction;

import java.util.Scanner;

public class TripMatePoc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String categoryContinuYesOrNo="";
		
		double total_price=0;
		
		
		
		do {
			    System.out.println("Enter category:");
			    String category = sc.next();
				
				switch(category) {
				case "transport"->{
				String transportServiceYesOrNo="";
				double transport_price=0;
				
				do {
					System.out.println("Enter transport mode:");
					String transport_mode = sc.next();
					switch(transport_mode) {
					case "b"->{
						System.out.println("Bus charge is 1000 ");
						double BusPrice=1000;
						transport_price+=BusPrice;
					}
					case "t"->{
						System.out.println("Train charge is 850");
						double TrainPrice=850;
						transport_price+=TrainPrice;
					
					}
					case "f"->{
						System.out.println("Flight charge is 3000");
						double FlightPrice=3000;
						transport_price+=FlightPrice;
					}
					default->System.out.println("Enterd service is unavailable...Thank you for u r cooperation");
			
					
					}
					System.out.println("Do u want to continue?enter Y for yes N for no");
					transportServiceYesOrNo=sc.next();
				}while(transportServiceYesOrNo.equalsIgnoreCase("y"));
				
				System.out.println("Total transport price is:" + transport_price);
				total_price += transport_price;
				
				
				
				
		}
				case "acc"->{
					String accommodationContinueYesOrNo="";
					double accommodationPrice=0;
					do {
						System.out.println("Enter Accommodation Type:");
						String accommodationType=sc.next();
						switch(accommodationType){
						case "bd"->{
							System.out.println("Budget friendly room  price is 1000:");
							double bdPrice=1000;
							accommodationPrice+=bdPrice;
							
						}
						case "sc"->{
							System.out.println("Standard room pirce is 2000");
							double scPrice=2000;
							accommodationPrice+=scPrice;
							
						}
						case "lr"->{
							System.out.println("Luxury room price is 4000");
							double lrPrice=4000;
							accommodationPrice+=lrPrice;
							
						}
						case "r"->{
							System.out.println("Resort price is 10000");
							double rPrice= 10000;
							accommodationPrice+=rPrice;
							
						}
						default->System.out.println("entered wrong choice....");
						}
						System.out.println("Do u want to continue..? enter  Y for yes N for no ");
						accommodationContinueYesOrNo=sc.next();
						
					}while(accommodationContinueYesOrNo.equalsIgnoreCase("y"));
					
					
					System.out.println("total accommodation price is: "+ accommodationPrice);
					total_price+=accommodationPrice;
					
				}
		}
				System.out.println("Do u want to continur with category....? enter Y for Yes N for No");
				categoryContinuYesOrNo=sc.next();
				

	}while(categoryContinuYesOrNo.equalsIgnoreCase("y"));
	System.out.println("Total price is:"+total_price);
	sc.close();

}
}
