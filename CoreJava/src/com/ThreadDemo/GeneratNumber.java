package com.ThreadDemo;

public class GeneratNumber extends Thread {

	
	public  synchronized void printNumber(String string){
		for(int i=0;i<=100;i++)
			System.out.println("Method 1 "+string+"  "+i);
	}
	
	public synchronized void printNumber1(String string){
		for(int i=0;i<=100;i++)
			System.out.println("Method2  "+string+"  "+i);
	}
	
	public void run(){
		
		printNumber(Thread.currentThread().getName());
		printNumber1(Thread.currentThread().getName());
	}
}
