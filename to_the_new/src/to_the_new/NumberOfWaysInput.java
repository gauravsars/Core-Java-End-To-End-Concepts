package to_the_new;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfWaysInput {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = "";
		try {
			name = reader.readLine();
			name.split(" ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Your name is "+name);
	}
	
	

}
