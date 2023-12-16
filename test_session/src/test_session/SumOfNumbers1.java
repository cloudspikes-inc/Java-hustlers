/**
 * 
 */
package test_session;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class SumOfNumbers1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This is a test message 356.");

//		System.out.println("Enter your username: ");
//		
//		
//		String username = scanner.nextLine();
//		
//		System.out.println("Enter amount value #1: ");
//		int amount_1 = scanner.nextInt();
//		
//		System.out.println("Enter amount value #2: ");
//		int amount_2 = scanner.nextInt();
//		
//		int sum = amount_1 + amount_2;
//		
//		System.out.println("Your username is " + username + " "
//			+ "and sum of amount #1 " + amount_1 + " and amount "
//			+ "#2 " + amount_2 + " is: " + sum);
//		
//		
//		if(sum % 2 == 0) {
//			System.out.println("Sum amount "+ sum + " is an "
//					+ "even digit.");
//		} else {
//			System.out.println("Sum amount "+ sum + " is an "
//					+ "odd digit.");
//		}
		
		ArrayList<String> products = new ArrayList<String>();
		products.add("Charger");
		products.add("Ear buds");
		products.add("Battery case");
		
		System.out.println("Enter your Keyword to search: ");
		String searchKeyword = scanner.nextLine();
		
//		
//		int sizeOfCart = products.size();
//		System.out.println("Cart size: " + sizeOfCart);
//		
//		sizeOfCart = sizeOfCart - 1;
//		
//		boolean searchFlag = false;
//		
//		while(sizeOfCart >= 0) {
//			
//			String productItem = products.get(sizeOfCart);
//			System.out.println("Item at index: "+ sizeOfCart 
//					+ " is: " + productItem);
//			
//			if(productItem.contains(searchKeyword)) {
//				System.out.println("Search Keyword: "+ searchKeyword 
//						+ " found at index: " + sizeOfCart);
//				searchFlag = true;
//				break;
//			}
//			
//			sizeOfCart--;
//		}
//		
//		if(searchFlag) {
//			System.out.println("Search results found.");
//		} else {
//			System.out.println("Search results not found.");
//		}
		
		
		
		for(int i = 0; i<products.size(); i++) {
			String productItem = products.get(i);
			
			System.out.println("Product item at index: "+i+
					" is: " + productItem);
			
			if(productItem.contains(searchKeyword)) {
				System.out.println("Search Keyword: "+ searchKeyword 
						+ " found at index: " + i);
				break;
			}
		}
		
		scanner.close();
	}

}
