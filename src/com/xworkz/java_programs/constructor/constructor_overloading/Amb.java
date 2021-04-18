package com.xworkz.java_programs.constructor.constructor_overloading;

public class Amb {
	
	String name;
	int noOfParticipents;
	
	 Amb(){
	 System.out.println("Default constructor");
	 }
	 
	 Amb(String name1){
		 System.out.println("a parameterized constructor");
		 name = name1;
	 }
	 
	 Amb(String name2, int noOfParticipents1){
		 System.out.println("2 parameterized constructor");
		 name = name2;
		 noOfParticipents = noOfParticipents1;
	 }
	 

}
