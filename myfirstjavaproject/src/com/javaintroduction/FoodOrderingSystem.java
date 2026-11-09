package com.javaintroduction;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total_price=0;
		String cont="";
		do {
			System.out.println("Enter an item:");
			int item = sc.nextInt();
			System.out.println("Enter quantity:");
			int quantity=sc.nextInt();
			switch(item) {
			case 1->{
				System.out.println("Pizza is 200 rs");
				int pizzaPrice=200;
				total_price+=pizzaPrice * quantity;
				}
			case 2->{
				System.out.println("Burger is 120 rs");
				int burgerPrice=120;
				total_price+=burgerPrice * quantity;
			}
			case 3->{
				System.out.println("Biryani  is 180 rs");
				int biryaniPrice=180;
				total_price+=biryaniPrice * quantity;
			}
			case 4->{
				System.out.println("Noodles  is 100 rs");
				int noodlesPrice=100;
				total_price+=noodlesPrice * quantity ;
			}
			default->System.out.println("Entered item is not available...");
			
			
			}System.out.println("do u want to continue entered Y for yes N for no");
			cont=sc.next();
			
			
		}while(cont.equalsIgnoreCase("y"));
		System.out.println("total price is:"+total_price);
		sc.close();
		

	}

}
