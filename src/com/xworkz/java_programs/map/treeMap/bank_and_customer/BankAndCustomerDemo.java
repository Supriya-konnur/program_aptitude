package com.xworkz.java_programs.map.treeMap.bank_and_customer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAndCustomerDemo {

	public static void main(String[] args) {
		Bank b1 = new Bank("Bank of India");
		Bank b2 = new Bank("Karnatak bank");
		Bank b3 = new Bank("SBI");
		
		Customer k1 = new Customer("Madhi",101,100000.00);
		Customer k2 = new Customer("Rohit",10001,1000000.00);
		Customer k3 = new Customer("Ramesh",20001,200000.00);
		Customer c1 = new Customer("Shwetha",30001,300000.00);
		Customer c2 = new Customer("Sachin",40001,10000.00);
		Customer c3 = new Customer("Jyoo",2004,500000.00);
		Customer s1 = new Customer("Megha",30001,700000.00);
		Customer s2 = new Customer("Pooja",3002,100000.00);
		Customer s3 = new Customer("Mamata",8000,1500000.00);
		
		ArrayList<Customer> bioCustomer = new ArrayList<Customer>();
		ArrayList<Customer> karCustomer = new ArrayList<Customer>();
		ArrayList<Customer> sbiCustomer = new ArrayList<Customer>();
		
		bioCustomer.add(k1);
		bioCustomer.add(k3);
		bioCustomer.add(s1);
		
		karCustomer.add(k2);
		karCustomer.add(c2);
		
		sbiCustomer.add(c3);
		sbiCustomer.add(s2);
		
		LinkedHashMap<Bank, ArrayList<Customer>> accountdatabase= new LinkedHashMap<Bank, ArrayList<Customer>>();
		
		
		accountdatabase.put(b1, bioCustomer);
		accountdatabase.put(b2, karCustomer);
		accountdatabase.put(b3, sbiCustomer);
		
		System.out.println("Enter the bank name to access customer list");
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		
		for(Map.Entry<Bank,ArrayList<Customer>> d : accountdatabase.entrySet()) {
			if(d.getKey().name.equals(b)) {
				for(Customer customer : d.getValue()) {
					System.out.println("Name: "+customer.name);
					System.out.println("Account No.: "+customer.accno);
					System.out.println("Current Balance: "+customer.balance);
					System.out.println();
				}
			}
		}
		System.out.println("Enter the account No.:");
		int ac= sc.nextInt();
		
		for(Map.Entry<Bank, ArrayList<Customer>> cu : accountdatabase.entrySet()) {
			for(Customer customer : cu.getValue()) {
			if(customer.accno == ac) {
				System.out.println("Name: "+customer.name);
				System.out.println("Bank Name: "+cu.getKey().name);
				System.out.println("Current Balance: "+customer.balance);
			}
				
			}
			
		}
		
				

	}

}
