package com.nullParameter;

import java.io.IOException;

import com.test.SysOut;



class A{
	
}
class B extends A {
	
}
class C extends B{
	
}

class D extends A{
	
}
class E extends D{
	
}



public class NullParameterInMethod {

	/*public void NullArg(C c){
		System.out.println("Called methis NullArg C");
	}

	
	public void NullArg(B b){
		System.out.println("Called methis NullArg B");
	}
	
	
	public void NullArg(A a){
		System.out.println(" Called method NullArg");
	}
	
	
	public static void AcceptNull(Integer inMethod){
		System.out.println("Method called");
	}
	
	public static void AcceptNull(Object str) {
		System.out.println(" NEw Method Called");
	}*/
	
	public static void AcceptNull(B str) {
		System.out.println(" NEw Method Called");
	}
	public static void AcceptNull(A str) {
		System.out.println(" NEw Method Called");
	}
	
	public static void getString(String str,String str1){
		System.out.println(" String data ");
	}
	
	public static void getString(Object i, Object i1){
		System.out.println( "String int ");
	}
	
	public static void Intg(String i){
		System.out.println( "String i ");
	}
	
	public static void Intg(int i){
		System.out.println("Integer i");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NullParameterInMethod inMethod = new NullParameterInMethod();
		
		/*A a= null;
		B b= null;
		*/
		
		//inMethod.NullArg(null);
		
		
		
		
		
		//NullParameterInMethod inMethod = new NullParameterInMethod();
		// AcceptNull(inMethod);
		 AcceptNull(null);
		 getString(null, null);
		 
		 Intg(null);
		 
		 Integer i = new Integer(null);
		 
		 System.out.println(" Completed Successfully !! ");
		
	}

}
