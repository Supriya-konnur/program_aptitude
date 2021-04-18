package com.xworkz.java_programs.polymorphism.runtime.example2Bank;

public class BankDemo {

	public static void main(String[] args) {
		
		Bank sbiBank = new SBI();
		Bank hdfcBank = new HDFC();
		
		sbiBank.interestRate();
		hdfcBank.interestRate();

	}

}
