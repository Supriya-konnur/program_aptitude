package com.xworkz.java_programs.object_class_methods.clone_method;

public class Test1 implements Cloneable {
	int a,b;
	Test test = new Test();
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		Test1 test1 = new Test1();
		test1.a=10;
		test1.b=20;
		test1.test.x=30;
		test1.test.y=40;
		Test1 test2 = (Test1) test1.clone();
		System.out.println("test1:"+test1);
		System.out.println("test2:"+test2);
		
		

	}


	

	@Override
	public String toString() {
		return "Test1 [a=" + a + ", b=" + b + ", test=" + test + "]";
	}

}
