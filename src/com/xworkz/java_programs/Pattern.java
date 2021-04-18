package com.xworkz.java_programs;



public class Pattern {

	public static void main(String[] args) {
		int nooflines=5;
		int mid=nooflines/2;
		int space=mid;
		int letters=1;
		for(int i=0; i<nooflines; i++) {
			for(int j=0; j<space; j++) {
				System.out.print("  ");
				
			}
			String s= "Mummy";
			for(int k=0; k<letters; k++) {
				System.out.print(s.charAt(k)+" ");
				
			}
			if(i<mid) {
				space--;
				letters=letters+2;
			}
			else {
				space++;
				letters=letters-2;
			}
			System.out.println();
		}
		
		

	}

}
