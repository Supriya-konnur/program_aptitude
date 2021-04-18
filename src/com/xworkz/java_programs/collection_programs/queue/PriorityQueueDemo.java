package com.xworkz.java_programs.collection_programs.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		pq.offer('a');
		pq.offer('c');
		pq.offer('b');
		pq.offer('d');
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.element());

	}

}
