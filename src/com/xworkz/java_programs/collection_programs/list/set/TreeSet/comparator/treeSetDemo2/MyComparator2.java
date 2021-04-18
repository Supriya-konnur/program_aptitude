package com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.treeSetDemo2;

import java.util.Comparator;

public class MyComparator2 implements Comparator {
	
	
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1 =(String)o1;
		String s2 =(String)o2;
		
		return -s1.compareTo(s2);
	}
	
}
