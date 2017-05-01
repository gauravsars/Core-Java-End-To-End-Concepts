package to_the_new;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTwoMinMax {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter array contents");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String arrayContent = "";
		try {
			arrayContent = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String arrayContentValues[] = arrayContent.split(" ");
		
		int array[] = new int[arrayContentValues.length];
		int i = 0;
		for(String arrayContentValuesOne : arrayContentValues){
			
			array[i] = Integer.parseInt(arrayContentValuesOne);
			
			i++;
			
		}
		
		FirstTwoMinMax fMinMax = new FirstTwoMinMax();
		
		fMinMax.findFirstTwoMin(array);
		
		fMinMax.findFirstTwoMax(array);
		
	}

	 void findFirstTwoMax(int[] arr) {
		 	
			int max1,max2;
		    max1 = arr[0];
		    max2 = arr[0];
			for(int i = 0 ; i< arr.length ; i++){
			
				if(max1 < arr[i]){
				
					max2 = max1;
					max1 = arr[i];
				
				}
				
				if((max2 < arr[i]) && (max1 > arr[i])){
				
					max2 = arr[i];
				
				}
				
				
			
			}
		 
			System.out.println(max1);
			System.out.println(max2);
		
	}

	public void findFirstTwoMin(int[] arr) {
		int min1,min2;
		min1 = arr[0];
		min2 =arr[0];
		for(int i = 0 ; i< arr.length ; i++){
		
			if(min1 > arr[i]){
			
				min2 = min1;
				min1 = arr[i];
			
			}
			
			if((min2 > arr[i]) && (min1 < arr[i])){
			
				min2 = arr[i];
			
			}
			
			
		
		}
		
		System.out.println(min1);
		System.out.println(min2);
	
	}
		
		
	}
