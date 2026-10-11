package com.javaintroduction;

public class BankAccount {
	static int balance = 1000;
	int depositamount = 500;
	int withdrawamount = 300;
//	int updated_balance = balance - depositamount;

	void deposit() {
		balance = balance + depositamount;
		System.out.println("updated balance is:" + balance);
		withdraw(balance);
	}

	void withdraw(int balance) {
		balance = balance - withdrawamount;

		System.out.println("updated balance is:" + balance);

	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit();

	}

}
