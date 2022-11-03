package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Grocery;
import com.xworkz.encapsulation.type.GroceryStore;

public class GroceryRunner {

	public static void main(String[] args) {
		GroceryStore store = new GroceryStore();
		Grocery grocery = new Grocery();
		
		store.useGrocery(grocery);
		System.out.println("After modifying :" + grocery.getSuperMarket());
	
		
		System.out.println("After modifying :" + grocery.getNoOfDmart());
		
		System.out.println("After modifying :" + grocery.getLocation());
		System.out.println("After modifying :" + grocery.getAreaDiameter());
		System.out.println("After modifying :" + grocery.getItems());
		
		System.out.println("After modifying :" + grocery.getFruits());
		System.out.println("After modifying :" + grocery.getNoOfFruits());
		System.out.println("After modifying :" + grocery.getVegetable());
		System.out.println("After modifying :" + grocery.getNoOfVegetable());
		System.out.println("After modifying :" + grocery.getPrice());
		

	}

}
