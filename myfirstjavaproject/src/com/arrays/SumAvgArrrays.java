package com.arrays;

public class SumAvgArrrays {

	public static void main(String[] args) {
		int[] numbers= {10,25,30,12,14};
		int sum =0;
		int avg=0;
//		for(int i = 0;i<numbers.length;i++) {
//			sum+= numbers[i];
//		}
		for(int n:numbers) {
			sum+=n;
		}
		avg=sum/numbers.length;
		System.out.println("sum is:"+sum);
		System.out.println("avg is:"+avg);

	}

}
