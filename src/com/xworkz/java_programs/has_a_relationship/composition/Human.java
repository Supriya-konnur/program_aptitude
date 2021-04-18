package com.xworkz.java_programs.has_a_relationship.composition;

public class Human {
	String name = "Rakesh";
	Heart heart = new Heart();
	void playGame() {
		System.out.println("plying game.....");
	}

}
