package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int total_cust = scan.nextInt();
		
		for(int i = 0; i < total_cust; i++) {
		
		String first_name = scan.next();
		
		String first_initial = first_name.substring(0, 1);
		
		String last_name = scan.next();
		
		int items = scan.nextInt();
		
		double total = 0;
		
			for(int j = 0; j < items; j++) {
			
				int quantity = scan.nextInt();
			
				String itemName = scan.next();
			
				double price = scan.nextDouble();
			
				total = total + quantity * price;
			
			}
		
		String result = String.format("%.2f", total);
		
		System.out.println(first_initial + ". " + last_name + ": " + result);
		
		
		}
		
		scan.close();
		
	}
	
}
