package com.xworkz.java_programs.collection_programs.list.array_list.card;

public class Card {
	String typeOfCard;
	int noOfCard;
	String color;
	
	public Card(String typeOfCard, int noOfCard, String color) {
		this.typeOfCard=typeOfCard;
		this.noOfCard=noOfCard;
		this.color=color;
	
	}

	@Override
	public String toString() {
		return "Card [typeOfCard=" + typeOfCard + ", noOfCard=" + noOfCard + ", color=" + color + "]";
	}
	
	

}
