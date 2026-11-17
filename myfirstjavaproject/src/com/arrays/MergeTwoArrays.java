package com.arrays;

import java.util.Arrays;

//WAP T PRINT TWO ARRAYS DATA ELEMENTS INTO ONE ARRAY
//input a={10,20,30}
//      b= {1,2,3}
// output  c= {10,20,30,1,2,3}


public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b= {1,2};
		int[] c=new int[a.length+b.length];
		for(int i =0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i =0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		System.out.println(Arrays.toString(c));
	

	}

}
