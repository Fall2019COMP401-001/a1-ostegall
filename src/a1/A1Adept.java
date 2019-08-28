package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemCount = scan.nextInt();
		
		double[] itemPriceArray = { };
		
		String[] itemNameArray = { };
		
		for (int i = 0; i < itemCount; i++) {
			
			String itemName = scan.next();
			
			double price = scan.nextDouble();
			
			problem here itemPriceArray[i] = price;
			
			itemNameArray[i] = itemName;
			
		}
		
		int customerCount = scan.nextInt();
		
		double min = 10000;
		
		double max = 0;
		
		String[] customerNameArray = { "" };
		
		double[] costArray = { };
		
		double totalCost = 0;
		
		String smallestName = "";
		
		String biggestName = "";
		
		for (int i = 0; i < customerCount; i++) {
			
			String firstName = scan.next();
			
			String lastName = scan.next();
			
			customerNameArray[i] = firstName + lastName;
			
			int itemsBought = scan.nextInt();
			
			double cost = 0;
			
			double price = 0;
			
			for (int j = 0; j < itemsBought; j++) {
				
				int quantity = scan.nextInt();
				
				String nameOfItemsBought = scan.next();
				
				for (int k = 0; k < itemCount; k++) {
					
					if (itemNameArray[k] == nameOfItemsBought) {
						
						price = itemPriceArray[k];
						
					}
					
				}
				
				cost = cost + price * quantity;
				
			}
			
			costArray[i] = cost;
			
			totalCost = totalCost + costArray[i];
			
			if (cost < min) {
				
				min = cost;
				
				smallestName = customerNameArray[i];
				
			}
			
			if (cost > max) {
				
				max  = cost;
				
				biggestName = customerNameArray[i];
				
			}
			
		}
		
		double average = totalCost / customerCount;
		
		String maxResult = String.format("%.2f", max);
		
		System.out.println("Biggest: " + biggestName + " (" + maxResult + ")");
		
		scan.close();

	}
	
}
