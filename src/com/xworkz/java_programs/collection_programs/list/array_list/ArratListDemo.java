package com.xworkz.java_programs.collection_programs.list.array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add('a');
		al.add("hi");
		al.add(true);
		System.out.println(al);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(int j=0; j<al.size();j++) {
			System.out.println(al.get(j));
			
		}
		for(Object o:al) {
			System.out.println(o);
		}

	}

}
