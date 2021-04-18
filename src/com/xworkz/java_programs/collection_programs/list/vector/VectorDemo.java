package com.xworkz.java_programs.collection_programs.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Metro> metros = new Vector<Metro>();
		
		Metro metro1 =new Metro("1",3,20.0);
		Metro metro2 =new Metro("2",6,30.0);
		Metro metro3 =new Metro("3",3,40.0);
		
		metros.addElement(metro1);
		metros.addElement(metro2);
		metros.addElement(metro3);
		
		Enumeration<Metro> e= metros.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
