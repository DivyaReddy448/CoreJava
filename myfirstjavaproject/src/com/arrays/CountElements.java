package com.arrays;
///Write java program to find frequent count of elements in given array 
//arr={1,2,1,3,1,2,3,4,5,6,1,4,2}
//output:
//1->4
//2->3
//3->2
//4->2
//5->1
//6->1

public class CountElements {

	public static void main(String[] args) {
		int[] a = {1,2,1,3,1,2,3,4,5,6,1,4,2};
		boolean[] visit = new boolean[a.length];
		for(int i =0;i<a.length;i++) {
			int count=0;
			if(visit[i]) 
				continue;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					visit[j]=true;
				}
			}
			System.out.println(a[i]+"->"+count);
 		}
		

	}

}
