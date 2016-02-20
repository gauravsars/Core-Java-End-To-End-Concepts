package com.staticMethod;

public class StaticMethod {

	static void show(){
		//this.display();
		System.out.println("ok");
	}
	
	public void display(){
		System.out.println("ok");
	}
	public static void main(String sdf[]){
		show();
	}
	
}
