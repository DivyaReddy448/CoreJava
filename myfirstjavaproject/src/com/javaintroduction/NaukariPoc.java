package com.javaintroduction;

import java.util.Scanner;

public class NaukariPoc {

	public static void main(String[] args) {
		System.out.println("****Naukari Portal****");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter u r name:");
		String name = sc.nextLine();
		

		System.out.println("enter u r age:");
		
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("you can continue");
		}else {
			System.out.println("you are not eligible");
			return;
		}
		System.out.println("enter u r qualification:");
		sc.nextLine();
		String qualification = sc.nextLine();
		if(qualification.equalsIgnoreCase("B.Tech") || qualification.equalsIgnoreCase("degree")){
			System.out.println("you are eligible");
		}else {
			System.out.println("you are  not eligible");
			return;
		}
		System.out.println("Enter u r technical skills");
		System.out.println("enter u r skills");
		String skills=sc.nextLine();
		if(skills.equalsIgnoreCase("java") && skills.equalsIgnoreCase("mysql")) {
			System.out.println("Eligible for technical round");	
		}else {
			System.out.println("Improve your technical skills");
		}
		
		
		
	

		
		sc.close();

	}

}
