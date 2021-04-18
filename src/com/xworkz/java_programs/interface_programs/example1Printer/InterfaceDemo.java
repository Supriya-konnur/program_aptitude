package com.xworkz.java_programs.interface_programs.example1Printer;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Sony sony = new Sony();
		Epson epson =new Epson();
		
		computer.slot(sony);
		computer.slot(epson);
	}

}
