package com.ThreadDemo;


class Work extends Thread{
	public void run(){
		
		for(int i=0;i<=100;i++){
			System.out.println(i);
		}
	}

}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Thread t1 = new Thread(new Work());
		Thread t2 = new Thread(new Work());
		t1.start();
		t2.start();
		
		new Work().start();
		
	}

}
