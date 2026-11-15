package com.casestudies;

public class SalaryAnalysis {
	static int[] salary = { 25000, 40000, 30000, 50000, 35000 };

	static int highestSal = salary[0];
	static int shighestSal =salary[0];
	static int lowestSal=salary[0];
	static int count=0;
	static int finalBill=0;
	static void sumBill() {
		for(int i=0;i<salary.length;i++) {
			finalBill= finalBill+salary[i];
			
			
		}
	
		
	}

	public static void main(String[] args) {
		for (int i = 0; i < salary.length; i++) {
			if (salary[i] > highestSal) {
				shighestSal=highestSal;

				highestSal = salary[i];
				

			}
			else if (salary[i] < highestSal && salary[i] > shighestSal) {
				shighestSal = salary[i];

			} if(salary[i]<lowestSal) {
				lowestSal=salary[i];
			}
			
			if(salary[i]>30000) {
				count++;
			}
			
		}

		System.out.println("highest salary:" + highestSal);
		System.out.println("second highest salary:" + shighestSal);
		System.out.println("lowest salary:" + lowestSal);
		System.out.println("Employees earning more than 30000 is:" + count);
		sumBill();
		System.out.println("sum of the salaries:" + finalBill);

	}

}
