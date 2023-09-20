package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

	public static void main(String[] args) {
		Map<String, Double> inventory = new HashMap<>();
		inventory.put("Bananas",1.99);
		inventory.put("Papaya",5.99);
		inventory.put("Kale",4.99);
		inventory.put("Apples",1.99);
		inventory.put("Carrot",1.49);
		inventory.put("Lime",0.49);
		inventory.put("Toothpaste",5.49);
		inventory.put("Zucchine",5.99);
		
		System.out.println("Welcome to Java Grocery. What can we help you find?\n");
		
		System.out.println("What is the price of Lime?");
		System.out.println(inventory.get("Lime"));
	
		System.out.println("\nWhat is the price of Zucchini?");
		System.out.println(inventory.get("Zucchine"));
		
		System.out.println("\nDo you guys sell Apples? ");
		boolean result = inventory.containsKey("Apples");
		String response = result ? "Yes!" : "No, sorry!";
		System.out.println(response);
		
	}
	
	
}
