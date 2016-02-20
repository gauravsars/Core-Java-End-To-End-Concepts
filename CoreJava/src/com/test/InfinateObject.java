package com.test;

public class InfinateObject {

	InfinateObject object = new InfinateObject();
	
	public int show(){
		return (true?null:0);
	}
	
	
	public static void main(String agr[]){
		
		InfinateObject object = new InfinateObject();
		object.show();
	}
	
}
