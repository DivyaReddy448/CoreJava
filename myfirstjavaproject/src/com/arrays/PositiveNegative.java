package com.arrays;
import java.util.Arrays;
//Write a Java program to count positive and negative elements in an array.
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] numbers = new int[size];
		int positiveCount=0;
		int negativeCount=0;
		for(int i=0;i<size;i++) {
			System.out.println("enter elements:");
			numbers[i]=sc.nextInt();
		}
		for(int n:numbers) {
			if(n>0) {
				positiveCount++;
			}
			if(n<0) {
				negativeCount++;
			}
		}
		System.out.println("positive numbers count is:" + positiveCount);
		System.out.println("negative numbers count is:" + negativeCount);
		System.out.println("array" + Arrays.toString(numbers));

	}

}
