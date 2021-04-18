package com.xworkz.java_programs.has_a_relationship.composition;

public class CompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human = new Human();
		
		System.out.println(human.name + human.heart.heartBeat());

	}

}
