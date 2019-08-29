package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemCount = scan.nextInt();
		
		double[] itemPriceArray = new double[itemCount];
		
		String[] itemNameArray = new String[itemCount];
		
		for (int i = 0; i < itemCount; i++) {
			
			String itemName = scan.next();
			
			double price = scan.nextDouble();
			
			itemPriceArray[i] = price;
			
			itemNameArray[i] = itemName;
			
		}
		
		int customerCount = scan.nextInt();
		
		double min = 10000;
		
		double max = 0;
		
		String[] customerNameArray = new String[customerCount];
		
		double totalCost = 0;
		
		double cost = 0;
		
		double price = 0;
		
		int quantity = 0;
		
		// fix array below to initialize length
		
		// 
		
		String smallestName = "";
		
		String biggestName = "";
		
		for (int i = 0; i < customerCount; i++) {
			
			String firstName = scan.next();
			
			String lastName = scan.next();
			
			customerNameArray[i] = firstName + " " + lastName;
			
			int itemsBought = scan.nextInt();
			
			for (int j = 0; j < itemsBought; j++) {
				
				quantity = scan.nextInt();
				
				String nameOfItemsBought = scan.next();
				
				for (int k = 0; k < itemCount; k++) {
					
					if (itemNameArray[k] == nameOfItemsBought) {
						
						//not becoming 1, but staying initialized 0
						
						price = itemPriceArray[k];
								
					}
					
				}
				
				cost = cost + price * quantity;
				
			}
			
			double[] costArray = new double[itemsBought];
			
			costArray[i] = cost;
			
			totalCost = totalCost + costArray[i];
			
			if (cost < min) {
				
				min = cost;
				
				smallestName = customerNameArray[i];
				
			}
			
			if (cost > max) {
				
				max = cost;
				
				biggestName = customerNameArray[i];
				
			}
			
		}
		
		double average = totalCost / customerCount;
		
		String maxResult = String.format("%.2f", max);
		
		String minResult = String.format("%.2f", min);
		
		String averageResult = String.format("%.2f", average);
		
		System.out.println(price);
		
		System.out.println(cost);
		
		System.out.println(quantity);
		
		System.out.println(itemNameArray[0]);
		
		System.out.println("Biggest: " + biggestName + " (" + maxResult + ")");
		
		System.out.println("Smallest: " + smallestName + " (" + minResult + ")");
		
		System.out.println("Average: " + averageResult);
		
		scan.close();

	}
	
}
