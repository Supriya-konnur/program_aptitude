package com.xworkz.java_programs.thread_programs.runnable_interface;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("executing by RunnableThread" + i);
		}

	}

}
