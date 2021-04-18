package com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.treeSetDemo2;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator2());
		
		ts.add("asha");
		ts.add("supriya");
		ts.add("mamata");
		ts.add("madhi");
		ts.add("alien");
		ts.add("prathima");
		
		System.out.println(ts);
	

	}

}
