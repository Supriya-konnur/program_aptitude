package com.xworkz.java_programs.map.treeMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("KGF", "Yash");
		tm.put("Robert", "Dashan");
		tm.put("Bahubali", "Prabhas");
		tm.put("Ranna", "Sudeep");
		tm.put("Master", "Vijay");
		
		System.out.println(tm);
		

	}

}
