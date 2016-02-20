package com.exceptionDemo;

public class HandleException {

	public void showCheckedExceptionDemo(String str) throws CheckedException{
		System.out.println("Checked Exception "+str);
	}
	
	
	public void showUnCheckedException(String str) throws UnCheckedException{
		System.out.println("UnChecked Exception "+str);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HandleException exce = new HandleException();
		
		try {
			exce.showCheckedExceptionDemo(" Raised ");
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		exce.showUnCheckedException(" Raised ");
	}

}
