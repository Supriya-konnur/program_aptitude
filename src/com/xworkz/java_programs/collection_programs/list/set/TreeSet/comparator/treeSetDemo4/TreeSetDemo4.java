package com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.treeSetDemo4;

import java.util.TreeSet;
public class TreeSetDemo4 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyComparator4());
		
		ts.add("black");
		ts.add("white");
		ts.add("pink");
		ts.add("blue");
		ts.add("violet");
		ts.add("orange");
		ts.add(new StringBuffer("yellow"));
		ts.add("red");
		ts.add("hi");
		
		System.out.println(ts);

	}

}
