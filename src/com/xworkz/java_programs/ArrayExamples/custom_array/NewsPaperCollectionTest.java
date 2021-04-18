package com.xworkz.java_programs.ArrayExamples.custom_array;

public class NewsPaperCollectionTest {

	public static void main(String[] args) {
		
		NewsPaper hindu = new NewsPaper("Hindu","English",12,5.00);
		NewsPaper prajavani = new NewsPaper("Prajavani","Kannada",8,4.00);
		NewsPaper deccan = new NewsPaper("Deccan herald","English",13,4.00);
		
		NewsPaper[] newsPaper = {hindu, prajavani, deccan};
		for (int i = 0; i < newsPaper.length; i++) {
			System.out.println(newsPaper[i]);
		}


	}

}
