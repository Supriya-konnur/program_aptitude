package com.xworkz.java_programs.collection_programs.list.set.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("book");
		lhs.add("dress");
		lhs.add("pen");
		lhs.add("book");
		lhs.add(null);
		
		for(String s: lhs) {
			System.out.println(s);
		}

	}

}
