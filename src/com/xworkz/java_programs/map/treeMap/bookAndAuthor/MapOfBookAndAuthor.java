package com.xworkz.java_programs.map.treeMap.bookAndAuthor;

import java.util.Map;
import java.util.TreeMap;

public class MapOfBookAndAuthor {

	public static void main(String[] args) {
		
		Book b1 = new Book("Curse of clown fish",200.00);
		Book b2 = new Book("Modern history", 400.00);
		Book b3 = new Book("Wings of fire",600.00);
		Book b4 = new Book("Harry potter",650.00);
		Book b5 = new Book("Kannuru Heggadthi", 700.00);
		
		Author a1 = new Author("Subhash");
		Author a2 = new Author("Bipin Chandra");
		Author a3 = new Author("APJ abdul kalam");
		Author a4 = new Author("J.K.Rowling");
		Author a5 = new Author("Kuvempu");
		
		TreeMap<Book,Author> tm = new TreeMap<Book,Author>();
		tm.put(b1, a1);
		tm.put(b2, a2);
		tm.put(b3, a3);
		tm.put(b4, a4);
		tm.put(b5, a5);
		
		for(Map.Entry<Book, Author> entry: tm.entrySet()) {
			Book book = entry.getKey();
			Author author = entry.getValue();
			System.out.println(book.name+"    "+author.name+ "   "+ book.price);
		}

	}

}
