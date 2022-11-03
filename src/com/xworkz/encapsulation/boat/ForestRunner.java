package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Forest;
import com.xworkz.encapsulation.type.ForestModify;

public class ForestRunner {
	public static void main(String[] args) {

		Forest forest = new Forest();
		ForestModify modify = new ForestModify();

		modify.useForest(forest);
		System.out.println("After modifying :" + forest.getName());
		System.out.println("After modifying :" + forest.getTotalArea());
		System.out.println("After modifying :" + forest.getType());
		System.out.println("After modifying :" + forest.getRegion());
		System.out.println("After modifying :" + forest.getLength());
		System.out.println("After modifying :" + forest.getAnimalName());
		System.out.println("After modifying :" + forest.getElephantLegs());
		System.out.println("After modifying :" + forest.getNoOfTrees());
		System.out.println("After modifying :" + forest.getNoOfAnimals());
		System.out.println("After modifying :" + forest.getNoOfBirds());

	}

}
