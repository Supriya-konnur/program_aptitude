package com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.student_ID_Name;

import java.util.TreeSet;



public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1 =new Student(1001,"supriya");
		Student s2 =new Student(1003,"shweta");
		Student s3 =new Student(1002,"konnur");
		Student s4 =new Student(1004,"rohit");
		Student s5 =new Student(1006,"ramesh");
		Student s6 =new Student(1005,"sachin");
		
		TreeSet<Student> studentset  = new TreeSet<Student>();
		
		studentset.add(s6);
		studentset.add(s1);
		studentset.add(s3);
		studentset.add(s5);
		studentset.add(s4);
		studentset.add(s2);
		
		for(Student s: studentset) {
		System.out.println(s.id+" "+s.name);
	}

}
}
