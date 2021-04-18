package com.xworkz.java_programs.method_program.example2;

public class Arpitha {

	public static void main(String[] args) {
		System.out.println("Arpitha going to postoffice to get letter");
		
		Postoffice postoffice = new Postoffice();
		Letter letter = postoffice.giveLetter();
		System.out.println("Arpitha got the letter");
		System.out.println("Arpitha reading the msg");
		letter.readMsg();
	}

}
