package com.xworkz.java_programs.object_class_methods.clone_method.deep_copy;

public class Xworkz implements Cloneable{
	String name;
	String founder;
	String location;
	
	Asha asha = new Asha();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Xworkz xworkz = new Xworkz();
		xworkz.asha= new Asha();
		
		return xworkz;
	}

	@Override
	public String toString() {
		return "Xworkz [name=" + name + ", founder=" + founder + ", location=" + location + ", asha=" + asha + "]";
	}
	
	
	
	

}
