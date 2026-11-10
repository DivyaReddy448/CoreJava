package com.arrays;
//WAP TO PRINT MIN AND MAX NUMBER FROM GIVEN ARRAY
public class MaxAndMin {

	public static void main(String[] args) {
		int[] numbers= {10,12,2,5,28,30,1,98};
		int min=numbers[0];
		int max=numbers[0];
//		
//		for(int n:numbers) {
//			if(n<min) {
//				min=n;	
//			}
//			if(n>max) {
//				max=n;
//			}
//			
		for(int i =0 ;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
				
			}else if(numbers[i]>max) {
				max=numbers[i];
			}
			
		}
			
		
		System.out.println("minimum number is:" + min);
		System.out.println("maximum number is:"+max);

	}

}
