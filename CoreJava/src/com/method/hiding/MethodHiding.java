package com.method.hiding;


class A{
	
	public static void staticMethod(){
		System.out.println("Static method From A");
	}
	
	public void method(){
		System.out.println("Non Static method From A");
	}
}

class B extends A{
	public static void staticMethod(int a){
		System.out.println("Static method From B");
	}
	
	public void method(){
		System.out.println("Non Static method From B");
	}
	
}


public class MethodHiding {

	public static void main(String asdf[])
	{
		A a = new A();
		A b = new B();
		B c = new B();
		A d = null;

		a.staticMethod(); // should not be done. Prints Animal
		b.staticMethod(); // should not be done. Prints Animal because the declared type of b is Animal
		c.staticMethod(); // should not be done. Prints Cat because the declared type of c is Cat
		d.staticMethod(); // should not be done. Prints Animal because the declared type of b is Animal
		System.out.println("Called Non Static method");
		a.method();
		b.
		c.method();
		d.method();
	}
}
