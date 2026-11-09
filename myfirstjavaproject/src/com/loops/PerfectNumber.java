package com.loops;
//WAP TO CHECK THE NUMBER IS PERFECT OR NOT
import java.util.Scanner;

public class PerfectNumber {
	static int sum=0;
	static boolean isPerfect(int n){
		boolean status=false; //status=false,true
		for(int i=1; i <= n/2;i++) {
			if(n % i==0) {
				sum+=i;
				
			}
		if(sum == n) {
			status=true;  
		}
		}
		
		
		return status;
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num =  sc.nextInt();
		boolean status=isPerfect(num);
		if(status) {   //if(status==false,true)
			System.out.println("given number is perfect number");
		}else {
			System.out.println("given number is not a  perfect number");
		}
		sc.close();
			
		
		

	}

}
