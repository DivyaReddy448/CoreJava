package com.javaintroduction;

public class Cookies {
	static  int Priceofchocolate = 15;
	static int Priceofcookie = 10;
	
	

	public static void main(String[] args) {
		int total = 450;
		int costchocolate= Priceofchocolate * 10;
		int costcookies=Priceofcookie * 5;
		int totalcost=costchocolate + costcookies;
		int remainingamount= total - totalcost;
		System.out.println("cost of chocalates is:"+costchocolate);
		System.out.println("cost of cookies is:"+costcookies);
		System.out.println(" total cost is:"+totalcost);
		System.out.println(" remaining amount is:"+remainingamount);
		
		

	}

}
