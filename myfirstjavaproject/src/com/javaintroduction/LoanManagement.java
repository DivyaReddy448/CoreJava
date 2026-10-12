package com.javaintroduction;

import java.util.Scanner;

public class LoanManagement {
	Scanner sc = new Scanner(System.in);
	String customerName;
	double LoanAmount;
	double interestRate;
	int totalTime;

	double calculateInterest(double LoanAmount, double totalTime, double interestRate) {
		double simple_interest = (LoanAmount * totalTime * interestRate) / 100;
		System.out.println("simple interest is:" + simple_interest);
		return simple_interest;
	}

	double calculateTotalAmount(double LoanAmount, double simple_interest) {
		double total_amount = LoanAmount + simple_interest;
		System.out.println("total amount is:" + total_amount);
		return total_amount;
	}

	double calculateMonthlyEMI(double total_amount, double totaltime) {
		double EMI = total_amount/( totaltime*12);
		System.out.println("emi is:" + EMI);
		return EMI;
	}
	void displayLoanSummary(double simple_interest,double total_amount,double Emi) {
		System.out.println("loan summary is:"+simple_interest+total_amount+Emi);
		
		
	}

	void main(String[] args) {
		System.out.println("enter principal amount:");
		double P = sc.nextDouble();
		System.out.println("enter total time:");
		double T = sc.nextDouble();
		System.out.println("enter rate of interest");
		double R = sc.nextDouble();
		double a=calculateInterest(P, T, R);

		
	
		double b=calculateTotalAmount(P, a);

		
		System.out.println("enter tenure(years):");
		double totaltime=sc.nextDouble();
		double c=calculateMonthlyEMI(b,totaltime);
		
		displayLoanSummary(a,b,c);
	

	}

}
