package com.xworkz.java_programs.collection_programs.list_iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList<String>ll = new LinkedList<String>();
		
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		
		ListIterator<String> litr = ll.listIterator();
		
		while(litr.hasNext()) {
			String s= litr.next();
			if(s.equals("a")) {
				litr.remove();
			}
			else if(s.equals("d")) {
				litr.add("e");
				
			}
			else if(s.equals("c"))
				litr.set("cat");
		}
		System.out.println(ll);

	}

}
