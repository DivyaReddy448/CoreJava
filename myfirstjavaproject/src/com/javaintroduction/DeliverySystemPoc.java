package com.javaintroduction;

import java.util.Scanner;

public class DeliverySystemPoc {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String continuechoice;
		
		do {
		System.out.println("Delivery system");
		
		System.out.println("Is the customer available at the delivery location");
		
		String customer_available=sc.next();
		
		
		if(customer_available.equalsIgnoreCase("yes")) {
			System.out.println("Customer is available. Let's verify the address");
			System.out.println("Is the delivery address correct?");
			String address_correct=sc.next();
			
			
			if(address_correct.equalsIgnoreCase("yes")) {
				System.out.println("Address verified. Let's check the payment");
				
				System.out.println("Is the payment completed?");
				String payment_completed=sc.next();
				if(payment_completed.equalsIgnoreCase("yes")) {
					System.out.println("Payment verified. Let's verify otp.");
					
					System.out.println("Enter the delivery OTP");
					int enteredOTP=sc.nextInt();
					if(enteredOTP == 1234) {
						System.out.println("OTP verified. Parcel delivered successfully!");
					}
					else {
						System.out.println("Invalid OTP. Delivery failed");
					}
				}else {
					System.out.println("Payment is pending. Delivery cannot proceed.");
				}
				
			}else {
				System.out.println("Address mismatch. Delivery cannot proceed");
			}
		}else {
			System.out.println("Customer is unavailable. Delivery postponed");
		}
		System.out.println("Do you want to continue?(y/n):");
		continuechoice = sc.next();
		
		
		

	}
		while(continuechoice.equalsIgnoreCase("y"));
		

}
}
	
		
		
		
		


