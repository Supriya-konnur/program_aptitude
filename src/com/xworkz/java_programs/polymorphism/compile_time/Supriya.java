package com.xworkz.java_programs.polymorphism.compile_time;

public class Supriya {

	public static void main(String[] args) {
		Stranger stranger = new Stranger();
		Beloved beloved = new Beloved();
		Supriya sk = new Supriya();
		sk.speak(stranger);
		sk.speak(beloved);
		
	}
	
	void speak(Stranger s) {
		System.out.println("hi,my day was great !!!");
	}
	void speak(Beloved b) {
		System.out.println("hi,my day was great and"+"you known what happems, and blah...blah...blah");
	}

}
