package com.arrays;
import java.util.Arrays;
//WAP TO READ THE ELELMENTS FROM SCANNER FOR AN ARRAY ELEMENTS
import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i =0 ;i<size;i++) {
			System.out.println("Enter element");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}

}
