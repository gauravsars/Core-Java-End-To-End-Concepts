package to_the_new;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalMoneySum {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter total money");
			int totalMoneySum = Integer.parseInt(reader.readLine());
			
			System.out.println("enter total number of coins");
			String coinsAvailable = reader.readLine();
			
			String coinsArray[] = coinsAvailable.split(" ");
			
			if(totalMoneySum==0)System.out.println("provide valid sumofmoney");
				
				int twentycount = totalMoneySum  / Integer.parseInt(coinsArray[0]);
				
				if(twentycount!=0){
				
					totalMoneySum = totalMoneySum - 20*twentycount;
					
					
					int tenCount =  totalMoneySum / Integer.parseInt(coinsArray[1]);
					
					if(tenCount!=0){
						
						totalMoneySum = totalMoneySum - 10*tenCount;
				}
					
					int fiveCount =  totalMoneySum / Integer.parseInt(coinsArray[2]);
					
					if(fiveCount!=0){
						
						totalMoneySum = totalMoneySum - 5*1;
					}
					
					int oneCount =  totalMoneySum / Integer.parseInt(coinsArray[3]);
					
					if(oneCount!=0){
						
						totalMoneySum = totalMoneySum - oneCount;
					}
					
					System.out.println(twentycount);
					System.out.println(tenCount);
					System.out.println(fiveCount);
					System.out.println(oneCount);
					
					
					//total sum is less then 20....
					
				
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
