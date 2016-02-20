/**
 * 
 */
package com.ThreadDemo;

/**
 * @author sachin.s.ghalme
 *
 */
public class CallThreadImpl {

	public static void main(String asdf[]){
	
	
		GeneratNumber g= new GeneratNumber();
		
		GenerateNumberUsingBlock g1= new GenerateNumberUsingBlock();
		Thread t1 = new Thread(g1);
		Thread t2 = new Thread(g1);
		
		t1.start();
		t2.start();
		
	
	
	
	
	}
	
}
