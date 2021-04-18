package com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.employee;

public class Employee implements Comparable{
	int id;
	String name;

	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee employee = (Employee)o;
		 int eID1= this.id;
		 int eID2 =employee.id;
		 
		 if(eID1<eID2) {
			 return -1;
			 
		 }
		 else if(eID1>eID2)
			 return 1;
		 
		 else
			 return 0;
	}

}
