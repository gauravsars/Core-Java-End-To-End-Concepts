package to_the_new;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	
	public static void main(String[] args) {
		
		ReverseString revStr = new ReverseString();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		
		try {
			String str = reader.readLine();
			
			String strArr[] =	str.split(" ");
			
			String outputString ="" ;
			
			for(int i = strArr.length -1 ; i >=0 ; i--){
				
				outputString =outputString + " " +strArr[i] ;
		
			}
			
			System.out.println(outputString);
			
			StringBuffer sb = new StringBuffer(str);
			
			sb = sb.reverse();
			
			String reverseString = new String(sb);
			
			System.out.println(reverseString);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
