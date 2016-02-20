package com.FinalDemo;

import java.util.ArrayList;

public class FinalDemoClass {

 final ArrayList<String> arrayList= new ArrayList<>();
 
 static final String str;
 
 static {
	 str= new String("Ghalme");
 }

 public final String  fisrtName=new String ("ok");
 
 public FinalDemoClass() {
	// TODO Auto-generated constructor stub
	 fisrtName = new String("Good");
	// str=new String("Ghalme");
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(str);
		// str=new String ("Ghalme");
		
	}

}
