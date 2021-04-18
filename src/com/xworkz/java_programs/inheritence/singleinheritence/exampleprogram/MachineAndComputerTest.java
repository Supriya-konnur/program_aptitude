package com.xworkz.java_programs.inheritence.singleinheritence.exampleprogram;
public class MachineAndComputerTest {
 public static void main(String args[]) {
	 Machine m = new Machine();
	 Computer c = new Computer();
	 
	 System.out.println("properties of Machine...");
	 m.storage();
	 m.generation();
	 m.speed();
	 
	 System.out.println("properties of Computer...");
	 c.storage();
	 c.generation();
	 c.speed();
	 c.operatingSystem();
	 
 }
}
