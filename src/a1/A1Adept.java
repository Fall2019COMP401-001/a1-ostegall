package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//Your code follows here.
		
		int itemCount = scan.nextInt();
		
		double[] itemPriceArray = new double[itemCount];
		
		String[] itemNameArray = new String[itemCount];
		
		for (int i = 0; i < itemCount; i++) {
			
			String itemName = scan.next();
			
			double itemPrice = scan.nextDouble();
			
			itemPriceArray[i] = itemPrice;
			
			itemNameArray[i] = itemName;
			
		}
		
		int customerCount = scan.nextInt();
		
		double min = 10000;
		
		double max = 0;
		
		String[] customerNameArray = new String[customerCount];
		
		double totalCost = 0;
		
		double price = 0;
		
		double quantity = 0;
		
		int itemsBought = 0;
		
		String smallestName = "";
		
		String biggestName = "";
		
		for (int i = 0; i < customerCount; i++) {
			
			double cost = 0;
			
			String firstName = scan.next();
			
			String lastName = scan.next();
			
			customerNameArray[i] = firstName + " " + lastName;
			
			itemsBought = scan.nextInt();
				
			for (int j = 0; j < itemsBought; j++) {
					
				quantity = scan.nextDouble();
					
				String nameOfItemBought = scan.next();
					
				for (int k = 0; k < itemCount; k++) {
					
					String string1 = nameOfItemBought;
					
					String string2 = itemNameArray[k];
					
					if (string1.equals(string2)) {
						
						price = itemPriceArray[k];
					
					}
					
				}
				
				cost = cost + price * quantity;
				
			}
				
			totalCost = totalCost + cost;
				
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
		
		System.out.println("Biggest: " + biggestName + " (" + maxResult + ")");
		
		System.out.println("Smallest: " + smallestName + " (" + minResult + ")");
		
		System.out.println("Average: " + averageResult);
		
		scan.close();
		
	}

}



