package com.nullParameter;

public class TestAmbiguos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  //Integer i = new Integer(null);
		  //String s = new String("ok");
		  
		  
		  System.out.println(System.currentTimeMillis());
		    for(int i = 100000; i > 0; i--) {}
		    System.out.println(System.currentTimeMillis());
		    for(int i = 1; i < 100000; i++) {}
		    System.out.println(System.currentTimeMillis());

		    
	}

}
