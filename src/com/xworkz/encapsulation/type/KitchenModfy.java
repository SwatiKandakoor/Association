package com.xworkz.encapsulation.type;

public class KitchenModfy {
	public Kitchen kitchen;

	public void useKitchen(Kitchen kitchen) {
		System.out.println(kitchen.getVegetableName());
		kitchen.setVegetableName("Tomato");

		System.out.println(kitchen.getFruitName());
		kitchen.setFruitName("Apple");

		System.out.println(kitchen.getNoOfspoon());
		kitchen.setNoOfspoon(26);

		System.out.println(kitchen.getNoOfPlates());
		kitchen.setNoOfPlates(36);

		System.out.println(kitchen.getKitchenArea());
		kitchen.setKitchenArea(1000);

		System.out.println(kitchen.getNoOfGlasses());
		kitchen.setNoOfGlasses(40);

		System.out.println(kitchen.isClean());
		kitchen.setClean(false);

	}

}
