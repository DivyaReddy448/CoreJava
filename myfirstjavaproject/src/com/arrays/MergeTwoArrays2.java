package com.arrays;

import java.util.Arrays;

public class MergeTwoArrays2 {
//WAP T PRINT TWO ARRAYS DATA ELEMENTS INTO ONE ARRAY
//input a=10,20,30
//      b=1,2
//output=11,22,30
	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b= {1,2};
		int[] c= new int[a.length];
		for(int i =0;i<a.length;i++) {
			if(i<b.length) {
			c[i]=a[i]+b[i];
		}
			else {
				c[i]=a[i];
			}

	}
		System.out.println(Arrays.toString(c));

}
}