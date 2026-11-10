package com.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		int sum = 0;
		int count=0;
		int n =num;
		int temp=num;
		while(num>0) {
			num = num /10;
			count++;
		}
		while(n >0) {
			int rem = n % 10;
			sum+=Math.powExact(rem, count);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
	

	}

}
