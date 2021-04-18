package com.xworkz.java_programs.map.hashTable;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("India", "New dheli");
		ht.put("United state", "Washington dc");
		ht.put("Nepal", "Katmandu");
		ht.put("England", "London");
		ht.put("Japan", "Tokiyo");
		
		System.out.println(ht);

	}

}
