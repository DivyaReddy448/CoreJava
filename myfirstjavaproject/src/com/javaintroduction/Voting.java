package com.javaintroduction;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		boolean indianCitizen =false;
		boolean hasVoterId =false;
		
		if (age <= 0 || age <18) {
			System.out.println("Invalid age ");
		}
		if (age >=18) {
			System.out.println("valid age   to vote");
			System.out.println("are u  an indian Citizen....?:");
			indianCitizen=sc.nextBoolean();
			

		 if (indianCitizen == true) {
			
			System.out.println("do u  has VoterId ....?:");
			hasVoterId=sc.nextBoolean();
			if (hasVoterId == true) {
				System.out.println("eligible for vote");
				
			}else {
				System.out.println("voter id is required");
				}
		}
		 else {
				System.out.println("you are  not  indian citzen so eligible for vote");
			}
		}else {
			System.out.println("you are not eligible for vote");
		}

		 
		

	}

}
