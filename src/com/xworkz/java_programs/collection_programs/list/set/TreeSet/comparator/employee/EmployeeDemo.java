package com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.employee;

import java.util.TreeSet;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(2004,"keerthi");
		Employee e2 = new Employee(2001,"supriya");
		Employee e3 = new Employee(2003,"sudha");
		Employee e4 = new Employee(2005,"shruthi");
		Employee e5 = new Employee(2002,"amrutha");
		
		TreeSet<Employee> employeeset = new TreeSet<Employee>();
		
		employeeset.add(e1);
		employeeset.add(e3);
		employeeset.add(e5);
		employeeset.add(e2);
		employeeset.add(e4);
		
		for(Employee e: employeeset) {
			System.out.println(e.id+" "+e.name);
		}
		
	}

}
