package com.ThreadDemo;

public class GenerateNumberUsingBlock extends Thread {
	public void printNumber(String string) {
		Integer i = 0;
		Integer j=0;
		String name ="Ok";
		synchronized (string) {
			System.out.println("Before start loop of method 1" );
			for (i = 0; i <= 100; i++) {
				System.out.println("Method 1   " + i);
			}
		}

	}

	public void printNumber1(String string) {
		Integer i = 0;
		Integer j=0;
		String name="Ok";
		synchronized (string) {
			System.out.println("Before start loop of method 2");
			for (i = 0; i <= 100; i++) {
				string = "" + i;
				System.out.println("Method2    " + i);
			}
		}
	}

	public void run() {

		printNumber(Thread.currentThread().getName());
		printNumber1(Thread.currentThread().getName());
	}
}
