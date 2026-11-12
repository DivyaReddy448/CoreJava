package com.arrays;
//write java program to find second largest distinct element in array
//eg: arr={2,7,13,9,8,13}
public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr={2,7,13,9,8,13};
		int largest=0;
		int secondLargest=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
				
				
			}else if(arr[i] > secondLargest && arr[i] < largest) {
				  secondLargest = arr[i];
			}
			
			
		}
		System.out.println(secondLargest);

	}

}
