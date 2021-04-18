package com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.employee;

import java.util.Comparator;

import com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.student_ID_Name.Student;

public class MyComparator6 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee employee1 = (Employee)o1;
		Employee employee2 = (Employee)o2;
		
		String s1= employee1.name;
		String s2= employee2.name;
		
		return s1.compareTo(s2);
		
	}

}
