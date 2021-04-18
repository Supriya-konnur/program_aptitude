package com.xworkz.java_programs.type_casting;

public class ReferenceTypeCastingDemo {

	public static void main(String[] args) {
		// up casting
		Vegitable vegitable = new Carrot();
		vegitable.wash();
		vegitable.chop();
		
		// down casting
		Vegitable vegitable1 = new Carrot();
		Carrot carrot = (Carrot)vegitable1;
		
		carrot.halwa();

	}

}
