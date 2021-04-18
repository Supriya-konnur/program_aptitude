package com.xworkz.java_programs.thread_programs.runnable_interface;

public class RunnableDemo {

	public static void main(String[] args) {
		Thread.currentThread().setName("Xworkz");
		MyRunnable myRunnable =new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		String name= Thread.currentThread().getName(); 
		for (int i = 0; i <=5; i++) {
			System.out.println("Executeing by "+name+" thread"+i);
		}
		
		//or
//		for (int i = 0; i <=5; i++) {
//			System.out.println("Executeing by "+Thread.currentThread().getName()+" thread"+i);
//		}
	}

}
