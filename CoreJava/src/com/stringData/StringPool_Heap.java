package com.stringData;

public class StringPool_Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str=  new String("Sachin");
		String str1= new String("Sachin");
		
		if (str==str1)
			System.out.println(" Data maches from string heap");
			
		String s1 = str.intern();
		String s2= str1.intern();
		
		if (s1==s2){
			System.out.println("Data maches from string pool");
		}
		}
	

}
