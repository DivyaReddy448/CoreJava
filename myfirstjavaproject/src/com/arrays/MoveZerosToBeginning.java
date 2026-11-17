package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToBeginning {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter arrya size:");
		int size =sc.nextInt();
		int index=0;
		int[] arr1= new int[size];
		int[] arr2= new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter elemnets");
			arr1[i]=sc.nextInt();
		}
		System.out.println("original array:"+Arrays.toString(arr1));
		for(int a:arr1) {
			if(a==0) {
				arr2[index]=a;
				index++;
				
			}
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=0) {
				arr2[index]=arr1[i];
				index++;
				
				
			}
		
		}
		
			System.out.println("after shifting zeroes:"+Arrays.toString(arr2));
		

	}

}
