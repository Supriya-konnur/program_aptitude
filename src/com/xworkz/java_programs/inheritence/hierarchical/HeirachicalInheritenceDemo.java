package com.xworkz.java_programs.inheritence.hierarchical;

public class HeirachicalInheritenceDemo {

	public static void main(String[] args) {
		System.out.println("CSE branch details...");
		CSE c = new CSE();
		c.dataStructure();
		c.machineLearning();
		c.maths();
		c.physics();
		System.out.println();
		
		System.out.println("ECE branch details...");
		ECE e = new ECE();
		e.EmbeddedSystem();
		e.fieldTheory();
		e.maths();
		e.physics();
		System.out.println();
		
		System.out.println("Mech branch details...");
		Mech m =new Mech();
		m.appliedThemoDynamicss();
		m.machineToolAndOperations();
		m.maths();
		m.physics();

	}

}
