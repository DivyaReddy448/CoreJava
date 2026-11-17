package com.arrays;

import java.util.Arrays;

//Write java program to moves all zero to end
//eg: arr={1,0,3,2,0,9,0,8,0,7}
//output: {1,3,2,9,8,7,0,0,0,0}
public class MovingZeroesToEnd {

	public static void main(String[] args) {
		int[] a={1,0,3,2,0,9,0,8,0,7};
		int[] b=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[index]=a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(b));
		
			
		}
		

	}


