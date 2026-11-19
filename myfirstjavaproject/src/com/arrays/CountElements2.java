package com.arrays;
//Print duplicate elements
public class CountElements2 {

	public static void main(String[] args) {
		int[] a = {1,2,1,3,1,2,3,4,5,6,1,4,2};
		boolean[] visit=new boolean[a.length];
		for(int i =0;i<a.length;i++) {
			int count=0;
			if(visit[i]) {
				continue;
			}
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
				count++;
				visit[j]=true;
				}
			}
		
		if(count>1) {
			System.out.println(a[i]);
		}
		}

	}

}
