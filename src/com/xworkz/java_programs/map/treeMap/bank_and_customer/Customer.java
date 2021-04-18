package com.xworkz.java_programs.map.treeMap.bank_and_customer;

public class Customer {
	String name;
	Integer accno;
	Double balance;
	
	public Customer(String name,Integer accno, Double balance) {
		this.name=name;
		this.accno=accno;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", accno=" + accno + ", balance=" + balance + "]";
	}
	
}
