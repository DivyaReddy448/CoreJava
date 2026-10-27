package com.javaintroduction;

import java.util.Scanner;

public class MobileBill {
	String mobile_model;
	double price;
	int quantity;
	double delivery_charge;
	double mobile_cost;
	double final_bill;
	MobileBill(){
		
	}

	// no-arg
	MobileBill(String mobile_model) {
		this();
		this.mobile_model=mobile_model;

	}

	MobileBill(String mobile_model, double price) {
       this(mobile_model);
       this.price=price;
	}

	MobileBill(String mobile_model, double price, int quantity) {
		this(mobile_model,price);
		this.quantity=quantity;

	}

	MobileBill(String mobile_model, double price, int quantity, double delivery_charge) {
           this(mobile_model,price,quantity);
		this.mobile_model = mobile_model;
		this.price = price;
		this.quantity = quantity;
		this.delivery_charge = delivery_charge;
		mobile_cost = price * quantity;
		final_bill = mobile_cost + delivery_charge;
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile model:");
		String mobile_model = sc.nextLine();
		System.out.println("Enter price:");
		double price = sc.nextDouble();
		System.out.println("Enter quantity:");
		int quantity = sc.nextInt();
		System.out.println("Enter delivery charge:");
		double delivery_charge = sc.nextDouble();
		MobileBill m = new MobileBill(mobile_model, price, quantity, delivery_charge);
		m.display();

	}

	void display() {
		System.out.println("mobile_model:" + mobile_model);
		System.out.println("price:" + price);
		System.out.println("quantity:" + quantity);
		System.out.println("delivery_charge:" + delivery_charge);
		System.out.println("mobile cost :" + mobile_cost);
		System.out.println("final_bill:" + final_bill);
	}

}
