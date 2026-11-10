package com.loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random ran=new Random();
		int ranNum=ran.nextInt(10)+1;
		
		for(int i=1;i<=3;i++) {
			System.out.println("enter a number:");
			int guess=sc.nextInt();
			if(guess < ranNum) {
				System.out.println("too low ! TRY AGAIN");	
			}else if(guess > ranNum) {
				System.out.println("too high! TRY AGAIN");
			}else if(guess == ranNum) {
				System.out.println("Congratulations! You guessed the correct number.");
				break;
			}
			
			
		}
		System.out.println("game over");
		System.out.println("random number is:"+ranNum);
		sc.close();

	}

}
