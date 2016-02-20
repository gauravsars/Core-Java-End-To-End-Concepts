package com.core;

import java.util.Scanner;

public class FindMinimumDistance {
	
	public static void main(String arre[]){
		
		int[] distance = new int[20];
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many distance you want to enter ::");
		int noOfDistance = scan.nextInt();
		
		for (int i=1; i<=noOfDistance;i++){
			System.out.print("Enter Distance "+i+" : ");
			distance[i-1]=scan.nextInt();
			
		}
		
		int value1=0,value2=0,diff1=0,diff2=Integer.MAX_VALUE;
		
		for (int i=0; i<noOfDistance;i++){
		
			for(int j=noOfDistance-1;  j>i ;j--) {
				
				diff1 = Math.abs(distance[i]-distance[j]);
				
				if (diff2>diff1){
					diff2=diff1;
					value1=distance[i];
					value2=distance[j];
				
				}
			}

			if(diff2==1) break;
			
				
		}
		System.out.println(" least diffrence in "+value1+" and "+value2);
	}

}
