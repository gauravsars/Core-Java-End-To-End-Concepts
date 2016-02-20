package com.test;

public class StaticBlock {

	
	static int a=1111;
	static int j=123;
	int i = 123;
	    
	{
		j=321;
		i=321;
		System.out.println("Non static block");
	        a = a++ + ++a;
	        System.out.println("ok");
	 }
	
	static
	 {
	        a = a-- - --a;
	        System.out.println(" Statoc block");
	 }
	    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);
		
		System.out.println(j+" :: ");
		new StaticBlock();
	}

}
