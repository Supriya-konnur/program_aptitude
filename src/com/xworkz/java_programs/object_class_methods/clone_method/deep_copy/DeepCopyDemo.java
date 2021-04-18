package com.xworkz.java_programs.object_class_methods.clone_method.deep_copy;

public class DeepCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Xworkz xworkz = new Xworkz();
		xworkz.name = "Xworkz";
		xworkz.founder="omkar";
		xworkz.location="Rajajinagar";
		xworkz.asha.name="Asha";
		xworkz.asha.Dob="29-12-1992";
		
		Xworkz duplicateXworkz = (Xworkz) xworkz.clone();
		
		duplicateXworkz.founder="Prajaval";
		duplicateXworkz.asha.name="Asha";
		duplicateXworkz.asha.Dob="29-91993";
		
		System.out.println(xworkz);
		System.out.println(duplicateXworkz);
	
	}

	@Override
	public String toString() {
		
		return "DeepCopyDemo";
	}
	

}
