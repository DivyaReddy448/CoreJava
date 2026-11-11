package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to count even and odd elements in an array.
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int[] numbers= new int[size];
		System.out.println("enter elements:");
		for(int i =0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		for(int n:numbers) {
			if(n%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
		
		}
		System.out.println("even count is:" +evencount);
		System.out.println("odd count is:"+ oddcount);
		System.out.println(Arrays.toString(numbers));
		

	}

}
