package com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.treeSetDemo3;
//WAP to insert string obj into treeset where sorting order reers alphabatic order
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet( new MyComparator3() );
		 ts.add(new StringBuffer("wonderland"));
		 ts.add(new StringBuffer("disneyworld"));
		 ts.add(new StringBuffer("fairytal"));
		 ts.add(new StringBuffer("BlackThunder"));
		 ts.add(new StringBuffer("marvels"));
		 ts.add(new StringBuffer("starwars"));
		 
		 System.out.println(ts);
		 



	}

}
