package com.xworkz.encapsulation.type;

public class ForestModify {

	public Forest forest;

	public void useForest(Forest forest) {
		System.out.println(forest.getName());
		forest.setName("Amazon");

		System.out.println(forest.getTotalArea());
		forest.setTotalArea(12335);

		System.out.println(forest.getType());
		forest.setType("Earth");

		System.out.println(forest.getRegion());
		forest.setRegion("South American ");

		System.out.println(forest.getLength());
		forest.setLength(6543);

		System.out.println(forest.getAnimalName());
		forest.setAnimalName("Lion");

		System.out.println(forest.getElephantLegs());
		forest.setElephantLegs(4);

		System.out.println(forest.getNoOfTrees());
		forest.setNoOfTrees(1200);

		System.out.println(forest.getNoOfAnimals());
		forest.setNoOfAnimals(800);

		System.out.println(forest.getNoOfBirds());
		forest.setNoOfBirds(200);
	}

}
