package com.xworkz.java_programs.collection_programs.queue.watch_program;

import java.util.PriorityQueue;

public class WatchTest {

	public static void main(String[] args) {
		
		Watch sonata= new Watch("sonata","analog",999);
		Watch fastrack= new Watch("fastrack","analog",1999);
		Watch titan= new Watch("titan","analog",1500);
		Watch apple= new Watch("apple","digital",30000);
		
		PriorityQueue<Watch> queueOfwatch = new PriorityQueue<Watch>();
		
		queueOfwatch.offer(sonata);
		queueOfwatch.offer(fastrack);
		queueOfwatch.offer(titan);
		queueOfwatch.offer(apple);
		
		for(Watch watch:queueOfwatch) {
			System.out.println(watch.brand+"  "+watch.type+"  "+watch.price);
		}

	}

}
