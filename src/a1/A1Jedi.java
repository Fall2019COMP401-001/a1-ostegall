package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int itemCount = scan.nextInt();
		
		String[] itemNameArray = new String[itemCount];
		
		int[] counterArray = new int[itemCount];
		
		for (int i = 0; i < itemCount; i++) {
			
			String itemName = scan.next();
			
			double itemPrice = scan.nextDouble();
			
			itemNameArray[i] = itemName;
			
		}
		
		String nameOfItemBought = "";
		
		double quantityBought = 0;
		
		int customerCount = scan.nextInt();
		
		for (int i = 0; i < customerCount; i++) {
			
			String firstName = scan.next();
			
			String lastName = scan.next();
			
			int itemsBought = scan.nextInt();
			
			for (int j = 0; j < itemsBought; j++) {
				
				quantityBought = scan.nextDouble();
				
				nameOfItemBought = scan.next();
				
				for (int k = 0; k < itemCount; k++) {
					
					String string1 = nameOfItemBought;
					
					String string2 = itemNameArray[k];
					
					if (string1.equals(string2)) { 
						
						counterArray[k] += 1;
					
						}
					
				}
						
			}
				
		}
		
		for (int i = 0; i < itemCount; i++) {
			
			if (counterArray[i] == 0) {
				
				System.out.println("No customers bought " + itemNameArray[i]);
				
			} else {
				
				System.out.println(counterArray[i] + " customers bought " + itemNameArray[i]); 
				
			}
			
		}
		
		scan.close();
		
	}
}
