package com.xworkz.encapsulation.type;

public class GroceryStore {
	public Grocery grocery;
	
	public void useGrocery(Grocery grocery) {
		System.out.println(grocery.getSuperMarket());
		grocery.setSuperMarket("Metro");
		
		System.out.println(grocery.getNoOfDmart());
		grocery.setNoOfDmart(15);
		
		System.out.println(grocery.getLocation());
		grocery.setLocation("Bagalkot");
		
		System.out.println(grocery.getAreaDiameter());
		grocery.setAreaDiameter(45);
		
		System.out.println(grocery.getItems());
		grocery.setItems(10);
		System.out.println(grocery.getNoOfItems());
		grocery.setNoOfItems(200d);
		
		System.out.println(grocery.getFruits());
		grocery.setFruits("Apple");
		System.out.println(grocery.getNoOfFruits());
		grocery.setNoOfFruits(9);
		
		System.out.println(grocery.getVegetable());
		grocery.setVegetable("Tomato");
		System.out.println(grocery.getNoOfVegetable());
		grocery.setNoOfVegetable(18);
		System.out.println(grocery.getPrice());
		grocery.setPrice(5000);
		
	}

}
