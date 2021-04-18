package com.xworkz.java_programs.collection_programs.list.linkrd_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList();
		
		ll.add('A');
		ll.add('B');
		ll.add('C');
		ll.add('D');
		
		ListIterator litr= ll.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

	}

}
