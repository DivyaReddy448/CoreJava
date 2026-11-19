package com.arrays;
//Write a java program  to rounding of elements in given array
//Eg: arr[]={99,95,71,84,81,75,60}
//Output: {100,90,70,80,80,70,60}

import java.util.Arrays;

public class RoundingOfElements {

	public static void main(String[] args) {
		int[] a = {99,98,95,82,82,60,22,23,25,76};
		for(int i =0;i<a.length;i++) {
			int rem=a[i] % 10;
			if(rem <=5) {
				a[i]=a[i]-rem;
			}
			else {
				int dif=10-rem;
				a[i]=a[i]+dif;
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
