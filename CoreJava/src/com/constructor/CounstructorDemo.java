package com.constructor;

public class CounstructorDemo {

	public CounstructorDemo() {
		// TODO Auto-generated constructor stub
		
		synchronized (this) {
			System.out.println(" Called Counstructor ");
		}
	}
	
	
	public void show(){
		System.out.println(" Show ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounstructorDemo counstructorDemo= new CounstructorDemo();
		
		
		counstructorDemo.show();
		
	}

}
