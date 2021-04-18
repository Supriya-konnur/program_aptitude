package com.xworkz.java_programs.thread_programs.program1;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread myThread= new MyThread();
		myThread.start();
		
		for (int i = 0; i <=5; i++) {
			System.out.println("printing by main thread");
		}
	}

}
