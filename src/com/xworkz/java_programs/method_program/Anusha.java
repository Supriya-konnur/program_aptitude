package com.xworkz.java_programs.method_program;

public class Anusha {

	public static void main(String[] args) {
		 Shop shop = new Shop();
		 System.out.println("Anusha going to shop to get book");
		 
		 Book book = shop.giveBook("vidya",100);
		 
		 System.out.println("Anusha got book");
		 book.open();
		 book.turnPage();
		 book.closeBook();
	}

}
