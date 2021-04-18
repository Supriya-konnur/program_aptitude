package com.xworkz.java_programs.ArrayExamples.custom_array;

public class NewsPaper {

	String name;
	String language;
	int noofPages;
	double price;
	
	public NewsPaper(String name, String language, int noofPages, double price) {
		this.name=name;
		this.language=language;
		this.noofPages=noofPages;
		this.price=price;
	}



	@Override
	public String toString() {
		return "NewsPaper [name=" + name + ", language=" + language + ", noofPages=" + noofPages + ", price=" + price
				+ "]";
	}
	
	
	
	

}
