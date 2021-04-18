package com.xworkz.java_programs.object_class_methods.equals_method;

public class Book {
		String brand;
		int noOfPages;
		double price;
		
		public Book(String brand, int noOfPages, double price) {
			this.brand=brand;
			this.noOfPages=noOfPages;
			this.price=price;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Book) {
				Book bookobj=((Book) obj);
				if(this.brand.equals(bookobj.brand)) {
				if(this.noOfPages==bookobj.noOfPages) {
				if(this.price==bookobj.price) {
					return true;
				}
				else {
					return false;
				}
			}
				else {
					return false;
				}
		}
				else {
					return false;
				}
			}
				else {
					return false;
				}
				}
}
