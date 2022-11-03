package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Kitchen;
import com.xworkz.encapsulation.type.KitchenModfy;

public class KitchenRunner {
	public static void main(String[] args) {

		Kitchen kitchen = new Kitchen();
		KitchenModfy modfy = new KitchenModfy();

		modfy.useKitchen(kitchen);
		System.out.println("After modifying :" +kitchen.getVegetableName());
		System.out.println("After modifying :" +kitchen.getFruitName());
		System.out.println("After modifying :" +kitchen.getNoOfspoon());
		System.out.println("After modifying :" +kitchen.getNoOfPlates());
		System.out.println("After modifying :" +kitchen.getKitchenArea());
		System.out.println("After modifying :" +kitchen.getNoOfGlasses());
		System.out.println("After modifying :" +kitchen.isClean());

	}

}
