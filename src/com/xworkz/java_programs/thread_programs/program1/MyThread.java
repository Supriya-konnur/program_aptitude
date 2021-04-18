package com.xworkz.java_programs.thread_programs.program1;

public class MyThread extends Thread {
	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("ptinting by chaild " + i);
		}
		// super.run();
	}

	public synchronized void start() {
		super.start();
		System.out.println("overrided start method");
	}

	public void run(int count) {

		for (int i = 0; i <= count; i++) {
			System.out.println("ptinting by chaild " + i);
		}
		// super.run();
	}
}
