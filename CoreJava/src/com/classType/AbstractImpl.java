package com.classType;

public class AbstractImpl extends Abs implements Inter{

	
	public static void main(String as[]){
		
		Inter abs = new AbstractImpl();
		
abs.show("String ok");
	}

/*	@Override
	public void show(String atr) {
		// TODO Auto-generated method stub
		System.out.println("ok");
		
	}*/
}

abstract class Abs {
	
	Abs(){}
	
	Abs(String ard){
		System.out.println("Abstract Class Constructor : "+ard);
	}
	
	public void show(String s){
		System.out.println(s);
	}
}


interface Inter{

	public void show(String atr);
}