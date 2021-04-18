package com.xworkz.java_programs.map.linked_hashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("Ramya", 30);
		lhm.put("Kiran", 40);
		lhm.put("Anu",16);
		lhm.put("Manasa", 22);
		lhm.put("Shivu", 12);
		
		System.out.println(lhm);

	}

}
